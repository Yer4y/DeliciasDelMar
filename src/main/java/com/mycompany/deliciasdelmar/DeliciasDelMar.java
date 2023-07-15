 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.deliciasdelmar;

import javax.swing.JOptionPane;

/**
 *
 * @author brand
 */
public class DeliciasDelMar {

    public static void main(String[] args) {
        
        String botonesMenu[]={"Restaurante", "Ordenes", "Menú", "Reportes", "Salir"};
      int botonint = JOptionPane.showOptionDialog(
                null,
                "¿Dondé desea ingresar?",
                "Seleccione una opción",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                botonesMenu,
                null);
        Mesas mesa[] = new Mesas[aleatorio(8, 12)];
        switch (botonint) {

            case 0:
                llenarMesas(mesa);
                ImprimirMesas(mesa);
            break;
            
            default:
                break;
        }
    }
    public static int aleatorio(int min, int max) {
        return (int) (Math.random() * (max - min) + min);
    }
    public static void llenarMesas(Mesas mesa[]) {
        for (int i = 0; i < mesa.length; i++) {
            int numMesa = 0 + 1;
            int Cantsillas = aleatorio(2, 6);
            boolean Estado = false;
            int vistmar = aleatorio(0, 1);
            DatosMesero mesero = mesa[i].mesero;

            mesa[i] = new Mesas(numMesa, 
                    Cantsillas, 
                    Estado, 
                    vistmar, 
                    mesero);
        }
    }
    public static void ImprimirMesas(Mesas mesa[]) {
        for (int i = 0; i < mesa.length; i++) {
            System.out.println("Numero mesa: " + mesa[i].getNumMesa());
            System.out.println("Cantidad de sillas: " + mesa[i].getCantsillas());
            System.out.println("Estado mesa: " + mesa[i].isEstado());
            if (mesa[i].getVistmar() == 1) {
                System.out.println("La mesa cuenta con vista al mar");
            } else {
                System.out.println("La mesa no cuenta con vista al mar");
            }
            System.out.println("Nombre de Mesero: " + mesa[i].getMesero().nombreMesero);

        }
    }
    
}
