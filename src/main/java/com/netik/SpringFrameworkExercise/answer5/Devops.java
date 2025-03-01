package com.netik.SpringFrameworkExercise.answer5;

import org.springframework.stereotype.Component;

@Component
public class Devops implements CompetencyType {
        public String getCompetency() {
            return "Devops Competency";
    }
}
