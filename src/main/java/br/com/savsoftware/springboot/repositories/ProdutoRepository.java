package br.com.savsoftware.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.savsoftware.springboot.entities.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

	
}
