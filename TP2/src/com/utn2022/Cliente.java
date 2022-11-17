package com.utn2022;

import java.util.UUID;

public class Cliente {
    private UUID id;
    private String nombre;
    private String email;
    private double porcentajeDeDescuento;

    public Cliente(String nombre, String email, double porcentajeDeDescuento) {
        this.id = UUID.randomUUID();
        this.nombre = nombre;
        this.email = email;
        this.porcentajeDeDescuento = porcentajeDeDescuento;
    }

    public UUID getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getPorcentajeDeDescuento() {
        return porcentajeDeDescuento;
    }

    public void setPorcentajeDeDescuento(double porcentajeDeDescuento) {
        this.porcentajeDeDescuento = porcentajeDeDescuento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", porcentajeDeDescuento=" + porcentajeDeDescuento +
                '}';
    }
}
