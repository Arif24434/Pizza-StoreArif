package Arif.PizzaStore.repository;

import Arif.PizzaStore.domain.Order;

import java.util.List;

public interface OrderRepository {
    Order getById(long id);

    List<Order> findAll();

    void save(Order order);
}

