package com.java.core.arrays;

public class ArraysEvenOdd {
    public static void main(String[] args) {
        int[] numbers={1,2,3,4,5,6,7,8,9,10};
        printOdd(numbers);
        System.out.print("\n");
        printEven(numbers);
    }
    private static void printEven(int[] arr){
        System.out.print("Even numbers: ");
        for(int a:arr){
            if(a%2==0){
                System.out.print(" "+a+" ");
            }
        }
    }
    private static void printOdd(int[] arr){
        System.out.print("Odd numbers: ");
        for(int a:arr){
            if(a%2!=0){
                System.out.print(" "+a+" ");
            }
        }
    }
}
