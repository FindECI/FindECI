/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.model;

public class Carrera {

    private String nombreCarrera;
    private int Semestre;
    private int a�oIngreso;

    public Carrera(String nombreCarrera, int Semestre, int a�oIngreso) {
        this.nombreCarrera = nombreCarrera;
        this.Semestre = Semestre;
        this.a�oIngreso = a�oIngreso;
    }

    public String getNombreCarrera() {
        return nombreCarrera;
    }

    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }

    public int getSemestre() {
        return Semestre;
    }

    public void setSemestre(int Semestre) {
        this.Semestre = Semestre;
    }

    public int getA�oIngreso() {
        return a�oIngreso;
    }

    public void setA�oIngreso(int a�oIngreso) {
        this.a�oIngreso = a�oIngreso;
    }
    
    
}
