package ru.gb.homework_4.repository;

import org.springframework.stereotype.Repository;
import ru.gb.homework_4.domain.Book;


import java.util.ArrayList;
import java.util.List;



@Repository
public class BookStoreRepository {


    private List<Book> books = new ArrayList<>();

    public BookStoreRepository(List<Book> books) {
        this.books = books;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getBooks() {
        return books;
    }

}
