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

public class crudmateria extends javax.swing.JFrame {
Connection con = null;
Statement stmt = null;
PreparedStatement ps;
ResultSet rs;
private void limpiar(){
    txtid.setText("");
    txtnombre.setText("");
    txtcantidad.setText("");
    descripcion.setText("");
    txtprecio.setText("");
    proveedor.setText("");
}

    public crudmateria() {
        initComponents();
        this.setSize(1010, 800);//le damos un tamaño a nuestra pantalla
        this.setTitle("MATERIALES");//le damos un titulo en la parte superior izquierda
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
        semititulo2 = new javax.swing.JLabel();
        semititulo3 = new javax.swing.JLabel();
        semititulo4 = new javax.swing.JLabel();
        semititulo5 = new javax.swing.JLabel();
        bneliminar = new javax.swing.JButton();
        volver = new javax.swing.JButton();
        txtprecio = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtcantidad = new javax.swing.JTextField();
        editar = new javax.swing.JButton();
        descripcion = new javax.swing.JTextField();
        txtid = new javax.swing.JTextField();
        proveedor = new javax.swing.JTextField();
        sempro = new javax.swing.JLabel();
        btnguardar = new javax.swing.JButton();
        consul = new javax.swing.JButton();
        tipousuario12 = new javax.swing.JLabel();
        usuario = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        seleccionarregistro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        seleccionarregistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mke_matholy/img/buscar.jpg"))); // NOI18N
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
        seleccionarregistro.setBounds(400, 130, 65, 65);

        titulo.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        titulo.setForeground(new java.awt.Color(0, 102, 255));
        titulo.setText("Modulo de materia prima ");
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
        semititulo1.setText("*Id:");
        semititulo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                semititulo1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                semititulo1MouseExited(evt);
            }
        });
        getContentPane().add(semititulo1);
        semititulo1.setBounds(490, 160, 40, 20);

        semititulo2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        semititulo2.setText("*Nombre del material :");
        semititulo2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                semititulo2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                semititulo2MouseExited(evt);
            }
        });
        getContentPane().add(semititulo2);
        semititulo2.setBounds(390, 220, 170, 25);

        semititulo3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        semititulo3.setText("*Cantidad :");
        semititulo3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                semititulo3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                semititulo3MouseExited(evt);
            }
        });
        getContentPane().add(semititulo3);
        semititulo3.setBounds(390, 280, 100, 30);

        semititulo4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        semititulo4.setText("Descripción : ");
        semititulo4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                semititulo4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                semititulo4MouseExited(evt);
            }
        });
        getContentPane().add(semititulo4);
        semititulo4.setBounds(390, 340, 111, 26);

        semititulo5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        semititulo5.setText("*Precio :");
        semititulo5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                semititulo5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                semititulo5MouseExited(evt);
            }
        });
        getContentPane().add(semititulo5);
        semititulo5.setBounds(390, 410, 121, 26);

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
        bneliminar.setBounds(820, 430, 65, 65);

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
        volver.setBounds(820, 560, 65, 65);

        txtprecio.setBackground(new java.awt.Color(204, 204, 255));
        txtprecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtprecioKeyTyped(evt);
            }
        });
        getContentPane().add(txtprecio);
        txtprecio.setBounds(570, 410, 150, 29);

        txtnombre.setBackground(new java.awt.Color(204, 204, 255));
        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreKeyTyped(evt);
            }
        });
        getContentPane().add(txtnombre);
        txtnombre.setBounds(570, 220, 150, 30);

        txtcantidad.setBackground(new java.awt.Color(204, 204, 255));
        txtcantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcantidadKeyTyped(evt);
            }
        });
        getContentPane().add(txtcantidad);
        txtcantidad.setBounds(570, 280, 150, 30);

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
        editar.setBounds(820, 350, 65, 65);

        descripcion.setBackground(new java.awt.Color(204, 204, 255));
        getContentPane().add(descripcion);
        descripcion.setBounds(570, 340, 150, 30);

        txtid.setBackground(new java.awt.Color(204, 204, 255));
        txtid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtidKeyTyped(evt);
            }
        });
        getContentPane().add(txtid);
        txtid.setBounds(570, 160, 70, 30);

        proveedor.setBackground(new java.awt.Color(204, 204, 255));
        proveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                proveedorKeyTyped(evt);
            }
        });
        getContentPane().add(proveedor);
        proveedor.setBounds(570, 470, 150, 29);

        sempro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sempro.setText("Id proveedor : ");
        sempro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                semproMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                semproMouseExited(evt);
            }
        });
        getContentPane().add(sempro);
        sempro.setBounds(390, 470, 121, 26);

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
        btnguardar.setBounds(820, 190, 65, 65);

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
        consul.setBounds(820, 270, 65, 65);

        tipousuario12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(tipousuario12);
        tipousuario12.setBounds(30, 120, 150, 30);

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
        usuario.setBounds(70, 50, 65, 65);

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

    private void semititulo2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_semititulo2MouseEntered
        semititulo2.setForeground(Color.blue);//le damos color al texto
    }//GEN-LAST:event_semititulo2MouseEntered

    private void semititulo2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_semititulo2MouseExited
        semititulo2.setForeground(Color.black);//le damos color al texto
    }//GEN-LAST:event_semititulo2MouseExited

    private void semititulo3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_semititulo3MouseEntered
        semititulo3.setForeground(Color.blue);//le damos color al texto
    }//GEN-LAST:event_semititulo3MouseEntered

    private void semititulo3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_semititulo3MouseExited
        semititulo3.setForeground(Color.black);//le damos color al texto
    }//GEN-LAST:event_semititulo3MouseExited

    private void semititulo4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_semititulo4MouseEntered
        semititulo4.setForeground(Color.blue);//le damos color al texto
    }//GEN-LAST:event_semititulo4MouseEntered

    private void semititulo4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_semititulo4MouseExited
        semititulo4.setForeground(Color.black);//le damos color al texto
    }//GEN-LAST:event_semititulo4MouseExited

    private void semititulo5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_semititulo5MouseEntered
        semititulo5.setForeground(Color.blue);//le damos color al texto
    }//GEN-LAST:event_semititulo5MouseEntered

    private void semititulo5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_semititulo5MouseExited
        semititulo5.setForeground(Color.black);//le damos color al texto
    }//GEN-LAST:event_semititulo5MouseExited

    private void bneliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bneliminarMouseEntered
        bneliminar.setBackground(new java.awt.Color(153,153,255));//le damos color al texto del boton y al relleno
        bneliminar.setForeground(Color.red);
    }//GEN-LAST:event_bneliminarMouseEntered

    private void bneliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bneliminarMouseExited
        bneliminar.setBackground(new java.awt.Color(204,204,255));//le damos color al texto del boton y al relleno
        bneliminar.setForeground(Color.black);
    }//GEN-LAST:event_bneliminarMouseExited

    private void bneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bneliminarActionPerformed
    if (txtid.getText().equals("") || (txtnombre.getText().equals("")) || (txtcantidad.getText().equals("")) || (descripcion.getText().equals("")) || (txtprecio.getText().equals(""))|| (proveedor.getText().equals("")))
        {
         JOptionPane.showMessageDialog(null,"Debes consultar tu registro");       
        }else{
        
        try{
        conexion co=new conexion();
        con=co.getconexion();
        ps =con.prepareStatement("DELETE  from MATERIA_PRIMA where ID_MATERIAPRIMA =?");
        ps.setInt(1,Integer.parseInt(txtid.getText()));
        
        int res=ps.executeUpdate();
        if(res>0){
            JOptionPane.showMessageDialog(null,"Registro eliminado");
        }else{
            JOptionPane.showMessageDialog(null,"Ocurrio un error al eliminar");
        }
        con.close();
        }   catch (SQLException e) {
                Logger.getLogger(crudmateria.class.getName()).log(Level.SEVERE, null, e);
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
        opc m=new opc();//cuando de click en el boton de volver lo dirija a la pantalla de materia prima
        m.setVisible(true);
        dispose();
        if (tipousuario12.getText().equals("USUARIO")){
                m.tipousuario21.setText("USUARIO");
        }
        if(tipousuario12.getText().equals("ADMINISTRADOR")){
                m.tipousuario21.setText("ADMINISTRADOR");
        }
    }//GEN-LAST:event_volverActionPerformed

    private void seleccionarregistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionarregistroActionPerformed
      if (txtid.getText().equals(""))
        {
         JOptionPane.showMessageDialog(null,"Debes consultar tu registro");       
        }else{
        try{
        conexion co=new conexion();
        con=co.getconexion();
        ps =con.prepareStatement("select * from MATERIA_PRIMA where ID_MATERIAPRIMA =?");
        ps.setString(1,txtid.getText());
        
        rs= ps.executeQuery();
        if(rs.next()){
            txtid.setText(rs.getString("ID_MATERIAPRIMA"));
            txtnombre.setText(rs.getString("NOMBRE_PRODUCTO"));
            txtcantidad.setText(rs.getString("CANTIDAD"));
            descripcion.setText(rs.getString("DESCRIPCION_PRODUCTO"));
            txtprecio.setText(rs.getString("VALOR_PRODUCTO"));
            proveedor.setText(rs.getString("DOC_PROVEEDOR"));
            btnguardar.setVisible(false);
            
            if(tipousuario12.getText().equals("ADMINISTRADOR")){
            editar.setVisible(true);
            bneliminar.setVisible(true);
            
            }
        }else{
           JOptionPane.showMessageDialog(null,"No hay un registro con ese ID"); 
           limpiar();
        }
        } catch (SQLException ex) {
              Logger.getLogger(crudmateria.class.getName()).log(Level.SEVERE, null, ex);
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
            if (txtid.getText().equals("") || (txtnombre.getText().equals("")) || (txtcantidad.getText().equals("")) ||(descripcion.getText().equals(""))||(txtprecio.getText().equals(""))||(proveedor.getText().equals("")))
        {
            //si los campos estan vacion imprimira en pantalla lo siguiente 
            javax.swing.JOptionPane.showMessageDialog(this,"Debe llenar todos los campos \n","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
            txtnombre.requestFocus();
        }else{
        try{
        conexion co=new conexion();
        con=co.getconexion();
        ps =con.prepareStatement("update MATERIA_PRIMA set DESCRIPCION_PRODUCTO=?,NOMBRE_PRODUCTO=?,VALOR_PRODUCTO=?,CANTIDAD=?,DOC_PROVEEDOR=? where ID_MATERIAPRIMA =? ");
        ps.setString(1,descripcion.getText());
        ps.setString(2,txtnombre.getText());
        ps.setString(3,txtprecio.getText());
        ps.setString(4,txtcantidad.getText());
        ps.setString(5,proveedor.getText());
        ps.setString(6,txtid.getText());
        
        int res=ps.executeUpdate();
        if(res>0){
            JOptionPane.showMessageDialog(null,"Registro modificado");
        }else{
            JOptionPane.showMessageDialog(null,"Ocurrio un error al modificar");
        }
        con.close();
        }   catch (SQLException e) {
                Logger.getLogger(crudmateria.class.getName()).log(Level.SEVERE, null, e);
            }
            }
    limpiar();
    bneliminar.setVisible(false);
    editar.setVisible(false);
    }//GEN-LAST:event_editarActionPerformed

    private void semproMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_semproMouseEntered
        sempro.setForeground(Color.blue);//le damos color al texto
    }//GEN-LAST:event_semproMouseEntered

    private void semproMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_semproMouseExited
        sempro.setForeground(Color.black);//le damos color al texto
    }//GEN-LAST:event_semproMouseExited

    private void btnguardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnguardarMouseEntered
        btnguardar.setBackground(new java.awt.Color(153,153,255));//le damos color al texto del boton y al relleno
        btnguardar.setForeground(Color.red);
    }//GEN-LAST:event_btnguardarMouseEntered

    private void btnguardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnguardarMouseExited
        btnguardar.setBackground(new java.awt.Color(204,204,255));//le damos color al texto del boton y al relleno
        btnguardar.setForeground(Color.black);
    }//GEN-LAST:event_btnguardarMouseExited

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed

        if (txtnombre.getText().equals("") || (txtcantidad.getText().equals("")) || (txtprecio.getText().equals("")) ||(descripcion.getText().equals(""))|| (proveedor.getText().equals("")))
        {
            //si los campos estan vacion imprimira en pantalla lo siguiente
            javax.swing.JOptionPane.showMessageDialog(this,"Debe llenar todos los campos \n","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }else{
            try{
                 conexion co=new conexion();
                con=co.getconexion();
                ps =con.prepareStatement("select * from proveedor where DOC_PROVEEDOR = ? ");
                ps.setString(1,proveedor.getText());
                rs= ps.executeQuery();
                if(rs.next()){
                    
            try{
                con=co.getconexion();
                ps =con.prepareStatement("insert into MATERIA_PRIMA(DESCRIPCION_PRODUCTO,NOMBRE_PRODUCTO,VALOR_PRODUCTO,CANTIDAD,DOC_PROVEEDOR)VALUES(?,?,?,?,?)");
                ps.setString(1,descripcion.getText());
                ps.setString(2,txtnombre.getText());
                ps.setString(3,txtprecio.getText());
                ps.setString(4,txtcantidad.getText());
                ps.setString(5,proveedor.getText());

                int res=ps.executeUpdate();
                if(res>0){
                    JOptionPane.showMessageDialog(null,"Registro gardado");
                }else{
                    JOptionPane.showMessageDialog(null,"Ocurrio un error");
                }
                con.close();
            }   catch (SQLException e) {
                Logger.getLogger(crudmateria.class.getName()).log(Level.SEVERE, null, e);
            }
        }else{
             JOptionPane.showMessageDialog(null,"El proveedor no ha sido registrado");
            }
        } catch (SQLException e) {
                Logger.getLogger(crudventas.class.getName()).log(Level.SEVERE, null, e);
                JOptionPane.showMessageDialog(null,"Ocurrio un error al realizar el descuento");
        }
        limpiar();
        }
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
        consultar cu=new consultar();
        cu.setVisible(true);
        dispose();
        if (tipousuario12.getText().equals("USUARIO")){
                cu.tipousuario5.setText("USUARIO");
        }
        if(tipousuario12.getText().equals("ADMINISTRADOR")){
                cu.tipousuario5.setText("ADMINISTRADOR");
        }
    }//GEN-LAST:event_consulActionPerformed

    private void txtidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidKeyTyped
        char c= evt.getKeyChar();
        if (c<'0'||c>'9') evt.consume();
    }//GEN-LAST:event_txtidKeyTyped

    private void txtnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyTyped
        char c= evt.getKeyChar();
        if ((c<'a'||c>'z') &&(c<'A'||c>'Z') )evt.consume();
    }//GEN-LAST:event_txtnombreKeyTyped

    private void txtcantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcantidadKeyTyped
        char c= evt.getKeyChar();
        if (c<'0'||c>'9') evt.consume();
    }//GEN-LAST:event_txtcantidadKeyTyped

    private void txtprecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprecioKeyTyped
        char c= evt.getKeyChar();
        if (c<'0'||c>'9') evt.consume();
    }//GEN-LAST:event_txtprecioKeyTyped

    private void proveedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_proveedorKeyTyped
        char c= evt.getKeyChar();
        if (c<'0'||c>'9') evt.consume();
    }//GEN-LAST:event_proveedorKeyTyped

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
            java.util.logging.Logger.getLogger(crudmateria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(crudmateria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(crudmateria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(crudmateria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new crudmateria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton consul;
    private javax.swing.JTextField descripcion;
    private javax.swing.JButton editar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField proveedor;
    private javax.swing.JButton seleccionarregistro;
    private javax.swing.JLabel semititulo1;
    private javax.swing.JLabel semititulo2;
    private javax.swing.JLabel semititulo3;
    private javax.swing.JLabel semititulo4;
    private javax.swing.JLabel semititulo5;
    private javax.swing.JLabel sempro;
    public javax.swing.JLabel tipousuario12;
    private javax.swing.JLabel titulo;
    private javax.swing.JTextField txtcantidad;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtprecio;
    private javax.swing.JButton usuario;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}