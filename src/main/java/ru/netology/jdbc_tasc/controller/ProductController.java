package ru.netology.jdbc_tasc.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.jdbc_tasc.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }


    @GetMapping("/fetch-product")
    public ResponseEntity<List<String>> getProduct(@RequestParam("name") String productName) {
        return ResponseEntity.ok(service.getProduct(productName));
    }
}