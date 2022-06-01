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

public class crudpedidos extends javax.swing.JFrame {
Connection con = null;
Statement stmt = null;
PreparedStatement ps;
ResultSet rs;
ResultSet res;
private void limpiar(){
    idpedido.setText("");
    fechapedi.setText("");
    nombcha.setText("");
    cantida.setText("");
    nombcli.setText("");
    doccli.setText("");
    docemp.setText("");
}

    public crudpedidos() {
        initComponents();
        this.setSize(1010, 800);//le damos un tamaño a nuestra pantalla
        this.setTitle("PEDIDOS");//le damos un titulo en la parte superior izquierda
        this.setLocation(150,60);//le damos una localizacion para cuando salga en pantalla
        bneliminar.setVisible(false);
        editar.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        seleccionarregistro = new javax.swing.JButton();
        titulo = new javax.swing.JLabel();
        lblid = new javax.swing.JLabel();
        lblfe = new javax.swing.JLabel();
        lbldir = new javax.swing.JLabel();
        lbltip = new javax.swing.JLabel();
        lbltel = new javax.swing.JLabel();
        bneliminar = new javax.swing.JButton();
        volver = new javax.swing.JButton();
        fechapedi = new javax.swing.JTextField();
        cantida = new javax.swing.JTextField();
        editar = new javax.swing.JButton();
        nombcli = new javax.swing.JTextField();
        idpedido = new javax.swing.JTextField();
        doccli = new javax.swing.JTextField();
        lblcorr = new javax.swing.JLabel();
        btnguardar = new javax.swing.JButton();
        consul = new javax.swing.JButton();
        lblap = new javax.swing.JLabel();
        nombcha = new javax.swing.JTextField();
        docemp = new javax.swing.JTextField();
        tipousuario13 = new javax.swing.JLabel();
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
        seleccionarregistro.setBounds(230, 100, 65, 65);

        titulo.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        titulo.setForeground(new java.awt.Color(0, 102, 255));
        titulo.setText("Modulo de pedidos");
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

        lblid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblid.setText("Id pedido : ");
        lblid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblidMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblidMouseExited(evt);
            }
        });
        getContentPane().add(lblid);
        lblid.setBounds(310, 140, 80, 20);

        lblfe.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblfe.setText("*Fecha : año/mes/dia");
        lblfe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblfeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblfeMouseExited(evt);
            }
        });
        getContentPane().add(lblfe);
        lblfe.setBounds(250, 200, 160, 25);

        lbldir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbldir.setText("*N° chaquetas :");
        lbldir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbldirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbldirMouseExited(evt);
            }
        });
        getContentPane().add(lbldir);
        lbldir.setBounds(250, 350, 130, 30);

        lbltip.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbltip.setText("*Documento del empleado :");
        lbltip.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbltipMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbltipMouseExited(evt);
            }
        });
        getContentPane().add(lbltip);
        lbltip.setBounds(240, 620, 210, 26);

        lbltel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbltel.setText("*Nombre del  cliente :");
        lbltel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbltelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbltelMouseExited(evt);
            }
        });
        getContentPane().add(lbltel);
        lbltel.setBounds(250, 440, 170, 26);

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
        bneliminar.setBounds(660, 450, 65, 65);

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

        fechapedi.setBackground(new java.awt.Color(204, 204, 255));
        getContentPane().add(fechapedi);
        fechapedi.setBounds(450, 200, 150, 30);

        cantida.setBackground(new java.awt.Color(204, 204, 255));
        cantida.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cantidaKeyTyped(evt);
            }
        });
        getContentPane().add(cantida);
        cantida.setBounds(450, 350, 150, 30);

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
        editar.setBounds(660, 360, 65, 65);

        nombcli.setBackground(new java.awt.Color(204, 204, 255));
        nombcli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombcliKeyTyped(evt);
            }
        });
        getContentPane().add(nombcli);
        nombcli.setBounds(450, 440, 150, 30);

        idpedido.setBackground(new java.awt.Color(204, 204, 255));
        idpedido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                idpedidoKeyTyped(evt);
            }
        });
        getContentPane().add(idpedido);
        idpedido.setBounds(450, 130, 140, 30);

        doccli.setBackground(new java.awt.Color(204, 204, 255));
        doccli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                doccliKeyTyped(evt);
            }
        });
        getContentPane().add(doccli);
        doccli.setBounds(450, 530, 150, 29);

        lblcorr.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblcorr.setText("*Documento del cliente : ");
        lblcorr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblcorrMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblcorrMouseExited(evt);
            }
        });
        getContentPane().add(lblcorr);
        lblcorr.setBounds(250, 530, 190, 26);

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
        consul.setBounds(660, 280, 65, 65);

        lblap.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblap.setText("*Nombre chaqueta :");
        lblap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblapMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblapMouseExited(evt);
            }
        });
        getContentPane().add(lblap);
        lblap.setBounds(250, 280, 160, 25);

        nombcha.setBackground(new java.awt.Color(204, 204, 255));
        getContentPane().add(nombcha);
        nombcha.setBounds(450, 280, 150, 30);

        docemp.setBackground(new java.awt.Color(204, 204, 255));
        docemp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                docempKeyTyped(evt);
            }
        });
        getContentPane().add(docemp);
        docemp.setBounds(450, 620, 150, 29);

        tipousuario13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(tipousuario13);
        tipousuario13.setBounds(20, 100, 150, 30);

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

    private void lblidMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblidMouseEntered
        lblid.setForeground(Color.blue);//le damos color al texto
    }//GEN-LAST:event_lblidMouseEntered

    private void lblidMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblidMouseExited
        lblid.setForeground(Color.black);//le damos color al texto
    }//GEN-LAST:event_lblidMouseExited

    private void lblfeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblfeMouseEntered
        lblfe.setForeground(Color.blue);//le damos color al texto
    }//GEN-LAST:event_lblfeMouseEntered

    private void lblfeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblfeMouseExited
        lblfe.setForeground(Color.black);//le damos color al texto
    }//GEN-LAST:event_lblfeMouseExited

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
    if (idpedido.getText().equals("") || (fechapedi.getText().equals("")) || (cantida.getText().equals("")) || (nombcli.getText().equals("")) || (doccli.getText().equals(""))|| (docemp.getText().equals(""))|| (nombcha.getText().equals("")))
        {
         JOptionPane.showMessageDialog(null,"Debes consultar tu registro");       
        }else{
        
        try{
        conexion co=new conexion();
        con=co.getconexion();
        ps =con.prepareStatement("DELETE  from PEDIDO where ID_PEDIDO= ?");
        ps.setInt(1,Integer.parseInt(idpedido.getText()));
        
        int res=ps.executeUpdate();
        if(res>0){
            JOptionPane.showMessageDialog(null,"Registro eliminado");
        }else{
            JOptionPane.showMessageDialog(null,"Ocurrio un error al eliminar");
        }
        con.close();
        }   catch (SQLException e) {
                Logger.getLogger(crudpedidos.class.getName()).log(Level.SEVERE, null, e);
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
        menupedidos pa=new menupedidos();
        pa.setVisible(true);
        dispose();
        if (tipousuario13.getText().equals("USUARIO")){
                pa.tipousuario18.setText("USUARIO");
        }
        if(tipousuario13.getText().equals("ADMINISTRADOR")){
                pa.tipousuario18.setText("ADMINISTRADOR");
        }
    }//GEN-LAST:event_volverActionPerformed

    private void seleccionarregistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionarregistroActionPerformed
      if (idpedido.getText().equals(""))
        {
         JOptionPane.showMessageDialog(null,"Debes consultar tu registro");       
        }else{
        try{
        conexion co=new conexion();
        con=co.getconexion();
        ps =con.prepareStatement("select * from PEDIDO where ID_PEDIDO = ?");
        ps.setString(1,idpedido.getText());
        
        rs= ps.executeQuery();
        if(tipousuario13.getText().equals("ADMINISTRADOR")){
        if(rs.next()){
            idpedido.setText(rs.getString("ID_PEDIDO"));
            fechapedi.setText(rs.getString("FECHA"));
            nombcha.setText(rs.getString("NOMBRE_CHA"));
            cantida.setText(rs.getString("CANTIDAD"));
            nombcli.setText(rs.getString("NOMBRE_CLIENTE"));
            doccli.setText(rs.getString("DOC_CLIENTE"));
            docemp.setText(rs.getString("DOC_EMPLEADO"));
            bneliminar.setVisible(true);
            editar.setVisible(true);
            btnguardar.setVisible(false);
        }else{
           JOptionPane.showMessageDialog(null,"No hay un registro con ese Id"); 
           limpiar();
        }}else{
            if(rs.next()){
            idpedido.setText(rs.getString("ID_PEDIDO"));
            fechapedi.setText(rs.getString("FECHA"));
            nombcha.setText(rs.getString("NOMBRE_CHA"));
            cantida.setText(rs.getString("CANTIDAD"));
            nombcli.setText(rs.getString("NOMBRE_CLIENTE"));
            doccli.setText(rs.getString("DOC_CLIENTE"));
            docemp.setText(rs.getString("DOC_EMPLEADO"));
            btnguardar.setVisible(false);
        }else{
           JOptionPane.showMessageDialog(null,"No hay un registro con ese Id"); 
           limpiar();
        }
        }
        } catch (SQLException ex) {
              Logger.getLogger(crudpedidos.class.getName()).log(Level.SEVERE, null, ex);
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
            if (idpedido.getText().equals("") || (fechapedi.getText().equals("")) || (nombcha.getText().equals(""))|| (cantida.getText().equals("")) ||(nombcli.getText().equals(""))||(doccli.getText().equals(""))||(docemp.getText().equals("")))
        {
            //si los campos estan vacion imprimira en pantalla lo siguiente 
            javax.swing.JOptionPane.showMessageDialog(this,"Debe llenar todos los campos \n","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
            fechapedi.requestFocus();
        }else{
        try{
        conexion co=new conexion();
        con=co.getconexion();
        ps =con.prepareStatement("update PEDIDO set FECHA=?,NOMBRE_CHA=?,CANTIDAD=?,NOMBRE_CLIENTE=?,DOC_CLIENTE=?,DOC_EMPLEADO=? where ID_PEDIDO =? ");
        ps.setString(1,fechapedi.getText());
        ps.setString(2,nombcha.getText());
        ps.setString(3,cantida.getText());
        ps.setString(4,nombcli.getText());
        ps.setString(5,doccli.getText());
        ps.setString(6,docemp.getText());
        ps.setString(7,idpedido.getText());
        
        int res=ps.executeUpdate();
        if(res>0){
            JOptionPane.showMessageDialog(null,"Registro modificado");
        }else{
            JOptionPane.showMessageDialog(null,"Ocurrio un error al modificar");
        }
        con.close();
        }   catch (SQLException e) {
                Logger.getLogger(crudpedidos.class.getName()).log(Level.SEVERE, null, e);
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

        if (fechapedi.getText().equals("") || (cantida.getText().equals(""))  ||(nombcli.getText().equals(""))|| (doccli.getText().equals(""))||(nombcha.getText().equals(""))||(docemp.getText().equals("")))
        {
            //si los campos estan vacion imprimira en pantalla lo siguiente
            javax.swing.JOptionPane.showMessageDialog(this,"Debe llenar todos los campos \n","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
            fechapedi.requestFocus();
        }else{
            try{
                 conexion co=new conexion();
                con=co.getconexion();
                ps =con.prepareStatement("select * from cliente where DOC_CLIENTE = ? ");
                ps.setString(1,doccli.getText());
                rs= ps.executeQuery();
                if(rs.next()){
                    con=co.getconexion();
                    ps =con.prepareStatement("select * from EMPLEADO where DOC_EMPLEADO = ? ");
                    ps.setString(1,docemp.getText());
                    res= ps.executeQuery();
                    
                    if (res.next()){
        
            try{
                con=co.getconexion();
                ps =con.prepareStatement("insert into PEDIDO(FECHA,NOMBRE_CHA,CANTIDAD,NOMBRE_CLIENTE,DOC_CLIENTE,DOC_EMPLEADO)VALUES(?,?,?,?,?,?)");
                ps.setString(1,fechapedi.getText());
                ps.setString(2,nombcha.getText());
                ps.setString(3,cantida.getText());
                ps.setString(4,nombcli.getText());
                ps.setString(5,doccli.getText());
                ps.setString(6,docemp.getText());
                

                int res=ps.executeUpdate();
                if(res>0){
                    JOptionPane.showMessageDialog(null,"Registro gardado");
                }else{
                    JOptionPane.showMessageDialog(null,"Ocurrio un error");
                }
                con.close();
            }   catch (SQLException e) {
                Logger.getLogger(crudpedidos.class.getName()).log(Level.SEVERE, null, e);
            }
            }else{
                        JOptionPane.showMessageDialog(null,"El empleado NO existe");
                    }
                }else{
                    JOptionPane.showMessageDialog(null,"El cliente NO existe");
                }
            }catch (SQLException e) {
                Logger.getLogger(crudventas.class.getName()).log(Level.SEVERE, null, e);
                JOptionPane.showMessageDialog(null,"valida los datos");
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
        consultaspedidos cu=new consultaspedidos();
        cu.setVisible(true);
        dispose();
    if (tipousuario13.getText().equals("USUARIO")){
                cu.tipousuario7.setText("USUARIO");
        }
        if(tipousuario13.getText().equals("ADMINISTRADOR")){
                cu.tipousuario7.setText("ADMINISTRADOR");
        }
    }//GEN-LAST:event_consulActionPerformed

    private void lblapMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblapMouseEntered
        lblap.setForeground(Color.blue);
    }//GEN-LAST:event_lblapMouseEntered

    private void lblapMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblapMouseExited
        lblap.setForeground(Color.black);
    }//GEN-LAST:event_lblapMouseExited

    private void idpedidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idpedidoKeyTyped
        char c= evt.getKeyChar();
        if (c<'0'||c>'9') evt.consume();
    }//GEN-LAST:event_idpedidoKeyTyped

    private void cantidaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidaKeyTyped
        char c= evt.getKeyChar();
        if (c<'0'||c>'9') evt.consume();
    }//GEN-LAST:event_cantidaKeyTyped

    private void nombcliKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombcliKeyTyped
        char c= evt.getKeyChar();
        if ((c<'a'||c>'z') &&(c<'A'||c>'Z') )evt.consume();
    }//GEN-LAST:event_nombcliKeyTyped

    private void doccliKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_doccliKeyTyped
        char c= evt.getKeyChar();
        if (c<'0'||c>'9') evt.consume();
    }//GEN-LAST:event_doccliKeyTyped

    private void docempKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_docempKeyTyped
        char c= evt.getKeyChar();
        if (c<'0'||c>'9') evt.consume();
    }//GEN-LAST:event_docempKeyTyped

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
            java.util.logging.Logger.getLogger(crudpedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(crudpedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(crudpedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(crudpedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new crudpedidos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JTextField cantida;
    private javax.swing.JButton consul;
    private javax.swing.JTextField doccli;
    private javax.swing.JTextField docemp;
    private javax.swing.JButton editar;
    private javax.swing.JTextField fechapedi;
    private javax.swing.JTextField idpedido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblap;
    private javax.swing.JLabel lblcorr;
    private javax.swing.JLabel lbldir;
    private javax.swing.JLabel lblfe;
    private javax.swing.JLabel lblid;
    private javax.swing.JLabel lbltel;
    private javax.swing.JLabel lbltip;
    private javax.swing.JTextField nombcha;
    private javax.swing.JTextField nombcli;
    private javax.swing.JButton seleccionarregistro;
    public javax.swing.JLabel tipousuario13;
    private javax.swing.JLabel titulo;
    private javax.swing.JButton usuario;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}