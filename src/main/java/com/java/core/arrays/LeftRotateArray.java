package com.java.core.arrays;

public class LeftRotateArray {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5};
        int t=3;
        rotateLeft(array,t);
    }
    static private void rotateLeft(int[] arr,int times){
//        print original array
        System.out.print("original array: [ ");
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.print("]\n");

//        rotate array.
        for(int i=0;i<times;i++){
//            save first element.
            int temp=arr[0];
//            set arr[j]=arr[j+1]
            for(int j=0;j<arr.length-1;j++){
                arr[j]=arr[j+1];
            }
//            append first element at last.
            arr[arr.length-1]=temp;
        }

        System.out.print("rotated array: [ ");
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.print("]\n");
    }
}
