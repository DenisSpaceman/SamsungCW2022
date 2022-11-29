package com.samsung.practicWork29112022.model;

public class Student extends User implements Printer{

    int group;

    public Student(String lastName, String firstName, String midName, String phoneNumber, int group){
        super(firstName, lastName, midName, phoneNumber);
        this.group = group;
    }

    public Student(String lastName, String firstName, String midName, int group){
        super(firstName, lastName, midName);
        this.group = group;
    }

    public Student(User user, int group) {
        super(user);
        this.group = group;
    }

    public int getGroup() {
        return group;
    }

    @Override
    public void sayHello(){
        System.out.println();
        System.out.println("Привет! Я студент, моё имя " + getFirstName() + ".");
    }

    @Override
    public void printInfoToConsoleSuperKpacuBo(){
        System.out.println("\n");
        System.out.println("_________________________________СТУДЕНТ_________________________________");
        System.out.println("Фамилия: " + getLastName());
        System.out.println("Имя: " + getFirstName());
        System.out.println("Отчество: " + getMidName());
        System.out.println("Телефон: " + getPhoneNumber());
        System.out.print("Группа: " + getGroup());
    }

}
