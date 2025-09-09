package com.jsb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @GetMapping("/")
    @ResponseBody
    public String index(){
        System.out.println("인덱스 메서드가 호출되었습니다");
        return "index";
    }

    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        System.out.println("hello 메서드가 호출되었습니다");
        return "hello";
    }


}
