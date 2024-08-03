package com.example.simplewebapp.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.simplewebapp.model.Product;
import com.example.simplewebapp.repository.ProductRepo;

@Service
public class ProductService {
    @Autowired
    ProductRepo repo;

   
    public List<Product> getProducts(){
        return repo.findAll();
    }
    public Product getProdId(int prodId) {
        return repo.findById(prodId).orElse(new Product());


    }

    public void addProduct(Product prod){
        repo.save(prod);
    }

    public void updateProduct(Product prod){
        repo.save(prod);
    }
    public void deleteProduct(int prodId) {
        repo.deleteById(prodId);

    }

}