package com.utn2022;


import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;

public class Factura {

    ItemVenta item1=new ItemVenta();

    private double montoTotal;
    private LocalDate fecha;
    private LocalTime hora;
    private Cliente cliente;
    private ItemVenta[] item;

    public Factura(double montoTotal, Cliente cliente, ItemVenta[] item) {
        this.montoTotal = montoTotal;
        this.fecha = LocalDate.now();
        this.hora = LocalTime.now();
        this.cliente = cliente;
        this.item = item;
    }

    public ItemVenta[] getItem() {
        return item;
    }

    public void setItem(ItemVenta item) {
        this.item1 = item;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double descuento(Cliente cliente, ItemVenta itemAux){
        double total=itemAux.getPrecioUnitario()-(itemAux.getPrecioUnitario()*cliente.getPorcentajeDeDescuento()/100);
        setMontoTotal(total);
        return total;
    }

    @Override
    public String toString() {
        return "\nFactura{" +
                ", fecha=" + fecha +
                ", hora=" + hora +
                "\n cliente=" + cliente +
                "\n Productos= "+ Arrays.toString(item) +
                "\n Precio final= "+ montoTotal +
                '}';
    }
}
