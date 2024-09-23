package com.fabricadecarros.fabricadecarros.model;


import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
public class Carro {
    private int assentos;
    private String motor;
    private boolean computadorBordo;
    private boolean gps;

    @Override
    public String toString() {
        return "Car [assentos=" + assentos + ", motor=" + motor + ", computadorBordo=" + computadorBordo + ", gps=" + gps + "]";
    }
}
