package com.rar.order.repository;

import com.rar.order.model.Order;
import org.springframework.data.repository.CrudRepository;

/**
 * Essa interface será responsável por fazer a “ponte” entre nossa camada de negócio e o banco de dados, podemos
 * ver que ela está estendendo a Interface CrudRepository ela é uma interface do Spring Data JPA que fornece uma
 * funcionalidade CRUD completa para a entidade que está sendo gerenciada.
 */

public interface OrderRepository  extends CrudRepository<Order, Integer> {
}