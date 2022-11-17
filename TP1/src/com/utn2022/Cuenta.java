package com.utn2022;

import java.util.UUID;

public class Cuenta {
    private UUID identificador;
    private String nombre;
    private double balance;

    public Cuenta(String nombre, double balance) {
        this.identificador = UUID.randomUUID();
        this.nombre = nombre;
        this.balance = balance;
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getBalance() {
        return balance;
    }

    public double setBalance(double balance) {
        this.balance = balance;
        return balance;
    }

    public double credito(double aux){
        double total=setBalance(getBalance()+aux);
        return total;
    }

    public double debito(double aux){
        double total = 0;
        if(balance>=0 && balance>=aux) {
            total = setBalance(getBalance() - aux);
        }
        else {
            System.out.println("Saldo insuficiente");
        }
        return total;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "identificador='" + identificador + '\'' +
                ", nombre='" + nombre + '\'' +
                ", balance=" + balance +
                '}';
    }
}
