package org.example.cours.dao;

import org.example.cours.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductDao extends JpaRepository<Product,Integer> {
}
