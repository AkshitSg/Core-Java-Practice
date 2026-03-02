package com.java.core.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DuplicateElementBySorting {
    public static void main(String[] args) {

        int[] numbers={7,4,5,3,4,2,6,4,5,9,2,6,5,6,3,4};
        System.out.print("original array: [ ");
        for(int n:numbers){
            System.out.print(n+" ");
        }
        System.out.print("]\n");

        Arrays.sort(numbers);

        System.out.print("sorted array: [ ");
        for(int n:numbers){
            System.out.print(n+" ");
        }
        System.out.print("]\n");
    }
}
