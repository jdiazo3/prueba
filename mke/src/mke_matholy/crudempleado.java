/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mke_matholy;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class crudempleado extends javax.swing.JFrame {
Connection con = null;
Statement stmt = null;
PreparedStatement ps;
ResultSet rs;
private void limpiar(){
    docemp.setText("");
    nombreem.setText("");
    apellidoem.setText("");
    direccionem.setText("");
    telefonoem.setText("");
    tipoemp.setSelectedItem("Seleccionar");
    correoem.setText("");
    useremp.setText("");
    contraseña.setText("");
}

    public crudempleado() {
        initComponents();
        this.setSize(1010, 800);//le damos un tamaño a nuestra pantalla
        this.setTitle("EMPLEADOS");//le damos un titulo en la parte superior izquierda
        this.setLocation(150,60);//le damos una localizacion para cuando salga en pantalla
        editar.setVisible(false);
        bneliminar.setVisible(false);
            
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        seleccionarregistro = new javax.swing.JButton();
        titulo = new javax.swing.JLabel();
        semititulo1 = new javax.swing.JLabel();
        lblnom = new javax.swing.JLabel();
        lbldir = new javax.swing.JLabel();
        lbltip = new javax.swing.JLabel();
        lbltel = new javax.swing.JLabel();
        bneliminar = new javax.swing.JButton();
        volver = new javax.swing.JButton();
        nombreem = new javax.swing.JTextField();
        direccionem = new javax.swing.JTextField();
        editar = new javax.swing.JButton();
        telefonoem = new javax.swing.JTextField();
        docemp = new javax.swing.JTextField();
        correoem = new javax.swing.JTextField();
        lblcorr = new javax.swing.JLabel();
        btnguardar = new javax.swing.JButton();
        consul = new javax.swing.JButton();
        tipoemp = new javax.swing.JComboBox<>();
        lblap = new javax.swing.JLabel();
        apellidoem = new javax.swing.JTextField();
        lbluser = new javax.swing.JLabel();
        useremp = new javax.swing.JTextField();
        lblcon = new javax.swing.JLabel();
        contraseña = new javax.swing.JTextField();
        tipousuario11 = new javax.swing.JLabel();
        usuario = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        seleccionarregistro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        seleccionarregistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mke_matholy/img/buscar.jpg"))); // NOI18N
        seleccionarregistro.setBorder(new javax.swing.border.MatteBorder(null));
        seleccionarregistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                seleccionarregistroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                seleccionarregistroMouseExited(evt);
            }
        });
        seleccionarregistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionarregistroActionPerformed(evt);
            }
        });
        getContentPane().add(seleccionarregistro);
        seleccionarregistro.setBounds(300, 90, 65, 65);

        titulo.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        titulo.setForeground(new java.awt.Color(0, 102, 255));
        titulo.setText("Modulo de empleados");
        titulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tituloMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tituloMouseExited(evt);
            }
        });
        getContentPane().add(titulo);
        titulo.setBounds(290, 30, 500, 50);

        semititulo1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        semititulo1.setText("*N° Documento :");
        semititulo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                semititulo1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                semititulo1MouseExited(evt);
            }
        });
        getContentPane().add(semititulo1);
        semititulo1.setBounds(370, 120, 130, 20);

        lblnom.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblnom.setText("*Nombre del empleado  :");
        lblnom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblnomMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblnomMouseExited(evt);
            }
        });
        getContentPane().add(lblnom);
        lblnom.setBounds(330, 190, 210, 25);

        lbldir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbldir.setText("Dirección :");
        lbldir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbldirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbldirMouseExited(evt);
            }
        });
        getContentPane().add(lbldir);
        lbldir.setBounds(340, 290, 100, 30);

        lbltip.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbltip.setText("*Tipo de usuario  :");
        lbltip.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbltipMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbltipMouseExited(evt);
            }
        });
        getContentPane().add(lbltip);
        lbltip.setBounds(340, 440, 150, 26);

        lbltel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbltel.setText("*Telefono :");
        lbltel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbltelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbltelMouseExited(evt);
            }
        });
        getContentPane().add(lbltel);
        lbltel.setBounds(340, 340, 121, 26);

        bneliminar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bneliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mke_matholy/img/eliminar (3).jpg"))); // NOI18N
        bneliminar.setBorder(new javax.swing.border.MatteBorder(null));
        bneliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bneliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bneliminarMouseExited(evt);
            }
        });
        bneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bneliminarActionPerformed(evt);
            }
        });
        getContentPane().add(bneliminar);
        bneliminar.setBounds(750, 400, 65, 65);

        volver.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
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
        volver.setBounds(750, 510, 65, 65);

        nombreem.setBackground(new java.awt.Color(204, 204, 255));
        nombreem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreemKeyTyped(evt);
            }
        });
        getContentPane().add(nombreem);
        nombreem.setBounds(510, 190, 150, 30);

        direccionem.setBackground(new java.awt.Color(204, 204, 255));
        getContentPane().add(direccionem);
        direccionem.setBounds(510, 290, 150, 30);

        editar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mke_matholy/img/MODIFICAR.jpg"))); // NOI18N
        editar.setBorder(new javax.swing.border.MatteBorder(null));
        editar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editarMouseExited(evt);
            }
        });
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });
        getContentPane().add(editar);
        editar.setBounds(750, 320, 65, 65);

        telefonoem.setBackground(new java.awt.Color(204, 204, 255));
        getContentPane().add(telefonoem);
        telefonoem.setBounds(510, 340, 150, 30);

        docemp.setBackground(new java.awt.Color(204, 204, 255));
        docemp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                docempKeyTyped(evt);
            }
        });
        getContentPane().add(docemp);
        docemp.setBounds(510, 120, 140, 30);

        correoem.setBackground(new java.awt.Color(204, 204, 255));
        getContentPane().add(correoem);
        correoem.setBounds(510, 390, 150, 29);

        lblcorr.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblcorr.setText("Correo  :");
        lblcorr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblcorrMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblcorrMouseExited(evt);
            }
        });
        getContentPane().add(lblcorr);
        lblcorr.setBounds(340, 390, 121, 26);

        btnguardar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mke_matholy/img/guardar.jpg"))); // NOI18N
        btnguardar.setBorder(new javax.swing.border.MatteBorder(null));
        btnguardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnguardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnguardarMouseExited(evt);
            }
        });
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnguardar);
        btnguardar.setBounds(750, 160, 65, 65);

        consul.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        consul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mke_matholy/img/buscar.jpg"))); // NOI18N
        consul.setBorder(new javax.swing.border.MatteBorder(null));
        consul.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                consulMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                consulMouseExited(evt);
            }
        });
        consul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consulActionPerformed(evt);
            }
        });
        getContentPane().add(consul);
        consul.setBounds(750, 240, 65, 65);

        tipoemp.setBackground(new java.awt.Color(204, 204, 255));
        tipoemp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tipoemp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "ADMINISTRADOR", "USUARIO" }));
        getContentPane().add(tipoemp);
        tipoemp.setBounds(510, 440, 150, 30);

        lblap.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblap.setText("*Apellido del empleado  :");
        lblap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblapMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblapMouseExited(evt);
            }
        });
        getContentPane().add(lblap);
        lblap.setBounds(330, 240, 210, 25);

        apellidoem.setBackground(new java.awt.Color(204, 204, 255));
        apellidoem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                apellidoemKeyTyped(evt);
            }
        });
        getContentPane().add(apellidoem);
        apellidoem.setBounds(510, 240, 150, 30);

        lbluser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbluser.setText("*Usuario :");
        lbluser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbluserMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbluserMouseExited(evt);
            }
        });
        getContentPane().add(lbluser);
        lbluser.setBounds(340, 490, 121, 26);

        useremp.setBackground(new java.awt.Color(204, 204, 255));
        getContentPane().add(useremp);
        useremp.setBounds(510, 490, 150, 29);

        lblcon.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblcon.setText("*Contraseña :");
        lblcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblconMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblconMouseExited(evt);
            }
        });
        getContentPane().add(lblcon);
        lblcon.setBounds(340, 540, 120, 26);

        contraseña.setBackground(new java.awt.Color(204, 204, 255));
        getContentPane().add(contraseña);
        contraseña.setBounds(510, 540, 150, 29);

        tipousuario11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(tipousuario11);
        tipousuario11.setBounds(20, 100, 150, 30);

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

    private void semititulo1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_semititulo1MouseEntered
        semititulo1.setForeground(Color.blue);//le damos color al texto
    }//GEN-LAST:event_semititulo1MouseEntered

    private void semititulo1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_semititulo1MouseExited
        semititulo1.setForeground(Color.black);//le damos color al texto
    }//GEN-LAST:event_semititulo1MouseExited

    private void lblnomMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblnomMouseEntered
        lblnom.setForeground(Color.blue);//le damos color al texto
    }//GEN-LAST:event_lblnomMouseEntered

    private void lblnomMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblnomMouseExited
        lblnom.setForeground(Color.black);//le damos color al texto
    }//GEN-LAST:event_lblnomMouseExited

    private void lbldirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbldirMouseEntered
        lbldir.setForeground(Color.blue);//le damos color al texto
    }//GEN-LAST:event_lbldirMouseEntered

    private void lbldirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbldirMouseExited
        lbldir.setForeground(Color.black);//le damos color al texto
    }//GEN-LAST:event_lbldirMouseExited

    private void lbltipMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbltipMouseEntered
        lbltip.setForeground(Color.blue);//le damos color al texto
    }//GEN-LAST:event_lbltipMouseEntered

    private void lbltipMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbltipMouseExited
        lbltip.setForeground(Color.black);//le damos color al texto
    }//GEN-LAST:event_lbltipMouseExited

    private void lbltelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbltelMouseEntered
        lbltel.setForeground(Color.blue);//le damos color al texto
    }//GEN-LAST:event_lbltelMouseEntered

    private void lbltelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbltelMouseExited
        lbltel.setForeground(Color.black);//le damos color al texto
    }//GEN-LAST:event_lbltelMouseExited

    private void bneliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bneliminarMouseEntered
        bneliminar.setBackground(new java.awt.Color(153,153,255));//le damos color al texto del boton y al relleno
        bneliminar.setForeground(Color.red);
    }//GEN-LAST:event_bneliminarMouseEntered

    private void bneliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bneliminarMouseExited
        bneliminar.setBackground(new java.awt.Color(204,204,255));//le damos color al texto del boton y al relleno
        bneliminar.setForeground(Color.black);
    }//GEN-LAST:event_bneliminarMouseExited

    private void bneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bneliminarActionPerformed
    if (docemp.getText().equals("") || (nombreem.getText().equals("")) || (direccionem.getText().equals("")) || (telefonoem.getText().equals("")) || (tipoemp.getSelectedItem().equals("Seleccionar"))|| (correoem.getText().equals("")))
        {
         JOptionPane.showMessageDialog(null,"Debes consultar tu registro");       
        }else{
        
        try{
        conexion co=new conexion();
        con=co.getconexion();
        ps =con.prepareStatement("DELETE  from EMPLEADO where DOC_EMPLEADO =?");
        ps.setInt(1,Integer.parseInt(docemp.getText()));
        
        int res=ps.executeUpdate();
        if(res>0){
            JOptionPane.showMessageDialog(null,"Registro eliminado");
        }else{
            JOptionPane.showMessageDialog(null,"Ocurrio un error al eliminar");
        }
        con.close();
        }   catch (SQLException e) {
                Logger.getLogger(crudempleado.class.getName()).log(Level.SEVERE, null, e);
            }
    }
    limpiar();
    bneliminar.setVisible(false);
    editar.setVisible(false);
    }//GEN-LAST:event_bneliminarActionPerformed

    private void volverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverMouseEntered
        volver.setBackground(new java.awt.Color(153,153,255));//le damos color al texto del boton y al relleno
        volver.setForeground(Color.red);
    }//GEN-LAST:event_volverMouseEntered

    private void volverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverMouseExited
        volver.setBackground(new java.awt.Color(204,204,255));//le damos color al texto del boton y al relleno
        volver.setForeground(Color.black);
    }//GEN-LAST:event_volverMouseExited

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        opcem pa=new opcem();
        pa.setVisible(true);
        dispose();
        if (tipousuario11.getText().equals("USUARIO")){
                pa.tipousuario24.setText("USUARIO");
        }
        if(tipousuario11.getText().equals("ADMINISTRADOR")){
                pa.tipousuario24.setText("ADMINISTRADOR");
        }
    }//GEN-LAST:event_volverActionPerformed

    private void seleccionarregistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionarregistroActionPerformed
      if (tipousuario11.getText().equals("ADMINISTRADOR")){
        if (docemp.getText().equals(""))
        {
         JOptionPane.showMessageDialog(null,"Debes consultar tu registro");       
        }else{
        try{
        conexion co=new conexion();
        con=co.getconexion();
        ps =con.prepareStatement("select * from EMPLEADO where DOC_EMPLEADO = ?");
        ps.setString(1,docemp.getText());
        
        rs= ps.executeQuery();
        if(rs.next()){
            docemp.setText(rs.getString("DOC_EMPLEADO"));
            nombreem.setText(rs.getString("NOMBRE_EMPLEADO"));
            apellidoem.setText(rs.getString("APELLIDO_EMPLEADO"));
            direccionem.setText(rs.getString("DIRECCION_EMPLEADO"));
            telefonoem.setText(rs.getString("TELEFONO_EMPLEADO"));
            tipoemp.setSelectedItem(rs.getString("TIPO_EMPLEADO"));
            correoem.setText(rs.getString("CORREO_EMPLEADO"));
            useremp.setText(rs.getString("USUARIO_EMPLEADO"));
            contraseña.setText(rs.getString("CONTRASEÑA_EMPLEADO"));
            btnguardar.setVisible(false);
            if(tipousuario11.getText().equals("ADMINISTRADOR")){
            editar.setVisible(true);
            bneliminar.setVisible(true);
            btnguardar.setVisible(false);
            }
        }else{
           JOptionPane.showMessageDialog(null,"No hay un registro con ese DOCUMENTO"); 
           limpiar();
        }
        } catch (SQLException ex) {
              Logger.getLogger(crudempleado.class.getName()).log(Level.SEVERE, null, ex);
          }
        }
      }else{
      JOptionPane.showMessageDialog(null,"No tienes los permisos para realizar esta acción");
      limpiar();
      }
    }//GEN-LAST:event_seleccionarregistroActionPerformed

    private void seleccionarregistroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seleccionarregistroMouseEntered
        seleccionarregistro.setBackground(new java.awt.Color(153,153,255));//le damos color al texto del boton y al relleno
        seleccionarregistro.setForeground(Color.red);
    }//GEN-LAST:event_seleccionarregistroMouseEntered

    private void seleccionarregistroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seleccionarregistroMouseExited
        seleccionarregistro.setBackground(new java.awt.Color(204,204,255));//le damos color al texto del boton y al relleno
        seleccionarregistro.setForeground(Color.black);
    }//GEN-LAST:event_seleccionarregistroMouseExited

    private void tituloMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tituloMouseEntered
        titulo.setForeground(Color.black);//le damos color al texto
    }//GEN-LAST:event_tituloMouseEntered

    private void tituloMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tituloMouseExited
        titulo.setForeground(Color.blue);//le damos color al texto
    }//GEN-LAST:event_tituloMouseExited

    private void editarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editarMouseEntered
        editar.setBackground(new java.awt.Color(153,153,255));//le damos color al texto del boton y al relleno
        editar.setForeground(Color.red);
    }//GEN-LAST:event_editarMouseEntered

    private void editarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editarMouseExited
        editar.setBackground(new java.awt.Color(204,204,255));//le damos color al texto del boton y al relleno
        editar.setForeground(Color.black);
    }//GEN-LAST:event_editarMouseExited

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed
            if (docemp.getText().equals("") || (nombreem.getText().equals("")) || (apellidoem.getText().equals(""))|| (direccionem.getText().equals("")) ||(telefonoem.getText().equals(""))||(tipoemp.getSelectedItem().equals(""))||(correoem.getText().equals(""))||(useremp.getText().equals(""))||(contraseña.getText().equals("")))
        {
            //si los campos estan vacion imprimira en pantalla lo siguiente 
            javax.swing.JOptionPane.showMessageDialog(this,"Debe llenar todos los campos \n","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
            nombreem.requestFocus();
        }else{
        try{
        conexion co=new conexion();
        con=co.getconexion();
        ps =con.prepareStatement("update EMPLEADO set NOMBRE_EMPLEADO=?,APELLIDO_EMPLEADO=?,DIRECCION_EMPLEADO=?,TELEFONO_EMPLEADO=?,CORREO_EMPLEADO=?,TIPO_EMPLEADO=?,USUARIO_EMPLEADO=?,CONTRASEÑA_EMPLEADO=? where DOC_EMPLEADO =? ");
        ps.setString(1,nombreem.getText());
        ps.setString(2,apellidoem.getText());
        ps.setString(3,direccionem.getText());
        ps.setString(4,telefonoem.getText());
        ps.setString(5,correoem.getText());
        ps.setString(6,tipoemp.getSelectedItem().toString());
        ps.setString(7,useremp.getText());
        ps.setString(8,contraseña.getText());
        ps.setString(9,docemp.getText());
        
        int res=ps.executeUpdate();
        if(res>0){
            JOptionPane.showMessageDialog(null,"Registro modificado");
        }else{
            JOptionPane.showMessageDialog(null,"Ocurrio un error al modificar");
        }
        con.close();
        }   catch (SQLException e) {
                Logger.getLogger(crudempleado.class.getName()).log(Level.SEVERE, null, e);
            }
            }
    limpiar();
    bneliminar.setVisible(false);
    editar.setVisible(false);
    }//GEN-LAST:event_editarActionPerformed

    private void lblcorrMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcorrMouseEntered
        lblcorr.setForeground(Color.blue);//le damos color al texto
    }//GEN-LAST:event_lblcorrMouseEntered

    private void lblcorrMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcorrMouseExited
        lblcorr.setForeground(Color.black);//le damos color al texto
    }//GEN-LAST:event_lblcorrMouseExited

    private void btnguardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnguardarMouseEntered
        btnguardar.setBackground(new java.awt.Color(153,153,255));//le damos color al texto del boton y al relleno
        btnguardar.setForeground(Color.red);
    }//GEN-LAST:event_btnguardarMouseEntered

    private void btnguardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnguardarMouseExited
        btnguardar.setBackground(new java.awt.Color(204,204,255));//le damos color al texto del boton y al relleno
        btnguardar.setForeground(Color.black);
    }//GEN-LAST:event_btnguardarMouseExited

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed

        if (nombreem.getText().equals("") || (direccionem.getText().equals("")) || (tipoemp.getSelectedItem().equals("Seleccionar")) ||(telefonoem.getText().equals(""))|| (correoem.getText().equals(""))||(apellidoem.getText().equals(""))||(useremp.getText().equals(""))||(contraseña.getText().equals(""))|| (docemp.getText().equals("")))
        {
            //si los campos estan vacion imprimira en pantalla lo siguiente
            javax.swing.JOptionPane.showMessageDialog(this,"Debe llenar todos los campos \n","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
            nombreem.requestFocus();
        }else{
        
            try{
                conexion co=new conexion();
                con=co.getconexion();
                ps =con.prepareStatement("insert into EMPLEADO(DOC_EMPLEADO,NOMBRE_EMPLEADO,APELLIDO_EMPLEADO,DIRECCION_EMPLEADO,TELEFONO_EMPLEADO,CORREO_EMPLEADO,TIPO_EMPLEADO,USUARIO_EMPLEADO,CONTRASEÑA_EMPLEADO)VALUES(?,?,?,?,?,?,?,?,?)");
                ps.setString(1,docemp.getText());
                ps.setString(2,nombreem.getText());
                ps.setString(3,apellidoem.getText());
                ps.setString(4,direccionem.getText());
                ps.setString(5,telefonoem.getText());
                ps.setString(6,correoem.getText());
                ps.setString(7,tipoemp.getSelectedItem().toString());
                ps.setString(8,useremp.getText());
                ps.setString(9,contraseña.getText());
                

                int res=ps.executeUpdate();
                if(res>0){
                    JOptionPane.showMessageDialog(null,"Registro gardado");
                }else{
                    JOptionPane.showMessageDialog(null,"Ocurrio un error");
                }
                con.close();
            }   catch (SQLException e) {
                Logger.getLogger(crudempleado.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        limpiar();
    }//GEN-LAST:event_btnguardarActionPerformed

    private void consulMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consulMouseEntered
        consul.setBackground(new java.awt.Color(153,153,255));//le damos color al texto del boton y al relleno
        consul.setForeground(Color.red);
    }//GEN-LAST:event_consulMouseEntered

    private void consulMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consulMouseExited
        consul.setBackground(new java.awt.Color(204,204,255));//le damos color al texto del boton y al relleno
        consul.setForeground(Color.black);
    }//GEN-LAST:event_consulMouseExited

    private void consulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consulActionPerformed
        consulempleado cu=new consulempleado();
        cu.setVisible(true);
        dispose();
        if (tipousuario11.getText().equals("USUARIO")){
                cu.tipousuario2.setText("USUARIO");
        }
        if(tipousuario11.getText().equals("ADMINISTRADOR")){
                cu.tipousuario2.setText("ADMINISTRADOR");
        }
    }//GEN-LAST:event_consulActionPerformed

    private void lblapMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblapMouseEntered
        lblap.setForeground(Color.blue);
    }//GEN-LAST:event_lblapMouseEntered

    private void lblapMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblapMouseExited
        lblap.setForeground(Color.black);
    }//GEN-LAST:event_lblapMouseExited

    private void lbluserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbluserMouseEntered
        lbluser.setForeground(Color.blue);
    }//GEN-LAST:event_lbluserMouseEntered

    private void lbluserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbluserMouseExited
        lbluser.setForeground(Color.black);
    }//GEN-LAST:event_lbluserMouseExited

    private void lblconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblconMouseEntered
        lblcon.setForeground(Color.blue);
    }//GEN-LAST:event_lblconMouseEntered

    private void lblconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblconMouseExited
        lblcon.setForeground(Color.black);
    }//GEN-LAST:event_lblconMouseExited

    private void docempKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_docempKeyTyped
        char c= evt.getKeyChar();
        if (c<'0'||c>'9') evt.consume();
    }//GEN-LAST:event_docempKeyTyped

    private void nombreemKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreemKeyTyped
        char c= evt.getKeyChar();
        if ((c<'a'||c>'z') &&(c<'A'||c>'Z') )evt.consume();
    }//GEN-LAST:event_nombreemKeyTyped

    private void apellidoemKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apellidoemKeyTyped
        char c= evt.getKeyChar();
        if ((c<'a'||c>'z') &&(c<'A'||c>'Z') )evt.consume();
    }//GEN-LAST:event_apellidoemKeyTyped

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
            java.util.logging.Logger.getLogger(crudempleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(crudempleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(crudempleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(crudempleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new crudempleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidoem;
    private javax.swing.JButton bneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton consul;
    private javax.swing.JTextField contraseña;
    private javax.swing.JTextField correoem;
    private javax.swing.JTextField direccionem;
    private javax.swing.JTextField docemp;
    private javax.swing.JButton editar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblap;
    private javax.swing.JLabel lblcon;
    private javax.swing.JLabel lblcorr;
    private javax.swing.JLabel lbldir;
    private javax.swing.JLabel lblnom;
    private javax.swing.JLabel lbltel;
    private javax.swing.JLabel lbltip;
    private javax.swing.JLabel lbluser;
    private javax.swing.JTextField nombreem;
    private javax.swing.JButton seleccionarregistro;
    private javax.swing.JLabel semititulo1;
    private javax.swing.JTextField telefonoem;
    private javax.swing.JComboBox<String> tipoemp;
    public javax.swing.JLabel tipousuario11;
    private javax.swing.JLabel titulo;
    private javax.swing.JTextField useremp;
    private javax.swing.JButton usuario;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}