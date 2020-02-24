package com.main.library.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.main.library.DTO.BookDto;
import com.main.library.entities.Book;
import com.main.library.service.BookService;

@RestController
public class BookController {

	@Autowired
	BookService bookService;

	@RequestMapping(value = "/book", method = RequestMethod.GET)
	public List<Book> getBookList(@RequestParam(name = "page", defaultValue = "0" ) int page, 
								@RequestParam (name = "pageSize", defaultValue = "10") int pageSize) {
		return bookService.getAllBooks(page, pageSize);
	}

	@RequestMapping(value = "/book/{id}", method = RequestMethod.GET)
	public Book getBook(@PathVariable Integer id) {
		return bookService.getBook(id);
	}
	
	@RequestMapping(value = "/book", method = RequestMethod.POST)
	public Book addBook(@RequestBody BookDto bookDto) {
		return bookService.saveBook(bookDto);

	}

}
