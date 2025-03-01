package com.netik.SpringFrameworkExercise;

import com.netik.SpringFrameworkExercise.answer4.ToTheNew;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.netik.SpringFrameworkExercise.answer4")
public class Answer4 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Answer4.class);
        ToTheNew ttn = context.getBean(ToTheNew.class);
        ttn.show();
    }
}
