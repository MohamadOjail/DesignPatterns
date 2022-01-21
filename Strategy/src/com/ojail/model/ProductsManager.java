package com.ojail.model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ProductsManager{

    private final List<Product> products = new ArrayList<>();
    private String sortStrategy;

    public void addProduct(Product product){
        products.add(product);
    }

    public void sortProducts(String sortStrategy){

        this.sortStrategy = sortStrategy;

        switch (sortStrategy){
            case "price" ->  products.sort(Comparator.comparingDouble(Product::getPrice));
            case  "qty" -> products.sort( Comparator.comparingInt(Product::getQty));
            default ->  products.sort(Comparator.comparing(Product::getName));
        }
    }

    public void printProductsList(){
        System.out.println();
        System.out.println("\t--Products list sorted by: " + this.sortStrategy + " --");
        for (Product product: products) {
            System.out.println("\t" + product.getName() + " " + product.getPrice() + "$ " + product.getQty() + "-stk");
        }
    }
}
