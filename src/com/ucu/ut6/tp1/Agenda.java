package com.ucu.ut6.tp1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Agenda {
    private static HashMap<String, Persona> contactos = new HashMap<>();

    public void agregarContacto(String nombre, String apellido, String telefono, String email) {
       
        Persona nuevaPersona = new Persona(nombre, apellido, telefono, email);
        contactos.put(telefono, nuevaPersona);
        System.out.println("Contacto agregado exitosamente.");
    }

    public void eliminarContacto(String telefono) {
       
        if (contactos.containsKey(telefono)) {
            contactos.remove(telefono);
            System.out.println("Contacto eliminado.");
        } else {
            System.out.println("No se encontró contacto con ese teléfono.");
        }
    }

    public void buscarContacto(String telefono) {
       
        if (contactos.containsKey(telefono)) {
            Persona p = contactos.get(telefono);
            System.out.println("Contacto encontrado:" + p);
        } else {
            System.out.println("No se encontró un contacto con ese teléfono.");
        }
    }

    public void listarContactos() {
        if (contactos.isEmpty()) {
            System.out.println("No hay contactos para mostrar.");
        } else {
            System.out.println("Lista de Contactos:");
            for (Map.Entry<String, Persona> entry : contactos.entrySet()) {
                System.out.println(entry.getValue());
                System.out.println("--------------------------");
            }
        }
    }
    
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        agenda.agregarContacto("Ana", "González", "099111222", "ana@example.com");
        agenda.agregarContacto("Luis", "Pérez", "098333444", "luis@example.com");
        agenda.agregarContacto("Marta", "López", "097555666", "marta@example.com");

        agenda.listarContactos();

        System.out.println("\nBuscar Contacto Existente:");
        agenda.buscarContacto("098333444");

        System.out.println("\nBuscar Contacto Inexistente:");
        agenda.buscarContacto("000000000");

        System.out.println("\nEliminar Contacto:");
        agenda.eliminarContacto("097555666");

        System.out.println("\nLista de Contactos Actualizada:");
        agenda.listarContactos();
    }

     
}
