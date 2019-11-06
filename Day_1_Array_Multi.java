package com.example.ReviewProjects.Arrays;

import java.util.Arrays;

public class Day_1_Array_Multi {
    public static void main(String[] args) {
        // to declare
        int [][] arr = { { 1,2,3 } , { 4,5,6 } };
        int [][] arr2 = new int[2][2];
        //to assign
        arr2[0][0] = 1; arr2[0][1] = 2; arr2[1][0] = 3; //etc
        System.out.println(Arrays.deepToString(arr));
        // prints [[1,2],[3,4]]
        for (int [] each : arr){
            for (int another : each){
                System.out.print(another + " ");
            }
        }
        //prints 1 2 5 3 4 5
        System.out.println();
        System.out.println(">>>");
        System.out.println("Nested loop to print all elements");
    for(int arrIndex = 0; arrIndex < arr.length; arrIndex++) {
        for (int elementIndex = 0; elementIndex < arr[arrIndex].length; elementIndex++) {
            System.out.print(arr[arrIndex][elementIndex] + " ");
        }
    }
        System.out.println();
        System.out.println(">>>");
        System.out.println();
        System.out.println((arr[0][1]));//prints a single value
    }
}
