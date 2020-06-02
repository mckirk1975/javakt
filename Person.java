package org.example.model;

public class Person {  // extends Object by default

    private String name;
    private int age;

    public Person() {

        System.out.println("no args person constructor called");
    }

    public Person(String theName) {

        System.out.println("with name only args person constructor called");

        this.name = theName;
    }

    public Person(String theName, int theAge) {

        System.out.println("with name and age args person constructor called");


        this.name = theName;
        this.age = theAge;
    }


    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int theAge) {

        this.age = theAge;
    }

    public String toString() {  // override toString method inherited from Object class

        return "Person: " + name + ", age: " + age;
    }

}
