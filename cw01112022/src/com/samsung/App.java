package com.samsung;

import com.samsung.model.Person;

import java.net.Inet4Address;

public class App {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Valera";
        person.age = 18;

        Person person1 = new Person();
        person1.name = "Vasya";
        person1.age = 18;

        person.printInfo();
        person.birthday();
        person.printInfo();

        Integer a = 1;
        String s = a.toString();
    }
}
