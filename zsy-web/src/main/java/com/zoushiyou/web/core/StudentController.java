package com.zoushiyou.web.core;

import com.zoushiyou.model.core.Student;
import com.zoushiyou.service.impl.StudentService;
import com.zoushiyou.web.base.WebController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 学生接口
 * Author QQ:511570155
 */
@RestController
@RequestMapping(value = "/v1/student")
public class StudentController extends WebController<StudentService,Student> {


}

