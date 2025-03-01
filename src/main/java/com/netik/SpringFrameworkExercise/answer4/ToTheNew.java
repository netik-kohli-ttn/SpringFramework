package com.netik.SpringFrameworkExercise.answer4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ToTheNew {
    @Autowired
    Competency competency;
    public void show(){
        System.out.println("Welcome to To The New you are in : " + competency.getCompetency());
    }
}
