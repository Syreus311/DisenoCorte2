package com.kjuli.monitoringback.service;

import com.kjuli.monitoringback.dto.ProductDTO;
import com.kjuli.monitoringback.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();
    Product getProductByID(Long id);
    Product createProduct(ProductDTO product);
    Product updateProduct(Long id, Product product);
    void deleteProduct(Long id);
}