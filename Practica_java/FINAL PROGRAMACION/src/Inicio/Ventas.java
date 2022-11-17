/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Inicio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lucia
 */
public class Ventas extends javax.swing.JFrame {

    /**
     * Creates new form Ventas
     */
    public Ventas() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        
        limpiar();
        mostrartabla("");
        
        txtid.setEnabled(false);
        
    }
    
    void limpiar () {
        
        txtid.setText("");
        txtproductos.setText("");
        txtfecha.setText("");
        txtmonto.setText("");
        txtmediopago.setText("");
        
    }
    
    void mostrartabla (String valor) {
        
        DefaultTableModel modelo=new DefaultTableModel ();
        
        modelo.addColumn("ID");
        modelo.addColumn("PRODUCTOS");
        modelo.addColumn("FECHA");
        modelo.addColumn("MONTO TOTAL");
        modelo.addColumn("MEDIO PAGO");
        
        tabla.setModel(modelo);
        
        String sql="SELECT * FROM Ventas WHERE CONCAT (cantidad_productos, fecha, monto_total, medio_pago) LIKE '%"+valor+"%'";
        
        String datos[]=new String[5];
        
        Statement st;
        
        try {
            
            st=cn.createStatement();
            
            ResultSet rs=st.executeQuery(sql);
            
            while(rs.next()) {
                
               datos[0]=rs.getString(1);
               datos[1]=rs.getString(2);
               datos[2]=rs.getString(3);
               datos[3]=rs.getString(4);
               datos[4]=rs.getString(5);
               
               modelo.addRow(datos);
                
            }
            
            tabla.setModel(modelo);
            
        } catch (SQLException e) {
            
            System.err.println("Error en el llenado de la tabla... "+e);
            JOptionPane.showMessageDialog(null, "Error en el llenado de la tabla");
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnguardar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtproductos = new javax.swing.JTextField();
        txtfecha = new javax.swing.JTextField();
        txtmonto = new javax.swing.JTextField();
        txtmediopago = new javax.swing.JTextField();
        btnactualizar = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btnvolver = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 153));

        btnguardar.setBackground(new java.awt.Color(153, 255, 153));
        btnguardar.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        btnguardar.setText("Guardar");
        btnguardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnguardarMouseClicked(evt);
            }
        });
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabel7.setText("Registro de ventas");

        jLabel3.setFont(new java.awt.Font("Loma", 0, 13)); // NOI18N
        jLabel3.setText("ID:");

        jLabel4.setFont(new java.awt.Font("Loma", 0, 13)); // NOI18N
        jLabel4.setText("Cant. Productos:");

        jLabel5.setFont(new java.awt.Font("Loma", 0, 13)); // NOI18N
        jLabel5.setText("Monto total:");

        jLabel8.setFont(new java.awt.Font("Loma", 0, 13)); // NOI18N
        jLabel8.setText("Medio de pago:");

        jLabel9.setFont(new java.awt.Font("Loma", 0, 13)); // NOI18N
        jLabel9.setText("Fecha:");

        btnactualizar.setBackground(new java.awt.Color(153, 255, 153));
        btnactualizar.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        btnactualizar.setText("Actualizar");
        btnactualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnactualizarMouseClicked(evt);
            }
        });
        btnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarActionPerformed(evt);
            }
        });

        btncancelar.setBackground(new java.awt.Color(153, 255, 153));
        btncancelar.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        btncancelar.setText("Cancelar");
        btncancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncancelarMouseClicked(evt);
            }
        });
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });

        btneliminar.setBackground(new java.awt.Color(153, 255, 153));
        btneliminar.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        btneliminar.setText("Eliminar");
        btneliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btneliminarMouseClicked(evt);
            }
        });
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel7))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel9)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtmonto, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                            .addComponent(txtmediopago)
                            .addComponent(txtid)
                            .addComponent(txtproductos, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                            .addComponent(txtfecha, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btncancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnguardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnactualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btneliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtproductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtmonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtmediopago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnguardar)
                    .addComponent(btnactualizar))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncancelar)
                    .addComponent(btneliminar))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 220, 320));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/fcce8e45d3293397347b6cd0182467d7.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-140, 0, 380, -1));

        jLabel6.setFont(new java.awt.Font("Rasa SemiBold", 1, 24)); // NOI18N
        jLabel6.setText("Registro Ventas");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 190, 40));

        tabla.setBackground(new java.awt.Color(204, 153, 255));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
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
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 480, 330));

        btnvolver.setBackground(new java.awt.Color(153, 255, 153));
        btnvolver.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        btnvolver.setText("Volver");
        btnvolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnvolverMouseClicked(evt);
            }
        });
        btnvolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvolverActionPerformed(evt);
            }
        });
        jPanel1.add(btnvolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 390, -1, -1));

        btnsalir.setBackground(new java.awt.Color(153, 255, 153));
        btnsalir.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        btnsalir.setText("Salir");
        btnsalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnsalirMouseClicked(evt);
            }
        });
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 390, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/cf684671e628d546a9a7aecf1974504f.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 620, 420));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 743, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnguardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnguardarMouseClicked

        try {

            PreparedStatement ps=cn.prepareStatement("INSERT INTO Ventas (cantidad_productos, fecha, monto_total, medio_pago) VALUES (?,?,?,?)");

            ps.setString(1, txtproductos.getText());
            ps.setString(2, txtfecha.getText());
            ps.setString(3, txtmonto.getText());
            ps.setString(4, txtmediopago.getText());

            ps.executeUpdate();

            limpiar();
            mostrartabla("");

        } catch (SQLException e) {

            System.err.println("Error al guardar... "+e);
            JOptionPane.showMessageDialog(null, "Error al guardar");

        }

    }//GEN-LAST:event_btnguardarMouseClicked

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnactualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnactualizarMouseClicked

        try {

            PreparedStatement ps=cn.prepareStatement ("UPDATE Ventas SET cantidad_productos='"+txtproductos.getText()+"',fecha='"+txtfecha.getText()+"',monto_total='"+txtmonto.getText()+"',medio_pago='"+txtmediopago.getText()+"' WHERE id='"+txtid.getText()+"'");

            int respuesta=ps.executeUpdate();

            if (respuesta>0) {

                JOptionPane.showMessageDialog(null, "Datos Actualizados");

                limpiar();
                mostrartabla("");

            } else {

                JOptionPane.showMessageDialog(null, "No ha seleccionado fila");

            }

        } catch (SQLException e) {

            System.err.println("Error al actualizar... "+e);
            JOptionPane.showMessageDialog(null, "Error al actualizar");

        }

    }//GEN-LAST:event_btnactualizarMouseClicked

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnactualizarActionPerformed

    private void btncancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncancelarMouseClicked
        limpiar ();
    }//GEN-LAST:event_btncancelarMouseClicked

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btncancelarActionPerformed

    private void btneliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btneliminarMouseClicked

        int fila=this.tabla.getSelectedRow();
        int eleccion = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea eliminar este registro?");
        if (eleccion==JOptionPane.YES_OPTION) {
            try {
                PreparedStatement ps=cn.prepareStatement ("DELETE FROM Ventas WHERE id='"+txtid.getText()+"'");
                int respuesta=ps.executeUpdate();
                if (respuesta>0) {

                    JOptionPane.showMessageDialog(null, "Registro Eliminado");
                    limpiar();
                    mostrartabla("");

                } else {

                    JOptionPane.showMessageDialog(null, "No ha seleccionado el registro");

                }

            } catch (SQLException e) {

                System.err.println("Error al eliminar... "+e);
                JOptionPane.showMessageDialog(null, "Error al eliminar");

            }
        } else {

            JOptionPane.showMessageDialog(null, "La operación fue cancelada");
            mostrartabla("");

        }

    }//GEN-LAST:event_btneliminarMouseClicked

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btneliminarActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked

        int fila=this.tabla.getSelectedRow();

        this.txtid.setText(this.tabla.getValueAt(fila, 0).toString());
        this.txtproductos.setText(this.tabla.getValueAt(fila, 1).toString());
        this.txtfecha.setText(this.tabla.getValueAt(fila, 2).toString());
        this.txtmonto.setText(this.tabla.getValueAt(fila, 3).toString());
        this.txtmediopago.setText(this.tabla.getValueAt(fila, 4).toString());
    }//GEN-LAST:event_tablaMouseClicked

    private void btnvolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnvolverMouseClicked
        Inicio inicio= new Inicio ();
        inicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnvolverMouseClicked

    private void btnvolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvolverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnvolverActionPerformed

    private void btnsalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnsalirMouseClicked

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnsalirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnactualizar;
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnsalir;
    private javax.swing.JButton btnvolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtfecha;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtmediopago;
    private javax.swing.JTextField txtmonto;
    private javax.swing.JTextField txtproductos;
    // End of variables declaration//GEN-END:variables

    cn con=new cn();
    Connection cn=con.conexión();
 
}
