package com.platzi.platzimarket.domain;

import lombok.Data;

@Data
public class Category {
    
    private int categoryId;
    private String categoryName;
    private boolean active;

}
