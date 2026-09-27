package com.danagar.FinCore.respositories;

import com.danagar.FinCore.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Long> {
}
