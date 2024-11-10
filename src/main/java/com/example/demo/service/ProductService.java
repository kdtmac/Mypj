package com.example.demo.service;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    // 获取所有商品
    public List<Product> getAllProducts() {
//        System.out.println(productRepository.findAll());
        return productRepository.findAll();
    }

    // 保存一个商品
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    // 初始化数据
    @PostConstruct
    public void init() {
        if (productRepository.count() == 0) {
            productRepository.save(new Product("iPhone 15", "最新款iPhone，超强性能", 7999.99));
            productRepository.save(new Product("MacBook Pro 16", "高性能笔记本，适合开发者", 14999.00));
            productRepository.save(new Product("AirPods Pro 2", "高品质无线耳机", 2399.00));
        }
    }
}
