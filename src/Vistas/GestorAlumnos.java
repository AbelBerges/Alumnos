/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import AccesoADatos.ABMAlumno;
import Entidades.Alumno;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author kalema
 */
public class GestorAlumnos extends javax.swing.JInternalFrame {

    public DefaultTableModel modelo = new DefaultTableModel() {

        @Override
        public boolean isCellEditable(int filas, int columna) {
            return false;
        }
    };

    ABMAlumno tempABM = new ABMAlumno();
    Alumno tempAlu = new Alumno();

    /**
     * Creates new form GestorAlumnos
     */
    public GestorAlumnos() {
        initComponents();
        armoTabla();
        camposHabilitados();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtGestionAlumnos = new javax.swing.JScrollPane();
        jTablaAluResultado = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jtBusquedaDNI = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jbtNuevoAlumno = new javax.swing.JButton();
        jtNuevoApeAlu = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtNuevoNomAlu = new javax.swing.JTextField();
        jtNuevoFechaAlu = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jcNuevoEstadoAlu = new javax.swing.JComboBox<>();
        jbtNuevoAgregarAlu = new javax.swing.JButton();
        jbtBajaAlu = new javax.swing.JButton();
        jbtActualizarAlu = new javax.swing.JButton();
        jbtCancelarAlu = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        jTablaAluResultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtGestionAlumnos.setViewportView(jTablaAluResultado);

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        jLabel1.setText("Ingrese el documento");
        jLabel1.setFocusable(false);

        jtBusquedaDNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtBusquedaDNIKeyReleased(evt);
            }
        });

        jLabel2.setText("Apellido");
        jLabel2.setFocusable(false);

        jbtNuevoAlumno.setText("Nuevo Alumno");
        jbtNuevoAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtNuevoAlumnoActionPerformed(evt);
            }
        });

        jtNuevoApeAlu.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtNuevoApeAluFocusLost(evt);
            }
        });

        jLabel3.setText("Nombre");
        jLabel3.setFocusable(false);

        jtNuevoNomAlu.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtNuevoNomAluFocusLost(evt);
            }
        });

        jtNuevoFechaAlu.setDateFormatString("yyyy-MM-dd");

        jLabel4.setText("Estado");
        jLabel4.setFocusable(false);

        jbtNuevoAgregarAlu.setText("Agregar");
        jbtNuevoAgregarAlu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtNuevoAgregarAluActionPerformed(evt);
            }
        });

        jbtBajaAlu.setText("Baja");

        jbtActualizarAlu.setText("Actualizar");

        jbtCancelarAlu.setText("Cancelar");
        jbtCancelarAlu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtCancelarAluActionPerformed(evt);
            }
        });

        jLabel5.setText("Fecha Nac.");
        jLabel5.setFocusable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtGestionAlumnos)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtBusquedaDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtNuevoAlumno))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtNuevoApeAlu)
                            .addComponent(jcNuevoEstadoAlu, 0, 150, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtNuevoAgregarAlu)
                                .addGap(18, 18, 18)
                                .addComponent(jbtBajaAlu)
                                .addGap(18, 18, 18)
                                .addComponent(jbtActualizarAlu)
                                .addGap(18, 18, 18)
                                .addComponent(jbtCancelarAlu))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtNuevoNomAlu, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jtNuevoFechaAlu, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(149, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtBusquedaDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtNuevoAlumno))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jtNuevoApeAlu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(jtNuevoNomAlu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addComponent(jtNuevoFechaAlu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jcNuevoEstadoAlu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtNuevoAgregarAlu)
                    .addComponent(jbtBajaAlu)
                    .addComponent(jbtActualizarAlu)
                    .addComponent(jbtCancelarAlu))
                .addGap(29, 29, 29)
                .addComponent(jtGestionAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtCancelarAluActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCancelarAluActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jbtCancelarAluActionPerformed

    private void jtBusquedaDNIKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtBusquedaDNIKeyReleased
        ResultSet resultado = tempABM.selecAlumno();
        borrarFilas();

        try {
            while (resultado.next()) {
                if (jtBusquedaDNI.getText().isEmpty()) {
                    jbtNuevoAlumno.setEnabled(false);
                    borrarFilas();

                } else if (resultado.getString("dni").startsWith(jtBusquedaDNI.getText())) {
                    modelo.addRow(new Object[]{resultado.getString(1), resultado.getString("Apellido"),
                        resultado.getString("nombre"), resultado.getInt(2), resultado.getBoolean("estado")});

                }

            }
            int cantidad=jtBusquedaDNI.getText().length();
            if (modelo.getRowCount() == 0 && cantidad>=8) {
                jbtNuevoAlumno.setEnabled(true);
            }
        } catch (SQLException e) {
        }
    }//GEN-LAST:event_jtBusquedaDNIKeyReleased

    private void jbtNuevoAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtNuevoAlumnoActionPerformed
        jtNuevoApeAlu.setEnabled(true);
        jtNuevoNomAlu.setEnabled(true);
        jtNuevoFechaAlu.setEnabled(true);
        jcNuevoEstadoAlu.setEnabled(true);
        cargoCombox();
        
    }//GEN-LAST:event_jbtNuevoAlumnoActionPerformed

    private void jtNuevoApeAluFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtNuevoApeAluFocusLost
        if(jtNuevoApeAlu.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "El campo APELLIDO no puede estar vacío");
            jtNuevoApeAlu.requestFocus();
        }
    }//GEN-LAST:event_jtNuevoApeAluFocusLost

    private void jtNuevoNomAluFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtNuevoNomAluFocusLost
        if(jtNuevoNomAlu.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "El campo NOMBRE no puede estar vacío");
        }
    }//GEN-LAST:event_jtNuevoNomAluFocusLost

    private void jbtNuevoAgregarAluActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtNuevoAgregarAluActionPerformed
        if(jtNuevoFechaAlu.getDate()==null){
            JOptionPane.showMessageDialog(this, "El campo FECHA NAC no puede estar vacío");
        }else{
            JOptionPane.showMessageDialog(this, "Viene con un valor");
        }
    }//GEN-LAST:event_jbtNuevoAgregarAluActionPerformed
    
   
    private void cargoCombox(){
        jcNuevoEstadoAlu.addItem("Activo");
        jcNuevoEstadoAlu.addItem("Desactivado");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTable jTablaAluResultado;
    private javax.swing.JButton jbtActualizarAlu;
    private javax.swing.JButton jbtBajaAlu;
    private javax.swing.JButton jbtCancelarAlu;
    private javax.swing.JButton jbtNuevoAgregarAlu;
    private javax.swing.JButton jbtNuevoAlumno;
    private javax.swing.JComboBox<String> jcNuevoEstadoAlu;
    private javax.swing.JTextField jtBusquedaDNI;
    private javax.swing.JScrollPane jtGestionAlumnos;
    private javax.swing.JTextField jtNuevoApeAlu;
    private com.toedter.calendar.JDateChooser jtNuevoFechaAlu;
    private javax.swing.JTextField jtNuevoNomAlu;
    // End of variables declaration//GEN-END:variables

    private void armoTabla() {
        modelo.addColumn("ID");
        modelo.addColumn("Apellido");
        modelo.addColumn("Nombre");
        modelo.addColumn("DNI");
        modelo.addColumn("Fecha de Nacimiento");
        jTablaAluResultado.setModel(modelo);
    }

    private void camposHabilitados() {
        jtNuevoApeAlu.setEnabled(false);
        jtNuevoNomAlu.setEnabled(false);
        jcNuevoEstadoAlu.setEnabled(false);
        jtNuevoFechaAlu.setEnabled(false);
        jbtActualizarAlu.setEnabled(false);
        jbtBajaAlu.setEnabled(false);
        jbtNuevoAgregarAlu.setEnabled(false);
        jbtNuevoAlumno.setEnabled(false);
    }

    private void amroFilas() {
        modelo.addRow(new Object[]{});
    }

    private void borrarFilas() {
        int valor = modelo.getRowCount() - 1;
//        System.out.println(valor);
        for (int i = valor; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

}
