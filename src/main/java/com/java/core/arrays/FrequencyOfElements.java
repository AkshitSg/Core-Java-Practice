package com.java.core.arrays;

public class FrequencyOfElements {
    public static void main(String[] args) {
        int []array={7,4,5,3,4,2,6,4,5,9,2,6,5,6,3,4};
        frequencyCount(array);
    }
    static private void frequencyCount(int[] arr){
//        print original array
        System.out.print("original array: [ ");
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println("]");

//        create an array to store frequency count
        int []fr=new int[arr.length];
        int visited=-1;

        for (int i=0;i<arr.length;i++) {
            int count=1;
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
//                    to avoid counting it again.
                    fr[j]=visited;
                }
            }
            if(fr[i]!=visited){
                fr[i]=count;
            }
        }

//        print frequency count
        System.out.println("Element|Frequency");
        for (int i=0; i<arr.length;i++){
            if(fr[i]!=visited){
                System.out.println(arr[i]+"|"+fr[i]);
            }
        }
    }
}
