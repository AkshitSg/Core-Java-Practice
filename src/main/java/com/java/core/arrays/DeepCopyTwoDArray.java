package com.java.core.arrays;

import java.util.Arrays;

public class DeepCopyTwoDArray {
    public static void main(String[] args) {

        int[][] original={{1,2},{3,4}};
//        Array of Arrays int_A[int_1[],int_2[]];

        int[][] copied=new int[original.length][];

        for(int i=0;i< original.length;i++){
            copied[i]= Arrays.copyOf(original[i],original[i].length);
        }
    }
}
