package com.ivan.opciones.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@RequiredArgsConstructor
@NoArgsConstructor
public class Opcion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    @NonNull
    private Integer numero;
    @NonNull
    private String tpOperacion;//(A)pertura | (C)ierre
    private Date fcOperacion;
    private Date fcVencimiento;
    private Integer dte; 
    @NonNull
    private String nombre;    
    @NonNull
    private String subyacente;    
    @NonNull
    private Double prima;    
    @NonNull
    private Double comision;
    @NonNull
    private Double strike;
    @NonNull
    private String tipo;//(C)all | (P)ut
    @NonNull
    private String operacion; // (C)compra | (V)enta
    private Double beneficio; 
    private String observaciones; 
    private String moneda; 
    private String broker; 
    private String estado;
    @NonNull
    private Double total;    
    
}
