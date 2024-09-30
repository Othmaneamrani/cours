package org.example.cours.controller;


import org.example.cours.models.Product;
import org.example.cours.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private IProductService iProductService;



    @PostMapping("/create")
    Product createProduct(@RequestBody Product product){
        return iProductService.createProduct(product);
    }


    @PutMapping("/update")
    Product updateProduct(@RequestBody Product product){
        return iProductService.updateProduct(product);
    }


    @GetMapping("/all")
    List<Product> getAllProducts(){
        return iProductService.getAllProducts();
    }


    @DeleteMapping("/delete/{id}")
    void deleteProduct (@PathVariable int id){
        iProductService.deleteProduct(id);
    }



}
