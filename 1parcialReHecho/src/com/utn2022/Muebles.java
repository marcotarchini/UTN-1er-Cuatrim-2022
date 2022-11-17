package com.utn2022;

public abstract class Muebles extends Productos{

    public Muebles(int numeroStock, String nombre, double precio) {
        super(numeroStock, nombre, precio);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
