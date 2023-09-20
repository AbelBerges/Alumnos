/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author kalema
 */
public class Grupos {
    private int idGrupo;
    private String nombre;
    private String comentario;
    private boolean estado;

    public Grupos() {
    }

    public Grupos(String nombre, String comentario,boolean estado) {
        this.nombre = nombre;
        this.comentario = comentario;
        this.estado=estado;
    }

    public Grupos(int idGrupo, String nombre, String comentario,boolean estado) {
        this.idGrupo = idGrupo;
        this.nombre = nombre;
        this.comentario = comentario;
        this.estado=estado;
    }

    public int getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(int idGrupo) {
        this.idGrupo = idGrupo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
}
