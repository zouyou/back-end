package com.zoushiyou.web.user;


import com.zoushiyou.service.impl.StudentService;
import com.zoushiyou.web.base.BaseController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 学生接口
 */
@RestController
@RequestMapping(value = "/student")
public class StudentController extends BaseController<StudentService> {


}
