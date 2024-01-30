package com.amit.productservice.service;

import com.amit.productservice.dto.ProductRequest;
import com.amit.productservice.dto.ProductResponse;
import com.amit.productservice.model.Product;
import com.amit.productservice.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {

    private final ProductRepository productRepository;
    public void createProduct(ProductRequest productRequest) {
        Product product = Product.builder()
                .name(productRequest.getName())
                .description((productRequest.getDescription()))
                .price(productRequest.getPrice())
                .build();

        productRepository.save(product);
        log.info("Product {} with ID {} is saved.", product.getName(), product.getId());
    }

    public List<ProductResponse> getAllProducts() {
        List<Product> all_products = productRepository.findAll();
        return all_products.stream().map(this::mapToProductResponse).toList();
    }

    private ProductResponse mapToProductResponse(Product product) {
        return ProductResponse.builder()
                .id(product.getId())
                .name((product.getName()))
                .description((product.getDescription()))
                .price(product.getPrice())
                .build();
    }
}

