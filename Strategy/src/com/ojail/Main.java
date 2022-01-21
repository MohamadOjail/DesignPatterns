package com.ojail;

import com.ojail.model.Product;
import com.ojail.model.ProductsManager;

public class Main {
    public static void main(String[] args) {

        ProductsManager productsManager = new ProductsManager();
        productsManager.addProduct(new Product("Graphics card", 1350.59, 26));
        productsManager.addProduct(new Product("Gaming keyboard", 850.89, 120));
        productsManager.addProduct(new Product("Motherboard", 1050.40, 40));
        productsManager.addProduct(new Product("Monitor", 1850.99, 56));

        productsManager.sortProducts(Strategies.name.toString());
        productsManager.printProductsList();

        productsManager.sortProducts(Strategies.price.toString());
        productsManager.printProductsList();

        productsManager.sortProducts(Strategies.qty.toString());
        productsManager.printProductsList();
    }
}
enum Strategies {
    name, price,qty
}