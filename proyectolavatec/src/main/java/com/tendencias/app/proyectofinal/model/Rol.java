package com.tendencias.app.proyectofinal.model;

import jakarta.persistence.*;
import lombok.Data;

public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_rol")
    private int id_rol;
    private String nombre_rol;
    private int estado;

}
