package com.utn2022;

import java.time.LocalDate;

public class Estudiantes extends Persona{
    private int añoDeIngreso;
    private double cuotaMensual;
    private String carrera;

    public Estudiantes(String dni, String nombreYApellido, String email, String direccion, int añoDeIngreso, double cuotaMensual, String carrera) {
        super(dni, nombreYApellido, email, direccion);
        this.añoDeIngreso = añoDeIngreso;
        this.cuotaMensual = cuotaMensual;
        this.carrera = carrera;
    }

    public int getAñoDeIngreso() {
        return añoDeIngreso;
    }

    public void setAñoDeIngreso(int añoDeIngreso) {
        this.añoDeIngreso = añoDeIngreso;
    }

    public double getCuotaMensual() {
        return cuotaMensual;
    }

    public void setCuotaMensual(double cuotaMensual) {
        this.cuotaMensual = cuotaMensual;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Estudiantes{" +
                super.toString() +
                "añoDeIngreso=" + añoDeIngreso +
                ", cuotaMensual=" + cuotaMensual +
                ", carrera='" + carrera + '\'' +
                '}';
    }
}
