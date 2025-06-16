package com.microservices.product_service.dto;

import java.math.*;


/* What is a Java record?
A record is a special type of class in Java used to create immutable data carriers — like DTOs (Data Transfer Objects) — with minimal boilerplate.

It automatically generates:

private final fields

Constructor

getters() (accessible via field names)

equals(), hashCode(), and toString()*/
public record ProductRequest(String id, String name, String description,
                             String skuCode, BigDecimal price) { }
