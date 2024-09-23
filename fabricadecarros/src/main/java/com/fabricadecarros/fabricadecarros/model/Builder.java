package com.fabricadecarros.fabricadecarros.model;

public interface Builder {
    void reset();
    void setAssentos(int assentos);
    void setMotor(String motor);
    void setComputadorBordo(boolean computadorBordo);
    void setGps(boolean gps);
}
