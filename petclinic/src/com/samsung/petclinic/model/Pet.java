package com.samsung.petclinic.model;

public class Pet {
    private String moniker;
    private String ownerName;
    private String petType;
    private String [] visitDates = new String[99999];

    public Pet(String moniker, String ownerName, String petType){
        this.moniker = moniker;
        this.ownerName = ownerName;
        this.petType = petType;
    }

    public String getMoniker() {
        return moniker;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getPetType() {
        return petType;
    }

    public void petInfo(){
        System.out.println("Moniker: " + moniker);
        System.out.println("Owner: " + ownerName);
        System.out.println("Pet type: " + petType);
        System.out.println();
    }

    public void addVisit(String date){
        for (int i = 0; i < visitDates.length; i++){
            if (visitDates[i] == null){
                visitDates[i] = date;
                break;
            }
        }
    }

    public void visitsInfo(){
        boolean haveVisit = false;
        for (int i = 0; i < visitDates.length; i++){
            if (visitDates[i] == null) break;
            else{
                haveVisit = true;
                System.out.println(visitDates[i]);
            }
        }
        if (!haveVisit){
            System.out.println("No visits!");
            System.out.println();
        }else{
            System.out.println();
        }
    }
}
