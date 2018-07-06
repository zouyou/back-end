package com.zoushiyou.web.core;

import com.zoushiyou.model.core.Attachments;
import com.zoushiyou.model.dto.ResultVo;
import com.zoushiyou.service.impl.AttachmentService;
import com.zoushiyou.web.base.WebController;
import com.zoushiyou.web.util.ExcelHelper;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 附件接口
 */
@RestController
@RequestMapping(value = "/v1/attachment")
public class AttachmentController extends WebController<AttachmentService, Attachments> {

    @Value("${fileupload.dir}")
    private String fileuploadDir;

    @RequestMapping(value = "/doUploadFile", method = RequestMethod.POST)
    public ResultVo doUploadFile(HttpServletRequest request,
                                 @RequestParam("fkType") Integer fkType, @RequestParam("fkPkId") String fkPkId,
                                 @RequestParam("file") MultipartFile file) throws Exception {
        String fileName = file.getOriginalFilename();
        try {
            FileUtils.copyInputStreamToFile(file.getInputStream(), new File(fileuploadDir, file.getOriginalFilename()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Attachments model = new Attachments();
        model.setFkType(fkType);              //外键类型
        model.setFkPkId(fkPkId);              //外键Id
        model.setCode(file.getContentType()); //文件类型
        model.setName(fileName);              //文件名称
        String suffix = fileName.substring(fileName.lastIndexOf("."));
        model.setSuffix(suffix);              //文件后缀名
        model.setStreamData(file.getBytes()); //文件流
        ResultVo vo = super.insertOne(request, model);
        return vo;
    }

    @RequestMapping(value = "/upExcel", method = RequestMethod.POST)
    public ResultVo upExcel(HttpServletRequest request,
                            @RequestParam("fkType") Integer fkType, @RequestParam("fkPkId") String fkPkId,
                            @RequestParam("file") MultipartFile file) throws Exception {
        ResultVo vo = new ResultVo();
        List<Object> lst = new ArrayList<>();
        ExcelHelper excelReader = new ExcelHelper();
        String[] title = excelReader.readExcelTitle(file.getInputStream());
        lst.add(title);
        List<String[]> mapList = excelReader.readExcelContent(file.getInputStream());
        for (int i = 0; i < mapList.size(); i++) {
            String[] strlist = mapList.get(i);
            lst.add(strlist);
        }
        vo.setData(lst);
        return vo;
    }

    @RequestMapping(value = "/downExcel", method = RequestMethod.GET)
    public ResultVo downExcel(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ResultVo vo = new ResultVo();
        String title = "测试单子";
        String[] columnName = new String[]{"序号", "num1", "num2", "num3", "num4"};
        List<Object[]> dataList = new ArrayList<Object[]>();
        for (int i = 0; i < 2; i++) {
            Object[] objs = new Object[columnName.length];
            for (int k = 0; k < objs.length; k++) {
                objs[k] = k;
            }
            dataList.add(objs);
        }
        ExcelHelper ex = new ExcelHelper(title, columnName, dataList, request, response);
        try {
            ex.excelExport();
        } catch (Exception e) {
            e.printStackTrace();
        }
        vo.setData("导出成功");
        return vo;
    }

}
