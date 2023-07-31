package com.product;

import com.comparators.ProductComparatorByName;
import com.comparators.ProductComparatorByPrice;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class ProductMarket {

    private ArrayList<Product> productList;

    public ProductMarket() {
        this.productList = new ArrayList<>();
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public ArrayList<String> printProductNames() {
        ArrayList<String> allProductNames = new ArrayList<>();
        for (Product product : productList) {
            allProductNames.add(product.getName());
        }
        return allProductNames;
    }

    public ArrayList<String> printAlphabeticProductNames() {
        ArrayList<String> allProductNamesSorted = new ArrayList<>();
        for (Product product : productList) {
            allProductNamesSorted.add(product.getName());
        }
        Collections.sort(allProductNamesSorted);
        return allProductNamesSorted;
    }

    public ArrayList<Integer> printProductPricesOver10() {
        ArrayList<Integer> allProductPricesOver10 = new ArrayList<>();
        for (Product product : productList) {
            if (product.getPrice() > 10) {
                allProductPricesOver10.add(product.getPrice());
            }
        }
        return allProductPricesOver10;
    }

    public ArrayList<Integer> printProductPricesBelow5() {
        ArrayList<Integer> allProductPricesBelow5 = new ArrayList<>();
        for (Product product : productList) {
            if (product.getPrice() < 5) {
                allProductPricesBelow5.add(product.getPrice());
            }
        }
        return allProductPricesBelow5;
    }

    public ArrayList<Integer> printProductPrices() {
        ArrayList<Integer> allProductPrices = new ArrayList<>();
        for (Product product : productList) {
            allProductPrices.add(product.getPrice());
        }
        return allProductPrices;
    }

    public List<Product> sortProductsByPriceComparator() {
        List<Product> products = new ArrayList<>(productList);
        Collections.sort(products, new ProductComparatorByPrice());
        return products;
    }

    public List<Product> sortProductsByNameComparator() {
        List<Product> products = new ArrayList<>(productList);
        Collections.sort(products, new ProductComparatorByName());
        return products;
    }

    public List<Product> sortProductsByPriceComparable() {
        List<Product> products = new ArrayList<>(productList);
        Collections.sort(products);
        return products;
    }
}
