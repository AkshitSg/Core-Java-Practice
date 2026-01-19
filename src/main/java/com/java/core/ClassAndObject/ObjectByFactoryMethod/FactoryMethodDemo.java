package com.java.core.ClassAndObject.ObjectByFactoryMethod;

class FactoryMethodDemo {
    public static void main(String[] args) {

        Person p=Person.createPerson(1,"Akshit");
        System.out.println("object created with factory method:" +p.toString());
    }
}
