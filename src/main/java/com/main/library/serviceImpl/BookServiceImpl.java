package com.main.library.serviceImpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.main.library.DTO.BookDto;
import com.main.library.entities.Book;
import com.main.library.repo.BookRepository;
import com.main.library.service.BookService;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	BookRepository bookRepo;

	public List<Book> getAllBooks(Integer page, Integer pageSize) {
		Pageable pageable = PageRequest.of(page, pageSize);
		return bookRepo.findAll(pageable);
	}

	public Book saveBook(BookDto bookDto) {

		Book book = new Book();
		book.setName(bookDto.getName());
		book.setIsbn(bookDto.getIsbn());
		book.setCreatedDate(new Date());
		bookRepo.save(book);
		bookRepo.flush();
		return book;

	}

	@Override
	public Book getBook(Integer id) {
		return bookRepo.findById(id);
	}


}
