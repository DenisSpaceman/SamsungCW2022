package com.samsung.model;

public class Person {
    public String name;
    public byte age;

    public void birthday(){
        age++;
    }

    public void printInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println();
    }
}
