package com.java.core.arrays;

public class CloneArrayMethod {
    public static void main(String[] args) {
//        1. cloning 1D array returns deep copy.
//        2. cloning 2D array returns shallow copy.

        int[] original={1,2,3,4,5,6,7,8,9};
        int[] cloned=original.clone();

        for (int i:original){
            System.out.print(i+" ");
        }
        System.out.print("\n");
        for (int j: cloned) {
            System.out.print(j+" ");
        }

    }
}
