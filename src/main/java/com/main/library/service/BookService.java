package com.main.library.service;

import java.util.List;


import com.main.library.DTO.BookDto;
import com.main.library.entities.Book;

public interface BookService {

	public List<Book> getAllBooks(Integer page, Integer pageSize);
	
	public Book getBook(Integer id);

	public Book saveBook(BookDto bookDto);

}
