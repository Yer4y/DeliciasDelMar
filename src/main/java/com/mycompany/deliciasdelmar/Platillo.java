/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deliciasdelmar;

/**
 *
 * @author yeray
 */
class Platillo {
    private int numero;
    private String nombre;
    private String descripcion;
    private double precio;
    private TipoPlatillo tipo;


    public Platillo(int numero, String nombre, String descripcion, double precio, TipoPlatillo tipo) {
        this.numero = numero;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.tipo = tipo;
    }

    Platillo(int numero, String nombre, String descripcion, double precio, com.mycompany.deliciasdelmar.TipoPlatillo tipo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public TipoPlatillo getTipo() {
        return tipo;
    }

    public void setTipo(TipoPlatillo tipo) {
        this.tipo = tipo;
    }


    @Override
    public String toString() {
        return "Número del platillo #" + numero + "\n" +
                "Nombre: " + nombre + "\n" +
                "Descripción: " + descripcion + "\n" +
                "Precio: $" + precio + "\n" +
                "Tipo: " + tipo + "\n" +
                "¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯";
    }

   

    void setTipo(com.mycompany.deliciasdelmar.TipoPlatillo nuevoTipo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static class TipoPlatillo {

        public TipoPlatillo() {
        }
    }
}
