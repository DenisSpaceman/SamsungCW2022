package com.samsung.practicWork29112022.model;

public abstract class User {
    private String firstName, lastName, midName, phoneNumber;

    public User(String firstName, String lastName, String midName, String phoneNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.midName = midName;
        this.phoneNumber = phoneNumber;
    }

    public User(String firstName, String lastName, String midName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.midName = midName;
    }

    public User(User user){
        this.firstName = user.firstName;
        this.lastName = user.lastName;
        this.midName = user.midName;
        this.phoneNumber = user.phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMidName() {
        return midName;
    }

    public String getPhoneNumber() {
        if (phoneNumber == null) return "Не указано";
        else return phoneNumber;
    }

    public abstract void sayHello();
}
