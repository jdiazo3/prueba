
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

public class crudventas extends javax.swing.JFrame {
Connection con = null;
Statement stmt = null;
PreparedStatement ps;
ResultSet rs;
ResultSet res;
private void limpiar(){
    idfactura.setText("");
    fechafac.setText("");
    nombcha.setText("");
    cantida.setText("");
    descu.setText("");
    doccli.setText("");
    docemp.setText("");
    color.setText("");
    total.setText("");
    totalsini.setText("");
    ivaa.setText("");
}

    public crudventas() {
        initComponents();
        this.setSize(1010, 800);//le damos un tamaño a nuestra pantalla
        this.setTitle("VENTAS");//le damos un titulo en la parte superior izquierda
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
        fechafac = new javax.swing.JTextField();
        cantida = new javax.swing.JTextField();
        editar = new javax.swing.JButton();
        descu = new javax.swing.JTextField();
        idfactura = new javax.swing.JTextField();
        doccli = new javax.swing.JTextField();
        lblcorr = new javax.swing.JLabel();
        btnguardar = new javax.swing.JButton();
        consul = new javax.swing.JButton();
        lblap = new javax.swing.JLabel();
        nombcha = new javax.swing.JTextField();
        docemp = new javax.swing.JTextField();
        total = new javax.swing.JTextField();
        lbltotalapagar = new javax.swing.JLabel();
        color = new javax.swing.JTextField();
        lblcolor = new javax.swing.JLabel();
        tipousuario16 = new javax.swing.JLabel();
        lbltotal1 = new javax.swing.JLabel();
        totalsini = new javax.swing.JTextField();
        lbliva = new javax.swing.JLabel();
        ivaa = new javax.swing.JTextField();
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
        seleccionarregistro.setBounds(180, 90, 65, 65);

        titulo.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        titulo.setForeground(new java.awt.Color(0, 102, 255));
        titulo.setText("Modulo de ventas");
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
        lblid.setText("Id factura : ");
        lblid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblidMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblidMouseExited(evt);
            }
        });
        getContentPane().add(lblid);
        lblid.setBounds(260, 130, 90, 20);

        lblfe.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblfe.setText("*Fecha : año/mes/dia ");
        lblfe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblfeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblfeMouseExited(evt);
            }
        });
        getContentPane().add(lblfe);
        lblfe.setBounds(180, 180, 170, 25);

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
        lbldir.setBounds(170, 290, 160, 30);

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
        lbltip.setBounds(160, 650, 210, 26);

        lbltel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbltel.setText("*Descuento : ");
        lbltel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbltelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbltelMouseExited(evt);
            }
        });
        getContentPane().add(lbltel);
        lbltel.setBounds(170, 400, 121, 26);

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
        bneliminar.setBounds(670, 390, 65, 65);

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
        volver.setBounds(670, 600, 65, 65);

        fechafac.setBackground(new java.awt.Color(204, 204, 255));
        getContentPane().add(fechafac);
        fechafac.setBounds(370, 180, 150, 30);

        cantida.setBackground(new java.awt.Color(204, 204, 255));
        cantida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cantidaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cantidaMouseEntered(evt);
            }
        });
        cantida.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cantidaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cantidaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cantidaKeyTyped(evt);
            }
        });
        getContentPane().add(cantida);
        cantida.setBounds(370, 290, 150, 30);

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
        editar.setBounds(670, 310, 65, 65);

        descu.setBackground(new java.awt.Color(204, 204, 255));
        descu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                descuKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                descuKeyTyped(evt);
            }
        });
        getContentPane().add(descu);
        descu.setBounds(370, 400, 150, 30);

        idfactura.setBackground(new java.awt.Color(204, 204, 255));
        idfactura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                idfacturaKeyTyped(evt);
            }
        });
        getContentPane().add(idfactura);
        idfactura.setBounds(370, 120, 140, 30);

        doccli.setBackground(new java.awt.Color(204, 204, 255));
        doccli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                doccliKeyTyped(evt);
            }
        });
        getContentPane().add(doccli);
        doccli.setBounds(370, 600, 150, 29);

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
        lblcorr.setBounds(170, 600, 180, 26);

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
        btnguardar.setBounds(670, 150, 65, 65);

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
        consul.setBounds(670, 230, 65, 65);

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
        lblap.setBounds(170, 230, 160, 25);

        nombcha.setBackground(new java.awt.Color(204, 204, 255));
        nombcha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nombchaMouseEntered(evt);
            }
        });
        nombcha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nombchaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombchaKeyTyped(evt);
            }
        });
        getContentPane().add(nombcha);
        nombcha.setBounds(370, 230, 150, 30);

        docemp.setBackground(new java.awt.Color(204, 204, 255));
        docemp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                docempKeyTyped(evt);
            }
        });
        getContentPane().add(docemp);
        docemp.setBounds(370, 650, 150, 29);

        total.setBackground(new java.awt.Color(204, 204, 255));
        total.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                totalKeyTyped(evt);
            }
        });
        getContentPane().add(total);
        total.setBounds(370, 550, 150, 30);

        lbltotalapagar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbltotalapagar.setText("Total sin iva : ");
        lbltotalapagar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbltotalapagarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbltotalapagarMouseExited(evt);
            }
        });
        getContentPane().add(lbltotalapagar);
        lbltotalapagar.setBounds(170, 450, 121, 26);

        color.setBackground(new java.awt.Color(204, 204, 255));
        color.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                colorKeyTyped(evt);
            }
        });
        getContentPane().add(color);
        color.setBounds(370, 350, 150, 30);

        lblcolor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblcolor.setText("*Color : ");
        lblcolor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblcolorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblcolorMouseExited(evt);
            }
        });
        getContentPane().add(lblcolor);
        lblcolor.setBounds(170, 350, 100, 30);

        tipousuario16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(tipousuario16);
        tipousuario16.setBounds(20, 100, 140, 30);

        lbltotal1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbltotal1.setText("Total a pagar : ");
        lbltotal1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbltotal1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbltotal1MouseExited(evt);
            }
        });
        getContentPane().add(lbltotal1);
        lbltotal1.setBounds(170, 550, 121, 26);

        totalsini.setBackground(new java.awt.Color(204, 204, 255));
        totalsini.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                totalsiniKeyTyped(evt);
            }
        });
        getContentPane().add(totalsini);
        totalsini.setBounds(370, 450, 150, 30);

        lbliva.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbliva.setText(" IVA : ");
        lbliva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblivaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblivaMouseExited(evt);
            }
        });
        getContentPane().add(lbliva);
        lbliva.setBounds(170, 500, 121, 26);

        ivaa.setBackground(new java.awt.Color(204, 204, 255));
        ivaa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ivaaKeyTyped(evt);
            }
        });
        getContentPane().add(ivaa);
        ivaa.setBounds(370, 500, 150, 30);

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
    if (idfactura.getText().equals("") || (fechafac.getText().equals("")) || (cantida.getText().equals("")) || (descu.getText().equals("")) || (doccli.getText().equals("")))
        {
         JOptionPane.showMessageDialog(null,"Debes consultar tu registro");       
        }else{
        
        try{
        conexion co=new conexion();
        con=co.getconexion();
        ps =con.prepareStatement("DELETE  from FACTURA where ID_FACTURA = ?");
        ps.setInt(1,Integer.parseInt(idfactura.getText()));
        
        int res=ps.executeUpdate();
        if(res>0){
            JOptionPane.showMessageDialog(null,"Registro eliminado");
        }else{
            JOptionPane.showMessageDialog(null,"Ocurrio un error al eliminar");
        }
        con.close();
        }   catch (SQLException e) {
                Logger.getLogger(crudventas.class.getName()).log(Level.SEVERE, null, e);
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
        menuventas1 pa=new menuventas1();
        pa.setVisible(true);
        dispose();
        if (tipousuario16.getText().equals("USUARIO")){
                pa.tipousuario20.setText("USUARIO");
        }
        if(tipousuario16.getText().equals("ADMINISTRADOR")){
                pa.tipousuario20.setText("ADMINISTRADOR");
        }
    }//GEN-LAST:event_volverActionPerformed

    private void seleccionarregistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionarregistroActionPerformed
      
        if (idfactura.getText().equals(""))
        {
         JOptionPane.showMessageDialog(null,"Debes consultar tu registro");       
        }else{
        try{
        conexion co=new conexion();
        con=co.getconexion();
        ps =con.prepareStatement("select * from FACTURA where ID_FACTURA = ?");
        ps.setString(1,idfactura.getText());
        
        rs= ps.executeQuery();
        if(tipousuario16.getText().equals("ADMINISTRADOR")){
        if(rs.next()){
            idfactura.setText(rs.getString("ID_FACTURA"));
            fechafac.setText(rs.getString("FECHA"));
            nombcha.setText(rs.getString("CHAQUETA"));
            cantida.setText(rs.getString("NUMERO_CHAQUETAS"));
            descu.setText(rs.getString("DESCUENTO"));
            doccli.setText(rs.getString("DOC_CLIENTE"));
            docemp.setText(rs.getString("DOC_EMPLEADO"));
            color.setText(rs.getString("COLOR_CHA"));
            total.setText(rs.getString("TOTALAPAGAR"));
            bneliminar.setVisible(true);
            editar.setVisible(true);
            btnguardar.setVisible(false);
        }else{
           JOptionPane.showMessageDialog(null,"No hay un registro con ese ID"); 
           limpiar();
        }}else{
            if(rs.next()){
            idfactura.setText(rs.getString("ID_FACTURA"));
            fechafac.setText(rs.getString("FECHA"));
            nombcha.setText(rs.getString("CHAQUETA"));
            cantida.setText(rs.getString("NUMERO_CHAQUETAS"));
            descu.setText(rs.getString("DESCUENTO"));
            doccli.setText(rs.getString("DOC_CLIENTE"));
            docemp.setText(rs.getString("DOC_EMPLEADO"));
            color.setText(rs.getString("COLOR_CHA"));
            total.setText(rs.getString("TOTALAPAGAR"));
            btnguardar.setVisible(false);
        }else{
           JOptionPane.showMessageDialog(null,"No hay un registro con ese ID"); 
           limpiar();
        }
        }
        } catch (SQLException ex) {
              Logger.getLogger(crudventas.class.getName()).log(Level.SEVERE, null, ex);
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
            if (idfactura.getText().equals("") || (fechafac.getText().equals("")) || (nombcha.getText().equals(""))|| (cantida.getText().equals("")) ||(descu.getText().equals(""))||(doccli.getText().equals(""))||(docemp.getText().equals("")))
        {
            //si los campos estan vacion imprimira en pantalla lo siguiente 
            javax.swing.JOptionPane.showMessageDialog(this,"Debe llenar todos los campos \n","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
            fechafac.requestFocus();
        }else{
        try{
        conexion co=new conexion();
        con=co.getconexion();
        ps =con.prepareStatement("update FACTURA set FECHA=?,CHAQUETA=?,NUMERO_CHAQUETAS=?,COLOR_CHA=?,DESCUENTO=?,TOTALAPAGAR=?,DOC_CLIENTE=?,DOC_EMPLEADO=? where ID_FACTURA =? ");
        ps.setString(1,fechafac.getText());
        ps.setString(2,nombcha.getText());
        ps.setString(3,cantida.getText());
        ps.setString(4,color.getText());
        ps.setString(5,descu.getText());
        ps.setString(6,total.getText());
        ps.setString(7,doccli.getText());
        ps.setString(8,docemp.getText());
        ps.setString(9,idfactura.getText());
        
        int res=ps.executeUpdate();
        if(res>0){
            JOptionPane.showMessageDialog(null,"Registro modificado");
        }else{
            JOptionPane.showMessageDialog(null,"Ocurrio un error al modificar");
        }
        con.close();
        }   catch (SQLException e) {
                Logger.getLogger(crudventas.class.getName()).log(Level.SEVERE, null, e);
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

        if (fechafac.getText().equals("") || (cantida.getText().equals(""))  ||(descu.getText().equals(""))|| (doccli.getText().equals(""))||(nombcha.getText().equals(""))||(docemp.getText().equals(""))||(total.getText().equals("")))
        {
            //si los campos estan vacion imprimira en pantalla lo siguiente
            javax.swing.JOptionPane.showMessageDialog(this,"Debe llenar todos los campos \n","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
            fechafac.requestFocus();
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
                            ps =con.prepareStatement("insert into FACTURA(FECHA,CHAQUETA,NUMERO_CHAQUETAS,COLOR_CHA,DESCUENTO,TOTALAPAGAR,DOC_CLIENTE,DOC_EMPLEADO,TOTAL,IVA)VALUES(?,?,?,?,?,?,?,?,?,?)");
                            ps.setString(1,fechafac.getText());
                            ps.setString(2,nombcha.getText());
                            ps.setString(3,cantida.getText());
                            ps.setString(4,color.getText());
                            ps.setString(5,descu.getText());
                            ps.setString(6,total.getText());
                            ps.setString(7,doccli.getText());
                            ps.setString(8,docemp.getText());
                            ps.setString(9,totalsini.getText());
                            ps.setString(10,ivaa.getText());
                
                            int res=ps.executeUpdate();
                                if(res>0){
                                    JOptionPane.showMessageDialog(null,"Registro gardado");
                                    try{
                                        String estado="VENDIDO";
                                        con=co.getconexion();
                                        ps =con.prepareStatement("update CHAQUETA_REALIZADA set ESTADO=? where NOMBRE_CHAQUETA_REALIZADA=? AND ESTADO='DISPONIBLE' AND COLOR =? limit ? ;");
                                        ps.setString(1,estado);
                                        ps.setString(2,nombcha.getText());
                                        ps.setString(3,color.getText());
                                        ps.setInt(4,Integer.parseInt(cantida.getText()));
                                        int rees=ps.executeUpdate();
                                    if(rees>0){
                                        JOptionPane.showMessageDialog(null,"Descuento realizado");
                                    }else{
                                        JOptionPane.showMessageDialog(null,"Ocurrio un error al realizar el descuento");
                                    }
                                    } catch (SQLException e) {
                                        Logger.getLogger(crudventas.class.getName()).log(Level.SEVERE, null, e);
                                        JOptionPane.showMessageDialog(null,"Ocurrio un error al realizar el descuento");
                                    }
                                }else{
                                       JOptionPane.showMessageDialog(null,"Ocurrio un error");
                                }
                
                        }catch (SQLException e) {
                            Logger.getLogger(crudventas.class.getName()).log(Level.SEVERE, null, e);
                            JOptionPane.showMessageDialog(null,"Ocurrio un error al realizar la factura");
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
              try {
        con.close();
    } catch (SQLException ex) {
        Logger.getLogger(crudventas.class.getName()).log(Level.SEVERE, null, ex);
    }
              
        limpiar();}
        
        
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
        consultasventas cu=new consultasventas();
        cu.setVisible(true);
        dispose();
        if (tipousuario16.getText().equals("USUARIO")){
                cu.tipousuario8.setText("USUARIO");
        }
        if(tipousuario16.getText().equals("ADMINISTRADOR")){
                cu.tipousuario8.setText("ADMINISTRADOR");
        }
    }//GEN-LAST:event_consulActionPerformed

    private void lblapMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblapMouseEntered
        lblap.setForeground(Color.blue);
    }//GEN-LAST:event_lblapMouseEntered

    private void lblapMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblapMouseExited
        lblap.setForeground(Color.black);
    }//GEN-LAST:event_lblapMouseExited

    private void lbltotalapagarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbltotalapagarMouseEntered
        lbltotalapagar.setForeground(Color.blue);
    }//GEN-LAST:event_lbltotalapagarMouseEntered

    private void lbltotalapagarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbltotalapagarMouseExited
        lbltotalapagar.setForeground(Color.black);
    }//GEN-LAST:event_lbltotalapagarMouseExited

    private void lblcolorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcolorMouseEntered
        lblcolor.setForeground(Color.blue);
    }//GEN-LAST:event_lblcolorMouseEntered

    private void lblcolorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcolorMouseExited
        lblcolor.setForeground(Color.black);
    }//GEN-LAST:event_lblcolorMouseExited

    private void nombchaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombchaKeyReleased

    
    }//GEN-LAST:event_nombchaKeyReleased

    private void cantidaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidaKeyReleased
    
    }//GEN-LAST:event_cantidaKeyReleased

    private void cantidaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidaKeyPressed
 
    }//GEN-LAST:event_cantidaKeyPressed

    private void nombchaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombchaMouseEntered

    }//GEN-LAST:event_nombchaMouseEntered

    private void cantidaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cantidaMouseEntered

    }//GEN-LAST:event_cantidaMouseEntered

    private void cantidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cantidaMouseClicked

    }//GEN-LAST:event_cantidaMouseClicked

    private void idfacturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idfacturaKeyTyped
        char c= evt.getKeyChar();
        if (c<'0'||c>'9') evt.consume();
    }//GEN-LAST:event_idfacturaKeyTyped

    private void nombchaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombchaKeyTyped
        char c= evt.getKeyChar();
        if ((c<'a'||c>'z') &&(c<'A'||c>'Z') )evt.consume();
    }//GEN-LAST:event_nombchaKeyTyped

    private void cantidaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidaKeyTyped
        char c= evt.getKeyChar();
        if (c<'0'||c>'9') evt.consume();
    }//GEN-LAST:event_cantidaKeyTyped

    private void colorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_colorKeyTyped
        char c= evt.getKeyChar();
        if ((c<'a'||c>'z') &&(c<'A'||c>'Z') )evt.consume();
    }//GEN-LAST:event_colorKeyTyped

    private void descuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_descuKeyTyped
        char c= evt.getKeyChar();
        if (c<'0'||c>'9') evt.consume();
    }//GEN-LAST:event_descuKeyTyped

    private void totalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_totalKeyTyped
        char c= evt.getKeyChar();
        if (c<'0'||c>'9') evt.consume();
    }//GEN-LAST:event_totalKeyTyped

    private void doccliKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_doccliKeyTyped
        char c= evt.getKeyChar();
        if (c<'0'||c>'9') evt.consume();
    }//GEN-LAST:event_doccliKeyTyped

    private void docempKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_docempKeyTyped
        char c= evt.getKeyChar();
        if (c<'0'||c>'9') evt.consume();
    }//GEN-LAST:event_docempKeyTyped

    private void descuKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_descuKeyReleased
       try {
        PreparedStatement ps= null;
        ResultSet rs= null;
        conexion conn = new conexion();
        Connection con= conn.getconexion();
        Statement stmt = null;
        String noo = nombcha.getText();
        String moo = color.getText();
        String sql ="select VALOR_CHAQUETA_REALIZADA from chaqueta_realizada WHERE NOMBRE_CHAQUETA_REALIZADA like '"+noo+"' and COLOR LIKE '"+moo+"';";
        ps=con.prepareStatement(sql);
        rs=ps.executeQuery();
        if(rs.next()){
            String resp=(rs.getString("VALOR_CHAQUETA_REALIZADA"));
            int rre;
            rre=Integer.parseInt(resp);
            int mul;
     int num1,num2,num3,iva;
     num2=Integer.parseInt(cantida.getText());
     num3=Integer.parseInt(descu.getText());
     num1=(rre*num2);
     iva=   (int) (num1*0.19);
     mul= (int) (num1+(num1*0.19)-(((num1+(num1*0.19))*num3)/100));
     ivaa.setText(String.valueOf(iva));
     total.setText(String.valueOf(mul));
     totalsini.setText(String.valueOf(num1));
        }
    } catch (SQLException ex) {
        Logger.getLogger(crudventas.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_descuKeyReleased

    private void lbltotal1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbltotal1MouseEntered
        lbltotal1.setForeground(Color.blue);
    }//GEN-LAST:event_lbltotal1MouseEntered

    private void lbltotal1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbltotal1MouseExited
        lbltotal1.setForeground(Color.black);
    }//GEN-LAST:event_lbltotal1MouseExited

    private void totalsiniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_totalsiniKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_totalsiniKeyTyped

    private void lblivaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblivaMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblivaMouseEntered

    private void lblivaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblivaMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lblivaMouseExited

    private void ivaaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ivaaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_ivaaKeyTyped

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
            java.util.logging.Logger.getLogger(crudventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(crudventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(crudventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(crudventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new crudventas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JTextField cantida;
    private javax.swing.JTextField color;
    private javax.swing.JButton consul;
    private javax.swing.JTextField descu;
    private javax.swing.JTextField doccli;
    private javax.swing.JTextField docemp;
    private javax.swing.JButton editar;
    private javax.swing.JTextField fechafac;
    private javax.swing.JTextField idfactura;
    private javax.swing.JTextField ivaa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblap;
    private javax.swing.JLabel lblcolor;
    private javax.swing.JLabel lblcorr;
    private javax.swing.JLabel lbldir;
    private javax.swing.JLabel lblfe;
    private javax.swing.JLabel lblid;
    private javax.swing.JLabel lbliva;
    private javax.swing.JLabel lbltel;
    private javax.swing.JLabel lbltip;
    private javax.swing.JLabel lbltotal1;
    private javax.swing.JLabel lbltotalapagar;
    private javax.swing.JTextField nombcha;
    private javax.swing.JButton seleccionarregistro;
    public javax.swing.JLabel tipousuario16;
    private javax.swing.JLabel titulo;
    private javax.swing.JTextField total;
    private javax.swing.JTextField totalsini;
    private javax.swing.JButton usuario;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}