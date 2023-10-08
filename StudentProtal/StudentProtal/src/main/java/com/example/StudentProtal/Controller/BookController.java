package com.example.StudentProtal.Controller;


import com.example.StudentProtal.Modal.Address;
import com.example.StudentProtal.Modal.Book;
import com.example.StudentProtal.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    BookService bookService;
    @PostMapping("Books")
    public String addBook(@RequestBody Book newBook)
    {
        return bookService.addBook(newBook);
    }
    @GetMapping("Books")
    public List<Book> Add() {
        return bookService.getAdd();
    }
    @GetMapping("FindBookById")
    public  Book getById(@RequestParam Integer id){
        return  bookService.getById(id);
    }
    @PutMapping("UpdatingPrice")
    public  String updateAddState(@RequestParam Integer id , String price){
        return bookService.updatePrice(id,price);
    }
    @DeleteMapping("RemoveBook")
    public  String remove(@RequestParam Integer id){
        return bookService.remove(id);
    }

}
