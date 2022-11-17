package com.utn2022;

public class Escritorios extends Muebles implements Aumento{

    private double alto;
    private double ancho;

    public Escritorios(int numeroStock, String nombre, double precio, double alto, double ancho) {
        super(numeroStock, nombre, precio);
        this.alto = alto;
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    @Override
    public String toString() {
        return  "\nalto=" + alto +
                "\nancho=" + ancho +
                super.toString();
    }

    @Override
    public double conAumento() {
        double precioFinal=getPrecio()+(getPrecio()*0.1);
        setPrecio(precioFinal);
        return precioFinal;
       }
}
