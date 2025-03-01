package com.netik.SpringFrameworkExercise;

import com.netik.SpringFrameworkExercise.answer6.Book;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.netik.SpringFrameworkExercise.answer6")
public class Answer6 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(Answer6.class, args);

        Book book = applicationContext.getBean(Book.class);
        System.out.println(book.getBookDetails());
    }
}

