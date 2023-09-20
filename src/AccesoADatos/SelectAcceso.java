/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoADatos;

import Entidades.Usuarios;
import org.mariadb.jdbc.Connection;
import org.mariadb.jdbc.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author kalema
 */
public class SelectAcceso {

    Connection seleCon = null;
    public static Usuarios acceso = new Usuarios();

    public SelectAcceso() {
        seleCon = Conectar.getConnection();
    }

    public boolean validarAcceso(String user, String clave) {
        String sql = "select * from usuarios";
        boolean valido = false;
        try {
            Statement st = seleCon.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                if (user.equals(rs.getString("usuario")) && clave.equals(rs.getString("clave"))) {
                    acceso.setApellido(rs.getString("apellido"));
                    acceso.setNombre(rs.getString("nombre"));
                    acceso.setElGrupo(rs.getInt(6));
                    acceso.setUsuario(rs.getString("usuario"));
                    valido = true;
                    break;
                }
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al ejecutar el query " + e.getMessage());
        }
        return valido;
    }

}
