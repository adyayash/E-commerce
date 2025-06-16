package com.microservices.product_service.model;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import java.math.BigDecimal;

@Document(value = "product") // tells that it was mongodb document
@Data // Gentrated getter setter
@AllArgsConstructor //create constructor - parameete
@NoArgsConstructor //create constructor - no arg
@Builder
public class Product {
    private String id;
    private String name;
    private String description;
    private String skuCode;
    private BigDecimal price;
}

