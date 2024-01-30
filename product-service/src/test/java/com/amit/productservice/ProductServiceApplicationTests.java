package com.amit.productservice;

import com.amit.productservice.dto.ProductRequest;
import com.amit.productservice.dto.ProductResponse;
import com.amit.productservice.model.Product;
import com.amit.productservice.repository.ProductRepository;
import com.amit.productservice.service.ProductService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.springframework.test.web.servlet.MockMvc;


import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.testcontainers.containers.MongoDBContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

import java.math.BigDecimal;
import java.util.List;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

//@SpringBootTest
//@Testcontainers
//@AutoConfigureMockMvc
class ProductServiceApplicationTests {

//	@Container
//	static MongoDBContainer mongoDBContainer = new MongoDBContainer("mongo:latest").withExposedPorts(27017);
//	@Autowired
//	private MockMvc mockMvc;
//	@Autowired
//	private ObjectMapper objectMapper;
//	@Autowired
//	private ProductService productService;
//	@Autowired
//	private ProductRepository productRepository;
//
//	@BeforeEach
//	void setup() {
//		productRepository.deleteAll();
//	}
//
//
//	@DynamicPropertySource
//	static void setProperties(DynamicPropertyRegistry dynamicPropertyRegistry) {
//		dynamicPropertyRegistry.add("spring.data.mongodb.uri", mongoDBContainer::getReplicaSetUrl);
//	}
//
//	@Test
//	void shouldCreateProduct() throws Exception {
//		ProductRequest productRequest = getProductRequest();
//		String productRequestString = objectMapper.writeValueAsString(productRequest);
//		mockMvc.perform(MockMvcRequestBuilders.post("/api/product")
//				.contentType(MediaType.APPLICATION_JSON)
//				.content(productRequestString))
//				.andExpect(status().isCreated());
//        Assertions.assertEquals(1, productRepository.findAll().size());
//	}
//
//	private ProductRequest getProductRequest() {
//		return ProductRequest.builder()
//				.name("OnePlus 20")
//				.description("OnePlus of Future")
//				.price(BigDecimal.valueOf(1200))
//				.build();
//	}
//
//	@Test
//	void shouldGetAllProducts() {
//		Product product = new Product(null, "OnePlus 20", "OnePlus of Future", BigDecimal.valueOf(1200));
//		productRepository.save(product);
//
//		List<ProductResponse> products = productService.getAllProducts();
//
//		Assertions.assertNotNull(products);
//		Assertions.assertEquals(1, products.size());
//		Assertions.assertEquals("OnePlus 20", products.getFirst().getName());
//		Assertions.assertEquals("OnePlus of Future", products.getFirst().getDescription());
//		Assertions.assertEquals(0, BigDecimal.valueOf(1200).compareTo(products.getFirst().getPrice()));
//	}

}



