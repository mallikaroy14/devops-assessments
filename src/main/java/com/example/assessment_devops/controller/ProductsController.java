package com.example.assessment_devops.controller;

import com.example.assessment_devops.models.Products;
import com.example.assessment_devops.services.ProductsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api/v1/products")
@RestController
public class ProductsController {

    @Autowired
    ProductsServices productsServices;

    @GetMapping("/")
    public List<Products> getAll(){
        return productsServices.getAll();
    }
}
