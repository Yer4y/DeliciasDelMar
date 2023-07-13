/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deliciasdelmar;

import javax.swing.JOptionPane;

/**
 *
 * @author yeray
 */
//Esto debe de ir en el main
//        Orden orden1 = new Orden();
//        Orden orden2 = new Orden();
//        Orden orden3 = new Orden();
//
//        System.out.println("Id Orden 1: " + orden1.getIdOrden());
//        System.out.println("Id Orden 2: " + orden2.getIdOrden());
//        System.out.println("Id Orden 3: " + orden3.getIdOrden());


// Falta que el numeroMesa y OpcionesCancelarAgregar sean botones y agregarle un ok
public class Orden {

    private int contador = 200;
    private int idOrden;
    private String nombreCliente;
    private int numMesa;

    public Orden(int idOrden, String nombreCliente, int numMesa) {
        this.idOrden = contador++;
        this.nombreCliente = nombreCliente;
        this.numMesa = numMesa;
    }

    public static void nombreCliente(String nombreCliente) {
        JOptionPane.showConfirmDialog(null, "Ingrese su nombre para que sea ingresado al sistema: ");

    }

    public static void numeroMesa(int numMesa) {
        int mesasOcupadas[] = new int[12]; //Por ahora ya que necesito lo q hizo Brandon

        if (validarNumeroMesa(numMesa)) {
            if (mesasOcupadas[numMesa - 1] == 1) {
                System.out.println("El numero de la mesa " + numMesa + " esta ocupada.");
                OpcionesCancelarAgregar();
            } else {
                System.out.println("Se ha asignado la mesa " + numMesa + " al client@.");
                mesasOcupadas[numMesa - 1] = 1;

            }
        } else {
            System.out.println("El numero de la mesa " + numMesa + " no es valido.");
            OpcionesCancelarAgregar();
        }

    }

    public static boolean validarNumeroMesa(int numMesa) {

        return numMesa >= 1 && numMesa <= 12;

    }

    public static void OpcionesCancelarAgregar() {
        System.out.println("Opciones:");
        System.out.println("[1] Agregar otro número");
        System.out.println("[2] Cancelar");

        int opcion = 1;

        if (opcion == 1) {
            numeroMesa(0); 
        } else if (opcion == 2) {
            System.out.println("Se cancela el abrir la orden.");

        }
    }

    public int getIdOrden() {
        return idOrden;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public int getNumMesa() {
        return numMesa;
    }

}
