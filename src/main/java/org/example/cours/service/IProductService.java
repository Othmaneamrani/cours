package org.example.cours.service;

import org.example.cours.models.Product;

import java.util.List;


public interface IProductService {

    Product createProduct(Product product);
    Product updateProduct(Product product);
    List<Product> getAllProducts();
    void deleteProduct (int id);

}
