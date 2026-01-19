package com.java.core.ClassAndObject.SerializationDeserialisation;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {
    public static void main(String[] args) throws IOException {

        Person p1=new Person(1,"Akshit","Sagar");
        System.out.println("object created: "+p1.toString());

        ObjectOutputStream oos=new ObjectOutputStream(           // converts object into byte stream.
                new FileOutputStream("person.ser"));      //  opens file to write bytes.

        oos.writeObject(p1); // writes bytes to file.
        oos.close();        //  closes stream, serialization complete.
    }
}
