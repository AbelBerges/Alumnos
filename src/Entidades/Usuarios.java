/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author kalema
 */
public class Usuarios {
    private int idUsuario;
    private String nombre;
    private String apellido;
    private String usuario;
    private String clave;
    private int elGrupo;
    private boolean estado;

    public Usuarios() {
    }

    public Usuarios(String nombre, String apellido, String usuario, String clave, int elGrupo, boolean estado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.clave = clave;
        this.elGrupo = elGrupo;
        this.estado = estado;
    }

    public Usuarios(int idUsuario, String nombre, String apellido, String usuario, String clave, int elGrupo, boolean estado) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.clave = clave;
        this.elGrupo = elGrupo;
        this.estado = estado;
    }

   

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getElGrupo() {
        return elGrupo;
    }

    public void setElGrupo(int elGrupo) {
        this.elGrupo = elGrupo;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
    
}
