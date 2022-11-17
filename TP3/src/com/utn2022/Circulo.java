package com.utn2022;

public abstract class Circulo {
    private double radio=1.0;
    private String color="Rojo";

    public Circulo(double radio, String color) {
        this.radio = radio;
        this.color = color;
    }

    public Circulo() {
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double area(){
        double total= radio*3.1416;
        return total;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                ", color='" + color + '\'' +
                " Area: "+ area()+ " ";
    }
}
