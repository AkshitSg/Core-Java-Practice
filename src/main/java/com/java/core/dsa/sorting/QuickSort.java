package com.java.core.dsa.sorting;

public class QuickSort {

    public static void main(String[] args) {
        int[] array={5,7,6,9,4,8,1,2,3};                // array length=9

        System.out.print("original array: [ ");
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.print("]\n");

        quickSort(array,0,array.length-1);     // passing index {0-8}

        System.out.print("sorted array: [ ");
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.print("]\n");
    }

    private static void quickSort(int[] arr,int low,int high){
        // low=0 high=8
        int pp;
        if(low<high){                               // base check for recursion. array with 0 or 1 ele is already sorted.
            pp=findPartitionPoint(arr,low,high);          // setting pivot at correct position.
            quickSort(arr,low,pp-1);                // sorting right-side sub-arrays {0-3}.
            quickSort(arr,pp+1,high);               // sorting left-side sub-arrays {5-8}.
        }
    }

    private static int findPartitionPoint(int[] arr,int low,int high){
        int pivot=arr[low];         // first element of array as pivot.
        int i=low;                  // starting i from first element.
        int j=high;                 // starting j from last element.
        while(i<j){                                 // important because i>=j we traversed complete array.
            while (i<=high && arr[i]<=pivot){       // increment i only if element is =< pivot.
                i++;
            }
            while (j>=low && arr[j]>pivot){         // decrement j only if element is > pivot.
                j--;
            }
            if(i<j){                                // important because we already incremented/decremented.
                swap(arr,i,j);                      // set element<=pivot to right side, element>pivot to left side.
            }
        }
        swap(arr,low,j);                            // actually sets pivot to its correct position.
        return j;
    }
    private static void swap(int[] arr, int a,int b){int temp=arr[a];arr[a]=arr[b];arr[b]=temp;}
}
