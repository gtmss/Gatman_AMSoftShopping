package org.example;

import java.math.BigDecimal;
import java.security.KeyPair;
import java.util.*;

public class ShoppingCart {
    private LinkedHashMap<Product, Integer> productsInCart = new LinkedHashMap<>();


    public void addInCart(Product product, Integer selectedQuantity) {
        if (checkAvailableQuantity(product, selectedQuantity)) {
            Integer availableQuanity = product.getQuantity();
            product.setQuantity(availableQuanity - selectedQuantity);
            productsInCart.put(product, selectedQuantity);
        }
    }

    private boolean checkAvailableQuantity(Product product, Integer quantity) {
        if (product.getQuantity() - quantity < 0) {
            System.out.println("Such quanity of this product is not available!");
            System.out.println(product.getQuantity() + " available");
            return false;
        }
        else return true;
    }

    public void displayCart() {
        productsInCart.forEach((product, integer) -> {
            System.out.println("______________________");
            System.out.println("Product ID: " +  product.getId());
            System.out.println("Product Name: " + product.getName());
            System.out.println("Price of one unit: " + product.getPrice());
            System.out.println("Selected quantity: " + integer);
            System.out.println("Total: " + integer * product.getPrice());
        });
        System.out.println("********************************************");
        System.out.println("TOTAL ORDER VALUE: " + calculateTotalPrice());
    }

    public float calculateTotalPrice() {
        float totalValue = 0.0f;
        for (Map.Entry<Product, Integer> entry : productsInCart.entrySet()) {
            Product product = entry.getKey();
            int quantity = entry.getValue();
            float price = product.getPrice();
            float productValue = price * quantity;
            totalValue += productValue;
        }
        return totalValue;
    }
}
