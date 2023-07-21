package com.platzi.platzimarket.persistence.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "compras_productos")
@Data
public class CompraProducto {
    
    @EmbeddedId
    private CompraProductoPK id;

    private Integer cantidad;

    private Integer total;

    private Boolean estado;
}
