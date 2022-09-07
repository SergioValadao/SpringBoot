package br.com.savsoftware.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.savsoftware.springboot.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
