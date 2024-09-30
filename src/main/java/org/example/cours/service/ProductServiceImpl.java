package org.example.cours.service;

import org.example.cours.dao.IProductDao;
import org.example.cours.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class ProductServiceImpl implements IProductService{


    @Autowired
    private IProductDao iProductDao;


    @Override
    public Product createProduct(Product product) {
        return iProductDao.save(product);
    }

    @Override
    public Product updateProduct(Product product) {
        return iProductDao.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return iProductDao.findAll();
    }

    @Override
    public void deleteProduct(int id) {
        Product product = iProductDao.findById(id).get();
        iProductDao.delete(product);
    }
}
