package com.utn2022;

import java.util.UUID;

public class ItemVenta {
        private UUID id;
        private String nombre;
        private String descripción;
        private double precioUnitario;

    public ItemVenta(String nombre, String descripción, double precioUnitario) {
        this.id = UUID.randomUUID();
        this.nombre = nombre;
        this.descripción = descripción;
        this.precioUnitario = precioUnitario;
    }

    public ItemVenta() {
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

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    @Override
    public String toString() {
        return "ItemVenta{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripción='" + descripción + '\'' +
                ", precioUnitario=" + precioUnitario +
                '}';
    }
}
