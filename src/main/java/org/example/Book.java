package org.example;

public class Book extends Product{
    private String author;
    private String genre;

    public Book(Long id, String name, Float price, Integer quantity, String author, String genre) {
        super(id, name, price, quantity);
        this.author = author;
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

}
