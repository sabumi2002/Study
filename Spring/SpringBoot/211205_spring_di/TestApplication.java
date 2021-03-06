package com.example.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TestApplication {

  public static void main(String[] args) {

    SpringApplication.run(TestApplication.class, args);

    ApplicationContext context = ApplicationContextProvider.getContext();

    Base64Encoder base64Encoder= context.getBean(Base64Encoder.class);
    Encoder encoder = new Encoder(base64Encoder);

    String url = "www.naver.com/books/it?page=10&size=20&name=spring-boot";

    String result = encoder.encode(url);
    System.out.println(result);

  }

}
