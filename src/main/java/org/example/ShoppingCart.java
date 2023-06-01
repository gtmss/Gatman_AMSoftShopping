package org.example;

import java.security.KeyPair;
import java.util.*;

public class ShoppingCart {
    private LinkedHashMap<Product, Integer> productInCart = new LinkedHashMap<>();

    public void addInCart(Product product, Integer selectedQuantity) {
        if (checkAvailableQuantity(product, selectedQuantity)) {
            Integer availableQuanity = product.getQuantity();
            product.setQuantity(availableQuanity - selectedQuantity);
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

    }
}
