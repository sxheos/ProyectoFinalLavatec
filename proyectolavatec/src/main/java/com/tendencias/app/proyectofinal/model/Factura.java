package com.tendencias.app.proyectofinal.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Entity
@Data
public class Factura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_factura")
    private int id_factura;
    private String numero_factura;
    private Date lista_factura;
    //foreing key con listafactura (listadoOrdenes)

}
