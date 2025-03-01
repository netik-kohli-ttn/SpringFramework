package com.netik.SpringFrameworkExercise.answer5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Competency {

    @Qualifier("devops")
    @Autowired
    CompetencyType competencyType;
    public void show(){
        System.out.println("Welcome to To The New you are in : " + competencyType.getCompetency());
    }
}
