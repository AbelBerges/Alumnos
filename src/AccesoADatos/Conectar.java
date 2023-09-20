/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoADatos;

import org.mariadb.jdbc.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Configuration;
import org.mariadb.jdbc.Driver;
/**
 *
 * @author kalema
 */
public class Conectar {
    
    
    public Conectar(){}
    
    private static Connection miConeccion;
    
    
    public static Connection getConnection(){
        if(miConeccion==null){
            try {
                String datos="jdbc:mariadb://localhost:3306/alumno?user=administrador&password=Sc@pL#BmDB";
                miConeccion=Driver.connect(Configuration.parse(datos));
            } catch (SQLException e) {
                JOptionPane.showConfirmDialog(null, "Error al conectar a la base de datos"+e.getMessage());
            }
        }
        return miConeccion;
    }
}
