package com.utn2022;

public class Rectangulo {
    private double alto;
    private double ancho;

    public Rectangulo(double alto, double ancho) {
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

    public double perimetro(Rectangulo aux){
        double total=((2*aux.getAlto())+(2* aux.getAncho()));
        return total;
    }

    public double area(Rectangulo aux){
        double total=(aux.getAlto()* aux.getAncho());
        return total;
    }



    @Override
    public String toString() {
        return "Rectangulo{" +
                "alto=" + alto +
                ", ancho=" + ancho +
                '}';
    }
}
