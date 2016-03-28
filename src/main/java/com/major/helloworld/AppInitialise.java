package com.major.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@EnableAutoConfiguration
public class AppInitialise {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "wut";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(AppInitialise.class, args);
    }
}
