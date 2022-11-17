package com.utn2022;

public class Cliente {

    private String nombreCompleto;
    private int dni;
    private String registro;

    public Cliente(String nombreCompleto, int dni, String registro) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
        this.registro = registro;
    }

    public Cliente() {
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombreCompleto='" + nombreCompleto + '\'' +
                ", dni=" + dni +
                ", registro='" + registro + '\'' +
                '}';
    }
}
