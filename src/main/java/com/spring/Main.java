package com.spring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
       UserController controller = context.getBean(UserController.class);
        controller.createUser("Sachin");
        controller.getUser();


    }
}
