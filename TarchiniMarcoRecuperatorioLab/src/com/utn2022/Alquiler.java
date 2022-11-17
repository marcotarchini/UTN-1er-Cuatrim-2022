package com.utn2022;

import java.time.LocalDate;

public class Alquiler {

    private Vehiculos vehiculo;
    private Cliente cliente;
    private Sucursal sucursal;
    private LocalDate prestamo;
    private LocalDate devolucion;

    public Alquiler(Vehiculos vehiculo, Cliente cliente, Sucursal sucursal, LocalDate prestamo) {
        this.vehiculo = vehiculo;
        this.cliente = cliente;
        this.sucursal = sucursal;
        this.prestamo = prestamo;
        this.devolucion = prestamo.plusDays(2);
    }

    public Vehiculos getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculos vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public LocalDate getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(LocalDate prestamo) {
        this.prestamo = prestamo;
    }

    public LocalDate getDevolucion() {
        return devolucion;
    }

    public void setDevolucion(LocalDate devolucion) {
        this.devolucion = devolucion;
    }

    @Override
    public String toString() {
        return "Alquiler{" +
                "vehiculo=" + vehiculo +
                ", cliente=" + cliente +
                ", sucursal=" + sucursal +
                ", prestamo=" + prestamo +
                ", devolucion=" + devolucion +
                '}';
    }
}
