/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deliciasdelmar;

/**
 *
 * @author brand
 */
public class DatosMesero {
    //Atributos

    int idMesero;
    String nombreMesero;
    Mesas mesasAsignadas;
    String turno;
    double propinas;
    double rating;

    //Constructor
    public DatosMesero(int idMesero, String nombreMesero, Mesas mesasAsignadas, String turno, double propinas, double rating) {
        this.idMesero = idMesero;
        this.nombreMesero = nombreMesero;
        this.mesasAsignadas = mesasAsignadas;
        this.turno = turno;
        this.propinas = propinas;
        this.rating = rating;
    }

    //Para generar un numero aleatorio, para el id
    public static int IdMesero() {
        int cantidadNum[] = new int[4];
        for (int i = 0; i < 4; i++) {
            cantidadNum[i] = numRandom(0, 10);

        }
        return cantidadNum[0];
    }

    public static int numRandom(int min, int max) {
        return (int) (Math.random() * (max - min) + min);

    }

    public class NombreCompletoAleatorio {

        public static void main(String[] args) {
            String[] nombres = {"Manolo", "María", "Pepe", "Tamara"};
            String[] apellidos = {"González", "Gómez", "Hernández", "Martínez"};

            String nombreCompleto = generarNombreCompletoAleatorio(nombres, apellidos);
            System.out.println("Nombre de su mesero: " + nombreCompleto);
        }

        public static String generarNombreCompletoAleatorio(String[] nombres, String[] apellidos) {
            int indiceNombre = (int) (Math.random() * nombres.length);
            int indiceApellido = (int) (Math.random() * apellidos.length);

            String nombre = nombres[indiceNombre];
            String apellido = apellidos[indiceApellido];

            return nombre + " " + apellido;
        }

        public static int generarIndiceAleatorio(int longitud) {
            return (int) (Math.random() * longitud);
        }
    }

}
