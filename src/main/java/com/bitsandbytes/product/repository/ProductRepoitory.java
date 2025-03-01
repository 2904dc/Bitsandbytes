package com.bitsandbytes.product.repository;

import com.bitsandbytes.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepoitory extends JpaRepository<Product, Long> {

}
