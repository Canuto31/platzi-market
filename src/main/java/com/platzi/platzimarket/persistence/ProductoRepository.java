package com.platzi.platzimarket.persistence;

import java.util.List;

import com.platzi.platzimarket.persistence.crud.ProductoCrudRepository;
import com.platzi.platzimarket.persistence.entity.Producto;

public class ProductoRepository {
    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getAll() {
        return (List<Producto>) productoCrudRepository.findAll();
    }
}
