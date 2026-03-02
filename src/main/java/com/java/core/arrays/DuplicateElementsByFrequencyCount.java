package com.java.core.arrays;

public class DuplicateElementsByFrequencyCount {
    public static void main(String[] args) {
        int[] numbers={7,4,5,3,4,2,6,4,5,9,2,6,5,6,3,4};
        findDuplicate(numbers);
    }
    private static void findDuplicate(int[] arr){
//        print original array,
        System.out.print("Original array: [ ");
        for(int a:arr){
            System.out.print(a+" ");
        }
        System.out.print(" ]\n");

//        initialized new array for frequency count.
        int[] frr=new int[arr.length];
        int visited=-1;

        for(int i=0;i< arr.length-1;i++){
            int count=1;
            for(int j=i+1;j< arr.length;j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    frr[j] = visited;
                }
            }
            if(frr[i]!=visited){
                frr[i]=count;
            }
        }
        System.out.print("Duplicate elements: [ ");
        for(int i=0;i< arr.length;i++){
            if(frr[i]>1){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.print("]");
    }
    }


