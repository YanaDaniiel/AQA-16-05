package com.product;

import java.util.Collections;
import java.util.ArrayList;

public class ProductMarket {

    private ArrayList<Product> productList;

    public ProductMarket() {
        this.productList = new ArrayList<>();
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public String printProductNames() {
        ArrayList<String> allProductNames = new ArrayList<>();
        for (Product product : productList) {
            allProductNames.add(product.getName());
        }
        return allProductNames.toString();
    }

    public String printAlphabeticProductNames() {
        ArrayList<String> allProductNamesSorted = new ArrayList<>();
        for (Product product : productList) {
            allProductNamesSorted.add(product.getName());
        }
        Collections.sort(allProductNamesSorted);
        return allProductNamesSorted.toString();
    }

    public String printProductPricesOver10() {
        ArrayList<Float> allProductPricesOver10 = new ArrayList<>();
        for (Product product : productList) {
            if (product.getPrice() > 10) {
                allProductPricesOver10.add(product.getPrice());
            }
        }
        return allProductPricesOver10.toString();
    }

    public String printProductPricesBelow5() {
        ArrayList<Float> allProductPricesBelow5 = new ArrayList<>();
        for (Product product : productList) {
            if (product.getPrice() < 5) {
                allProductPricesBelow5.add(product.getPrice());
            }
        }
        return allProductPricesBelow5.toString();
    }

    public String printProductPrices() {
        ArrayList<Float> allProductPrices = new ArrayList<>();
        for (Product product : productList) {
            allProductPrices.add(product.getPrice());
        }
        return allProductPrices.toString();
    }
}
