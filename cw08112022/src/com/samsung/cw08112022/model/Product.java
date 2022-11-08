package com.samsung.cw08112022.model;

public class Product {

    private String name;
    private int cost;
    private int count;

    public static int productCount = 0;

    public Product(String name, int cost, int count){
       this.name = name;
       this.cost = cost;
       this.count = count;

       productCount++;
    }

    public static void changeCount(Product v, int count){
        count = v.count;
    }

    @Override
    public String toString(){
        String res = "Name: " + name + "\n"
                   + "Cost: " + cost + "\n"
                   + "Count: " + count;
        return res;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public int getCount() {
        return count;
    }
}
