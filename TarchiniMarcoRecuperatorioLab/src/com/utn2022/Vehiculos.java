package com.utn2022;

import java.time.LocalDate;

public class Vehiculos {

    private Tipos auto;
    private String modelo;
    private int kilometraje;
    private LocalDate año;
    private int codInterno;

    public Vehiculos(Tipos auto, String modelo, int kilometraje, LocalDate año, int codInterno) {
        this.auto=auto;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
        this.año = año;
        this.codInterno = codInterno;
    }

    public Vehiculos() {
    }

    public Tipos getAuto() {
        return auto;
    }

    public void setAuto(Tipos auto) {
        this.auto = auto;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public LocalDate getAño() {
        return año;
    }

    public void setAño(LocalDate año) {
        this.año = año;
    }

    public int getCodInterno() {
        return codInterno;
    }

    public void setCodInterno(int codInterno) {
        this.codInterno = codInterno;
    }

    @Override
    public String toString() {
        return "Vehiculos{" +
                "Tipo="+ auto +
                "modelo='" + modelo + '\'' +
                ", kilometraje=" + kilometraje +
                ", año=" + año +
                ", codInterno=" + codInterno +
                '}';
    }
}
