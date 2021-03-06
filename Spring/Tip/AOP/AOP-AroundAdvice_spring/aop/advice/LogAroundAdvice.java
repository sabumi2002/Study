package com.example.springtest.aop.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

// around-advice는 인터페이스로 MethodInterceptor 를 넣어야함.

public class LogAroundAdvice implements MethodInterceptor {

  @Override
  public Object invoke(MethodInvocation invocation) throws Throwable {
    long start = System.currentTimeMillis();

    Object result = invocation.proceed();

    long end = System.currentTimeMillis();
    String message = (end-start)+"ms ?쒓컙??嫄몃졇?듬땲??";
    System.out.println(message);
    return result;
  }
}
