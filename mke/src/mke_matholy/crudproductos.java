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

public class crudproductos extends javax.swing.JFrame {
Connection con = null;
Statement stmt = null;
PreparedStatement ps;
ResultSet rs;
private void limpiar(){
    idcha.setText("");
    nombrecha.setText("");
    estilocha.setText("");
    preciocha.setText("");
    generocha.setSelectedItem("Seleccionar");
    colorcha.setText("");
    cantida.setText("");
}

    public crudproductos() {
        initComponents();
        this.setSize(1010, 800);//le damos un tamaño a nuestra pantalla
        this.setTitle("CHAQUETAS");//le damos un titulo en la parte superior izquierda
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
        lnom = new javax.swing.JLabel();
        lestilo = new javax.swing.JLabel();
        lgenero = new javax.swing.JLabel();
        lprecio = new javax.swing.JLabel();
        bneliminar = new javax.swing.JButton();
        volver = new javax.swing.JButton();
        nombrecha = new javax.swing.JTextField();
        estilocha = new javax.swing.JTextField();
        editar = new javax.swing.JButton();
        preciocha = new javax.swing.JTextField();
        idcha = new javax.swing.JTextField();
        colorcha = new javax.swing.JTextField();
        lcolor = new javax.swing.JLabel();
        btnguardar = new javax.swing.JButton();
        consul = new javax.swing.JButton();
        generocha = new javax.swing.JComboBox<>();
        lblcant = new javax.swing.JLabel();
        cantida = new javax.swing.JTextField();
        tipousuario14 = new javax.swing.JLabel();
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
        seleccionarregistro.setBounds(390, 130, 65, 65);

        titulo.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        titulo.setForeground(new java.awt.Color(0, 102, 255));
        titulo.setText("Modulo chaquetas terminadas");
        titulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tituloMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tituloMouseExited(evt);
            }
        });
        getContentPane().add(titulo);
        titulo.setBounds(250, 40, 580, 50);

        semititulo1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        semititulo1.setText("Id:");
        semititulo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                semititulo1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                semititulo1MouseExited(evt);
            }
        });
        getContentPane().add(semititulo1);
        semititulo1.setBounds(500, 160, 30, 20);

        lnom.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lnom.setText("*Nombre de la chaqueta :");
        lnom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lnomMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lnomMouseExited(evt);
            }
        });
        getContentPane().add(lnom);
        lnom.setBounds(290, 250, 180, 25);

        lestilo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lestilo.setText("Estilo :");
        lestilo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lestiloMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lestiloMouseExited(evt);
            }
        });
        getContentPane().add(lestilo);
        lestilo.setBounds(290, 330, 100, 30);

        lgenero.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lgenero.setText("*Genero :");
        lgenero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lgeneroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lgeneroMouseExited(evt);
            }
        });
        getContentPane().add(lgenero);
        lgenero.setBounds(290, 500, 111, 26);

        lprecio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lprecio.setText("*Precio :");
        lprecio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lprecioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lprecioMouseExited(evt);
            }
        });
        getContentPane().add(lprecio);
        lprecio.setBounds(290, 410, 121, 26);

        bneliminar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bneliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mke_matholy/img/eliminar (3).jpg"))); // NOI18N
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
        bneliminar.setBounds(780, 450, 65, 65);

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
        volver.setBounds(780, 580, 65, 65);

        nombrecha.setBackground(new java.awt.Color(204, 204, 255));
        nombrecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombrechaKeyTyped(evt);
            }
        });
        getContentPane().add(nombrecha);
        nombrecha.setBounds(540, 240, 150, 30);

        estilocha.setBackground(new java.awt.Color(204, 204, 255));
        estilocha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                estilochaKeyTyped(evt);
            }
        });
        getContentPane().add(estilocha);
        estilocha.setBounds(540, 330, 150, 30);

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
        editar.setBounds(780, 370, 65, 65);

        preciocha.setBackground(new java.awt.Color(204, 204, 255));
        preciocha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                preciochaKeyTyped(evt);
            }
        });
        getContentPane().add(preciocha);
        preciocha.setBounds(540, 410, 150, 30);

        idcha.setBackground(new java.awt.Color(204, 204, 255));
        idcha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                idchaKeyTyped(evt);
            }
        });
        getContentPane().add(idcha);
        idcha.setBounds(560, 150, 70, 30);

        colorcha.setBackground(new java.awt.Color(204, 204, 255));
        colorcha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                colorchaKeyTyped(evt);
            }
        });
        getContentPane().add(colorcha);
        colorcha.setBounds(540, 570, 150, 29);

        lcolor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lcolor.setText("*Color :");
        lcolor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lcolorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lcolorMouseExited(evt);
            }
        });
        getContentPane().add(lcolor);
        lcolor.setBounds(290, 570, 121, 26);

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
        btnguardar.setBounds(780, 210, 65, 65);

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
        consul.setBounds(780, 290, 65, 65);

        generocha.setBackground(new java.awt.Color(204, 204, 255));
        generocha.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        generocha.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Masculino", "Femenino" }));
        getContentPane().add(generocha);
        generocha.setBounds(540, 500, 110, 30);

        lblcant.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblcant.setText("Cantidad : ");
        lblcant.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblcantMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblcantMouseExited(evt);
            }
        });
        getContentPane().add(lblcant);
        lblcant.setBounds(290, 640, 121, 26);

        cantida.setBackground(new java.awt.Color(204, 204, 255));
        cantida.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cantidaKeyTyped(evt);
            }
        });
        getContentPane().add(cantida);
        cantida.setBounds(540, 640, 150, 29);

        tipousuario14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(tipousuario14);
        tipousuario14.setBounds(20, 100, 140, 30);

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

    private void lnomMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lnomMouseEntered
        lnom.setForeground(Color.blue);//le damos color al texto
    }//GEN-LAST:event_lnomMouseEntered

    private void lnomMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lnomMouseExited
        lnom.setForeground(Color.black);//le damos color al texto
    }//GEN-LAST:event_lnomMouseExited

    private void lestiloMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lestiloMouseEntered
        lestilo.setForeground(Color.blue);//le damos color al texto
    }//GEN-LAST:event_lestiloMouseEntered

    private void lestiloMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lestiloMouseExited
        lestilo.setForeground(Color.black);//le damos color al texto
    }//GEN-LAST:event_lestiloMouseExited

    private void lgeneroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lgeneroMouseEntered
        lgenero.setForeground(Color.blue);//le damos color al texto
    }//GEN-LAST:event_lgeneroMouseEntered

    private void lgeneroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lgeneroMouseExited
        lgenero.setForeground(Color.black);//le damos color al texto
    }//GEN-LAST:event_lgeneroMouseExited

    private void lprecioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lprecioMouseEntered
        lprecio.setForeground(Color.blue);//le damos color al texto
    }//GEN-LAST:event_lprecioMouseEntered

    private void lprecioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lprecioMouseExited
        lprecio.setForeground(Color.black);//le damos color al texto
    }//GEN-LAST:event_lprecioMouseExited

    private void bneliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bneliminarMouseEntered
        bneliminar.setBackground(new java.awt.Color(153,153,255));//le damos color al texto del boton y al relleno
        bneliminar.setForeground(Color.red);
    }//GEN-LAST:event_bneliminarMouseEntered

    private void bneliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bneliminarMouseExited
        bneliminar.setBackground(new java.awt.Color(204,204,255));//le damos color al texto del boton y al relleno
        bneliminar.setForeground(Color.black);
    }//GEN-LAST:event_bneliminarMouseExited

    private void bneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bneliminarActionPerformed
    if (idcha.getText().equals("") || (nombrecha.getText().equals("")) || (estilocha.getText().equals("")) || (preciocha.getText().equals("")) || (generocha.getSelectedItem().equals("Seleccionar"))|| (colorcha.getText().equals("")))
        {
         JOptionPane.showMessageDialog(null,"Debes consultar tu registro");       
        }else{
        
        try{
        conexion co=new conexion();
        con=co.getconexion();
        ps =con.prepareStatement("DELETE  from CHAQUETA_REALIZADA where ID_CHAQUETA_REALIZADAA =?");
        ps.setInt(1,Integer.parseInt(idcha.getText()));
        
        int res=ps.executeUpdate();
        if(res>0){
            JOptionPane.showMessageDialog(null,"Registro eliminado");
        }else{
            JOptionPane.showMessageDialog(null,"Ocurrio un error al eliminar");
        }
        con.close();
        }   catch (SQLException e) {
                Logger.getLogger(crudproductos.class.getName()).log(Level.SEVERE, null, e);
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
        opccha pa=new opccha();
        pa.setVisible(true);
        dispose();
        if (tipousuario14.getText().equals("USUARIO")){
                pa.tipousuario22.setText("USUARIO");
        }
        if(tipousuario14.getText().equals("ADMINISTRADOR")){
                pa.tipousuario22.setText("ADMINISTRADOR");
        }
    }//GEN-LAST:event_volverActionPerformed

    private void seleccionarregistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionarregistroActionPerformed
      if (idcha.getText().equals(""))
        {
         JOptionPane.showMessageDialog(null,"Debes consultar tu registro");       
        }else{
        try{
        conexion co=new conexion();
        con=co.getconexion();
        ps =con.prepareStatement("select * from CHAQUETA_REALIZADA where ID_CHAQUETA_REALIZADAA =?");
        ps.setString(1,idcha.getText());
        
        rs= ps.executeQuery();
        if(rs.next()){
            idcha.setText(rs.getString("ID_CHAQUETA_REALIZADAA"));
            nombrecha.setText(rs.getString("NOMBRE_CHAQUETA_REALIZADA"));
            estilocha.setText(rs.getString("NOMBRE_ESTILO_PRODUCTO"));
            preciocha.setText(rs.getString("VALOR_CHAQUETA_REALIZADA"));
            generocha.setSelectedItem(rs.getString("GENERO"));
            colorcha.setText(rs.getString("COLOR"));
            btnguardar.setVisible(false);
            if(tipousuario14.getText().equals("ADMINISTRADOR")){
            editar.setVisible(true);
            bneliminar.setVisible(true);
            btnguardar.setVisible(false);
            }
        }else{
           JOptionPane.showMessageDialog(null,"No hay un registro con ese ID"); 
           limpiar();
        }
        } catch (SQLException ex) {
              Logger.getLogger(crudproductos.class.getName()).log(Level.SEVERE, null, ex);
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
            if (idcha.getText().equals("") || (nombrecha.getText().equals("")) || (estilocha.getText().equals("")) ||(preciocha.getText().equals(""))||(generocha.getSelectedItem().equals(""))||(colorcha.getText().equals("")))
        {
            //si los campos estan vacion imprimira en pantalla lo siguiente 
            javax.swing.JOptionPane.showMessageDialog(this,"Debe llenar todos los campos \n","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
            nombrecha.requestFocus();
        }else{
        try{
        conexion co=new conexion();
        con=co.getconexion();
        ps =con.prepareStatement("update CHAQUETA_REALIZADA set NOMBRE_CHAQUETA_REALIZADA=?,NOMBRE_ESTILO_PRODUCTO=?,VALOR_CHAQUETA_REALIZADA=?,GENERO=?,COLOR=?,ESTADO='DISPONIBLE' where ID_CHAQUETA_REALIZADAA =? ");
        ps.setString(1,nombrecha.getText());
        ps.setString(2,estilocha.getText());
        ps.setString(3,preciocha.getText());
        ps.setString(4,generocha.getSelectedItem().toString());
        ps.setString(5,colorcha.getText());
        ps.setString(6,idcha.getText());
        
        int res=ps.executeUpdate();
        if(res>0){
            JOptionPane.showMessageDialog(null,"Registro modificado");
        }else{
            JOptionPane.showMessageDialog(null,"Ocurrio un error al modificar");
        }
        con.close();
        }   catch (SQLException e) {
                Logger.getLogger(crudproductos.class.getName()).log(Level.SEVERE, null, e);
            }
            }
    limpiar();
    bneliminar.setVisible(false);
    editar.setVisible(false);
    }//GEN-LAST:event_editarActionPerformed

    private void lcolorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lcolorMouseEntered
        lcolor.setForeground(Color.blue);//le damos color al texto
    }//GEN-LAST:event_lcolorMouseEntered

    private void lcolorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lcolorMouseExited
        lcolor.setForeground(Color.black);//le damos color al texto
    }//GEN-LAST:event_lcolorMouseExited

    private void btnguardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnguardarMouseEntered
        btnguardar.setBackground(new java.awt.Color(153,153,255));//le damos color al texto del boton y al relleno
        btnguardar.setForeground(Color.red);
    }//GEN-LAST:event_btnguardarMouseEntered

    private void btnguardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnguardarMouseExited
        btnguardar.setBackground(new java.awt.Color(204,204,255));//le damos color al texto del boton y al relleno
        btnguardar.setForeground(Color.black);
    }//GEN-LAST:event_btnguardarMouseExited

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        int cantidad=Integer.parseInt(cantida.getText());
        for (int i=0;i<cantidad;i++){
        if (nombrecha.getText().equals("") || (estilocha.getText().equals("")) || (generocha.getSelectedItem().equals("Seleccionar")) ||(preciocha.getText().equals(""))|| (colorcha.getText().equals("")))
        {
            //si los campos estan vacion imprimira en pantalla lo siguiente
            javax.swing.JOptionPane.showMessageDialog(this,"Debe llenar todos los campos \n","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
            nombrecha.requestFocus();
        }else{
            try{
                String estado="DISPONIBLE";
                conexion co=new conexion();
                con=co.getconexion();
                
                ps =con.prepareStatement("insert into CHAQUETA_REALIZADA(NOMBRE_CHAQUETA_REALIZADA,NOMBRE_ESTILO_PRODUCTO,VALOR_CHAQUETA_REALIZADA,ESTADO,GENERO,COLOR)VALUES(?,?,?,?,?,?)");
                ps.setString(1,nombrecha.getText());
                ps.setString(2,estilocha.getText());
                ps.setString(3,preciocha.getText());
                ps.setString(4,estado);
                ps.setString(5,generocha.getSelectedItem().toString());
                ps.setString(6,colorcha.getText());
            
                int res=ps.executeUpdate();
                if(res>0){
                    JOptionPane.showMessageDialog(null,"Registro gardado");
                }else{
                    JOptionPane.showMessageDialog(null,"Ocurrio un error");
                }
                con.close();
            }   catch (SQLException e) {
                Logger.getLogger(crudproductos.class.getName()).log(Level.SEVERE, null, e);
            }
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
        consulproductos cu=new consulproductos();
        cu.setVisible(true);
        dispose();
        if (tipousuario14.getText().equals("USUARIO")){
                cu.tipousuario3.setText("USUARIO");
        }
        if(tipousuario14.getText().equals("ADMINISTRADOR")){
                cu.tipousuario3.setText("ADMINISTRADOR");
        }
    }//GEN-LAST:event_consulActionPerformed

    private void lblcantMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcantMouseEntered
        lblcant.setForeground(Color.blue);
    }//GEN-LAST:event_lblcantMouseEntered

    private void lblcantMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcantMouseExited
        lblcant.setForeground(Color.black);
    }//GEN-LAST:event_lblcantMouseExited

    private void idchaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idchaKeyTyped
        char c= evt.getKeyChar();
        if (c<'0'||c>'9') evt.consume();
    }//GEN-LAST:event_idchaKeyTyped

    private void nombrechaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombrechaKeyTyped
        char c= evt.getKeyChar();
        if ((c<'a'||c>'z') &&(c<'A'||c>'Z') )evt.consume();
    }//GEN-LAST:event_nombrechaKeyTyped

    private void estilochaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_estilochaKeyTyped
        char c= evt.getKeyChar();
        if ((c<'a'||c>'z') &&(c<'A'||c>'Z')&&(c<'1'||c>'9'))evt.consume();
    }//GEN-LAST:event_estilochaKeyTyped

    private void preciochaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_preciochaKeyTyped
        char c= evt.getKeyChar();
        if (c<'0'||c>'9') evt.consume();
    }//GEN-LAST:event_preciochaKeyTyped

    private void colorchaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_colorchaKeyTyped
        char c= evt.getKeyChar();
        if ((c<'a'||c>'z') &&(c<'A'||c>'Z') )evt.consume();
    }//GEN-LAST:event_colorchaKeyTyped

    private void cantidaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidaKeyTyped
        char c= evt.getKeyChar();
        if (c<'0'||c>'9') evt.consume();
    }//GEN-LAST:event_cantidaKeyTyped

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
            java.util.logging.Logger.getLogger(crudproductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(crudproductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(crudproductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(crudproductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new crudproductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JTextField cantida;
    private javax.swing.JTextField colorcha;
    private javax.swing.JButton consul;
    private javax.swing.JButton editar;
    private javax.swing.JTextField estilocha;
    private javax.swing.JComboBox<String> generocha;
    private javax.swing.JTextField idcha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblcant;
    private javax.swing.JLabel lcolor;
    private javax.swing.JLabel lestilo;
    private javax.swing.JLabel lgenero;
    private javax.swing.JLabel lnom;
    private javax.swing.JLabel lprecio;
    private javax.swing.JTextField nombrecha;
    private javax.swing.JTextField preciocha;
    private javax.swing.JButton seleccionarregistro;
    private javax.swing.JLabel semititulo1;
    public javax.swing.JLabel tipousuario14;
    private javax.swing.JLabel titulo;
    private javax.swing.JButton usuario;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}