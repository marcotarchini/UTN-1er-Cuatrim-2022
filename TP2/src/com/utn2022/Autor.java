package com.utn2022;

public class Autor {
    private String nombreYApellido;
    private String email;
    private Genero genero;

    public Autor(String nombreYApellido, String email, Genero genero) {
        this.nombreYApellido = nombreYApellido;
        this.email = email;
        this.genero = genero;
    }

    public String getNombreYApellido() {
        return nombreYApellido;
    }

    public void setNombreYApellido(String nombreYApellido) {
        this.nombreYApellido = nombreYApellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Autor: "+nombreYApellido+"email "+email+"genero "+genero;
    }
}
