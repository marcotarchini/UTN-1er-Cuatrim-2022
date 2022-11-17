package com.utn2022;

public class Cilindro extends Circulo{
    private double altura=1.0;

    public Cilindro(double radio, String color, double altura) {
        super(radio, color);
        this.altura = altura;
    }

    public Cilindro() {
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double volumen(){
        double total = 3.1416*getRadio()*getRadio()*altura;
        return total;
    }

    @Override
    public double area() {
        double total= (2*3.1416*getRadio()*altura) + (2*super.area());
        return total;
    }

    @Override
    public String toString() {
        return "Cilindro{" +
                super.toString() +
                "altura= " + altura +
                "volumen= "+ volumen() +
                "Area cilindro= "+area();
    }
}
