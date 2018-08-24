package com.zoushiyou.service.impl;

import com.zoushiyou.dao.core.StudentDao;
import com.zoushiyou.model.core.Student;
import com.zoushiyou.service.base.BaseService;
import org.springframework.stereotype.Service;

@Service("studentService")
public class StudentService extends BaseService<StudentDao,Student> {
}
