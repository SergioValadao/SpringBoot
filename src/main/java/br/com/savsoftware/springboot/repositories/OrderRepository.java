package br.com.savsoftware.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.savsoftware.springboot.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
