package com.samsung.practicWork29112022.model;

public class Teacher extends User implements Printer{

    String descipline;

    public Teacher(String lastName, String firstName, String midName, String phoneNumber, String descipline) {
        super(firstName, lastName, midName, phoneNumber);
        this.descipline = descipline;
    }

    public Teacher(String lastName, String firstName, String midName, String descipline) {
        super(firstName, lastName, midName);
        this.descipline = descipline;
    }

    public Teacher(User user, String descipline) {
        super(user);
        this.descipline = descipline;
    }

    public String getDescipline() {
        return descipline;
    }

    @Override
    public void sayHello(){
        System.out.println();
        System.out.println("Здравствуйте! Я преподаватель, моё имя " + getFirstName() + " " + getMidName()  + ".");
    }

    @Override
    public void printInfoToConsoleSuperKpacuBo(){
        System.out.println("\n");
        System.out.println("______________________________ПРЕПОДАВАТЕЛЬ______________________________");
        System.out.println("Фамилия: " + getLastName());
        System.out.println("Имя: " + getFirstName());
        System.out.println("Отчество: " + getMidName());
        System.out.println("Телефон: " + getPhoneNumber());
        System.out.print("Дисциплина: " + getDescipline());
    }

}
