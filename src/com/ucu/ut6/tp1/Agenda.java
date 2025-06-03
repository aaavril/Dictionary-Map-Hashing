package com.ucu.ut6.tp1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Agenda {
    private static HashMap<String, Persona> contactos = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    private static void mostrarMenu() {
        System.out.println("\n--- Agenda de Contactos ---");
        System.out.println("1. Agregar Contacto");
        System.out.println("2. Eliminar Contacto");
        System.out.println("3. Buscar Contacto");
        System.out.println("4. Listar Contactos");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private static void agregarContacto() {
        System.out.print("Ingrese nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese apellido: ");
        String apellido = scanner.nextLine();
        System.out.print("Ingrese teléfono: ");
        String telefono = scanner.nextLine();
        System.out.print("Ingrese email: ");
        String email = scanner.nextLine();

        Persona nuevaPersona = new Persona(nombre, apellido, telefono, email);
        contactos.put(telefono, nuevaPersona);
        System.out.println("Contacto agregado exitosamente.");
    }

    private static void eliminarContacto() {
        System.out.print("Ingrese el teléfono del contacto a eliminar: ");
        String telefono = scanner.nextLine();

        if (contactos.containsKey(telefono)) {
            contactos.remove(telefono);
            System.out.println("Contacto eliminado exitosamente.");
        } else {
            System.out.println("No se encontró un contacto con ese teléfono.");
        }
    }

    private static void buscarContacto() {
        System.out.print("Ingrese el teléfono del contacto a buscar: ");
        String telefono = scanner.nextLine();

        if (contactos.containsKey(telefono)) {
            Persona p = contactos.get(telefono);
            System.out.println("Contacto encontrado:\n" + p);
        } else {
            System.out.println("No se encontró un contacto con ese teléfono.");
        }
    }

    private static void listarContactos() {
        if (contactos.isEmpty()) {
            System.out.println("No hay contactos para mostrar.");
        } else {
            System.out.println("\n--- Lista de Contactos ---");
            for (Map.Entry<String, Persona> entry : contactos.entrySet()) {
                System.out.println(entry.getValue());
                System.out.println("--------------------------");
            }
        }
    }
    
    public static void main(String[] args) {
        int opcion;

        do {
            mostrarMenu();
            opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1:
                    agregarContacto();
                    break;
                case 2:
                    eliminarContacto();
                    break;
                case 3:
                    buscarContacto();
                    break;
                case 4:
                    listarContactos();
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 5);
    }

}
