package com.java.core.ClassAndObject;

import java.util.Random;

public class PhraseOMatic {
    public static void main(String[] args) {
        String[] wordList1={"my","friend","akshit","thor","ready","2026","better","not","will","aspire","gold"};
        String[] wordList2={"is","master","genius","better","god","Was"};
        String[] wordList3={"my","friend","always","developer","star","what","true","in","heart"};

        int oneLength=wordList1.length;
        int twoLength=wordList2.length;
        int threeLength=wordList3.length;

        Random random=new Random();
        int random1= random.nextInt(oneLength);
        int random2= random.nextInt(twoLength);
        int random3= random.nextInt(threeLength);

        String phrase=wordList1[random1]+" "+wordList2[random2]+" "+wordList3[random3];
        System.out.println(phrase);
    }
}
