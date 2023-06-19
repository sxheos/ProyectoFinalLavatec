package com.tendencias.app.proyectofinal.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_persona")
    private int id_persona;
    private String nombre_persona;
    private String identificacion;
    private String direccion;
    private String telefono;
}
