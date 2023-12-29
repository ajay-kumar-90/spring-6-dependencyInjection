package com.ajaycodes.springdi;

import com.ajaycodes.springdi.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringDiApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(SpringDiApplication.class, args);
        MyController myControllerBean = applicationContext.getBean(MyController.class);
        System.out.println("In the main method");
        System.out.println(myControllerBean.sayHello());
    }

}
