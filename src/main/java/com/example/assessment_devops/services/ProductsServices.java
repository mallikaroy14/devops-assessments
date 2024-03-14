package com.example.assessment_devops.services;

import com.example.assessment_devops.ProductsRepository;
import com.example.assessment_devops.models.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsServices {


    @Autowired
    ProductsRepository productsRepository;

    public List<Products> getAll(){
        return productsRepository.findAll();
    }


}
