package com.zoushiyou.service.base;

import com.zoushiyou.dao.base.BaseDao;
import com.zoushiyou.model.base.BaseModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public abstract class BaseService<TBaseDao extends BaseDao, TModel extends BaseModel> implements IBaseService<TModel> {
    @Autowired
    protected TBaseDao modelDao;

    @Transactional
    public Boolean insertOne(TModel model) {
        return modelDao.insertOne(model);
    }

    @Transactional
    public Boolean updateOne(TModel model) {
        return modelDao.updateOne(model);
    }

    @Transactional
    public Boolean deleteOne(long pkId) {
        return modelDao.deleteOne(pkId);
    }

    public TModel findOne(long pkId) { return (TModel) modelDao.findOne(pkId); }

    public List<TModel> findAll(HttpServletRequest request) {
        Enumeration paramNames = request.getParameterNames();
        Map<String, Object> params = new TreeMap<String, Object>();
        while ((paramNames != null) && paramNames.hasMoreElements()) {
            String paramName = (String) paramNames.nextElement();
            if (paramName.equals("pIndex") || paramName.equals("pSize"))
                continue;
            String value = request.getParameter(paramName);
            if (value != null && !value.trim().equals(""))
                params.put(paramName, value);
        }
        if (params.size() > 0) {
            StringBuilder str = new StringBuilder();
            for (String key : params.keySet()) {
                String[] keyArray = key.split("_",2);
                //如 EQ_code=1 IN_code=1,2
                if (keyArray.length == 2) {
                    String prefix = keyArray[0];  //前缀
                    String fieldName = keyArray[1]; //字段名称
                    switch (prefix) {
                        case "EQ":
                            str.append(" AND " + fieldName + " = '" + params.get(key) + "' ");
                            break;
                        case "IN":
                            String[] inVals = params.get(key).toString().split(",");
                            if (inVals != null && inVals.length > 0) {
                                StringBuilder strIn = new StringBuilder();
                                for (int i = 0; i < inVals.length; i++) {
                                    strIn.append("'" + inVals[i] + "'");
                                    if (i != inVals.length - 1)
                                        strIn.append(",");
                                }
                                str.append(" AND " + fieldName + " IN (" + strIn.toString() + ") ");
                            }
                            break;
                        case "LIKE":
                            str.append(" AND " + fieldName + " LIKE '%" + params.get(key) + "%' ");
                            break;
                    }
                }
            }
            return modelDao.findAll(str.toString());
        }
        return modelDao.findAll(null);
    }
}
