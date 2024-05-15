package ru.gb.homework_4.service;

import org.springframework.stereotype.Service;
import ru.gb.homework_4.domain.Book;
import ru.gb.homework_4.repository.BookStoreRepository;

import java.util.List;

@Service
public class BookStoreService {

    private BookStoreRepository bookStoreRepository;

    public BookStoreService(BookStoreRepository bookStoreRepository) {
        this.bookStoreRepository = bookStoreRepository;
    }

    public List<Book> getAllBooks() {
        return bookStoreRepository.getBooks();
    }

    public void addBook(Book book) {
        bookStoreRepository.addBook(book);
    }
}
