
package mke_matholy;
import java.awt.Color;
import javax.swing.JOptionPane;



public class menuventas extends javax.swing.JFrame {


    public menuventas(){
        initComponents();
               this.setSize(1010, 800);//le damos un tamaño a nuestra pantalla
               this.setTitle("OPCIONES");//le damos un titulo en la parte superior izquierda
               this.setLocation(150,60);//le damos una localizacion para cuando salga en pantalla
                
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        pedidos = new javax.swing.JButton();
        ventas = new javax.swing.JButton();
        volver = new javax.swing.JButton();
        devoluciones = new javax.swing.JButton();
        tipousuario19 = new javax.swing.JLabel();
        lestilo = new javax.swing.JLabel();
        lestilo1 = new javax.swing.JLabel();
        lestilo2 = new javax.swing.JLabel();
        usuario = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        titulo.setBackground(new java.awt.Color(255, 255, 255));
        titulo.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        titulo.setForeground(new java.awt.Color(51, 102, 255));
        titulo.setText("Menú del modulo ventas");
        titulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tituloMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tituloMouseExited(evt);
            }
        });
        getContentPane().add(titulo);
        titulo.setBounds(280, 20, 720, 90);

        pedidos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        pedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mke_matholy/img/pedidos.jpg"))); // NOI18N
        pedidos.setBorder(new javax.swing.border.MatteBorder(null));
        pedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pedidosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pedidosMouseExited(evt);
            }
        });
        pedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pedidosActionPerformed(evt);
            }
        });
        getContentPane().add(pedidos);
        pedidos.setBounds(650, 270, 180, 180);

        ventas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ventas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mke_matholy/img/ventas.jpg"))); // NOI18N
        ventas.setBorder(new javax.swing.border.MatteBorder(null));
        ventas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ventasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ventasMouseExited(evt);
            }
        });
        ventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ventasActionPerformed(evt);
            }
        });
        getContentPane().add(ventas);
        ventas.setBounds(170, 270, 180, 180);

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
        volver.setBounds(470, 520, 65, 65);

        devoluciones.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        devoluciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mke_matholy/img/devoluciones.jpg"))); // NOI18N
        devoluciones.setBorder(new javax.swing.border.MatteBorder(null));
        devoluciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                devolucionesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                devolucionesMouseExited(evt);
            }
        });
        devoluciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                devolucionesActionPerformed(evt);
            }
        });
        getContentPane().add(devoluciones);
        devoluciones.setBounds(410, 270, 180, 180);

        tipousuario19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(tipousuario19);
        tipousuario19.setBounds(20, 100, 150, 30);

        lestilo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lestilo.setText("Ventas");
        lestilo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lestiloMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lestiloMouseExited(evt);
            }
        });
        getContentPane().add(lestilo);
        lestilo.setBounds(230, 240, 70, 30);

        lestilo1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lestilo1.setText("Pedidos");
        lestilo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lestilo1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lestilo1MouseExited(evt);
            }
        });
        getContentPane().add(lestilo1);
        lestilo1.setBounds(700, 240, 70, 30);

        lestilo2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lestilo2.setText("Devoluciones");
        lestilo2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lestilo2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lestilo2MouseExited(evt);
            }
        });
        getContentPane().add(lestilo2);
        lestilo2.setBounds(440, 240, 130, 30);

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
        jLabel1.setBounds(0, 0, 1080, 800);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tituloMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tituloMouseEntered
        titulo.setForeground(Color.black);
    }//GEN-LAST:event_tituloMouseEntered

    private void tituloMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tituloMouseExited
        titulo.setForeground(Color.blue);//le damos color al texto
    }//GEN-LAST:event_tituloMouseExited

    private void pedidosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pedidosMouseEntered
        pedidos.setBackground(new java.awt.Color(153,153,255));//le damos color al texto del boton y al relleno
        pedidos.setForeground(Color.red);
    }//GEN-LAST:event_pedidosMouseEntered

    private void pedidosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pedidosMouseExited
        pedidos.setBackground(new java.awt.Color(204,204,255));//le damos color al texto del boton y al relleno
        pedidos.setForeground(Color.black);
    }//GEN-LAST:event_pedidosMouseExited

    private void pedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pedidosActionPerformed
        menupedidos con=new menupedidos();
        con.setVisible(true);
        dispose();
        if (tipousuario19.getText().equals("USUARIO")){
                con.tipousuario18.setText("USUARIO");
        }
        if(tipousuario19.getText().equals("ADMINISTRADOR")){
                con.tipousuario18.setText("ADMINISTRADOR");
        }
    }//GEN-LAST:event_pedidosActionPerformed

    private void ventasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ventasMouseEntered
        ventas.setBackground(new java.awt.Color(153,153,255));//le damos color al texto del boton y al relleno
        ventas.setForeground(Color.red);
    }//GEN-LAST:event_ventasMouseEntered

    private void ventasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ventasMouseExited
        ventas.setBackground(new java.awt.Color(204,204,255));//le damos color al texto del boton y al relleno
        ventas.setForeground(Color.black);
    }//GEN-LAST:event_ventasMouseExited

    private void ventasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ventasActionPerformed
        menuventas1 el=new menuventas1();
        el.setVisible(true);
        dispose();
        if (tipousuario19.getText().equals("USUARIO")){
                el.tipousuario20.setText("USUARIO");
        }
        if(tipousuario19.getText().equals("ADMINISTRADOR")){
                el.tipousuario20.setText("ADMINISTRADOR");
        }
    }//GEN-LAST:event_ventasActionPerformed

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
        if (tipousuario19.getText().equals("USUARIO")){
                pan.tipousuario.setText("USUARIO");
        }
        if(tipousuario19.getText().equals("ADMINISTRADOR")){
                pan.tipousuario.setText("ADMINISTRADOR");
        }
    }//GEN-LAST:event_volverActionPerformed

    private void devolucionesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_devolucionesMouseEntered
        devoluciones.setBackground(new java.awt.Color(153,153,255));//le damos color al texto del boton y al relleno
        devoluciones.setForeground(Color.red);
    }//GEN-LAST:event_devolucionesMouseEntered

    private void devolucionesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_devolucionesMouseExited
        devoluciones.setBackground(new java.awt.Color(204,204,255));//le damos color al texto del boton y al relleno
        devoluciones.setForeground(Color.black);
    }//GEN-LAST:event_devolucionesMouseExited

    private void devolucionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_devolucionesActionPerformed
    if(tipousuario19.getText().equals("ADMINISTRADOR")){
        menudevoluciones pan=new menudevoluciones();
        pan.setVisible(true);
        dispose();
        if (tipousuario19.getText().equals("USUARIO")){
                pan.tipousuario17.setText("USUARIO");
        }
        if(tipousuario19.getText().equals("ADMINISTRADOR")){
                pan.tipousuario17.setText("ADMINISTRADOR");
        }
    }else{
        JOptionPane.showMessageDialog(null,"No tienes los permisos para realizar esta acción");
    }
    }//GEN-LAST:event_devolucionesActionPerformed

    private void lestiloMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lestiloMouseEntered
        lestilo.setForeground(Color.blue);//le damos color al texto
    }//GEN-LAST:event_lestiloMouseEntered

    private void lestiloMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lestiloMouseExited
        lestilo.setForeground(Color.black);//le damos color al texto
    }//GEN-LAST:event_lestiloMouseExited

    private void lestilo1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lestilo1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lestilo1MouseEntered

    private void lestilo1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lestilo1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lestilo1MouseExited

    private void lestilo2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lestilo2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lestilo2MouseEntered

    private void lestilo2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lestilo2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lestilo2MouseExited

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
            java.util.logging.Logger.getLogger(menuventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                    new menuventas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton devoluciones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lestilo;
    private javax.swing.JLabel lestilo1;
    private javax.swing.JLabel lestilo2;
    private javax.swing.JButton pedidos;
    public javax.swing.JLabel tipousuario19;
    private javax.swing.JLabel titulo;
    private javax.swing.JButton usuario;
    private javax.swing.JButton ventas;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
