package com.utn2022;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Vehiculos vehiculos[] = new Vehiculos[10];
        Sucursal sucursal[] = new Sucursal[10];

        vehiculos [0] = new Vehiculos(Tipos.DOSPUERTAS, "Corsa", 100, LocalDate.of(2010, 3, 1), 1);
        vehiculos [1] = new Vehiculos(Tipos.CUATROPUERTAS, "Suran", 80, LocalDate.of(2018, 5, 23), 2);
        vehiculos [2] = new Vehiculos(Tipos.CAMIONETA, "Toro", 69, LocalDate.of(2020, 4, 6), 3);

        Cliente cliente1 = new Cliente("JuanCarlosPerez", 10254874, "si");
        Cliente cliente2 = new Cliente("JoseAlbertoSuarez", 14785963, "no");

         sucursal[0] = new Sucursal("MardelPlata", "Luro7474", "223547895");
         sucursal[1]= new Sucursal("BuenosAires", "GeneralPaz333", "011154789632");


        Cliente clientes[] = new Cliente[10];


        Empresa empresa = new Empresa(vehiculos, clientes, sucursal);

        empresa.agregarCliente(cliente1);
        empresa.agregarCliente(cliente2);

        imprimirClientes(empresa);
        imprimirVehiculos(empresa);

        System.out.println("\n=== Imprimo resultado de alquiler1 ===");
        System.out.println(empresa.alquilarVehiculo("Corsa","JuanCarlosPerez", "MardelPlata"));

        imprimirAlquileres(empresa);

        imprimirVehiculos(empresa);

        empresa.devolverVehiculo("JuanCarlosPerez");

        imprimirAlquileres(empresa);

        imprimirVehiculos(empresa);



    }

    public static void imprimirVehiculos(Empresa empresa) {
        System.out.println("\n=== Imprimo Vehiculos ===");
        for (Vehiculos vehiculo : empresa.getVehiculos()) {
            if (vehiculo != null) System.out.println(vehiculo);
        }
    }

    public static void imprimirClientes(Empresa empresa) {
        System.out.println("\n=== Imprimo clientes ===");
        for (Cliente cliente : empresa.getClientes()) {
            if (cliente != null) System.out.println(cliente);
        }
    }

    public static void imprimirAlquileres(Empresa empresa) {
        System.out.println("\n=== Imprimo alquileres activos ===");
        for (Alquiler alquiler : empresa.getAlquileres()) {
            if (alquiler != null) System.out.println(alquiler);
        }
    }
}
/*Desarrolle un sistema para una empresa que alquila vehículos a clientes
particulares. La empresa alquila 3 tipos de vehículos (2PUERTAS, 4PUERTAS y
CAMIONETA). Todos los vehículos tienen un modelo, kilometraje, año y código interno.
También cuentan con una tarifa fija por día.
Para realizar un nuevo alquiler se debe solicitar al cliente: Nombre completo, DNI y
tiene que tener registro para conducir. Si el cliente cumple con estas condiciones, se
genera un nuevo alquiler y se selecciona el vehículo en cuestión.
El alquiler también cuenta con una fecha de inicio y una fecha final. Para el cálculo
total del costo se debe tener en cuenta la cantidad de kilómetros que realizó el cliente
sobre el vehículo más la cantidad de días rentado. El costo fijo del kilómetro es de $50
Como la empresa cuenta con varias sucursales dentro del país, el cliente puede
rentar un auto en una sucursal y retornarlo en otra distinta. A modo de información, cada
sucursal tiene: Ciudad, dirección y número de teléfono.
Desarrolle:
1) Cree las clases enunciadas en el texto junto con los atributos.
2) Generar un nuevo alquiler, teniendo en cuenta las
validaciones solicitadas.
3) Encontrar el alquiler con mayor costo y mostrar por pantalla toda la
información.
Primer recuperatorio:
4) Devolver la cantidad de alquileres generados por cada tipo de vehículo de
todos los alquileres.*/