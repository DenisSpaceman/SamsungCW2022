package com.samsung.practicWork29112022.model;

public class DomoService {

    University university;

    public DomoService() {
    }

    public void demo(){

        Student student1 = new Student("Грачев", "Денис", "Алексеевич",
                "+79875673543", 228);
        Student student2 = new Student("Иванов", "Иван", "Иванович", 101);

        Teacher teacher1 = new Teacher("Максимов", "Максим", "Максимович",
                   "+78005553535", "Болтология");
        Teacher teacher2 = new Teacher("Семионов", "Семён", "Семёнович", "Исскуство");

        Student [] students = {student1, student2};
        Teacher [] teachers = {teacher1, teacher2};

        university = new University("Москва, Пирожочное шоссе, 22/3", students, teachers);
        university.printInfoToConsoleSuperKpacuBo();

        System.out.println();
        student1.sayHello();
        teacher1.sayHello();
    }
}
