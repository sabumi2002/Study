package com.company;

public class Main {

    public static void main(String[] args) {
        String url = "www.naver.com/books/it?page=10&size=20&name=spring-boot";

        Encoder encoder = new Encoder(new UrlEncoder()); // 이부분만 건드려서 외부 주입받는다.
        String result = encoder.encode(url);
        System.out.println(result);
    }
}
