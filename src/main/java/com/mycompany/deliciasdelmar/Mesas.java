/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deliciasdelmar;

/**
 *
 * @author brand
 */
public class Mesas {

    int numMesa;
    int Cantsillas;
    boolean Estado;
    int vistmar;
    DatosMesero mesero;

    public Mesas(int numMesa, int Cantsillas, boolean Estado, int vistmar, DatosMesero mesero) {
        this.numMesa = numMesa;
        this.Cantsillas = Cantsillas;
        this.Estado = Estado;
        this.vistmar = vistmar;
        this.mesero = mesero;
    }

    public int getNumMesa() {
        return numMesa;
    }

    public void setNumMesa(int numMesa) {
        this.numMesa = numMesa;
    }

    public int getCantsillas() {
        return Cantsillas;
    }

    public void setCantsillas(int Cantsillas) {
        this.Cantsillas = Cantsillas;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }

    public int getVistmar() {
        return vistmar;
    }

    public void setVistmar(int vistmar) {
        this.vistmar = vistmar;
    }

    public DatosMesero getMesero() {
        return mesero;
    }

    public void setMesero(DatosMesero mesero) {
        this.mesero = mesero;
    }

}
