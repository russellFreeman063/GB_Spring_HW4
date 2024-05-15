package ru.gb.homework_4.domain;


public class Book {

    private String name;
    private String author;
    private int quantity;

    public Book(String name, String author, int quantity) {
        this.name = name;
        this.author = author;
        this.quantity = quantity;
    }


    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
