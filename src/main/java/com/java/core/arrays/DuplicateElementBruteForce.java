package com.java.core.arrays;

public class DuplicateElementBruteForce {
    public static void main(String[] args) {
        int[] array={4,5,6,7,5,6,5,6};
        findDuplicate(array); // O(n*n)
    }
    static private void findDuplicate(int[] array){
        int visited=-1;

        for(int i=0;i< array.length;i++){
            if(array[i]!=visited){
                for(int j=i+1;j< array.length;j++){
                    if(array[i]==array[j]){
                        array[j]=visited;
                        System.out.println("Duplicate element found: "+array[i]);
                    }
                }
            }
        }

    }
}
