package com.samsung.cw08112022;

import com.samsung.cw08112022.model.Product;

public class App {
    public static void main(String[] args) {
        Product product = new Product("Ham", 120, 1000);
        System.out.println(product.toString());
    }
}
