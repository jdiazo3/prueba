package mke_matholy;//paquete donde se encuentra nuestro documento

import java.awt.Color;//libreria para el color en el diseño 



//@author Juan david diaz
public class pantallainicio extends javax.swing.JFrame {
//creamos una clase publica
    public pantallainicio() {
        initComponents();//le damos los siguientes componentes 
        this.setSize(1010, 800);//le damos un tamaño a nuestra pantalla
        this.setTitle("MKE MATHOLY");//le damos un titulo en la parte superior izquierda
        this.setLocation(150,60);//le damos una localizacion para cuando salga en pantalla
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        cerrar = new javax.swing.JButton();
        materiaprima = new javax.swing.JButton();
        chaquetasre = new javax.swing.JButton();
        personal = new javax.swing.JButton();
        ventas = new javax.swing.JButton();
        tipousuario = new javax.swing.JLabel();
        usuario = new javax.swing.JButton();
        lestilo = new javax.swing.JLabel();
        lestilo1 = new javax.swing.JLabel();
        lestilo2 = new javax.swing.JLabel();
        lestilo3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1010, 720));
        getContentPane().setLayout(null);

        titulo.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        titulo.setForeground(new java.awt.Color(102, 102, 255));
        titulo.setText("MKE MATHOLY");
        titulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tituloMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tituloMouseExited(evt);
            }
        });
        getContentPane().add(titulo);
        titulo.setBounds(360, 20, 340, 40);

        cerrar.setBackground(new java.awt.Color(204, 204, 255));
        cerrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mke_matholy/img/cerrar.jpg"))); // NOI18N
        cerrar.setBorder(new javax.swing.border.MatteBorder(null));
        cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cerrarMouseExited(evt);
            }
        });
        getContentPane().add(cerrar);
        cerrar.setBounds(420, 570, 120, 120);

        materiaprima.setBackground(new java.awt.Color(204, 204, 255));
        materiaprima.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        materiaprima.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mke_matholy/img/material.jpg"))); // NOI18N
        materiaprima.setBorder(new javax.swing.border.MatteBorder(null));
        materiaprima.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                materiaprimaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                materiaprimaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                materiaprimaMouseExited(evt);
            }
        });
        materiaprima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materiaprimaActionPerformed(evt);
            }
        });
        getContentPane().add(materiaprima);
        materiaprima.setBounds(190, 110, 200, 200);

        chaquetasre.setBackground(new java.awt.Color(204, 204, 255));
        chaquetasre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        chaquetasre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mke_matholy/img/chaqueta.jpg"))); // NOI18N
        chaquetasre.setBorder(new javax.swing.border.MatteBorder(null));
        chaquetasre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chaquetasreMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                chaquetasreMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                chaquetasreMouseExited(evt);
            }
        });
        chaquetasre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chaquetasreActionPerformed(evt);
            }
        });
        getContentPane().add(chaquetasre);
        chaquetasre.setBounds(570, 110, 200, 200);

        personal.setBackground(new java.awt.Color(204, 204, 255));
        personal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        personal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mke_matholy/img/personal.jpg"))); // NOI18N
        personal.setBorder(new javax.swing.border.MatteBorder(null));
        personal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                personalMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                personalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                personalMouseExited(evt);
            }
        });
        personal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personalActionPerformed(evt);
            }
        });
        getContentPane().add(personal);
        personal.setBounds(570, 360, 200, 200);

        ventas.setBackground(new java.awt.Color(204, 204, 255));
        ventas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ventas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mke_matholy/img/ventas.jpg"))); // NOI18N
        ventas.setBorder(new javax.swing.border.MatteBorder(null));
        ventas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ventasMouseClicked(evt);
            }
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
        ventas.setBounds(190, 360, 200, 200);

        tipousuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(tipousuario);
        tipousuario.setBounds(30, 100, 140, 30);

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

        lestilo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lestilo.setText("Materia prima");
        lestilo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lestiloMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lestiloMouseExited(evt);
            }
        });
        getContentPane().add(lestilo);
        lestilo.setBounds(230, 80, 150, 30);

        lestilo1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lestilo1.setText("Chaquetas");
        lestilo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lestilo1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lestilo1MouseExited(evt);
            }
        });
        getContentPane().add(lestilo1);
        lestilo1.setBounds(620, 80, 150, 30);

        lestilo2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lestilo2.setText("Ventas");
        lestilo2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lestilo2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lestilo2MouseExited(evt);
            }
        });
        getContentPane().add(lestilo2);
        lestilo2.setBounds(260, 330, 150, 30);

        lestilo3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lestilo3.setText("Personal");
        lestilo3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lestilo3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lestilo3MouseExited(evt);
            }
        });
        getContentPane().add(lestilo3);
        lestilo3.setBounds(630, 330, 150, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mke_matholy/img/mke DEGRA.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1100, 800);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseClicked
        iniciosesion mpg=new iniciosesion();//cuandonde clicñ en el boton cerrar sesion lo envie a la ventana de inicio sesion 
        mpg.setVisible(true);
        dispose();
    }//GEN-LAST:event_cerrarMouseClicked

    private void materiaprimaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_materiaprimaMouseClicked
        opc on=new opc();
        on.setVisible(true);
        dispose();
        if (tipousuario.getText().equals("USUARIO")){
                on.tipousuario21.setText("USUARIO");
        }
        if(tipousuario.getText().equals("ADMINISTRADOR")){
                on.tipousuario21.setText("ADMINISTRADOR");
        }
    }//GEN-LAST:event_materiaprimaMouseClicked

    private void materiaprimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materiaprimaActionPerformed
       
    }//GEN-LAST:event_materiaprimaActionPerformed

    private void materiaprimaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_materiaprimaMouseEntered
        materiaprima.setBackground(new java.awt.Color(153,153,255));//le damos color al texto del boton y al relleno
        materiaprima.setForeground(Color.red);
    }//GEN-LAST:event_materiaprimaMouseEntered

    private void materiaprimaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_materiaprimaMouseExited
        materiaprima.setBackground(new java.awt.Color(204,204,255));//le damos color al texto del boton y al relleno
        materiaprima.setForeground(Color.black);
    }//GEN-LAST:event_materiaprimaMouseExited

    private void cerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseEntered
        cerrar.setBackground(new java.awt.Color(153,153,255));//le damos color al texto del boton y al relleno
        cerrar.setForeground(Color.red);
    }//GEN-LAST:event_cerrarMouseEntered

    private void cerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseExited
        cerrar.setBackground(new java.awt.Color(204,204,255));//le damos color al texto del boton y al relleno
        cerrar.setForeground(Color.black);
    }//GEN-LAST:event_cerrarMouseExited

    private void tituloMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tituloMouseEntered
        titulo.setForeground(Color.black);//le damos color al texto
    }//GEN-LAST:event_tituloMouseEntered

    private void tituloMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tituloMouseExited
       titulo.setForeground(Color.blue);//le damos color al texto
    }//GEN-LAST:event_tituloMouseExited

    private void chaquetasreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chaquetasreMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_chaquetasreMouseClicked

    private void chaquetasreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chaquetasreMouseEntered
        chaquetasre.setBackground(new java.awt.Color(153,153,255));//le damos color al texto del boton y al relleno
        chaquetasre.setForeground(Color.red);
    }//GEN-LAST:event_chaquetasreMouseEntered

    private void chaquetasreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chaquetasreMouseExited
        chaquetasre.setBackground(new java.awt.Color(204,204,255));//le damos color al texto del boton y al relleno
        chaquetasre.setForeground(Color.black);
    }//GEN-LAST:event_chaquetasreMouseExited

    private void chaquetasreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chaquetasreActionPerformed
        opccha cr=new opccha();
        cr.setVisible(true);
        dispose();
        if (tipousuario.getText().equals("USUARIO")){
                cr.tipousuario22.setText("USUARIO");
        }
        if(tipousuario.getText().equals("ADMINISTRADOR")){
                cr.tipousuario22.setText("ADMINISTRADOR");
        }
    }//GEN-LAST:event_chaquetasreActionPerformed

    private void personalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_personalMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_personalMouseClicked

    private void personalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_personalMouseEntered
        personal.setBackground(new java.awt.Color(153,153,255));//le damos color al texto del boton y al relleno
        personal.setForeground(Color.red);
    }//GEN-LAST:event_personalMouseEntered

    private void personalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_personalMouseExited
        personal.setBackground(new java.awt.Color(204,204,255));//le damos color al texto del boton y al relleno
        personal.setForeground(Color.black);
    }//GEN-LAST:event_personalMouseExited

    private void personalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personalActionPerformed
    opcionespers op=new opcionespers();
    op.setVisible(true);
    dispose();
    if (tipousuario.getText().equals("USUARIO")){
                op.tipousuario25.setText("USUARIO");
        }
        if(tipousuario.getText().equals("ADMINISTRADOR")){
                op.tipousuario25.setText("ADMINISTRADOR");
        }
    }//GEN-LAST:event_personalActionPerformed

    private void ventasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ventasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ventasMouseClicked

    private void ventasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ventasMouseEntered
        ventas.setBackground(new java.awt.Color(153,153,255));//le damos color al texto del boton y al relleno
        ventas.setForeground(Color.red);
    }//GEN-LAST:event_ventasMouseEntered

    private void ventasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ventasMouseExited
        ventas.setBackground(new java.awt.Color(204,204,255));//le damos color al texto del boton y al relleno
        ventas.setForeground(Color.black);
    }//GEN-LAST:event_ventasMouseExited

    private void ventasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ventasActionPerformed
        menuventas op=new menuventas();
        op.setVisible(true);
        dispose();
        if (tipousuario.getText().equals("USUARIO")){
                op.tipousuario19.setText("USUARIO");
        }
        if(tipousuario.getText().equals("ADMINISTRADOR")){
                op.tipousuario19.setText("ADMINISTRADOR");
        }
    }//GEN-LAST:event_ventasActionPerformed

    private void usuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuarioMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioMouseEntered

    private void usuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuarioMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioMouseExited

    private void usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioActionPerformed

    private void lestiloMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lestiloMouseEntered
        lestilo.setForeground(Color.blue);//le damos color al texto
    }//GEN-LAST:event_lestiloMouseEntered

    private void lestiloMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lestiloMouseExited
        lestilo.setForeground(Color.black);//le damos color al texto
    }//GEN-LAST:event_lestiloMouseExited

    private void lestilo1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lestilo1MouseEntered
       lestilo1.setForeground(Color.blue);//le damos color al texto
    }//GEN-LAST:event_lestilo1MouseEntered

    private void lestilo1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lestilo1MouseExited
        lestilo1.setForeground(Color.black);//le damos color al texto
    }//GEN-LAST:event_lestilo1MouseExited

    private void lestilo2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lestilo2MouseEntered
        lestilo2.setForeground(Color.blue);//le damos color al texto
    }//GEN-LAST:event_lestilo2MouseEntered

    private void lestilo2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lestilo2MouseExited
        lestilo2.setForeground(Color.black);//le damos color al texto
    }//GEN-LAST:event_lestilo2MouseExited

    private void lestilo3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lestilo3MouseEntered
        lestilo3.setForeground(Color.blue);//le damos color al texto
    }//GEN-LAST:event_lestilo3MouseEntered

    private void lestilo3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lestilo3MouseExited
        lestilo3.setForeground(Color.black);//le damos color al texto
    }//GEN-LAST:event_lestilo3MouseExited

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
            java.util.logging.Logger.getLogger(pantallainicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pantallainicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pantallainicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pantallainicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pantallainicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cerrar;
    private javax.swing.JButton chaquetasre;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lestilo;
    private javax.swing.JLabel lestilo1;
    private javax.swing.JLabel lestilo2;
    private javax.swing.JLabel lestilo3;
    private javax.swing.JButton materiaprima;
    private javax.swing.JButton personal;
    public javax.swing.JLabel tipousuario;
    private javax.swing.JLabel titulo;
    private javax.swing.JButton usuario;
    private javax.swing.JButton ventas;
    // End of variables declaration//GEN-END:variables
}
//cerramos la clase declarando las variables como privadas