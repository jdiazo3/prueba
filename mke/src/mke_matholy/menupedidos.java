
package mke_matholy;
import java.awt.Color;



public class menupedidos extends javax.swing.JFrame {


    public menupedidos(){
        initComponents();
               this.setSize(1010, 800);//le damos un tamaño a nuestra pantalla
               this.setTitle("OPCIONES");//le damos un titulo en la parte superior izquierda
               this.setLocation(150,60);//le damos una localizacion para cuando salga en pantalla
                
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        consultar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        volver = new javax.swing.JButton();
        tipousuario18 = new javax.swing.JLabel();
        usuario = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        titulo.setBackground(new java.awt.Color(255, 255, 255));
        titulo.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        titulo.setForeground(new java.awt.Color(51, 102, 255));
        titulo.setText("Menú del modulo pedidos");
        titulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tituloMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tituloMouseExited(evt);
            }
        });
        getContentPane().add(titulo);
        titulo.setBounds(300, 40, 720, 90);

        consultar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        consultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mke_matholy/img/VIZU.jpg"))); // NOI18N
        consultar.setBorder(new javax.swing.border.MatteBorder(null));
        consultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                consultarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                consultarMouseExited(evt);
            }
        });
        consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarActionPerformed(evt);
            }
        });
        getContentPane().add(consultar);
        consultar.setBounds(560, 220, 180, 180);

        eliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mke_matholy/img/mod.jpg"))); // NOI18N
        eliminar.setBorder(new javax.swing.border.MatteBorder(null));
        eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                eliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                eliminarMouseExited(evt);
            }
        });
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        getContentPane().add(eliminar);
        eliminar.setBounds(280, 220, 180, 180);

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
        volver.setBounds(480, 470, 65, 65);

        tipousuario18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(tipousuario18);
        tipousuario18.setBounds(30, 100, 140, 30);

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

    private void consultarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultarMouseEntered
        consultar.setBackground(new java.awt.Color(153,153,255));//le damos color al texto del boton y al relleno
        consultar.setForeground(Color.red);
    }//GEN-LAST:event_consultarMouseEntered

    private void consultarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultarMouseExited
        consultar.setBackground(new java.awt.Color(204,204,255));//le damos color al texto del boton y al relleno
        consultar.setForeground(Color.black);
    }//GEN-LAST:event_consultarMouseExited

    private void consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarActionPerformed
        consultaspedidos con=new consultaspedidos();
        con.setVisible(true);
        dispose();
        if (tipousuario18.getText().equals("USUARIO")){
                con.tipousuario7.setText("USUARIO");
        }
        if(tipousuario18.getText().equals("ADMINISTRADOR")){
                con.tipousuario7.setText("ADMINISTRADOR");
        }
    }//GEN-LAST:event_consultarActionPerformed

    private void eliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarMouseEntered
        eliminar.setBackground(new java.awt.Color(153,153,255));//le damos color al texto del boton y al relleno
        eliminar.setForeground(Color.red);
    }//GEN-LAST:event_eliminarMouseEntered

    private void eliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarMouseExited
        eliminar.setBackground(new java.awt.Color(204,204,255));//le damos color al texto del boton y al relleno
        eliminar.setForeground(Color.black);
    }//GEN-LAST:event_eliminarMouseExited

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        crudpedidos el=new crudpedidos();
        el.setVisible(true);
        dispose();
        if (tipousuario18.getText().equals("USUARIO")){
                el.tipousuario13.setText("USUARIO");
        }
        if(tipousuario18.getText().equals("ADMINISTRADOR")){
                el.tipousuario13.setText("ADMINISTRADOR");
        }
    }//GEN-LAST:event_eliminarActionPerformed

    private void volverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverMouseEntered
        volver.setBackground(new java.awt.Color(153,153,255));//le damos color al texto del boton y al relleno
        volver.setForeground(Color.red);
    }//GEN-LAST:event_volverMouseEntered

    private void volverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverMouseExited
        volver.setBackground(new java.awt.Color(204,204,255));//le damos color al texto del boton y al relleno
        volver.setForeground(Color.black);
    }//GEN-LAST:event_volverMouseExited

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        menuventas pan=new menuventas();
        pan.setVisible(true);
        dispose();
        if (tipousuario18.getText().equals("USUARIO")){
                pan.tipousuario19.setText("USUARIO");
        }
        if(tipousuario18.getText().equals("ADMINISTRADOR")){
                pan.tipousuario19.setText("ADMINISTRADOR");
        }
    }//GEN-LAST:event_volverActionPerformed

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
            java.util.logging.Logger.getLogger(menupedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menupedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menupedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menupedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                    new menupedidos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton consultar;
    private javax.swing.JButton eliminar;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel tipousuario18;
    private javax.swing.JLabel titulo;
    private javax.swing.JButton usuario;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
