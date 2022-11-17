package com.utn2022;

import java.util.List;

public class Empresa {

    public Empresa() {
    }

    public void recorrerConinstancia(List<Productos> lista) {

        for (Productos productos : lista) {

            if (productos != null) {
                if (productos instanceof Escritorios) {
                    System.out.println("\n=======ESCRITORIOS======");
                    System.out.println(productos);
                }
                if (productos instanceof Sillas) {
                    System.out.println("\n=======SILLAS======");
                    System.out.println(productos);
                }
                if (productos instanceof Impresoras) {
                    System.out.println("\n=======IMPRESORAS======");
                    System.out.println(productos);
                }
                if (productos instanceof Notebook) {
                    System.out.println("\n=======NOTEBOOK======");
                    System.out.println(productos);
                }
            }
        }
    }

    public void aumento(List<Productos> lista) {

        System.out.println("\n\n******************NUEVOS AUMENTOS APLICADOS*************************"+
                "\n●Sillas = 5%" +
                "\n● Escritorios = 10%" +
                "\n● Impresoras = 15%" +
                "\n● Notebooks = 20%");

        for (Productos productos : lista) {
            if (productos != null) {
                if (productos instanceof Sillas) {
                    productos.setPrecio (((Sillas)productos).conAumento());
                }
                if (productos instanceof Escritorios) {
                    productos.setPrecio(((Escritorios)productos).conAumento());
                }
                if (productos instanceof Notebook) {
                    productos.setPrecio(((Notebook)productos).conAumento());
                }
                if (productos instanceof Impresoras) {
                    productos.setPrecio(((Impresoras)productos).conAumento());
                }
            } } }
}
