package com.example.test;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

// spring 어플리케이션이 실행될때 ApplicationContextProvider를 만들때
// setApplicationContext에 ApplicationContext를 주입을 해줄것이고 그것을 받아서 static변수에 할당할것이다.
@Component
public class ApplicationContextProvider implements ApplicationContextAware {

  private static ApplicationContext context;  //이 어플리케이션을 주입받는것은 ApplicationContext로 주입받겠다.

  @Override
  public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
    // 여기서 주입이 일어나면 context는 ApplicationContext를 할당하겠다.
    context = applicationContext;
  }

  public static ApplicationContext getContext(){
    return context;
  }
}
