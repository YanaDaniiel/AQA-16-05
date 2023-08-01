package com.product;

import java.util.*;

public class ProductMarket {

    private List<Product> productList;

    public ProductMarket(List<Product> products) {
        this.productList = products;
    }

    public List<String> getProductNames() {
        return productList.stream()
                .map(Product::getName)
                .toList();
    }

    public List<String> getAlphabeticProductNames() {
        return productList.stream()
                .map(Product::getName)
                .sorted()
                .toList();
    }

    public List<Integer> getProductPricesOver10() {
        return productList.stream()
                .filter(product -> product.getPrice() > 10)
                .map(Product::getPrice)
                .toList();
    }

    public List<Integer> getProductPricesBelow0() {
        return productList.stream()
                .filter(product -> product.getPrice() < 0)
                .map(Product::getPrice)
                .toList();
    }

    public List<String> getProductPrices() {
        return productList.stream()
                .map(product -> String.valueOf(product.getPrice()))
                .toList();
    }
}
