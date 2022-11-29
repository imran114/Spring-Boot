package com.evampsaanga.jpa.controller;

import com.evampsaanga.jpa.model.Product;
import com.evampsaanga.jpa.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService service;
    @PostMapping("/products")
    public void add(@RequestBody Product product) {
        service.save(product);
    }

    @GetMapping("/products")
    public List<Product> list() {
        return service.listAll();
    }
}
