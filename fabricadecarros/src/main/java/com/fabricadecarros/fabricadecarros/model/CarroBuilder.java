package com.fabricadecarros.fabricadecarros.model;

public class CarBuilder implements Builder {
    private Carro car;

    public CarBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.car = new Carro();
    }

    @Override
    public void setAssentos(int seats) {
        this.car.setAssentos(seats);
    }

    @Override
    public void setMotor(String engine) {
        this.car.setMotor(engine);
    }

    @Override
    public void setComputadorBordo(boolean tripComputer) {
        this.car.setComputadorBordo(tripComputer);
    }

    @Override
    public void setGps(boolean gps) {
        this.car.setGps(gps);
    }

    public Carro getProduct() {
        Carro product = this.car;
        this.reset();
        return product;
    }
}
