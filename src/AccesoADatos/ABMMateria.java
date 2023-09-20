/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoADatos;

import Entidades.Alumno;
import Entidades.Materia;
import java.sql.Date;
import org.mariadb.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;

/**
 *
 * @author kalema
 */
public class ABMMateria {
    private Connection conectMateria=null;
    
    public ABMMateria(){
        conectMateria=Conectar.getConnection();
    }
    
    
    public void agregarMateria(Materia mat){
        String sql="insert into materia(nombre,cursada,estado)"
                + "values(?,?,?)";
        try {
            PreparedStatement ps=conectMateria.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, mat.getNombre());
            ps.setInt(2, mat.getCursada());
            ps.setBoolean(3, mat.getEstado());
            ps.executeUpdate();
            ResultSet rs=ps.getGeneratedKeys();
            if(rs.next()){
                mat.setIdMateria(rs.getInt(1));
            }else{
                JOptionPane.showMessageDialog(null, "Error al agregar la materia ");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos "+e.getMessage());
        }
    }
    
    public void actualizoMateria(Materia vieneMat){
        String sql="update materia set nombre=?,cursada=?,estado=? where idMateria=?";
        try {
            PreparedStatement psm=conectMateria.prepareStatement(sql);
            psm.setString(1, vieneMat.getNombre());
            psm.setInt(2, vieneMat.getCursada());
            psm.setBoolean(3, vieneMat.getEstado());
            psm.setInt(4, vieneMat.getIdMateria());
            int valor=psm.executeUpdate();
            if(valor==1){
                JOptionPane.showMessageDialog(null, "La materia se ha actualizado");
            }else{
                JOptionPane.showMessageDialog(null, "No se ha podido actualizar la materia");
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al preparar la conexión a la base de datos "+e.getMessage());
        }
    }
    
    public ResultSet seleccion(){
        String consulta="select * from materia";
        ResultSet rs=null;
        try {
            Statement st=conectMateria.createStatement();
            rs=st.executeQuery(consulta);
            st.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al establecer la conexión a la base de datos "+e.getMessage());
        }
        return rs;
    }
    
    public Materia buscarPorId(int idMat){
        Materia laMat=null;
        String sql="select * from alumos where idAlumno=? and estado =1";
        try {
            java.sql.Statement stSelect=conectMateria.createStatement();
            ResultSet rsSelect=stSelect.executeQuery(sql);
            while (rsSelect.next()) {                
                laMat=new Materia();
                laMat.setIdMateria(rsSelect.getInt(1));
                laMat.setNombre(rsSelect.getString("nombre"));
                laMat.setCursada(rsSelect.getShort("cursada"));
                laMat.setEstado(rsSelect.getBoolean("estado"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al recuperar datos "+e.getMessage());
        }
        return laMat;
    }
}
