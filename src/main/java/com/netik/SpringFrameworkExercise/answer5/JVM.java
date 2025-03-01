package com.netik.SpringFrameworkExercise.answer5;

import org.springframework.stereotype.Component;

@Component
public class JVM implements CompetencyType {
    public String getCompetency() {
        return "JVM Competency";
    }
}
