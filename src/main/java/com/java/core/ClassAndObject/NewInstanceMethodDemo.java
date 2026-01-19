package com.java.core.ClassAndObject;

import java.lang.reflect.InvocationTargetException;

class Person{
    int id;
    String name;
    Person(int id,String name){
        // compiler calls super() implicitly.
        this.id=id;
        this.name=name;
    }
}
public class NewInstanceMethodDemo {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, ClassNotFoundException {
        Person p1=Person.class              // gives class object of Person.
                .getDeclaredConstructor()   // finds no argument constructor of Person.
                .newInstance();             // calls that constructor.

        Person p2=(Person)Class.forName("Person")
                .getDeclaredConstructor()
                .newInstance();
    }
}
