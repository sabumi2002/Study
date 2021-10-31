package com.example.springtest;

import com.example.springtest.aop.Exam;
import com.example.springtest.aop.NewlecExam;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

@SpringBootApplication
public class SpringTestApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringTestApplication.class, args);

    Exam exam = new NewlecExam(1, 1, 1, 1);
    Exam proxy = (Exam) Proxy.newProxyInstance(NewlecExam.class.getClassLoader(),
            new Class[]{Exam.class},
            new InvocationHandler() {

              @Override
              public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                long start = System.currentTimeMillis();
                Object result = method.invoke(exam, args);  // 원래 객체 메소드
                long end = System.currentTimeMillis();
                String message = (end-start)+"ms 시간이 걸렸습니다.";
                System.out.println(message);
                return result;
              }
            }
    );
    System.out.printf("total is %d\n", proxy.total());
    System.out.printf("avg is %f\n", proxy.avg());
  }


}
