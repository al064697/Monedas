/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Sebas
 */
public class monedaConstructor {
    private int ID;
    private String Nombre;
    private String Simbolo;
    private double valorPesos;

    public monedaConstructor() {
    }

    public monedaConstructor(int ID, String Nombre, String Simbolo, double valorPesos) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.Simbolo = Simbolo;
        this.valorPesos = valorPesos;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getSimbolo() {
        return Simbolo;
    }

    public void setSimbolo(String Simbolo) {
        this.Simbolo = Simbolo;
    }

    public double getValorPesos() {
        return valorPesos;
    }

    public void setValorPesos(double valorPesos) {
        this.valorPesos = valorPesos;
    }

    @Override
    public String toString() {
        return "moneda{" + "ID=" + ID + ", Nombre=" + Nombre + ", Simbolo=" + Simbolo + ", valorPesos=" + valorPesos + '}';
    }
    
}