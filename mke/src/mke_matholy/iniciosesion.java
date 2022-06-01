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



 // @author Juan david diaz ovalle
 
public class iniciosesion extends javax.swing.JFrame {//clase donde realizaremos todo el codigo

    public iniciosesion() {//hacemos publica nuestra clase para nombras componentes 
        initComponents();

               this.setSize(1010, 800);//le damos un tamaño a nuestra pantalla
               this.setTitle("INICIO DE SESION");//le damos un titulo en la parte superior izquierda
               this.setLocation(150,60);//le damos una localizacion para cuando salga en pantalla
   
    }
    
    
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        labelusuario = new javax.swing.JLabel();
        lblcontraseña = new javax.swing.JLabel();
        ingresar = new javax.swing.JButton();
        olvido = new javax.swing.JButton();
        txtusuario = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        sesion = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        titulo.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        titulo.setForeground(new java.awt.Color(102, 102, 255));
        titulo.setText("Inicio de sesion");
        titulo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        titulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tituloMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tituloMouseExited(evt);
            }
        });
        getContentPane().add(titulo);
        titulo.setBounds(420, 70, 300, 40);

        labelusuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelusuario.setText("*Usuario:");
        labelusuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelusuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelusuarioMouseExited(evt);
            }
        });
        getContentPane().add(labelusuario);
        labelusuario.setBounds(390, 260, 120, 30);

        lblcontraseña.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblcontraseña.setText("*Contraseña:");
        lblcontraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblcontraseñaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblcontraseñaMouseExited(evt);
            }
        });
        getContentPane().add(lblcontraseña);
        lblcontraseña.setBounds(380, 350, 130, 30);

        ingresar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ingresar.setText("Ingresar");
        ingresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingresarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ingresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ingresarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ingresarMousePressed(evt);
            }
        });
        ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarActionPerformed(evt);
            }
        });
        getContentPane().add(ingresar);
        ingresar.setBounds(360, 460, 100, 23);

        olvido.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        olvido.setText("¿Olvido su contraseña?");
        olvido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                olvidoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                olvidoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                olvidoMouseExited(evt);
            }
        });
        olvido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                olvidoActionPerformed(evt);
            }
        });
        getContentPane().add(olvido);
        olvido.setBounds(530, 460, 180, 23);

        txtusuario.setBackground(new java.awt.Color(204, 204, 255));
        getContentPane().add(txtusuario);
        txtusuario.setBounds(510, 260, 190, 30);

        password.setBackground(new java.awt.Color(204, 204, 255));
        getContentPane().add(password);
        password.setBounds(510, 350, 190, 30);

        sesion.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        sesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mke_matholy/img/sesion.jpg"))); // NOI18N
        sesion.setBorder(new javax.swing.border.MatteBorder(null));
        sesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sesionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sesionMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sesionMousePressed(evt);
            }
        });
        sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sesionActionPerformed(evt);
            }
        });
        getContentPane().add(sesion);
        sesion.setBounds(510, 130, 100, 100);

        jLabel4.setBackground(new java.awt.Color(244, 244, 244));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mke_matholy/img/mke DEGRA.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 1010, 800);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarActionPerformed
        // accion cuando demos click en elboton ingresar 
    }//GEN-LAST:event_ingresarActionPerformed

    private void olvidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_olvidoActionPerformed
        olvidosucontraseña ol =new olvidosucontraseña();
        ol.setVisible(true);
        dispose();
    }//GEN-LAST:event_olvidoActionPerformed

    private void ingresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresarMouseClicked
        String usuario1=txtusuario.getText();//declaramos una variable tipo string donde le damos el valor que va a tener el usuario en nuestra aplicacion 
       String cap=""; //declaramos una variable tipo string donde le damos el valor que va a tener la contraseña en nuestra aplicacion
        String pass;//declarmos variable para almacenar el valor ingresado en el txtpassword del sistema 
        pass = new String(password.getPassword());//le damos el valor del password 
        String sql2 = "select * from EMPLEADO WHERE CONTRASEÑA_EMPLEADO LIKE '"+pass+"' AND USUARIO_EMPLEADO LIKE '"+usuario1+"';";
        Connection con=null;
       if ("".equals(usuario1)||"".equals(pass)){
           JOptionPane.showMessageDialog(this,"digite su usuario y contraseña : ");
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
                }
                if (cap.equals("ADMINISTRADOR")){
                JOptionPane.showMessageDialog(null,"INGRESASTE COMO ADMINISTRADOR "+" Bienvenido sr."+"\n"+usuario1);
                pantallainicio pan=new pantallainicio();
                pan.setVisible(true);
                dispose();
                pan.tipousuario.setText("ADMINISTRADOR");
                }
                
               if (cap.equals("USUARIO")){
                JOptionPane.showMessageDialog(null,"INGRESASTE COMO USUARIO "+" Bienvenido sr."+usuario1);
                pantallainicio pan=new pantallainicio();
                pan.setVisible(true);
                dispose();
                pan.tipousuario.setText("USUARIO");
               }
              if (!cap.equalsIgnoreCase("USUARIO")&& !cap.equalsIgnoreCase("ADMINISTRADOR")){
                        
                    JOptionPane.showMessageDialog(null,"tu usuario o contraseña no son validos");
                    txtusuario.setText("");
                    password.setText("");
                
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
    }//GEN-LAST:event_ingresarMouseClicked

    private void olvidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_olvidoMouseClicked
           

        // TODO add your handling code here:
    }//GEN-LAST:event_olvidoMouseClicked

    private void ingresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresarMouseEntered
        ingresar.setBackground(new java.awt.Color(153,153,255));//le damos color al texto del boton y al relleno
        ingresar.setForeground(Color.red);
    }//GEN-LAST:event_ingresarMouseEntered

    private void ingresarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresarMousePressed
       // TODO add your handling code here:
    }//GEN-LAST:event_ingresarMousePressed

    private void ingresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresarMouseExited
        ingresar.setBackground(new java.awt.Color(204,204,255));//le damos color al texto del boton y al relleno
        ingresar.setForeground(Color.black);
    }//GEN-LAST:event_ingresarMouseExited

    private void olvidoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_olvidoMouseEntered
        olvido.setBackground(new java.awt.Color(153,153,255));//le damos color al texto del boton y al relleno
        olvido.setForeground(Color.red);
    }//GEN-LAST:event_olvidoMouseEntered

    private void olvidoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_olvidoMouseExited
        olvido.setBackground(new java.awt.Color(204,204,255));//le damos color al texto del boton y al relleno
        olvido.setForeground(Color.black);
    }//GEN-LAST:event_olvidoMouseExited

    private void labelusuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelusuarioMouseEntered
        labelusuario.setForeground(Color.blue);//le damos color al texto
    }//GEN-LAST:event_labelusuarioMouseEntered

    private void tituloMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tituloMouseEntered
        titulo.setForeground(Color.black);//le damos color al texto
    }//GEN-LAST:event_tituloMouseEntered

    private void labelusuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelusuarioMouseExited
        labelusuario.setForeground(Color.black);//le damos color al texto
    }//GEN-LAST:event_labelusuarioMouseExited

    private void tituloMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tituloMouseExited
        titulo.setForeground(Color.blue);//le damos color al texto
    }//GEN-LAST:event_tituloMouseExited

    private void lblcontraseñaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcontraseñaMouseEntered
        lblcontraseña.setForeground(Color.blue);//le damos color al texto
    }//GEN-LAST:event_lblcontraseñaMouseEntered

    private void lblcontraseñaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcontraseñaMouseExited
        lblcontraseña.setForeground(Color.black);//le damos color al texto
    }//GEN-LAST:event_lblcontraseñaMouseExited

    private void sesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sesionMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_sesionMouseClicked

    private void sesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sesionMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_sesionMouseEntered

    private void sesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sesionMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_sesionMouseExited

    private void sesionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sesionMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_sesionMousePressed

    private void sesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sesionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sesionActionPerformed

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
            java.util.logging.Logger.getLogger(iniciosesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(iniciosesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(iniciosesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(iniciosesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new iniciosesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ingresar;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel labelusuario;
    private javax.swing.JLabel lblcontraseña;
    private javax.swing.JButton olvido;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton sesion;
    private javax.swing.JLabel titulo;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables

}//cerramos la clase declarando las variables como privadas 
