package com.zoushiyou.web.user;


import com.zoushiyou.model.user.Student;
import com.zoushiyou.service.impl.StudentService;
import com.zoushiyou.web.base.WebController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 学生接口
 * Author QQ:511570155
 */
@RestController
@RequestMapping(value = "/student")
public class StudentController extends WebController<StudentService,Student> {


}

