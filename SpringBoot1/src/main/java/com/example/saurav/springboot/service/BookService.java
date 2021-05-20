package com.example.saurav.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.saurav.springboot.entity.Book;

import com.example.saurav.springboot.repository.BookRepository;

public class BookService {

	@Autowired
	BookRepository bookrepository;

	public List<Book> getAllBook() {
		return null;
	}

	public Book getBookById(Book bookid) {
		return bookid;
	}

	public void saveorUpdate(Book book) {
		bookrepository.save(book);
	}

	public void delete(int id) {
		bookrepository.deleteById(id);
	}

	public void update(Book book, int bookid) {
		bookrepository.save(book);
	}
}
