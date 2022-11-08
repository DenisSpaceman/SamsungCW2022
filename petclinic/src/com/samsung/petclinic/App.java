package com.samsung.petclinic;

import com.samsung.petclinic.model.Pet;

public class App {
    public static void main(String[] args) {
        Pet catStepan = new Pet("Stepan", "Denis", "Cat");
        Pet dogRoma = new Pet("Roma", "Ivan", "Dog");
        Pet parrotFlin = new Pet("Flin", "Nikolay", "Parrot");
        catStepan.addVisit("07.11.2022");
        catStepan.visitsInfo();
        catStepan.petInfo();
        System.out.println(parrotFlin.getPetType());
        parrotFlin.visitsInfo();
    }
}
