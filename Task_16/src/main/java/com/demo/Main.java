package com.demo;

import com.product.Product;
import com.product.ProductMarket;

public class Main {
    public static void main(String[] args) {
        ProductMarket productList = new ProductMarket();

        productList.addProduct(new Product("Tomato", 4));
        productList.addProduct(new Product("Cabbage", 10));
        productList.addProduct(new Product("Cucumber", 18));

        System.out.println(productList.printProductNames());
        System.out.println(productList.printAlphabeticProductNames());
        System.out.println(productList.printProductPricesOver10());
        System.out.println(productList.printProductPricesBelow5());
        System.out.println(productList.printProductPrices());

        //sorting via Comparator - by price
        System.out.println(productList.sortProductsByPriceComparator());
        //sorting via Comparator - by name
        System.out.println(productList.sortProductsByNameComparator());
        //sorting via Comparable - by price
        System.out.println(productList.sortProductsByPriceComparable());
    }
}
