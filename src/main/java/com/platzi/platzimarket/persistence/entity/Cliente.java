package com.platzi.platzimarket.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "clientes")
@Data
public class Cliente {
    
    @Id
    private Integer id;

    private String nombre;
    
    private String apellidos;

    private Integer celular;

    private String direccion;

    @Column(name = "correo_electronico")
    private String correoElectronico;
}
