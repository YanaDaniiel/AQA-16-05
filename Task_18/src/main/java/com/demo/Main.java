package com.demo;

import com.product.Product;
import com.product.ProductMarket;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product("Onion", -2));
        products.add(new Product("Tomato", 4));
        products.add(new Product("Cabbage", 10));
        products.add(new Product("Cucumber", 18));

        ProductMarket productList = new ProductMarket(products);

        System.out.println(productList.getProductNames());
        System.out.println(productList.getAlphabeticProductNames());
        System.out.println(productList.getProductPricesOver10());
        System.out.println(productList.getProductPricesBelow0());
        System.out.println(productList.getProductPrices());
    }
}
