package com.java.core.arrays;

public class CloneArrayMethod {
    public static void main(String[] args) {
//        1. Always copies full array.
//        2. Returns the same type.
//        3. O(n) time
//        4. Deep copy for primitives, shallow for objects.

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
