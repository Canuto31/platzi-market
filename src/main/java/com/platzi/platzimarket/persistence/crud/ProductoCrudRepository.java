package com.platzi.platzimarket.persistence.crud;

import org.springframework.data.repository.CrudRepository;

import com.platzi.platzimarket.persistence.entity.Producto;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer>{
    
}
