package com.java.core.ClassAndObject.SerializationDeserialisation;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ObjectInputStream ooi=new ObjectInputStream(        // converts bytes back to object.
                new FileInputStream("person.sez"));  // reads file for byte stream

        Person p2=(Person)ooi.readObject(); // gets field names back from bytes and allocates memory in heap.
        ooi.close();                        // stream closed.
        System.out.println("object after deserialization: "+p2.toString());
    }
}
