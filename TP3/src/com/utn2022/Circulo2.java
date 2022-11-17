package com.utn2022;

public class Circulo2 extends Figura{

    private double radio;

    public Circulo2(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    @Override
    public void area() {

    }

    @Override
    public void perimetro() {
        double total= radio*3.1416;
    }
}
