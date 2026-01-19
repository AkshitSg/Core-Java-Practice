package com.java.core.ClassAndObject;

class Student{
    int id;
    String name;

    Student(int id,String name){
        // compiler adds super() implicitly.
        this.id=id;
        this.name=name;
    }
}
// Only one public class allowed in a java file and that class name should be same as file name.
public class NewKeywordDemo {
    public static void main(String[] args) {
        Student s1=new Student(1,"Akshit");
        // Anonymous object has no reference variable. Use when object is only for one time use.
        new Student(2,"Developer");
        System.out.println("ID: "+s1.id);
        System.out.println("NAME: "+s1.name);
    }
}
