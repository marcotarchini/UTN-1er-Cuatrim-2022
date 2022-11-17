package com.utn2022;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Empresa empresa=new Empresa();

        Sillas silla1=new Sillas(1,"Barroca",5000,"no");
        Sillas silla2=new Sillas(2,"Gammer",7000,"si");
        Escritorios escritorio1=new Escritorios(3,"Office",20000,0.80,1.40);
        Notebook notebook1=new Notebook(4,"Acer",100000,"China",4);
        Impresoras impresora1=new Impresoras(5,"Cannon",40000,"India",50);

        List<Productos>productos=new ArrayList<>();

        productos.add(silla1);
        productos.add(silla2);
        productos.add(escritorio1);
        productos.add(notebook1);
        productos.add(impresora1);

        empresa.recorrerConinstancia(productos);

        silla1.descuento(10);
        impresora1.descuento(20);

        empresa.recorrerConinstancia(productos);

        empresa.aumento(productos);

        empresa.recorrerConinstancia(productos);
    }
}
/*Desarrolle el sistema para una empresa que comercializa productos para oficina. Tiene dos
grandes grupos de productos a la venta: Muebles (sillas y escritorios) y productos informáticos.
Todos los productos que comercializa tienen en común un número de stock, nombre y precio.
Las sillas y escritorios se diferencian. Por un lado para las sillas es importante saber si traen
o no ruedas. Mientras que para los escritorios necesitan tener el conocimiento de las dimensiones
(alto y ancho).
Los productos informáticos son más complejos ya que tienen distintas categorías. Por un
lado tenemos las impresoras y por otro las notebooks. Ambos productos comparten el nombre del
fabricante, pero la empresa necesita saber: por cada impresora cuantas impresiones realiza por
minuto. Mientras que para las notebook debemos indicar cuánta memoria poseen(en gb).
1) Crear las distintas clases presentes en el texto. Respetar nombres y atributos.
2) Para cada clase generar un método ToString donde contenga toda la información de la misma.
3) Crear una instancia de cada clase y agregarla a un List. Luego recorrerlo mostrando por pantalla el
tipo de instancia que es.
4) La empresa nos encarga otra tarea. Nos dice que tanto las Impresoras como las Sillas se encuentran
de oferta. Y que para cada cliente se puede aplicar un descuento especial. Se debe indicar por parámetro
el porcentaje de descuento y retornar el precio del producto con el descuento aplicado. Se tendrá en
cuenta la forma en que solucionan este punto.
5) Se solicita actualizar el valor de los precios del array del ejercicio 3. Esto se debe realizar a través
de un método de la clase. Cree un bucle en donde se actualizan con los siguientes valores e imprima
ambos valores(sin aumento y con aumento):
● Sillas = 5%
● Escritorios = 10%
● Impresoras = 15%
● Notebooks = 20%*/
