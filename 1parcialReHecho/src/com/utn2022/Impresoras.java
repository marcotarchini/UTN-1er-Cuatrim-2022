package com.utn2022;

public class Impresoras extends Informaticos implements Descuento, Aumento{
    private int cantImpresiones;

    public Impresoras(int numeroStock, String nombre, double precio, String nombreFabricante, int cantImpresiones) {
        super(numeroStock, nombre, precio, nombreFabricante);
        this.cantImpresiones = cantImpresiones;
    }

    public int getCantImpresiones() {
        return cantImpresiones;
    }

    public void setCantImpresiones(int cantImpresiones) {
        this.cantImpresiones = cantImpresiones;
    }

    @Override
    public String toString() {
        return  "\ncantImpresiones=" + cantImpresiones+
                super.toString();
    }

    @Override
    public double descuento(int porcentaje) {
        double precioFinal=getPrecio()-(getPrecio()*porcentaje/100);
        setPrecio(precioFinal);
        return precioFinal;
    }

    @Override
    public double conAumento() {
        double precioFinal=getPrecio()+(getPrecio()*0.15);
        setPrecio(precioFinal);
        return precioFinal;
    }
}
