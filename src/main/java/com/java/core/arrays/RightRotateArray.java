package com.java.core.arrays;

public class RightRotateArray {
    public static void main(String[] args) {
        int [] numbers={1,2,3,4,5,6};
        rotateArrayRight(numbers,3);
    }
    private static void rotateArrayRight(int[] arr,int times){

        for(int i=0;i<times;i++){
            int temp=arr[arr.length-1];
            for(int j=arr.length-1;j>0;j--){
                arr[j]=arr[j-1];
            }
            arr[0]=temp;
        }
        for(int a:arr){
            System.out.print(a+" ");
        }
    }
}
