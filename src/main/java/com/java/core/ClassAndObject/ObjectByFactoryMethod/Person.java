package com.java.core.ClassAndObject.ObjectByFactoryMethod;

class Person {
    private int id;
    private String name;

    private Person(int id,String name){ // private constructor ensures object creation via factory.
        this.id=id;
        this.name=name;
    }

    public static Person createPerson(int id,String name){ // static so caller does not need Person instance.
        Person p=new Person(id, name);
        return p;
    }

    @Override
    public String toString(){
        return "Person{" +
                "id"+id
                +"name"+name+
                "}";
    }
}
