package com.java.core.arrays;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] array=new int[2][3];

        array[0][0]=10;
        array[0][1]=20;
        array[0][2]=30;
        array[1][0]=40;
        array[1][1]=50;
        array[1][2]=60;
        System.out.println("length: "+array.length);
        System.out.println("class: "+array.getClass().getName());
        System.out.println("elements: ");
        for(int i=0;i< array.length;i++){
            for(int j=0;j< array.length;j++){
                System.out.print(array[i][j]+" ");
            }
        }
    }

}
