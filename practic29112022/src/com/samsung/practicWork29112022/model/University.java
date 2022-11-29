package com.samsung.practicWork29112022.model;

public class University implements Printer{

    String address;
    Student [] students;
    Teacher [] teachers;

    public University(String address, Student[] students, Teacher[] teachers) {
        this.address = address;
        this.students = students;
        this.teachers = teachers;
    }

    public String getAddress() {
        return address;
    }

    public Student[] getStudents() {
        return students;
    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    @Override
    public void printInfoToConsoleSuperKpacuBo(){
        System.out.println();
        System.out.println("_______________________________УНИВЕРСИТЕТ_______________________________");
        System.out.println(getAddress());
        for (int i = 0; i < students.length; i++) students[i].printInfoToConsoleSuperKpacuBo();
        for (int i = 0; i < teachers.length; i++) teachers[i].printInfoToConsoleSuperKpacuBo();

    }
}
