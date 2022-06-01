
package mke_matholy;
import java.awt.Color;
import javax.swing.JOptionPane;



public class opcionespers extends javax.swing.JFrame {


    public opcionespers(){
        initComponents();
               this.setSize(1010, 800);//le damos un tamaño a nuestra pantalla
               this.setTitle("OPCIONES");//le damos un titulo en la parte superior izquierda
               this.setLocation(150,60);//le damos una localizacion para cuando salga en pantalla
               
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        clientes = new javax.swing.JButton();
        empl = new javax.swing.JButton();
        volver = new javax.swing.JButton();
        proveedores = new javax.swing.JButton();
        tipousuario25 = new javax.swing.JLabel();
        lestilo2 = new javax.swing.JLabel();
        lestilo3 = new javax.swing.JLabel();
        lestilo4 = new javax.swing.JLabel();
        usuario = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        titulo.setBackground(new java.awt.Color(255, 255, 255));
        titulo.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        titulo.setForeground(new java.awt.Color(51, 102, 255));
        titulo.setText("Menú del modulo del personal ");
        titulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tituloMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tituloMouseExited(evt);
            }
        });
        getContentPane().add(titulo);
        titulo.setBounds(220, 20, 720, 90);

        clientes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mke_matholy/img/cliente.jpg"))); // NOI18N
        clientes.setBorder(new javax.swing.border.MatteBorder(null));
        clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clientesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clientesMouseExited(evt);
            }
        });
        clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientesActionPerformed(evt);
            }
        });
        getContentPane().add(clientes);
        clientes.setBounds(390, 180, 180, 180);

        empl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        empl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mke_matholy/img/empleado_1.jpg"))); // NOI18N
        empl.setBorder(new javax.swing.border.MatteBorder(null));
        empl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                emplMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                emplMouseExited(evt);
            }
        });
        empl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emplActionPerformed(evt);
            }
        });
        getContentPane().add(empl);
        empl.setBounds(150, 180, 180, 180);

        volver.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mke_matholy/img/volver.jpg"))); // NOI18N
        volver.setBorder(new javax.swing.border.MatteBorder(null));
        volver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                volverMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                volverMouseExited(evt);
            }
        });
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        getContentPane().add(volver);
        volver.setBounds(450, 460, 65, 65);

        proveedores.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        proveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mke_matholy/img/proveedor.jpg"))); // NOI18N
        proveedores.setBorder(new javax.swing.border.MatteBorder(null));
        proveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                proveedoresMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                proveedoresMouseExited(evt);
            }
        });
        proveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proveedoresActionPerformed(evt);
            }
        });
        getContentPane().add(proveedores);
        proveedores.setBounds(630, 180, 180, 180);

        tipousuario25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(tipousuario25);
        tipousuario25.setBounds(30, 100, 150, 30);

        lestilo2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lestilo2.setText("Empleados");
        lestilo2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lestilo2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lestilo2MouseExited(evt);
            }
        });
        getContentPane().add(lestilo2);
        lestilo2.setBounds(200, 150, 150, 30);

        lestilo3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lestilo3.setText("Clientes");
        lestilo3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lestilo3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lestilo3MouseExited(evt);
            }
        });
        getContentPane().add(lestilo3);
        lestilo3.setBounds(440, 150, 150, 30);

        lestilo4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lestilo4.setText("Proveedores");
        lestilo4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lestilo4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lestilo4MouseExited(evt);
            }
        });
        getContentPane().add(lestilo4);
        lestilo4.setBounds(670, 150, 150, 30);

        usuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mke_matholy/img/usuario.jpg"))); // NOI18N
        usuario.setBorder(new javax.swing.border.MatteBorder(null));
        usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                usuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                usuarioMouseExited(evt);
            }
        });
        usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioActionPerformed(evt);
            }
        });
        getContentPane().add(usuario);
        usuario.setBounds(60, 30, 65, 65);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mke_matholy/img/mke DEGRA.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1080, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tituloMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tituloMouseEntered
        titulo.setForeground(Color.black);
    }//GEN-LAST:event_tituloMouseEntered

    private void tituloMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tituloMouseExited
        titulo.setForeground(Color.blue);//le damos color al texto
    }//GEN-LAST:event_tituloMouseExited

    private void clientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientesMouseEntered
        clientes.setBackground(new java.awt.Color(153,153,255));//le damos color al texto del boton y al relleno
        clientes.setForeground(Color.red);
    }//GEN-LAST:event_clientesMouseEntered

    private void clientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientesMouseExited
        clientes.setBackground(new java.awt.Color(204,204,255));//le damos color al texto del boton y al relleno
        clientes.setForeground(Color.black);
    }//GEN-LAST:event_clientesMouseExited

    private void clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientesActionPerformed
        opcclien con=new opcclien();
        con.setVisible(true);
        dispose();
        if (tipousuario25.getText().equals("USUARIO")){
                con.tipousuario23.setText("USUARIO");
        }
        if(tipousuario25.getText().equals("ADMINISTRADOR")){
                con.tipousuario23.setText("ADMINISTRADOR");
        }
    }//GEN-LAST:event_clientesActionPerformed

    private void emplMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emplMouseEntered
        empl.setBackground(new java.awt.Color(153,153,255));//le damos color al texto del boton y al relleno
        empl.setForeground(Color.red);
    }//GEN-LAST:event_emplMouseEntered

    private void emplMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emplMouseExited
        empl.setBackground(new java.awt.Color(204,204,255));//le damos color al texto del boton y al relleno
        empl.setForeground(Color.black);
    }//GEN-LAST:event_emplMouseExited

    private void emplActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emplActionPerformed
if(tipousuario25.getText().equals("ADMINISTRADOR")){
        opcem el=new opcem();
        el.setVisible(true);
        dispose();
        if (tipousuario25.getText().equals("USUARIO")){
                el.tipousuario24.setText("USUARIO");
        }
        if(tipousuario25.getText().equals("ADMINISTRADOR")){
                el.tipousuario24.setText("ADMINISTRADOR");
        }
}else{
    JOptionPane.showMessageDialog(null,"No tienes los permisos para realizar esta acción");
}
    }//GEN-LAST:event_emplActionPerformed

    private void volverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverMouseEntered
        volver.setBackground(new java.awt.Color(153,153,255));//le damos color al texto del boton y al relleno
        volver.setForeground(Color.red);
    }//GEN-LAST:event_volverMouseEntered

    private void volverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverMouseExited
        volver.setBackground(new java.awt.Color(204,204,255));//le damos color al texto del boton y al relleno
        volver.setForeground(Color.black);
    }//GEN-LAST:event_volverMouseExited

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        pantallainicio pan=new pantallainicio();
        pan.setVisible(true);
        dispose();
        if (tipousuario25.getText().equals("USUARIO")){
                pan.tipousuario.setText("USUARIO");
        }
        if(tipousuario25.getText().equals("ADMINISTRADOR")){
                pan.tipousuario.setText("ADMINISTRADOR");
        }
    }//GEN-LAST:event_volverActionPerformed

    private void proveedoresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_proveedoresMouseEntered
        proveedores.setBackground(new java.awt.Color(153,153,255));//le damos color al texto del boton y al relleno
        proveedores.setForeground(Color.red);
    }//GEN-LAST:event_proveedoresMouseEntered

    private void proveedoresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_proveedoresMouseExited
        proveedores.setBackground(new java.awt.Color(204,204,255));//le damos color al texto del boton y al relleno
        proveedores.setForeground(Color.black);
    }//GEN-LAST:event_proveedoresMouseExited

    private void proveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proveedoresActionPerformed
    if(tipousuario25.getText().equals("ADMINISTRADOR")){
        opcprov pan=new opcprov();
        pan.setVisible(true);
        dispose();
        if (tipousuario25.getText().equals("USUARIO")){
                pan.tipousuario26.setText("USUARIO");
        }
        if(tipousuario25.getText().equals("ADMINISTRADOR")){
                pan.tipousuario26.setText("ADMINISTRADOR");
        }
    }else{
        JOptionPane.showMessageDialog(null,"No tienes los permisos para realizar esta acción");
    }
    }//GEN-LAST:event_proveedoresActionPerformed

    private void lestilo2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lestilo2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lestilo2MouseEntered

    private void lestilo2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lestilo2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lestilo2MouseExited

    private void lestilo3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lestilo3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lestilo3MouseEntered

    private void lestilo3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lestilo3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lestilo3MouseExited

    private void lestilo4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lestilo4MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lestilo4MouseEntered

    private void lestilo4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lestilo4MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lestilo4MouseExited

    private void usuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuarioMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioMouseEntered

    private void usuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuarioMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioMouseExited

    private void usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioActionPerformed

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
            java.util.logging.Logger.getLogger(opcionespers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(opcionespers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(opcionespers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(opcionespers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                    new opcionespers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clientes;
    private javax.swing.JButton empl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lestilo2;
    private javax.swing.JLabel lestilo3;
    private javax.swing.JLabel lestilo4;
    private javax.swing.JButton proveedores;
    public javax.swing.JLabel tipousuario25;
    private javax.swing.JLabel titulo;
    private javax.swing.JButton usuario;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
