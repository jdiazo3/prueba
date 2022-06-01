package mke_matholy;//paquete donde se encuentra nuestro documento


import java.awt.Color;//libreria para el color en el diseño 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;//libreria para imprimir en pantalla

//@author Juan david diaz 
 
public class olvidosucontraseña extends javax.swing.JFrame {
//creamos una clase publica 
    public olvidosucontraseña() {
        initComponents();//le damos los siguientes componentes 
        this.setSize(1010, 800);//le damos un tamaño a nuestra pantalla
        this.setTitle("¿OLVIDO SU CONTRASEÑA?");//le damos un titulo en la parte superior izquierda
        this.setLocation(150,60);//le damos una localizacion para cuando salga en pantalla
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        recuperar = new javax.swing.JButton();
        user = new javax.swing.JTextField();
        ced = new javax.swing.JTextField();
        lblusuario = new javax.swing.JLabel();
        lblcedula = new javax.swing.JLabel();
        volver = new javax.swing.JButton();
        lestilo2 = new javax.swing.JLabel();
        usuario = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        titulo.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        titulo.setForeground(new java.awt.Color(102, 102, 255));
        titulo.setText("¿Olvido su contraseña?");
        titulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tituloMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tituloMouseExited(evt);
            }
        });
        getContentPane().add(titulo);
        titulo.setBounds(310, 60, 440, 90);

        recuperar.setBackground(new java.awt.Color(204, 204, 255));
        recuperar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        recuperar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mke_matholy/img/buscar.jpg"))); // NOI18N
        recuperar.setBorder(new javax.swing.border.MatteBorder(null));
        recuperar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                recuperarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                recuperarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                recuperarMouseExited(evt);
            }
        });
        getContentPane().add(recuperar);
        recuperar.setBounds(390, 460, 65, 65);

        user.setBackground(new java.awt.Color(204, 204, 255));
        getContentPane().add(user);
        user.setBounds(520, 280, 150, 30);

        ced.setBackground(new java.awt.Color(204, 204, 255));
        getContentPane().add(ced);
        ced.setBounds(520, 330, 150, 30);

        lblusuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblusuario.setText("*Usuario:");
        lblusuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblusuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblusuarioMouseExited(evt);
            }
        });
        getContentPane().add(lblusuario);
        lblusuario.setBounds(400, 280, 70, 20);

        lblcedula.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblcedula.setText("*Cedula: ");
        lblcedula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblcedulaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblcedulaMouseExited(evt);
            }
        });
        getContentPane().add(lblcedula);
        lblcedula.setBounds(400, 330, 70, 20);

        volver.setBackground(new java.awt.Color(204, 204, 255));
        volver.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mke_matholy/img/volver.jpg"))); // NOI18N
        volver.setBorder(new javax.swing.border.MatteBorder(null));
        volver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                volverMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                volverMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                volverMouseExited(evt);
            }
        });
        getContentPane().add(volver);
        volver.setBounds(600, 460, 65, 65);

        lestilo2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lestilo2.setText("Recuperar");
        lestilo2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lestilo2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lestilo2MouseExited(evt);
            }
        });
        getContentPane().add(lestilo2);
        lestilo2.setBounds(390, 430, 80, 30);

        usuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mke_matholy/img/sesion.jpg"))); // NOI18N
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
        usuario.setBounds(390, 160, 100, 100);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mke_matholy/img/mke DEGRA.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 1030, 800);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void recuperarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recuperarMouseClicked
    String usuario1=user.getText();//declaramos una variable tipo string donde le damos el valor que va a tener el usuario en nuestra aplicacion 
       String cap=""; //declaramos una variable tipo string donde le damos el valor que va a tener la contraseña en nuestra aplicacion
        String cedula=ced.getText();//le damos el valor del password 
        String sql2=("select * from EMPLEADO WHERE DOC_EMPLEADO LIKE '"+cedula+"' AND USUARIO_EMPLEADO LIKE '"+usuario1+"';");
        Connection con=null;
        String pass="";
       
        
       if ("".equals(usuario1)||"".equals(cedula)){
           JOptionPane.showMessageDialog(this,"digite su usuario y cedula : ");
       }
        else
        try {
            //declaracion de variables asignandoles valores de la base de datos
            String url = "jdbc:mysql://localhost:3306/mke_matholy";
            String usuario = "root";
            String contraseña = "";  
            
               Class.forName("com.mysql.jdbc.Driver").newInstance();
             con = DriverManager.getConnection(url,usuario,contraseña);
               if (con!= null){
                   System.out.println("Se ha establecido una conexion a la base de datos"+"\n"+url);
               Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(sql2);
                while (rs.next()){
                    cap=rs.getString("TIPO_EMPLEADO");
                    pass=rs.getString("CONTRASEÑA_EMPLEADO");
                }
                
                if (cap.equals("ADMINISTRADOR")){
                JOptionPane.showMessageDialog(null,"tu usuario es : "+usuario1+"  Y tu contraseña es : "+pass);
                iniciosesion pan=new iniciosesion();
                pan.setVisible(true);
                dispose();
                }
                
               if (cap.equals("USUARIO")){
                JOptionPane.showMessageDialog(null,"tu usuario es : "+usuario1+"  Y tu contraseña es : "+pass);
                iniciosesion pan=new iniciosesion();
                pan.setVisible(true);
                dispose();
               }
              if (!cap.equalsIgnoreCase("USUARIO")&& !cap.equalsIgnoreCase("ADMINISTRADOR")){
                        
                    JOptionPane.showMessageDialog(null,"tu usuario o cedula no son validos");
                    user.setText("");
                    ced.setText("");
                
              }
               }
               else{
                   System.out.println("No se ha establecido una conexion a la base de datos");
               }
        } catch (ClassNotFoundException ex) {
            
            Logger.getLogger(iniciosesion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(iniciosesion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(iniciosesion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(iniciosesion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_recuperarMouseClicked

    private void volverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverMouseClicked
            iniciosesion in=new iniciosesion();//cuando haga click en el boton volver loenvie ala ventana de incio sesion 
            in.setVisible(true);
            dispose();
    }//GEN-LAST:event_volverMouseClicked

    private void recuperarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recuperarMouseEntered
        recuperar.setBackground(new java.awt.Color(153,153,255));//le damos color al texto del boton y al relleno
        recuperar.setForeground(Color.red);
    }//GEN-LAST:event_recuperarMouseEntered

    private void recuperarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recuperarMouseExited
         recuperar.setBackground(new java.awt.Color(204,204,255));//le damos color al texto del boton y al relleno
         recuperar.setForeground(Color.black);
    }//GEN-LAST:event_recuperarMouseExited

    private void volverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverMouseEntered
        volver.setBackground(new java.awt.Color(153,153,255));//le damos color al texto del boton y al relleno
        volver.setForeground(Color.red);
    }//GEN-LAST:event_volverMouseEntered

    private void volverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverMouseExited
        volver.setBackground(new java.awt.Color(204,204,255));//le damos color al texto del boton y al relleno
        volver.setForeground(Color.black);
    }//GEN-LAST:event_volverMouseExited

    private void tituloMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tituloMouseEntered
        titulo.setForeground(Color.black);//le damos color al texto
    }//GEN-LAST:event_tituloMouseEntered

    private void tituloMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tituloMouseExited
        titulo.setForeground(Color.blue);//le damos color al texto
    }//GEN-LAST:event_tituloMouseExited

    private void lblusuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblusuarioMouseEntered
       lblusuario.setForeground(Color.blue);//le damos color al texto
    }//GEN-LAST:event_lblusuarioMouseEntered

    private void lblusuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblusuarioMouseExited
        lblusuario.setForeground(Color.black);//le damos color al texto
    }//GEN-LAST:event_lblusuarioMouseExited

    private void lblcedulaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcedulaMouseEntered
        lblcedula.setForeground(Color.blue);//le damos color al texto
    }//GEN-LAST:event_lblcedulaMouseEntered

    private void lblcedulaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcedulaMouseExited
        lblcedula.setForeground(Color.black);//le damos color al texto
    }//GEN-LAST:event_lblcedulaMouseExited

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
            java.util.logging.Logger.getLogger(olvidosucontraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(olvidosucontraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(olvidosucontraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(olvidosucontraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new olvidosucontraseña().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ced;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblcedula;
    private javax.swing.JLabel lblusuario;
    private javax.swing.JLabel lestilo2;
    private javax.swing.JButton recuperar;
    private javax.swing.JLabel titulo;
    private javax.swing.JTextField user;
    private javax.swing.JButton usuario;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
//cerramos la clase declarando las variables como privadas