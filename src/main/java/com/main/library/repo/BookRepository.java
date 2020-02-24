package com.main.library.repo;


import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import com.main.library.entities.Book;

@org.springframework.stereotype.Repository
public interface BookRepository extends Repository<Book,Integer>{
	
	List<Book> findAll(Pageable pageable);
	
	void save(Book book);
	
	void flush();
	
	Book findById(Integer id);

}
