package com.tendencias.app.proyectofinal.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class ListadoOrdenes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lista_id")
    private int lista_id;
    private int estado;
    //foreing keys
    private double subtotal;
    private double descuento;
    private double iva;
    private double total;
}
