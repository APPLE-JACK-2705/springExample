package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
//        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        Camera camera = context.getBean("camera", Camera.class);
        camera.doPhoto();
        camera.doPhoto();
    }
}