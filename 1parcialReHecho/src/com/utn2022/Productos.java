package com.utn2022;

public abstract class Productos {
    private int numeroStock;
    private String nombre;
    private double precio;

    public Productos(int numeroStock, String nombre, double precio) {
        this.numeroStock = numeroStock;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getNumeroStock() {
        return numeroStock;
    }

    public void setNumeroStock(int numeroStock) {
        this.numeroStock = numeroStock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return  "\nnumero de Stock= " + numeroStock +
                "\nnombre= " + nombre +
                "\nprecio= " + precio;
    }
}
