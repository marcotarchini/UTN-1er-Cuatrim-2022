package com.utn2022;

import java.util.UUID;

public class Item {
    private UUID identificador;
    private String descripción;
    private double cantidad;
    private double precioUnitario;

    public Item(String descripción, double cantidad, double precioUnitario) {
        this.identificador = UUID.randomUUID();
        this.descripción = descripción;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public double precioTotal (){
        double total=precioUnitario*cantidad;
        return total;
    }

    @Override
    public String toString() {
        return "Item{" +
                "\nidentificador=" + identificador +
                "\n descripción='" + descripción + '\'' +
                "\n cantidad=" + cantidad +
                "\n precioUnitario=" + precioUnitario +
                "\n Precio final: " + precioTotal() +
                '}';
    }
}
