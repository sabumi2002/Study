package com.example.post.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class PostApiController {

    @PostMapping("/post")
    public void post(@RequestBody Map<String, Object> requestData){ //post에선 Map앞에 @RequestBody가 있어야함 안하면 외부에서 받은 값이 안들어옴
        /*
        requestData.forEach((key, value) -> {
            System.out.println("key : " + key);
            System.out.println("value : " + value);
        });
         */
        System.out.println(requestData);
    }
}
