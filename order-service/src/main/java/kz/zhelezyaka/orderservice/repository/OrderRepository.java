package kz.zhelezyaka.orderservice.repository;

import kz.zhelezyaka.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
