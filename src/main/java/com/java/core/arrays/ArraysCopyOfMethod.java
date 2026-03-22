package com.java.core.arrays;

import java.util.Arrays;

public class ArraysCopyOfMethod {
    public static void main(String[] args) {
//        internally Arrays.copyOf() uses System.arraycopy() under the hood.
        int[] original={1,2,3,4,5};

        int[] copied= Arrays.copyOf(original,3);
//        copied=[1,2,3] - copies first 3 elements.

        int []copied2= Arrays.copyOf(original,7);
//        copied2=[1,2,3,4,5,0,0] - pads with 0s if longer than original.

        int []copied3= Arrays.copyOfRange(original,1,3);
//        copied3=[2,3] - from index 1 (inclusive) to index 3 (exclusive).
    }
}
