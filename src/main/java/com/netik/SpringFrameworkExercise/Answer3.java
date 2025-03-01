package com.netik.SpringFrameworkExercise;

import com.netik.SpringFrameworkExercise.answer3.BinarySearch;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.netik.SpringFrameworkExercise.answer3")
public class Answer3 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(Answer3.class, args);

        BinarySearch binarySearch = applicationContext.getBean(BinarySearch.class);
        int[] arr = {5,7,3,1,8,9,2};
        int target = 2;
        int output = binarySearch.binarySearch(arr, 0, arr.length, target);
        System.out.println("Sorted array: ");
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nIndex of target Value "+target+" : " + output);
    }
}
