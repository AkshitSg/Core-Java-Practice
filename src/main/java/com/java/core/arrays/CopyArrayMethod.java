package com.java.core.arrays;

public class CopyArrayMethod {
    public static void main(String[] args) {
        char[] original={'a','b','c','d','e','f','g','h','i','j','k','l'};
        char[] copied=new char[8];

        System.arraycopy(original,2,copied,0,copied.length);
        for (char c:copied){
            System.out.print(c+" ");
        }
    }
}
