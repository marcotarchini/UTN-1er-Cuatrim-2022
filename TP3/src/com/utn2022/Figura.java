package com.utn2022;

public abstract class Figura {
    private String color;

    public Figura(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void area();
    public abstract void perimetro();

    @Override
    public String toString() {
        return "Figura{" +
                "color='" + color + '\'' +
                '}';
    }
}
