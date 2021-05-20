package com.example.saurav.springboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.saurav.springboot.entity.Book;

 

public interface BookRepository  extends CrudRepository<Book,Integer>
{

}
