package com.antifull.servicioproductos.repository;

import com.antifull.servicioproductos.entity.ProductoEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends MongoRepository<ProductoEntity,String> {
}
