/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author kalema
 */
public class Materia {
    private int idMateria;
    private String nombre;
    private int cursada;
    private boolean estado;

    public Materia() {
    }

    public Materia(String nombre, int cursada, boolean estado) {
        this.nombre = nombre;
        this.cursada = cursada;
        this.estado = estado;
    }

    public Materia(int idMateria, String nombre, int cursada, boolean estado) {
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.cursada = cursada;
        this.estado = estado;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCursada() {
        return cursada;
    }

    public void setCursada(int cursada) {
        this.cursada = cursada;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
    
}
