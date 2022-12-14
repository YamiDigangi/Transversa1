/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vistas;

import ClasesControladoras.MateriaData;
import ClasesModelo.Conexion;
import ClasesModelo.Materia;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author yamic
 */
public class Materias extends javax.swing.JInternalFrame {
    private MateriaData materiaData;
    private Connection con;
    /** Creates new form Materia */
    public Materias() {
        initComponents();
        
        this.con =Conexion.getConexion();
        this.materiaData = new MateriaData();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlMaterias = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jchEstado = new javax.swing.JCheckBox();
        jtfID = new javax.swing.JTextField();
        jtfNombre = new javax.swing.JTextField();
        jtfAño = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbBorrar = new javax.swing.JButton();
        jbActualizar = new javax.swing.JButton();
        jbLimpiar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jlMaterias.setFont(new java.awt.Font("Felix Titling", 1, 36)); // NOI18N
        jlMaterias.setForeground(new java.awt.Color(0, 153, 102));
        jlMaterias.setText("Materias");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("CODIGO:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("NOMBRE:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("AÑO:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("ESTADO");

        jbBuscar.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jbBuscar.setForeground(new java.awt.Color(0, 102, 51));
        jbBuscar.setText("BUSCAR");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jbGuardar.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jbGuardar.setForeground(new java.awt.Color(0, 102, 51));
        jbGuardar.setText("GUARDAR");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbBorrar.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jbBorrar.setForeground(new java.awt.Color(0, 102, 51));
        jbBorrar.setText("BORRAR");
        jbBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBorrarActionPerformed(evt);
            }
        });

        jbActualizar.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jbActualizar.setForeground(new java.awt.Color(0, 102, 51));
        jbActualizar.setText("ACUALIZAR");
        jbActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActualizarActionPerformed(evt);
            }
        });

        jbLimpiar.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jbLimpiar.setForeground(new java.awt.Color(0, 102, 51));
        jbLimpiar.setText("LIMPIAR");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(0, 153, 102));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbGuardar)
                                .addGap(18, 18, 18)
                                .addComponent(jbBorrar)
                                .addGap(18, 18, 18)
                                .addComponent(jbActualizar)
                                .addGap(18, 18, 18)
                                .addComponent(jbLimpiar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator1)
                                    .addComponent(jlMaterias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jLabel4))
                        .addContainerGap(21, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtfID, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbBuscar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfAño, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jchEstado))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(70, 70, 70))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jlMaterias)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jtfID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbBuscar))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jtfAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jchEstado)))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGuardar)
                    .addComponent(jbBorrar)
                    .addComponent(jbActualizar)
                    .addComponent(jbLimpiar))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        // TODO add your handling code here:
        int id= Integer.parseInt(jtfID.getText());
        Materia mat = materiaData.obtenerMateriaPorId(id);
        if(mat != null){
            
        try {
        jtfAño.setText(mat.getAño()+"");
        jtfNombre.setText(mat.getNombre());
        jchEstado.setSelected(mat.isEstado());
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Ud debe ingresar un numero");
            jtfID.setText("");
            jtfID.requestFocus();
        }
        }else {
            JOptionPane.showMessageDialog(this, "Materia no encontra");
        } 
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        // TODO add your handling code here:
        jtfID.setText("");
        jtfAño.setText("");
        jtfNombre.setText("");
        jchEstado.setEnabled(false);
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBorrarActionPerformed
        // TODO add your handling code here:
        int idMateria = Integer.parseInt(jtfID.getText());
        materiaData.borrarMateria(idMateria);
        
    }//GEN-LAST:event_jbBorrarActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        // TODO add your handling code here:
        int año=Integer.parseInt(jtfAño.getText());
        String nombre=jtfNombre.getText();
        boolean estado =jchEstado.isEnabled();
        
        Materia materia = new Materia(nombre,año,estado);
        materiaData.guardarMateria(materia);
        jtfID.setText(materia.getIdMateria()+"");
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActualizarActionPerformed
        // TODO add your handling code here:
         if(jtfID.getText() != null){
            
         int id=Integer.parseInt(jtfID.getText());
         int año=Integer.parseInt(jtfAño.getText());
         String nombre=jtfNombre.getText();
         boolean estado =jchEstado.isEnabled();
            
         Materia materia=new Materia(id,nombre,año,estado);
         materiaData.actualizaMateria(materia);
         }
    }//GEN-LAST:event_jbActualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbActualizar;
    private javax.swing.JButton jbBorrar;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JCheckBox jchEstado;
    private javax.swing.JLabel jlMaterias;
    private javax.swing.JTextField jtfAño;
    private javax.swing.JTextField jtfID;
    private javax.swing.JTextField jtfNombre;
    // End of variables declaration//GEN-END:variables

}
