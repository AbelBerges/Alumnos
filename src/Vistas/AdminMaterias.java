/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import AccesoADatos.ABMMateria;
import Entidades.Materia;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
/**
 *
 * @author kalema
 */
public class AdminMaterias extends javax.swing.JInternalFrame {

    public DefaultTableModel modeloAlta=new DefaultTableModel(){
        
        @Override
        public boolean isCellEditable(int filas,int columna){
            return false;
        }
    
    };
    
    public static Materia matTemp=new Materia();
    public static ABMMateria abmMat=new ABMMateria();
    
    /**
     * Creates new form AdminMaterias
     */
    public AdminMaterias() {
        initComponents();
        armoTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTabs = new javax.swing.JTabbedPane();
        jTabMeteriaAlta = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablaMuestroAlta = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jtMateriaNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtMateriaCursada = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtMateriaActiva = new javax.swing.JTextField();
        jbtMateriaAgregar = new javax.swing.JButton();
        jbtMateriaCancelar = new javax.swing.JButton();
        jTabMeteriaEdicion = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtTablaEdicionResultado = new javax.swing.JTable();
        jtEdicionBusqueda = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtEdicionID = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtEdicionMatNombre = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtEdicionMatCursada = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jtEdicionMatActiva = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1053, 555));

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel1.setText("ADMINISTRACIÓN DE MATERIAS");

        jTabs.setBackground(new java.awt.Color(255, 255, 255));

        jTabMeteriaAlta.setBackground(new java.awt.Color(218, 233, 209));

        jTablaMuestroAlta.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTablaMuestroAlta);

        jLabel2.setText("Nombre");
        jLabel2.setFocusable(false);

        jLabel3.setText("Año de cursada");
        jLabel3.setFocusable(false);

        jLabel4.setText("Activa");
        jLabel4.setFocusable(false);

        jbtMateriaAgregar.setText("Agregar");
        jbtMateriaAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtMateriaAgregarActionPerformed(evt);
            }
        });

        jbtMateriaCancelar.setText("Cancelar");
        jbtMateriaCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtMateriaCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jTabMeteriaAltaLayout = new javax.swing.GroupLayout(jTabMeteriaAlta);
        jTabMeteriaAlta.setLayout(jTabMeteriaAltaLayout);
        jTabMeteriaAltaLayout.setHorizontalGroup(
            jTabMeteriaAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jTabMeteriaAltaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jTabMeteriaAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jTabMeteriaAltaLayout.createSequentialGroup()
                        .addGroup(jTabMeteriaAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbtMateriaAgregar)
                            .addGroup(jTabMeteriaAltaLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jtMateriaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jtMateriaCursada, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75)
                                .addComponent(jLabel4)))
                        .addGap(18, 18, 18)
                        .addGroup(jTabMeteriaAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtMateriaActiva, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtMateriaCancelar))
                        .addGap(0, 123, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jTabMeteriaAltaLayout.setVerticalGroup(
            jTabMeteriaAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jTabMeteriaAltaLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jTabMeteriaAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtMateriaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jtMateriaCursada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jtMateriaActiva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addGroup(jTabMeteriaAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtMateriaAgregar)
                    .addComponent(jbtMateriaCancelar))
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabs.addTab("Alta de materias", jTabMeteriaAlta);

        jTabMeteriaEdicion.setBackground(new java.awt.Color(242, 217, 171));

        jLabel5.setText("Patrón de búsqueda");
        jLabel5.setFocusable(false);

        jtTablaEdicionResultado.setModel(new javax.swing.table.DefaultTableModel(
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
        jtTablaEdicionResultado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtTablaEdicionResultadoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtTablaEdicionResultado);

        jtEdicionBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtEdicionBusquedaKeyReleased(evt);
            }
        });

        jLabel6.setText("ID Materia");
        jLabel6.setFocusable(false);

        jLabel7.setText("Nombre");
        jLabel7.setFocusable(false);

        jLabel8.setText("Cursada");
        jLabel8.setFocusable(false);

        jLabel9.setText("Acitva");
        jLabel9.setFocusable(false);

        jButton1.setText("Actualizar");

        jButton2.setText("Cancelar");

        javax.swing.GroupLayout jTabMeteriaEdicionLayout = new javax.swing.GroupLayout(jTabMeteriaEdicion);
        jTabMeteriaEdicion.setLayout(jTabMeteriaEdicionLayout);
        jTabMeteriaEdicionLayout.setHorizontalGroup(
            jTabMeteriaEdicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jTabMeteriaEdicionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jTabMeteriaEdicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jTabMeteriaEdicionLayout.createSequentialGroup()
                        .addGroup(jTabMeteriaEdicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jTabMeteriaEdicionLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jtEdicionBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jTabMeteriaEdicionLayout.createSequentialGroup()
                                .addGroup(jTabMeteriaEdicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton1)
                                    .addGroup(jTabMeteriaEdicionLayout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(jtEdicionID, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(48, 48, 48)
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(jtEdicionMatNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addComponent(jtEdicionMatCursada, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jTabMeteriaEdicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jTabMeteriaEdicionLayout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18)
                                        .addComponent(jtEdicionMatActiva, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButton2))))
                        .addGap(0, 138, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jTabMeteriaEdicionLayout.setVerticalGroup(
            jTabMeteriaEdicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jTabMeteriaEdicionLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jTabMeteriaEdicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtEdicionBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jTabMeteriaEdicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jTabMeteriaEdicionLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jTabMeteriaEdicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jtEdicionID, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jTabMeteriaEdicionLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jTabMeteriaEdicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jtEdicionMatNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jtEdicionMatCursada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jtEdicionMatActiva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(51, 51, 51)
                .addGroup(jTabMeteriaEdicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(39, 39, 39)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabs.addTab("Edición de Materias", jTabMeteriaEdicion);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(368, 368, 368)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabs)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabs)
                .addContainerGap())
        );

        jTabs.getAccessibleContext().setAccessibleName("Alta de Materias");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtMateriaAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtMateriaAgregarActionPerformed
        matTemp.setNombre(jtMateriaNombre.getText());
        matTemp.setCursada(Integer.parseInt(jtMateriaCursada.getText()));
        boolean act=false;
        int valor=Integer.parseInt(jtMateriaActiva.getText());
        if(valor==1){
            act=true;
        }
        matTemp.setEstado(act);
        abmMat.agregarMateria(matTemp);
        System.out.println("Muestro si me trae el id de la materia agregada "+matTemp.getIdMateria());
        armoFilas();
        jtMateriaNombre.setText("");
        jtMateriaCursada.setText("");
        jtMateriaActiva.setText("");
        jtMateriaNombre.requestFocus();
        jtMateriaNombre.selectAll();
    }//GEN-LAST:event_jbtMateriaAgregarActionPerformed

    private void jbtMateriaCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtMateriaCancelarActionPerformed
        jtMateriaNombre.setText("");
        jtMateriaCursada.setText("");
        jtMateriaActiva.setText("");
        jtMateriaNombre.requestFocus();
        jtMateriaNombre.selectAll();
    }//GEN-LAST:event_jbtMateriaCancelarActionPerformed

    private void jtTablaEdicionResultadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtTablaEdicionResultadoMouseClicked
        int valor=jtTablaEdicionResultado.getSelectedRow();
        String idMat=String.valueOf(jtTablaEdicionResultado.getValueAt(valor, 0));
        String nomMat=String.valueOf(jtTablaEdicionResultado.getValueAt(valor, 1));
        String curMat=String.valueOf(jtTablaEdicionResultado.getValueAt(valor, 2));
        String actMat=String.valueOf(jtTablaEdicionResultado.getValueAt(valor, 3));
        jtEdicionID.setText(idMat);
        jtEdicionMatNombre.setText(nomMat);
        jtEdicionMatCursada.setText(curMat);
        jtEdicionMatActiva.setText(actMat);
    }//GEN-LAST:event_jtTablaEdicionResultadoMouseClicked

    private void jtEdicionBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtEdicionBusquedaKeyReleased
        String busqueda=jtEdicionBusqueda.getText();
        try {
            ResultSet datos=abmMat.seleccion();
            if(busqueda.isEmpty()){
                while (datos.next()) {                
                if(busqueda.startsWith(datos.getString("nombre"))){
                    
                }
            }
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jtEdicionBusquedaKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel jTabMeteriaAlta;
    private javax.swing.JPanel jTabMeteriaEdicion;
    private javax.swing.JTable jTablaMuestroAlta;
    private javax.swing.JTabbedPane jTabs;
    private javax.swing.JButton jbtMateriaAgregar;
    private javax.swing.JButton jbtMateriaCancelar;
    private javax.swing.JTextField jtEdicionBusqueda;
    private javax.swing.JLabel jtEdicionID;
    private javax.swing.JTextField jtEdicionMatActiva;
    private javax.swing.JTextField jtEdicionMatCursada;
    private javax.swing.JTextField jtEdicionMatNombre;
    private javax.swing.JTextField jtMateriaActiva;
    private javax.swing.JTextField jtMateriaCursada;
    private javax.swing.JTextField jtMateriaNombre;
    private javax.swing.JTable jtTablaEdicionResultado;
    // End of variables declaration//GEN-END:variables
    
    private void armoTabla(){
        modeloAlta.addColumn("Id");
        modeloAlta.addColumn("Nombre");
        modeloAlta.addColumn("Cursada");
        modeloAlta.addColumn("Activa");
        jTablaMuestroAlta.setModel(modeloAlta);
        jtTablaEdicionResultado.setModel(modeloAlta);
    }
    
    private void armoFilas(){
        String valorID=String.valueOf(matTemp.getIdMateria());
        modeloAlta.addRow(new Object[]{valorID,jtMateriaNombre.getText(),jtMateriaCursada.getText(),jtMateriaActiva.getText()});
    }

}
