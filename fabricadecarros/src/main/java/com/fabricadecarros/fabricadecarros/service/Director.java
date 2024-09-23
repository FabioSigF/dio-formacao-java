package com.fabricadecarros.fabricadecarros.service;

import com.fabricadecarros.fabricadecarros.model.Builder;

public class Director {
    public void constructSportsCar(Builder builder) {
        builder.reset();
        builder.setAssentos(2);
        builder.setMotor("SportEngine");
        builder.setComputadorBordo(true);
        builder.setGps(true);
    }

    public void constructSUV(Builder builder) {
        builder.reset();
        builder.setAssentos(5);
        builder.setMotor("SUVEngine");
        builder.setComputadorBordo(true);
        builder.setGps(false);
    }
}
