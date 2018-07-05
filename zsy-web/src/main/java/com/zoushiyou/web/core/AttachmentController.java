package com.zoushiyou.web.core;

import com.zoushiyou.model.dto.ResultVo;
import com.zoushiyou.model.core.Attachments;
import com.zoushiyou.service.impl.AttachmentService;
import com.zoushiyou.web.base.WebController;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

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
}
