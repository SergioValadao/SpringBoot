package br.com.savsoftware.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.savsoftware.springboot.entities.Usuario;

public interface UserRepository extends JpaRepository<Usuario, Long> {

}
