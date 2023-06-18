package br.com.diogo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.diogo.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {}