package com.example.module1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jianzhongli on 15/11/21.
 */
@RestController
@EnableAutoConfiguration
public class TestController {

    @RequestMapping("/test1")
    String home() {
        return "test1!";
    }
    public static void main(String[] args) throws Exception {
        SpringApplication.run(TestController.class, args);
    }
}

