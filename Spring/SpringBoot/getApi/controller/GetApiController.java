package com.example.hello.controller;

import com.example.hello.dto.UserRequest;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/get")
public class GetApiController {

    @GetMapping(path= "/hello") // http://localhost:9090/api/get/hello
    public String getHello(){
        return "get Hello";
    }
    @RequestMapping(path= "/hi", method= RequestMethod.GET)   // get http://localhost:9090/api/get/hi
    public String hi(){
        return "hi";
    }

    // http://localhost:9090/api/get/path-variable/{spring-boot}
    @GetMapping("/path-variable/{name}")
    public String pathVariable(@PathVariable(name= "name") String pathName){
        System.out.println("PathVariable : "+ pathName);
        return pathName;
    }

    // http://localhost:9090/api/get/query-param?name=예상국&email=steve@gmail.com&age=30
    @GetMapping(path= "query-param") //무한정 뭐가 들어올지 몰라하면 Map의 형식도 있지만
    public String queryParam(@RequestParam Map<String, String> queryParam){
        StringBuilder sb= new StringBuilder();



        queryParam.entrySet().forEach( entry -> {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println("/n");

            sb.append(entry.getKey()+ " = "+ entry.getValue()+ "/n");
        } );
        return sb.toString();
    }

    @GetMapping("query-param02")    // query파라미터로 들어오는 종류가 적다하면 이렇게 써도 사오간없음
    public String queryParam02(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam int age
    ){
        System.out.println(name);
        System.out.println(email);
        System.out.println(age);

        return name+ " "+ email+ " "+ age;
    }

    // ?name=예상국&email=steve@gmail.com&age=30
    @GetMapping("query-param03")    // 주소    이방식이 제일 많이씀. 객체를 만들어서 쿼리파라미터가 바로매칭이되는 해당의 형태
    public String queryParam03(UserRequest userRequest) {  //메소드 객체로 받을거임
        System.out.println(userRequest.getName());
        System.out.println(userRequest.getEmail());
        System.out.println(userRequest.getAge());

        return userRequest.toString();
    }
}
