package com.example.StudentProtal.Service;

import com.example.StudentProtal.Modal.Book;
import com.example.StudentProtal.Repo.IBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    IBook iBook;
    public String addBook(Book newBook) {
        iBook.save(newBook);
        return "books added";
    }

    public List<Book> getAdd() {
        return iBook.findAll();
    }

    public Book getById(Integer id) {
         return iBook.findById(id).get();
    }

    public String updatePrice(Integer id, String price) {
        Book book=iBook.findById(id).get();
        book.setPrice(price);
        iBook.save(book);
        return "price updated";
    }

    public String remove(Integer id) {
        iBook.deleteById(id);
        return "book removed";
    }
}
