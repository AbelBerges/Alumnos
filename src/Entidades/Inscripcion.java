/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import Entidades.Materia;
import Entidades.Alumno;

/**
 *
 * @author kalema
 */
public class Inscripcion {
    private int idInscripcion;
    private double nota;
    private Alumno elAlumno;
    private Materia laMateria;

    public Inscripcion() {
    }

    public Inscripcion(double nota, Alumno elAlumno, Materia laMateria) {
        this.nota = nota;
        this.elAlumno = elAlumno;
        this.laMateria = laMateria;
    }

    public Inscripcion(int idInscripcion, double nota, Alumno elAlumno, Materia laMateria) {
        this.idInscripcion = idInscripcion;
        this.nota = nota;
        this.elAlumno = elAlumno;
        this.laMateria = laMateria;
    }

    public int getIdInscripcion() {
        return idInscripcion;
    }

    public void setIdInscripcion(int idInscripcion) {
        this.idInscripcion = idInscripcion;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public Alumno getElAlumno() {
        return elAlumno;
    }

    public void setElAlumno(Alumno elAlumno) {
        this.elAlumno = elAlumno;
    }

    public Materia getLaMateria() {
        return laMateria;
    }

    public void setLaMateria(Materia laMateria) {
        this.laMateria = laMateria;
    }
    
    
}
