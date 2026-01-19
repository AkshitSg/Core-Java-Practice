package com.java.core.ClassAndObject.SerializationDeserialisation;

import java.io.Serializable;

class Person implements Serializable { // Serializable is markers interface(no methods).
    int id;
    String firstname;
    String lastname;

    Person(int id, String firstname, String lastname){
        System.out.println("constructor called.");
        this.id=id;
        this.firstname=firstname;
        this.lastname=lastname;
    }
    @Override
    public String toString(){
     return "Person {"
             +"\nPerson id: "+id
             +"\nPerson firstname: "+firstname
             +"\nperson lastname: "+lastname;
    }
}
