package com.platzi.platzimarket.domain;

import lombok.Data;

@Data
public class Product {
    
    private int ProductId;
    private String ProductName;
    private int categoryId;
    private double price;
    private int sotck;
    private boolean active;
    private Category category;
}
