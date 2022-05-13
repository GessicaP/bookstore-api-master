package com.gessica.bookstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gessica.bookstore.domain.Livro;

public interface LivroRepository extends JpaRepository<Livro, Integer>{

}
