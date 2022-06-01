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

public class crudproveedor extends javax.swing.JFrame {
Connection con = null;
Statement stmt = null;
PreparedStatement ps;
ResultSet rs;
private void limpiar(){
    docpro.setText("");
    nombrepro.setText("");
    apellidopro.setText("");
    direccionempr.setText("");
    telefonopro.setText("");
    correopro.setText("");
    nombreempr.setText("");
}

    public crudproveedor() {
        initComponents();
        this.setSize(1010, 800);//le damos un tamaño a nuestra pantalla
        this.setTitle("PROVEEDOR");//le damos un titulo en la parte superior izquierda
        this.setLocation(150,60);//le damos una localizacion para cuando salga en pantalla
        bneliminar.setVisible(false);
        editar.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        seleccionarregistro = new javax.swing.JButton();
        titulo = new javax.swing.JLabel();
        semititulo1 = new javax.swing.JLabel();
        lblnom = new javax.swing.JLabel();
        lbldir = new javax.swing.JLabel();
        lbltel = new javax.swing.JLabel();
        bneliminar = new javax.swing.JButton();
        volver = new javax.swing.JButton();
        nombrepro = new javax.swing.JTextField();
        direccionempr = new javax.swing.JTextField();
        editar = new javax.swing.JButton();
        telefonopro = new javax.swing.JTextField();
        docpro = new javax.swing.JTextField();
        correopro = new javax.swing.JTextField();
        lblcorr = new javax.swing.JLabel();
        btnguardar = new javax.swing.JButton();
        consul = new javax.swing.JButton();
        lblap = new javax.swing.JLabel();
        apellidopro = new javax.swing.JTextField();
        lbluser = new javax.swing.JLabel();
        nombreempr = new javax.swing.JTextField();
        tipousuario15 = new javax.swing.JLabel();
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
        seleccionarregistro.setBounds(170, 90, 65, 65);

        titulo.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        titulo.setForeground(new java.awt.Color(0, 102, 255));
        titulo.setText("Modulo de proveedores");
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
        semititulo1.setBounds(240, 130, 120, 20);

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
        lblnom.setBounds(200, 190, 180, 25);

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
        lbldir.setBounds(190, 630, 100, 30);

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
        lbltel.setBounds(200, 360, 121, 26);

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
        bneliminar.setBounds(660, 440, 65, 65);

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
        volver.setBounds(660, 580, 65, 65);

        nombrepro.setBackground(new java.awt.Color(204, 204, 255));
        nombrepro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreproKeyTyped(evt);
            }
        });
        getContentPane().add(nombrepro);
        nombrepro.setBounds(400, 190, 150, 30);

        direccionempr.setBackground(new java.awt.Color(204, 204, 255));
        getContentPane().add(direccionempr);
        direccionempr.setBounds(400, 630, 150, 30);

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
        editar.setBounds(660, 280, 65, 65);

        telefonopro.setBackground(new java.awt.Color(204, 204, 255));
        getContentPane().add(telefonopro);
        telefonopro.setBounds(400, 360, 150, 30);

        docpro.setBackground(new java.awt.Color(204, 204, 255));
        docpro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                docproKeyTyped(evt);
            }
        });
        getContentPane().add(docpro);
        docpro.setBounds(400, 120, 140, 30);

        correopro.setBackground(new java.awt.Color(204, 204, 255));
        getContentPane().add(correopro);
        correopro.setBounds(400, 460, 150, 29);

        lblcorr.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblcorr.setText("*Correo  :");
        lblcorr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblcorrMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblcorrMouseExited(evt);
            }
        });
        getContentPane().add(lblcorr);
        lblcorr.setBounds(210, 460, 121, 26);

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
        btnguardar.setBounds(660, 200, 65, 65);

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
        consul.setBounds(660, 360, 65, 65);

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
        lblap.setBounds(200, 270, 190, 25);

        apellidopro.setBackground(new java.awt.Color(204, 204, 255));
        apellidopro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                apellidoproKeyTyped(evt);
            }
        });
        getContentPane().add(apellidopro);
        apellidopro.setBounds(400, 270, 150, 30);

        lbluser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbluser.setText("*Nombre empresa  :");
        lbluser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbluserMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbluserMouseExited(evt);
            }
        });
        getContentPane().add(lbluser);
        lbluser.setBounds(200, 540, 150, 26);

        nombreempr.setBackground(new java.awt.Color(204, 204, 255));
        nombreempr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreemprActionPerformed(evt);
            }
        });
        nombreempr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreemprKeyTyped(evt);
            }
        });
        getContentPane().add(nombreempr);
        nombreempr.setBounds(400, 540, 150, 29);

        tipousuario15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(tipousuario15);
        tipousuario15.setBounds(10, 100, 160, 30);

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
    if (docpro.getText().equals("") || (nombrepro.getText().equals("")) || (direccionempr.getText().equals("")) || (telefonopro.getText().equals("")) || (correopro.getText().equals(""))|| (nombreempr.getText().equals("")))
        {
         JOptionPane.showMessageDialog(null,"Debes consultar tu registro");       
        }else{
        
        try{
        conexion co=new conexion();
        con=co.getconexion();
        ps =con.prepareStatement("DELETE  from PROVEEDOR where DOC_PROVEEDOR =?");
        ps.setInt(1,Integer.parseInt(docpro.getText()));
        
        int res=ps.executeUpdate();
        if(res>0){
            JOptionPane.showMessageDialog(null,"Registro eliminado");
        }else{
            JOptionPane.showMessageDialog(null,"Ocurrio un error al eliminar");
        }
        con.close();
        }   catch (SQLException e) {
                Logger.getLogger(crudproveedor.class.getName()).log(Level.SEVERE, null, e);
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
        opcprov pa=new opcprov();
        pa.setVisible(true);
        dispose();
        if (tipousuario15.getText().equals("USUARIO")){
                pa.tipousuario26.setText("USUARIO");
        }
        if(tipousuario15.getText().equals("ADMINISTRADOR")){
                pa.tipousuario26.setText("ADMINISTRADOR");
        }
    }//GEN-LAST:event_volverActionPerformed

    private void seleccionarregistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionarregistroActionPerformed
      if (docpro.getText().equals(""))
        {
         JOptionPane.showMessageDialog(null,"Debes consultar tu registro");       
        }else{
        try{
        conexion co=new conexion();
        con=co.getconexion();
        ps =con.prepareStatement("select * from PROVEEDOR where DOC_PROVEEDOR = ?");
        ps.setString(1,docpro.getText());
        
        rs= ps.executeQuery();
        if(rs.next()){
            docpro.setText(rs.getString("DOC_PROVEEDOR"));
            nombrepro.setText(rs.getString("NOMBRE_PROVEEDOR"));
            apellidopro.setText(rs.getString("APELLIDO_PROVEEDOR"));
            direccionempr.setText(rs.getString("DIRECCION_EMPRESA"));
            telefonopro.setText(rs.getString("TELEFONO_PROVEEDOR"));
            correopro.setText(rs.getString("CORREO_PROVEEDOR"));
            nombreempr.setText(rs.getString("NOMBRE_EMPRESA"));
            bneliminar.setVisible(true);
            editar.setVisible(true);
            btnguardar.setVisible(false);
        }else{
           JOptionPane.showMessageDialog(null,"No hay un registro con ese DOCUMENTO"); 
           limpiar();
        }
        } catch (SQLException ex) {
              Logger.getLogger(crudproveedor.class.getName()).log(Level.SEVERE, null, ex);
          }
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
            if (docpro.getText().equals("") || (nombrepro.getText().equals("")) || (apellidopro.getText().equals(""))|| (direccionempr.getText().equals("")) ||(telefonopro.getText().equals(""))||(correopro.getText().equals(""))||(nombreempr.getText().equals("")))
        {
            //si los campos estan vacion imprimira en pantalla lo siguiente 
            javax.swing.JOptionPane.showMessageDialog(this,"Debe llenar todos los campos \n","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
            nombrepro.requestFocus();
        }else{
        try{
        conexion co=new conexion();
        con=co.getconexion();
        ps =con.prepareStatement("update PROVEEDOR set NOMBRE_PROVEEDOR=?,APELLIDO_PROVEEDOR=?,TELEFONO_PROVEEDOR=?,CORREO_PROVEEDOR=?,NOMBRE_EMPRESA=?,DIRECCION_EMPRESA=? where DOC_PROVEEDOR =? ");
        ps.setString(1,nombrepro.getText());
        ps.setString(2,apellidopro.getText());
        ps.setString(3,telefonopro.getText());
        ps.setString(4,correopro.getText());
        ps.setString(5,nombreempr.getText());
        ps.setString(6,direccionempr.getText());
        ps.setString(7,docpro.getText());
        
        int res=ps.executeUpdate();
        if(res>0){
            JOptionPane.showMessageDialog(null,"Registro modificado");
        }else{
            JOptionPane.showMessageDialog(null,"Ocurrio un error al modificar");
        }
        con.close();
        }   catch (SQLException e) {
                Logger.getLogger(crudproveedor.class.getName()).log(Level.SEVERE, null, e);
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

        if (nombrepro.getText().equals("") || (direccionempr.getText().equals("")) ||(telefonopro.getText().equals(""))|| (correopro.getText().equals(""))||(apellidopro.getText().equals(""))||(nombreempr.getText().equals(""))|| (docpro.getText().equals("")))
        {
            //si los campos estan vacion imprimira en pantalla lo siguiente
            javax.swing.JOptionPane.showMessageDialog(this,"Debe llenar todos los campos \n","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
            nombrepro.requestFocus();
        }else{
        
            try{
                conexion co=new conexion();
                con=co.getconexion();
                ps =con.prepareStatement("insert into PROVEEDOR(DOC_PROVEEDOR,NOMBRE_PROVEEDOR,APELLIDO_PROVEEDOR,TELEFONO_PROVEEDOR,CORREO_PROVEEDOR,NOMBRE_EMPRESA,DIRECCION_EMPRESA)VALUES(?,?,?,?,?,?,?)");
                ps.setString(1,docpro.getText());
                ps.setString(2,nombrepro.getText());
                ps.setString(3,apellidopro.getText());
                ps.setString(4,telefonopro.getText());
                ps.setString(5,correopro.getText());
                ps.setString(6,nombreempr.getText());
                ps.setString(7,direccionempr.getText());

                int res=ps.executeUpdate();
                if(res>0){
                    JOptionPane.showMessageDialog(null,"Registro gardado");
                }else{
                    JOptionPane.showMessageDialog(null,"Ocurrio un error");
                }
                con.close();
            }   catch (SQLException e) {
                Logger.getLogger(crudproveedor.class.getName()).log(Level.SEVERE, null, e);
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
        consulproveedor cu=new consulproveedor();
        cu.setVisible(true);
        dispose();
        if (tipousuario15.getText().equals("USUARIO")){
                cu.tipousuario4.setText("USUARIO");
        }
        if(tipousuario15.getText().equals("ADMINISTRADOR")){
                cu.tipousuario4.setText("ADMINISTRADOR");
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

    private void nombreemprActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreemprActionPerformed
        
    }//GEN-LAST:event_nombreemprActionPerformed

    private void docproKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_docproKeyTyped
        char c= evt.getKeyChar();
        if (c<'0'||c>'9') evt.consume();
    }//GEN-LAST:event_docproKeyTyped

    private void nombreproKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreproKeyTyped
        char c= evt.getKeyChar();
        if ((c<'a'||c>'z') &&(c<'A'||c>'Z') )evt.consume();
    }//GEN-LAST:event_nombreproKeyTyped

    private void apellidoproKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apellidoproKeyTyped
        char c= evt.getKeyChar();
        if ((c<'a'||c>'z') &&(c<'A'||c>'Z') )evt.consume();
    }//GEN-LAST:event_apellidoproKeyTyped

    private void nombreemprKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreemprKeyTyped
        char c= evt.getKeyChar();
        if ((c<'a'||c>'z') &&(c<'A'||c>'Z')&&(c<'1'||c>'9'))evt.consume();
    }//GEN-LAST:event_nombreemprKeyTyped

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
            java.util.logging.Logger.getLogger(crudproveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(crudproveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(crudproveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(crudproveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new crudproveedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidopro;
    private javax.swing.JButton bneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton consul;
    private javax.swing.JTextField correopro;
    private javax.swing.JTextField direccionempr;
    private javax.swing.JTextField docpro;
    private javax.swing.JButton editar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblap;
    private javax.swing.JLabel lblcorr;
    private javax.swing.JLabel lbldir;
    private javax.swing.JLabel lblnom;
    private javax.swing.JLabel lbltel;
    private javax.swing.JLabel lbluser;
    private javax.swing.JTextField nombreempr;
    private javax.swing.JTextField nombrepro;
    private javax.swing.JButton seleccionarregistro;
    private javax.swing.JLabel semititulo1;
    private javax.swing.JTextField telefonopro;
    public javax.swing.JLabel tipousuario15;
    private javax.swing.JLabel titulo;
    private javax.swing.JButton usuario;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}