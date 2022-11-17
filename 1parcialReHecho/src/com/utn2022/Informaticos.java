package com.utn2022;

public class Informaticos extends Productos{

    private String nombreFabricante;

    public Informaticos(int numeroStock, String nombre, double precio, String nombreFabricante) {
        super(numeroStock, nombre, precio);
        this.nombreFabricante = nombreFabricante;
    }

    public String getNombreFabricante() {
        return nombreFabricante;
    }

    public void setNombreFabricante(String nombreFabricante) {
        this.nombreFabricante = nombreFabricante;
    }

    @Override
    public String toString() {
        return "\n nombreFabricante='" + nombreFabricante+
                super.toString();
    }

}
