package com.utn2022;

public class Empleado {
    private String dni;
     private String nombreYApellido;
     private double salario;

    public Empleado(String dni, String nombreYApellido, double salario) {
        this.dni = dni;
        this.nombreYApellido = nombreYApellido;
        this.salario = salario;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombreYApellido() {
        return nombreYApellido;
    }

    public void setNombreYApellido(String nombreYApellido) {
        this.nombreYApellido = nombreYApellido;
    }

    public double getSalario() {
        return salario;
    }

    public double setSalario(double salario) {
        this.salario = salario;
        return salario;
    }

    public double salarioAnual(){
        double total= (getSalario()*12);
        System.out.println("El salario anual es de "+total);
        return total;
    }

    public double aumento(double aux){
        double total= setSalario(getSalario()+(getSalario()*aux)/100);
        return total;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "dni='" + dni + '\'' +
                ", nombreYApellido='" + nombreYApellido + '\'' +
                ", salario=" + salario +
                '}';
    }
}
