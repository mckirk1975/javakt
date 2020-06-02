package org.example.application;

import org.example.model.Person;

public class PersonMaker {


    public static void main(String[] args) {

        Person a = new Person();
        a.setName("Matt");
        a.setAge(45);

        Person b = new Person("Neville", 21);
//        b.setName("Neville");
//        b.setAge(21);

        Person c = new Person("Moira");
        c.setAge(21);


        print(a);
        print(b);
        print(c);

        c.setName("Douglas");

        print(c);

    }

    private static void print(Person p) {

        System.out.println("Person = " + p);  // calls toString method on object p

        System.out.println("Person name = " + p.getName());

        System.out.println("Person age = " + p.getAge());

    }

}
