package org.example.service;

import org.example.dto.Product;

import java.util.List;

public interface ProductService {
    void addProduct(Product product);

    void updateProduct(Product product);

    void deleteProduct(String id);
    List<Product> getAll();

    List<Product> searchByCategory(String category);
}
