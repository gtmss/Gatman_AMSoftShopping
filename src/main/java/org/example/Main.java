package org.example;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book(10L, "Alice", 2.77f, 10, "Eminescu", "Fantasy");
        Electronics electro1 = new Electronics(1L, "iPhone", 850.99f, 25, "Apple", "12 Pro Max");
        ShoppingCart cart = new ShoppingCart();
        cart.addInCart(book1, 10);
        cart.addInCart(electro1, 1);
        cart.displayCart();
    }
}