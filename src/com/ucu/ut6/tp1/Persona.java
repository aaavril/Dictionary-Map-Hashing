package com.ucu.ut6.tp1;

public class Persona {
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;

    public Persona(String nombre, String apellido, String telefono, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return "Nombre: " + nombre + " " + apellido + "\nTeléfono: " + telefono + "\nEmail: " + email;
    }
}

