package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "productos")
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "id_vendedor")
    private Long sellerId;
    @Column(name = "id_marca")
    private Long brandId;
    @Column(name = "nombre")
    private String name;
    @Column(name = "descripcion")
    private String description;
    @Column(name = "precio")
    private BigDecimal price;
    private Integer stock;
    @Column(name = "esta_activo")
    private boolean isActive;
    @Column(name = "fecha_creacion")
    private LocalDateTime creationDate;
    @Column(name = "fecha_actualizacion")
    private LocalDateTime updateDate;


}
