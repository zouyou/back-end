package com.zouyou.backend.webapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/user")
public class UserController {
    @GetMapping("/")
    public String Author() {
        return "zouyou";
    }
}
