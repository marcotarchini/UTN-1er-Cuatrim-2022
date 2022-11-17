package com.utn2022;

public class Rectangulo extends Figura {

    private double alto;
    private double largo;

    public Rectangulo(String color, double alto, double largo) {
        super(color);
        this.alto = alto;
        this.largo = largo;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    @Override
    public void area() {

    }

    @Override
    public void perimetro() {

    }
}
