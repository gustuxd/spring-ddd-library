package com.library.domain.repository;

import com.library.domain.entity.Book;
import com.library.domain.entity.BookId;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, BookId> {
}
