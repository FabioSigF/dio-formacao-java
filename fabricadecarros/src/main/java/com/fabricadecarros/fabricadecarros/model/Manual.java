package com.fabricadecarros.fabricadecarros.model;

import jakarta.persistence.Entity;
import lombok.Setter;

@Entity
@Setter
public class Manual {
    private int assentosInfo;
    private String motorInfo;
    private boolean computadorBordoInfo;
    private boolean gpsInfo;

    @Override
    public String toString() {
        return "Manual [assentosInfo=" + assentosInfo + ", motorInfo=" + motorInfo + ", computadorBordoInfo=" + computadorBordoInfo + ", gpsInfo=" + gpsInfo + "]";
    }
}

