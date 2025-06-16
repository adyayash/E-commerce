package com.microservices.product_service.dto;

import java.math.*;

public record ProductResponse(String id, String name, String description,
                              String skuCode, BigDecimal price) {
}
