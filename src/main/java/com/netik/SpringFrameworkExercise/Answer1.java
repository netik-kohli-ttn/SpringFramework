package com.netik.SpringFrameworkExercise;

import com.netik.SpringFrameworkExercise.answer1.BinarySearch;

public class Answer1 {
    public static void main(String[] args) {
        int[] arr = {5,7,3,1,8,6,2};
        int target = 3;
        BinarySearch binarySearch = new BinarySearch();
        int output = binarySearch.binarySearch(arr, 0, arr.length, target);
        System.out.println("Sorted array: ");
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nIndex of target Value "+target+" : " + output);
    }
}
