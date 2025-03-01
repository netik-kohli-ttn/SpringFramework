package com.netik.SpringFrameworkExercise.answer6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Book {
    Author author;
    @Autowired
    public Book(Author author) {
       this.author = author;
    }

    public String getAuthor() {
        return author.getName();
    }
    public String getBookDetails() {
        return "Book Name : Java 25 \n" + "Author Name : " + getAuthor();
    }
}
