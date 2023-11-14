package kz.zhelezyaka.productservice.repository;

import kz.zhelezyaka.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
