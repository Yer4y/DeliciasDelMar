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
      switch(botonint){
          
          case 0:
          int numrammesa=(int)(Math.random()*12+1);
          Mesas mesa1=new Mesas();
          mesa1.numMesa=numrammesa;
          
          
          
          
          
          
          
      }
    }
}
