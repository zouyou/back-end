package com.zoushiyou.test;

import com.zoushiyou.model.dto.ResultVo;
import com.zoushiyou.model.user.Student;
import com.zoushiyou.service.impl.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import java.util.UUID;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:config/applicationContext.xml")
public class ServiceTest {
    @Autowired
    private StudentService studentService;

    @Test
    public void insertOne() throws Exception {
        Student model = new Student(); //
        model.setId(UUID.randomUUID().toString());
        model.setName("王同学");
        model.setSex(false);
        model.setAddress("北京");
       System.out.println(studentService.insertOne(model));
    }

    @Test
    public void findOne() throws Exception {
        ResultVo student = studentService.findOne("1");
        System.out.println(student.getData().toString());
    }
}
