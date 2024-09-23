package com.fabricadecarros.fabricadecarros.model;

public class CarroManualBuilder implements Builder {
    private Manual manual;

    public CarroManualBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.manual = new Manual();
    }

    @Override
    public void setAssentos(int assentos) {
        this.manual.setAssentosInfo(assentos);
    }

    @Override
    public void setMotor(String motor) {
        this.manual.setMotorInfo(motor);
    }

    @Override
    public void setComputadorBordo(boolean computadorBordo) {
        this.manual.setComputadorBordoInfo(computadorBordo);
    }

    @Override
    public void setGps(boolean gps) {
        this.manual.setGpsInfo(gps);
    }

    public Manual getProduct() {
        Manual product = this.manual;
        this.reset();
        return product;
    }
}

