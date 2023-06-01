package org.example;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book(10L, "Alice", 2.77f, 10, "Eminescu", "Fantasy");
        Book book2 = new Book(11L, "DaVinci Code", 9.99f, 100, "Dan Brown", "Detective");
        Electronics device1 = new Electronics(1L, "iPhone", 850.99f, 25, "Apple", "12 Pro Max");
        Electronics device2 = new Electronics(2L, "Pixel", 660.82f, 25, "Google", "Pixel 6a");

        ShoppingCart cart = new ShoppingCart();

        cart.addInCart(book1, 2);
        cart.addInCart(book2, 8);
        cart.addInCart(device1, 2);
        cart.addInCart(device2, 1);

        cart.calculateTotalPrice();
        cart.displayCart();
    }
}