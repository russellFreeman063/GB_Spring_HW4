package ru.gb.homework_4.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.gb.homework_4.domain.Book;
import ru.gb.homework_4.service.BookStoreService;

@Controller
public class BookStoreController {

    private BookStoreService service;

    public BookStoreController(BookStoreService service) {
        this.service = service;
    }

    @GetMapping("bookstore")
    public String getBooks(Model model) {
        model.addAttribute("books", service.getAllBooks());
        return "bookstore";
    }

    @PostMapping("/bookstore")
    public String addBook(Book book, Model model) {
        service.addBook(book);
        model.addAttribute("books", service.getAllBooks());
        return "bookstore";
    }

}
