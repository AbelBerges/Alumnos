/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoADatos;

import Entidades.Alumno;
import Entidades.Inscripcion;
import Entidades.Materia;
import org.mariadb.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author kalema
 */
public class ABMInscripcion {
    
    private Connection micon=null;
    private Materia mat=new Materia();
    //private Alumno alu=new Alumno();
    private ABMAlumno abmAlu=new ABMAlumno();
    private ABMMateria abmMat=new ABMMateria();
    
    public ABMInscripcion(){
        micon=Conectar.getConnection();
    }
    
    
    public void agredoInscripcion(Inscripcion ins){
        
        String sql="insert into inscripcion (nota,idAlumno,idMateria)"
                + "values(?,?,?)";
        
        try {
            PreparedStatement ps=micon.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setDouble(1, ins.getNota());
            ps.setInt(2, ins.getLaMateria().getIdMateria());
            ps.setInt(3, ins.getElAlumno().getIdAlumno());
            ps.executeUpdate();
            ResultSet rs=ps.getGeneratedKeys();
            if(rs.next()){
                ins.setIdInscripcion(1);
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al insertar los datos "+e.getMessage());
        }
        
    }
    
    public void actualizarNota(int idAlumno,int idMateria,double nota){
        String sql="update inscrtipcion set nota= ? where idAlumno = ? and idMateria = ?";
        try {
            PreparedStatement psa=micon.prepareStatement(sql);
            psa.setDouble(1, nota);
            psa.setInt(2, idAlumno);
            psa.setInt(2, idMateria);
            int valor=psa.executeUpdate();
            if(valor==1){
                JOptionPane.showMessageDialog(null, "Se actualizo el registro");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar el registro "+e.getMessage());
        }
        
    }
    
    
    public void eliminarInscripcion(int idAlumno,int idMateria){
        String sql="update inscripcion set estado = 0 where idAlumno=? and idMateria=?";
        try {
            PreparedStatement psb=micon.prepareStatement(sql);
            psb.setInt(1, idAlumno);
            psb.setInt(2, idMateria);
            int fila=psb.executeUpdate();
            if(fila>0){
                JOptionPane.showMessageDialog(null, "Se dio de baja la inscripción");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al dar de baja la inscripción "+e.getMessage());
        }
    }
    
    
    public List<Inscripcion> listarInscripciones(){
        
        ArrayList<Inscripcion> laLista=new ArrayList();
        String seleccion="select * from inscripcion";        
        Inscripcion insc=null;
        try {
            Statement st=micon.createStatement();
            ResultSet rs=st.executeQuery(seleccion);
            while (rs.next()) {                
                insc= new Inscripcion();
                insc.setIdInscripcion(rs.getInt(1));
                insc.setElAlumno(abmAlu.buscarPorId(rs.getInt("idAlumno")));
                insc.setLaMateria(abmMat.buscarPorId(rs.getInt("idMateria")));
                insc.setNota(rs.getDouble("nota"));
                laLista.add(insc);
            }
        } catch (Exception e) {
        }
        
        
        return laLista;
    }
    
    public List<Inscripcion> listarPorAlumno(int idAlu){
        ArrayList<Inscripcion> lsxAlu=new ArrayList();
        String consulta="Select * from inscrpcion where idAlumno=?";
        Inscripcion inscAlu=null;
        try {
            PreparedStatement st=micon.prepareStatement(consulta);
            st.setInt(1, idAlu);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                inscAlu=new Inscripcion();
                inscAlu.setIdInscripcion(rs.getInt(1));
                inscAlu.setElAlumno(abmAlu.buscarPorId(rs.getInt("idAlumno")));
                inscAlu.setLaMateria(abmMat.buscarPorId(rs.getInt("idMateria")));
                inscAlu.setNota(rs.getDouble("nota"));
                lsxAlu.add(inscAlu);
            }
            st.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al consultar la base de datos "+e.getMessage());
        }
        return lsxAlu;
    }
    
    public List<Materia> lisatxMat(int idMat){
        //Esta sin terminar
        ArrayList<Materia> lisMat=new ArrayList();
        String sql="select * from inscripcion where idMateria=?";
        try {
            PreparedStatement ps=micon.prepareStatement(sql);
            ps.setInt(1, idMat);
            ResultSet rs=ps.executeQuery();
            while (rs.next()) {                
                
            }
        } catch (Exception e) {
        }
        return lisMat;
    }
}
