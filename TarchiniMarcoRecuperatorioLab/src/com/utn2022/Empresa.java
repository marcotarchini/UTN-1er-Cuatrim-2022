package com.utn2022;

import java.time.LocalDate;

public class Empresa {

    private Vehiculos[] vehiculos;
    private Cliente[] clientes;
    private Sucursal[] sucursales;
    private Alquiler[] alquileres;

    public Vehiculos[] getVehiculos() {
        return vehiculos;
    }

    public Cliente[] getClientes() {
        return clientes;
    }

    public Alquiler[] getAlquileres() {
        return alquileres;
    }

    public Empresa(Vehiculos[] vehiculos, Cliente[] clientes,Sucursal[] sucursales) {
        this.vehiculos = vehiculos;
        this.clientes = clientes;
        this.sucursales= sucursales;
        this.alquileres = new Alquiler[20];
    }
    public Vehiculos buscarVehiculo(String modelo) {
        for (Vehiculos vehiculo : vehiculos ) {
            if (vehiculo  != null && vehiculo.getModelo().equals(modelo)) {
                return vehiculo;
            }
        }
        return null;
    }

    public Cliente buscarCliente(String nombre) {
        for (Cliente cliente : clientes) {
            if (cliente != null && cliente.getNombreCompleto().equals(nombre)) {
                return cliente;
            }
        }
        return null;
    }

    public Alquiler buscarAlquiler(String cliente) {
        for (Alquiler alquiler : alquileres) {
            if (alquiler != null && alquiler.getCliente().equals(cliente)) {
                return alquiler;
            }
        }
        return null;
    }

    public Sucursal buscarSucursal(String ciudad) {
        for (Sucursal sucursal : sucursales) {
            if (sucursal != null && sucursal.getCiudad().equals(ciudad)) {
                return sucursal;
            }
        }
        return null;
    }

    public String agregarCliente(Cliente cliente) {
        for (int i = 0; i < clientes.length ; i++) {
            if (clientes[i] == null) {
                clientes[i] = cliente;
                break;
            }
        }
        return cliente.toString();
    }


    public Alquiler alquilarVehiculo(String coche, String nombreCliente,String ciudad) {
        Vehiculos vehiculo = buscarVehiculo(coche);
        Cliente cliente = buscarCliente(nombreCliente);
        Sucursal sucursal=buscarSucursal(ciudad);
        if (vehiculo != null && cliente != null) {

            if (cliente.getNombreCompleto()!=null && cliente.getDni()!=0 && cliente.getRegistro().equals("si")) {
                Alquiler alqui = new Alquiler(vehiculo, cliente, sucursal, LocalDate.now());
                for (int i = 0; i < alquileres.length; i++) {
                    if (alquileres[i] == null) {
                        alquileres[i] = alqui;
                        break;
                    }
                }
                return alqui;
            }
        }
        return null;
    }

    public void devolverVehiculo(String cliente) {

        Alquiler alquiler = buscarAlquiler(cliente);
        if (alquiler != null) {
            String cocheNombre = String.valueOf(alquiler.getVehiculo());
            Vehiculos auto = buscarVehiculo(cocheNombre);
            double costo = (auto.getKilometraje() * 50) * 2;
            System.out.println("Costo de devolucion "+ costo);

            eliminarAlquiler(cocheNombre);
        }
    }

    public void eliminarAlquiler(String nombre) {
        for (int i = 0; i < alquileres.length ; i++) {
            if (alquileres[i] != null && alquileres[i].getVehiculo().equals(nombre)) {
                alquileres[i] = null;
                break;
            }
        }
    }
}


