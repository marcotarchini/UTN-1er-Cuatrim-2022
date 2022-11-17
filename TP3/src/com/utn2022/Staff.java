package com.utn2022;

public class Staff extends Persona{
    private double Salario;
    private Turno turno;

    public Staff(String dni, String nombreYApellido, String email, String direccion, double salario, Turno turno) {
        super(dni, nombreYApellido, email, direccion);
        Salario = salario;
        this.turno = turno;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double salario) {
        Salario = salario;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        return "Staff{" +
                super.toString() +
                "Salario=" + Salario +
                ", turno=" + turno +
                '}';
    }
}
