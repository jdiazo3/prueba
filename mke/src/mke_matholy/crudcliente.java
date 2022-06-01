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

public class crudcliente extends javax.swing.JFrame {
Connection con = null;
Statement stmt = null;
PreparedStatement ps;
ResultSet rs;
private void limpiar(){
    doccli.setText("");
    nombrecli.setText("");
    apellidocli.setText("");
    telefonocli.setText("");
    correocli.setText("");
}

    public crudcliente() {
        initComponents();
        this.setSize(1010, 800);//le damos un tamaño a nuestra pantalla
        this.setTitle("CLIENTES");//le damos un titulo en la parte superior izquierda
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
        lbltel = new javax.swing.JLabel();
        bneliminar = new javax.swing.JButton();
        volver = new javax.swing.JButton();
        nombrecli = new javax.swing.JTextField();
        editar = new javax.swing.JButton();
        telefonocli = new javax.swing.JTextField();
        doccli = new javax.swing.JTextField();
        correocli = new javax.swing.JTextField();
        lblcorr = new javax.swing.JLabel();
        btnguardar = new javax.swing.JButton();
        consul = new javax.swing.JButton();
        lblap = new javax.swing.JLabel();
        apellidocli = new javax.swing.JTextField();
        tipousuario9 = new javax.swing.JLabel();
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
        seleccionarregistro.setBounds(340, 110, 65, 65);

        titulo.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        titulo.setForeground(new java.awt.Color(0, 102, 255));
        titulo.setText("Modulo clientes");
        titulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tituloMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tituloMouseExited(evt);
            }
        });
        getContentPane().add(titulo);
        titulo.setBounds(360, 30, 500, 50);

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
        semititulo1.setBounds(410, 130, 130, 20);

        lblnom.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblnom.setText("*Nombre del cliente  :");
        lblnom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblnomMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblnomMouseExited(evt);
            }
        });
        getContentPane().add(lblnom);
        lblnom.setBounds(390, 200, 170, 25);

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
        lbltel.setBounds(390, 370, 121, 26);

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
        bneliminar.setBounds(790, 430, 65, 65);

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
        volver.setBounds(790, 550, 65, 65);

        nombrecli.setBackground(new java.awt.Color(204, 204, 255));
        nombrecli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombrecliKeyTyped(evt);
            }
        });
        getContentPane().add(nombrecli);
        nombrecli.setBounds(560, 200, 150, 30);

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
        editar.setBounds(790, 330, 65, 65);

        telefonocli.setBackground(new java.awt.Color(204, 204, 255));
        getContentPane().add(telefonocli);
        telefonocli.setBounds(560, 370, 150, 30);

        doccli.setBackground(new java.awt.Color(204, 204, 255));
        doccli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                doccliKeyTyped(evt);
            }
        });
        getContentPane().add(doccli);
        doccli.setBounds(560, 130, 140, 30);

        correocli.setBackground(new java.awt.Color(204, 204, 255));
        getContentPane().add(correocli);
        correocli.setBounds(560, 460, 150, 29);

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
        lblcorr.setBounds(390, 460, 121, 26);

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
        btnguardar.setBounds(790, 170, 65, 65);

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
        consul.setBounds(790, 250, 65, 65);

        lblap.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblap.setText("*Apellido del cliente  :");
        lblap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblapMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblapMouseExited(evt);
            }
        });
        getContentPane().add(lblap);
        lblap.setBounds(390, 290, 170, 25);

        apellidocli.setBackground(new java.awt.Color(204, 204, 255));
        apellidocli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                apellidocliKeyTyped(evt);
            }
        });
        getContentPane().add(apellidocli);
        apellidocli.setBounds(560, 290, 150, 30);

        tipousuario9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(tipousuario9);
        tipousuario9.setBounds(20, 100, 160, 30);

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
    if (doccli.getText().equals("") || (nombrecli.getText().equals("")) ||(apellidocli.getText().equals(""))|| (telefonocli.getText().equals(""))|| (correocli.getText().equals("")))
        {
         JOptionPane.showMessageDialog(null,"Debes consultar tu registro");       
        }else{
        
        try{
        conexion co=new conexion();
        con=co.getconexion();
        ps =con.prepareStatement("DELETE  from CLIENTE where DOC_CLIENTE= ? ");
        ps.setInt(1,Integer.parseInt(doccli.getText()));
        
        int res=ps.executeUpdate();
        if(res>0){
            JOptionPane.showMessageDialog(null,"Registro eliminado");
        }else{
            JOptionPane.showMessageDialog(null,"Ocurrio un error al eliminar");
        }
        con.close();
        }   catch (SQLException e) {
                Logger.getLogger(crudcliente.class.getName()).log(Level.SEVERE, null, e);
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
        opcclien pa=new opcclien();
        pa.setVisible(true);
        dispose();
        if (tipousuario9.getText().equals("USUARIO")){
                pa.tipousuario23.setText("USUARIO");
        }
        if(tipousuario9.getText().equals("ADMINISTRADOR")){
                pa.tipousuario23.setText("ADMINISTRADOR");
        }
    }//GEN-LAST:event_volverActionPerformed

    private void seleccionarregistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionarregistroActionPerformed
      if (doccli.getText().equals(""))
        {
         JOptionPane.showMessageDialog(null,"Debes consultar tu registro");       
        }else{
        try{
        conexion co=new conexion();
        con=co.getconexion();
        ps =con.prepareStatement("select * from CLIENTE where DOC_CLIENTE = ?");
        ps.setString(1,doccli.getText());
        
        rs= ps.executeQuery();
        if(tipousuario9.getText().equals("ADMINISTRADOR")){
        if(rs.next()){
            doccli.setText(rs.getString("DOC_CLIENTE"));
            nombrecli.setText(rs.getString("NOMBRE_CLIENTE"));
            apellidocli.setText(rs.getString("APELLIDO_CLIENTE"));
            telefonocli.setText(rs.getString("TELEFONO_CLIENTE"));
            correocli.setText(rs.getString("CORREO_CLIENTE"));
            bneliminar.setVisible(true);
            editar.setVisible(true);
            btnguardar.setVisible(false);
        }else{
           JOptionPane.showMessageDialog(null,"No hay un registro con ese DOCUMENTO"); 
           limpiar();
        }}else
            if(rs.next()){
            doccli.setText(rs.getString("DOC_CLIENTE"));
            nombrecli.setText(rs.getString("NOMBRE_CLIENTE"));
            apellidocli.setText(rs.getString("APELLIDO_CLIENTE"));
            telefonocli.setText(rs.getString("TELEFONO_CLIENTE"));
            correocli.setText(rs.getString("CORREO_CLIENTE"));
            btnguardar.setVisible(false);
        }else{
           JOptionPane.showMessageDialog(null,"No hay un registro con ese DOCUMENTO"); 
           limpiar();
        }
        } catch (SQLException ex) {
              Logger.getLogger(crudcliente.class.getName()).log(Level.SEVERE, null, ex);
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
            if (doccli.getText().equals("") || (nombrecli.getText().equals("")) || (apellidocli.getText().equals(""))||(telefonocli.getText().equals(""))||(correocli.getText().equals("")))
        {
            //si los campos estan vacion imprimira en pantalla lo siguiente 
            javax.swing.JOptionPane.showMessageDialog(this,"Debe llenar todos los campos \n","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
            nombrecli.requestFocus();
        }else{
        try{
        conexion co=new conexion();
        con=co.getconexion();
        ps =con.prepareStatement("update CLIENTE set DOC_CLIENTE= ?, NOMBRE_CLIENTE=?,APELLIDO_CLIENTE=?,TELEFONO_CLIENTE=?,CORREO_CLIENTE=? where DOC_CLIENTE=? ");
        ps.setString(1,doccli.getText());
        ps.setString(2,nombrecli.getText());
        ps.setString(3,apellidocli.getText());
        ps.setString(4,telefonocli.getText());
        ps.setString(5,correocli.getText());
        ps.setString(6,doccli.getText());
        
        int res=ps.executeUpdate();
        if(res>0){
            JOptionPane.showMessageDialog(null,"Registro modificado");
        }else{
            JOptionPane.showMessageDialog(null,"Ocurrio un error al modificar");
        }
        con.close();
        }   catch (SQLException e) {
                Logger.getLogger(crudcliente.class.getName()).log(Level.SEVERE, null, e);
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

        if (nombrecli.getText().equals("")  ||(telefonocli.getText().equals(""))|| (correocli.getText().equals(""))||(apellidocli.getText().equals(""))|| (doccli.getText().equals("")))
        {
            //si los campos estan vacion imprimira en pantalla lo siguiente
            javax.swing.JOptionPane.showMessageDialog(this,"Debe llenar todos los campos \n","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
            nombrecli.requestFocus();
        }else{
        
            try{
                conexion co=new conexion();
                con=co.getconexion();
                ps =con.prepareStatement("insert into CLIENTE(DOC_CLIENTE,NOMBRE_CLIENTE,APELLIDO_CLIENTE,TELEFONO_CLIENTE,CORREO_CLIENTE)VALUES(?,?,?,?,?)");
                ps.setString(1,doccli.getText());
                ps.setString(2,nombrecli.getText());
                ps.setString(3,apellidocli.getText());
                ps.setString(4,telefonocli.getText());
                ps.setString(5,correocli.getText());
                

                int res=ps.executeUpdate();
                if(res>0){
                    JOptionPane.showMessageDialog(null,"Registro gardado");
                }else{
                    JOptionPane.showMessageDialog(null,"Ocurrio un error");
                }
                con.close();
            }   catch (SQLException e) {
                Logger.getLogger(crudcliente.class.getName()).log(Level.SEVERE, null, e);
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
        consulcliente cu=new consulcliente();
        cu.setVisible(true);
        dispose();
        if (tipousuario9.getText().equals("USUARIO")){
                cu.tipousuario1.setText("USUARIO");
        }
        if(tipousuario9.getText().equals("ADMINISTRADOR")){
                cu.tipousuario1.setText("ADMINISTRADOR");
        }
    }//GEN-LAST:event_consulActionPerformed

    private void lblapMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblapMouseEntered
        lblap.setForeground(Color.blue);
    }//GEN-LAST:event_lblapMouseEntered

    private void lblapMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblapMouseExited
        lblap.setForeground(Color.black);
    }//GEN-LAST:event_lblapMouseExited

    private void doccliKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_doccliKeyTyped
        char c= evt.getKeyChar();
        if (c<'0'||c>'9') evt.consume();
    }//GEN-LAST:event_doccliKeyTyped

    private void nombrecliKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombrecliKeyTyped
        char c= evt.getKeyChar();
        if ((c<'a'||c>'z') &&(c<'A'||c>'Z') )evt.consume();
    }//GEN-LAST:event_nombrecliKeyTyped

    private void apellidocliKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apellidocliKeyTyped
        char c= evt.getKeyChar();
        if ((c<'a'||c>'z') &&(c<'A'||c>'Z') )evt.consume();
    }//GEN-LAST:event_apellidocliKeyTyped

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
            java.util.logging.Logger.getLogger(crudcliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(crudcliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(crudcliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(crudcliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new crudcliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidocli;
    private javax.swing.JButton bneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton consul;
    private javax.swing.JTextField correocli;
    private javax.swing.JTextField doccli;
    private javax.swing.JButton editar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblap;
    private javax.swing.JLabel lblcorr;
    private javax.swing.JLabel lblnom;
    private javax.swing.JLabel lbltel;
    private javax.swing.JTextField nombrecli;
    private javax.swing.JButton seleccionarregistro;
    private javax.swing.JLabel semititulo1;
    private javax.swing.JTextField telefonocli;
    public javax.swing.JLabel tipousuario9;
    private javax.swing.JLabel titulo;
    private javax.swing.JButton usuario;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}