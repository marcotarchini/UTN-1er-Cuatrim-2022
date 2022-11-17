package com.utn2022;

public class Notebook extends Informaticos implements Aumento{
    private int memoria;

    public Notebook(int numeroStock, String nombre, double precio, String nombreFabricante, int memoria) {
        super(numeroStock, nombre, precio, nombreFabricante);
        this.memoria = memoria;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    @Override
    public String toString() {
        return  "\nmemoria=" + memoria+
                super.toString();
    }

    @Override
    public double conAumento() {
        double precioFinal=getPrecio()+(getPrecio()*0.2);
        setPrecio(precioFinal);
        return precioFinal;
    }
}
