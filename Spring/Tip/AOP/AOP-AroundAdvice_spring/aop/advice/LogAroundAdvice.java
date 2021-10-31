package com.example.springtest.aop.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

// around-advice�� �������̽��� MethodInterceptor �� �־����.

public class LogAroundAdvice implements MethodInterceptor {

  @Override
  public Object invoke(MethodInvocation invocation) throws Throwable {
    long start = System.currentTimeMillis();

    Object result = invocation.proceed();

    long end = System.currentTimeMillis();
    String message = (end-start)+"ms ?�간??걸렸?�니??";
    System.out.println(message);
    return result;
  }
}