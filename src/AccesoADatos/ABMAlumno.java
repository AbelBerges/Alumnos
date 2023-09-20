/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoADatos;

import Entidades.Alumno;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Connection;

/**
 *
 * @author kalema
 */
public class ABMAlumno {
    private Connection micon=null;
    
    public ABMAlumno(){
        micon=Conectar.getConnection();
    }
    
    public void insertoDatos(Alumno unAlumno){
        String sql="insert into alumnos(dni,apellido,nombre,fechaNacimiento,estado)"
                + "values(?,?,?,?,?)";
        try {
            PreparedStatement ps=micon.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, unAlumno.getDni());
            ps.setString(2, unAlumno.getApellido());
            ps.setString(3, unAlumno.getNombre());
            ps.setDate(4, Date.valueOf(unAlumno.getFechaNacimiento()));
            ps.setBoolean(5, unAlumno.getEstado());
            ps.executeUpdate();
            ResultSet rs=ps.getGeneratedKeys();
            if(rs.next()){
                unAlumno.setIdAlumno(rs.getInt(1));
            }
            ps.close();
            
        } catch (SQLException e) {
        }
    }
    
    
    
    public void modificoAlumno(Alumno vieneAlumno){
        String sql="update alumnos set dni=?,apellido=?,nombre=?,fechaNacimiento=?,estado=? where idAlumno=?";
        try {
            PreparedStatement ps=micon.prepareStatement(sql);
            ps.setInt(1, vieneAlumno.getDni());
            ps.setString(2, vieneAlumno.getApellido());
            ps.setString(3, vieneAlumno.getNombre());
            ps.setDate(4, Date.valueOf(vieneAlumno.getFechaNacimiento()));
            ps.setBoolean(5, vieneAlumno.getEstado());
            ps.setInt(6, vieneAlumno.getIdAlumno());
            int valor = ps.executeUpdate();
            if(valor==1){
                JOptionPane.showMessageDialog(null, "El alumno ha sido modificado");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar los datos de el alummo "+e.getMessage());
        }
    }
    
    public ResultSet selecAlumno(){
        String sqlSelect="select * from alumnos";
        ResultSet rs=null;
        try {
            Statement st=micon.createStatement();
            rs=st.executeQuery(sqlSelect);
            st.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al ejecutar el query "+e.getMessage());
        }
        return rs;
    }
    
    public Alumno buscarPorId(int idAlu){
        Alumno elAlu=null;
        String sql="select * from alumos where idAlumno=? and estado =1";
        try {
            Statement stSelect=micon.createStatement();
            ResultSet rsSelect=stSelect.executeQuery(sql);
            while (rsSelect.next()) {                
                elAlu=new Alumno();
                elAlu.setIdAlumno(rsSelect.getInt(1));
                elAlu.setDni(rsSelect.getInt(2));
                elAlu.setApellido(rsSelect.getString("apellido"));
                elAlu.setNombre(rsSelect.getString("nombre"));
                elAlu.setFechaNacimiento(Date.valueOf(rsSelect.getString("fechaNacimiento")).toLocalDate());
                elAlu.setEstado(rsSelect.getBoolean("estado"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al recuperar datos "+e.getMessage());
        }
        return elAlu;
    }
    
}
