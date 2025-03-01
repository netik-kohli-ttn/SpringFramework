package com.netik.SpringFrameworkExercise;

import com.netik.SpringFrameworkExercise.answer5.Competency;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.netik.SpringFrameworkExercise.answer5")
public class Answer5 {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Answer5.class, args);
        Competency competency = context.getBean(Competency.class);
        competency.show();
    }
}
