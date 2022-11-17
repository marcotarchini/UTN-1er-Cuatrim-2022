package com.utn2022;

public class Sillas extends Muebles implements Descuento, Aumento{

    private Ruedas estado;
    private String ruedas;

    public Sillas(int numeroStock, String nombre, double precio, String ruedas) {
        super(numeroStock, nombre, precio);
        this.ruedas = ruedas;
        validaRuedas();
    }

    public Ruedas getEstado() {
        return estado;
    }

    public void setEstado(Ruedas estado) {
        this.estado = estado;
    }

    public String getRuedas() {
        return ruedas;
    }

    public void setRuedas(String ruedas) {
        this.ruedas = ruedas;
    }
    
    public void validaRuedas(){
        if (ruedas=="si"){
            setEstado(Ruedas.CONRUEDAS);
        }
        else {
            setEstado(Ruedas.SINRUEDAS);
        }
    }

    @Override
    public String toString() {
        return "\nruedas=" + estado +
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
        double precioFinal=getPrecio()+(getPrecio()*0.05);
        setPrecio(precioFinal);
        return precioFinal;
    }
}
