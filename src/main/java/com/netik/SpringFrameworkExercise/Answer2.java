package com.netik.SpringFrameworkExercise;

import com.netik.SpringFrameworkExercise.answer2.BinarySearch;
import com.netik.SpringFrameworkExercise.sortalgorithms.SelectionSort;

public class Answer2 {
    public static void main(String[] args) {
        int[] arr = {5,7,3,1,8,6,2};
        int target = 5;
        BinarySearch binarySearch = new BinarySearch(new SelectionSort());
        int output = binarySearch.binarySearch(arr, 0, arr.length, target);
        System.out.println("Sorted array: ");
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nIndex of target Value "+target+" : " + output);
    }
}
