package com.ucu.ut6.tp2;

//Implementá un sistema que agrupe países según su continente utilizando  una tabla hash.
// Cada país es una clave (String) y su continente es el valor asociado (String)

import java.util.*;

public class EjercicioHashing {
    // Función hash que usa el primer carácter
    public static int hash(String clave) {
        return Math.abs(clave.charAt(0)) % 7;
    }

    public static void main(String[] args) {
        // Datos de países y continentes
        Map<String, String> datos = new LinkedHashMap<>();
        datos.put("Argentina", "América");
        datos.put("España", "Europa");
        datos.put("Brasil", "América");
        datos.put("Francia", "Europa");
        datos.put("Egipto", "África");
        datos.put("China", "Asia");
        datos.put("Chile", "América");
        datos.put("Canadá", "América");

        // Crear tabla hash de tamaño 7 con listas encadenadas
        List<List<String>> tablaHash = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            tablaHash.add(new ArrayList<>());
        }

        // Insertar los datos en la tabla y mostrar info de hash
        for (String pais : datos.keySet()) {
            char letra = pais.charAt(0);
            int ascii = (int) letra;
            int indice = hash(pais);

            System.out.println("País: " + pais +
                               " | Letra: " + letra +
                               " | ASCII: " + ascii +
                               " | Hash % 7: " + indice);

            String valor = pais + " → " + datos.get(pais);
            tablaHash.get(indice).add(valor);
        }

        // Imprimir la tabla hash final
        System.out.println("\n📦 Tabla Hash Final:");
        for (int i = 0; i < tablaHash.size(); i++) {
            System.out.println("Índice " + i + ": " + tablaHash.get(i));
        }
    }
}

