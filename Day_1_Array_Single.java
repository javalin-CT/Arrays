package com.example.ReviewProjects.Arrays;

import java.util.Arrays;

public class Day_1_Array_Single {
    /*
    the different ways to declare an array
        int arr = {122,3,4,4,3,3};
        int arr = new int[size of array]
     */
    public static void main(String[] args) {
        int[] arr = new int[4];
        int[] arr2 = {1,2,3,4,3,2};
        //we can perform math operations using the different indexes together
        System.out.println(arr2[3] + arr2[1]);//6
        System.out.println(arr2[2] / arr2[4]);//1

        //adding elements to an array
        arr[0] = 4; arr[1] = 1; arr[2] = 3; arr[3] = 5;

        //to print this array out, use Arrays.toString to change it to a string first
        System.out.println("Arrays.toString");
        System.out.println(Arrays.toString(arr));

        //to print an array out without the brackets and commas
        System.out.println("for loop");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        //can also use for each loop to do the same thing
        System.out.println("\nfor each");
        for(int each : arr){
            System.out.print(each+" ");
        }



    }
}
