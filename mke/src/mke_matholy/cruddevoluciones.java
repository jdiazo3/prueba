package mke_matholy;//paquete donde se encuentra nuestro documento
import java.awt.Color;//libreria para el color en el diseño 
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;//libreria para imprimir en pantalla



 // @author Juan david diaz ovalle
 
public class cruddevoluciones extends javax.swing.JFrame {//clase donde realizaremos todo el codigo
private void limpiar(){
                iddevo.setText("");
                nomcli.setText("");
                idfac.setText("");
                nombrecha.setText("");
                colorcha.setText("");
                cantidad.setText("");
                
            }
    public cruddevoluciones() {//hacemos publica nuestra clase para nombras componentes 
        initComponents();

               this.setSize(1010, 800);//le damos un tamaño a nuestra pantalla
               this.setTitle("DEVOLUCIONES");//le damos un titulo en la parte superior izquierda
               this.setLocation(150,60);//le damos una localizacion para cuando salga en pantalla
               bneliminar.setVisible(false);
               
    }
    
    
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        lbldoccli = new javax.swing.JLabel();
        lblidfac = new javax.swing.JLabel();
        nomcli = new javax.swing.JTextField();
        btnguardar = new javax.swing.JButton();
        consul = new javax.swing.JButton();
        bneliminar = new javax.swing.JButton();
        volver = new javax.swing.JButton();
        seleccionarregistro = new javax.swing.JButton();
        iddevo = new javax.swing.JTextField();
        lblidd = new javax.swing.JLabel();
        lblnombrecha = new javax.swing.JLabel();
        lblcolorcha = new javax.swing.JLabel();
        lblcantidad = new javax.swing.JLabel();
        idfac = new javax.swing.JTextField();
        nombrecha = new javax.swing.JTextField();
        colorcha = new javax.swing.JTextField();
        cantidad = new javax.swing.JTextField();
        tipousuario10 = new javax.swing.JLabel();
        usuario = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        titulo.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        titulo.setForeground(new java.awt.Color(102, 102, 255));
        titulo.setText("Modulo devoluciones");
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
        titulo.setBounds(350, 40, 450, 60);

        lbldoccli.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbldoccli.setText("*Nombre del cliente : ");
        lbldoccli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbldoccliMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbldoccliMouseExited(evt);
            }
        });
        getContentPane().add(lbldoccli);
        lbldoccli.setBounds(250, 200, 150, 30);

        lblidfac.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblidfac.setText("*Id de la factura : ");
        lblidfac.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblidfacMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblidfacMouseExited(evt);
            }
        });
        getContentPane().add(lblidfac);
        lblidfac.setBounds(240, 280, 140, 30);

        nomcli.setBackground(new java.awt.Color(204, 204, 255));
        nomcli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nomcliKeyTyped(evt);
            }
        });
        getContentPane().add(nomcli);
        nomcli.setBounds(510, 200, 190, 30);

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
        btnguardar.setBounds(810, 180, 65, 65);

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
        consul.setBounds(810, 350, 65, 65);

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
        bneliminar.setBounds(810, 260, 65, 65);

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
        volver.setBounds(810, 490, 65, 65);

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
        seleccionarregistro.setBounds(370, 120, 65, 65);

        iddevo.setBackground(new java.awt.Color(204, 204, 255));
        iddevo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                iddevoKeyTyped(evt);
            }
        });
        getContentPane().add(iddevo);
        iddevo.setBounds(580, 130, 80, 30);

        lblidd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblidd.setText("Id devolucion :");
        lblidd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbliddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbliddMouseExited(evt);
            }
        });
        getContentPane().add(lblidd);
        lblidd.setBounds(450, 130, 120, 30);

        lblnombrecha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblnombrecha.setText("*Nombre de la chaqueta : ");
        lblnombrecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblnombrechaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblnombrechaMouseExited(evt);
            }
        });
        getContentPane().add(lblnombrecha);
        lblnombrecha.setBounds(240, 350, 240, 30);

        lblcolorcha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblcolorcha.setText("*Color de la chaqueta :");
        lblcolorcha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblcolorchaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblcolorchaMouseExited(evt);
            }
        });
        getContentPane().add(lblcolorcha);
        lblcolorcha.setBounds(240, 420, 180, 30);

        lblcantidad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblcantidad.setText("Cantidad chaquetas : ");
        lblcantidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblcantidadMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblcantidadMouseExited(evt);
            }
        });
        getContentPane().add(lblcantidad);
        lblcantidad.setBounds(240, 490, 180, 30);

        idfac.setBackground(new java.awt.Color(204, 204, 255));
        idfac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idfacActionPerformed(evt);
            }
        });
        idfac.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                idfacKeyTyped(evt);
            }
        });
        getContentPane().add(idfac);
        idfac.setBounds(510, 280, 190, 30);

        nombrecha.setBackground(new java.awt.Color(204, 204, 255));
        nombrecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombrechaActionPerformed(evt);
            }
        });
        nombrecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombrechaKeyTyped(evt);
            }
        });
        getContentPane().add(nombrecha);
        nombrecha.setBounds(510, 350, 190, 30);

        colorcha.setBackground(new java.awt.Color(204, 204, 255));
        colorcha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorchaActionPerformed(evt);
            }
        });
        colorcha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                colorchaKeyTyped(evt);
            }
        });
        getContentPane().add(colorcha);
        colorcha.setBounds(510, 420, 190, 30);

        cantidad.setBackground(new java.awt.Color(204, 204, 255));
        cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadActionPerformed(evt);
            }
        });
        cantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cantidadKeyTyped(evt);
            }
        });
        getContentPane().add(cantidad);
        cantidad.setBounds(510, 490, 190, 30);

        tipousuario10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(tipousuario10);
        tipousuario10.setBounds(20, 110, 150, 30);

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
        usuario.setBounds(60, 40, 65, 65);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mke_matholy/img/mke DEGRA.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 1080, 800);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbldoccliMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbldoccliMouseEntered
        lbldoccli.setForeground(Color.blue);//le damos color al texto
    }//GEN-LAST:event_lbldoccliMouseEntered

    private void tituloMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tituloMouseEntered
        titulo.setForeground(Color.black);//le damos color al texto
    }//GEN-LAST:event_tituloMouseEntered

    private void lbldoccliMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbldoccliMouseExited
        lbldoccli.setForeground(Color.black);//le damos color al texto
    }//GEN-LAST:event_lbldoccliMouseExited

    private void tituloMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tituloMouseExited
        titulo.setForeground(Color.blue);//le damos color al texto
    }//GEN-LAST:event_tituloMouseExited

    private void lblidfacMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblidfacMouseEntered
        lblidfac.setForeground(Color.blue);//le damos color al texto
    }//GEN-LAST:event_lblidfacMouseEntered

    private void lblidfacMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblidfacMouseExited
        lblidfac.setForeground(Color.black);//le damos color al texto
    }//GEN-LAST:event_lblidfacMouseExited

    private void btnguardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnguardarMouseEntered
        btnguardar.setBackground(new java.awt.Color(153,153,255));//le damos color al texto del boton y al relleno
        btnguardar.setForeground(Color.red);
    }//GEN-LAST:event_btnguardarMouseEntered

    private void btnguardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnguardarMouseExited
        btnguardar.setBackground(new java.awt.Color(204,204,255));//le damos color al texto del boton y al relleno
        btnguardar.setForeground(Color.black);
    }//GEN-LAST:event_btnguardarMouseExited

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        
        if (nomcli.getText().equals("") || (idfac.getText().equals("")) || (nombrecha.getText().equals("")) ||(colorcha.getText().equals(""))|| (cantidad.getText().equals("")))
        {
            //si los campos estan vacion imprimira en pantalla lo siguiente
            javax.swing.JOptionPane.showMessageDialog(this,"Debe llenar todos los campos \n","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }else{
            try{
                Connection con = null;
                PreparedStatement ps;
                conexion co=new conexion();
                con=co.getconexion();
                ps =con.prepareStatement("insert into DEVOLUCION(NOMBRE_CLIENTE,NOMB_CHAQUETA,COL_CHAAQUETA,ID_FACTURA,CANTI_CHAQUETAS)VALUES(?,?,?,?,?)");
                ps.setString(1,nomcli.getText());
                ps.setString(2,nombrecha.getText());
                ps.setString(3,colorcha.getText());
                ps.setInt(4,Integer.parseInt(idfac.getText()));
                ps.setInt(5,Integer.parseInt(cantidad.getText()));
                

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
                try{
                Connection con = null;
                PreparedStatement ps;
                conexion co=new conexion();
                con=co.getconexion();
                ps =con.prepareStatement("update factura set NUMERO_CHAQUETAS=(NUMERO_CHAQUETAS-?) where ID_FACTURA=? ;");
                ps.setInt(1,Integer.parseInt(cantidad.getText()));
                ps.setInt(2,Integer.parseInt(idfac.getText()));
                

                int res=ps.executeUpdate();
                if(res>0){
                    JOptionPane.showMessageDialog(null,"Factura modificada");
                }else{
                    JOptionPane.showMessageDialog(null,"Ocurrio un error");
                }
                con.close();
            }   catch (SQLException e) {
                Logger.getLogger(crudmateria.class.getName()).log(Level.SEVERE, null, e);
            }
        try{
                Connection con = null;
                PreparedStatement ps;
                conexion co=new conexion();
                con=co.getconexion();
                ps =con.prepareStatement("update CHAQUETA_REALIZADA set ESTADO='EN REPARACION' where NOMBRE_CHAQUETA_REALIZADA=? AND COLOR=? AND ESTADO LIKE 'VENDIDO' LIMIT ?;");
                ps.setString(1,nombrecha.getText());
                ps.setString(2,colorcha.getText());
                ps.setInt(3,Integer.parseInt(cantidad.getText()));

                int res=ps.executeUpdate();
                if(res>0){
                    JOptionPane.showMessageDialog(null,"chaqueta modificada");
                }else{
                    JOptionPane.showMessageDialog(null,"Ocurrio un error");
                }
                con.close();
            }   catch (SQLException e) {
                Logger.getLogger(crudmateria.class.getName()).log(Level.SEVERE, null, e);
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
        consultasdevoluciones cu=new consultasdevoluciones();
        cu.setVisible(true);
        dispose();
        if (tipousuario10.getText().equals("USUARIO")){
                cu.tipousuario6.setText("USUARIO");
        }
        if(tipousuario10.getText().equals("ADMINISTRADOR")){
                cu.tipousuario6.setText("ADMINISTRADOR");
        }
    }//GEN-LAST:event_consulActionPerformed

    private void bneliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bneliminarMouseEntered
        bneliminar.setBackground(new java.awt.Color(153,153,255));//le damos color al texto del boton y al relleno
        bneliminar.setForeground(Color.red);
    }//GEN-LAST:event_bneliminarMouseEntered

    private void bneliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bneliminarMouseExited
        bneliminar.setBackground(new java.awt.Color(204,204,255));//le damos color al texto del boton y al relleno
        bneliminar.setForeground(Color.black);
    }//GEN-LAST:event_bneliminarMouseExited

    private void bneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bneliminarActionPerformed
        if (iddevo.getText().equals("") || (nomcli.getText().equals("")) || (idfac.getText().equals("")) || (nombrecha.getText().equals("")) || (colorcha.getText().equals(""))|| (cantidad.getText().equals("")))
        {
         JOptionPane.showMessageDialog(null,"Debes consultar tu registro");       
        }else{
        
        try{
            Connection con = null;
            PreparedStatement ps;
            conexion co=new conexion();
            con=co.getconexion();
            ps =con.prepareStatement("DELETE  from DEVOLUCION where ID_DEVOLUCION =?");
            ps.setInt(1,Integer.parseInt(iddevo.getText()));

            int res=ps.executeUpdate();
            if(res>0){
                JOptionPane.showMessageDialog(null,"Registro eliminado");
            }else{
                JOptionPane.showMessageDialog(null,"Ocurrio un error al eliminar");
            }
            con.close();
            }catch (SQLException e) {
                    Logger.getLogger(crudmateria.class.getName()).log(Level.SEVERE, null, e);
        }
        try{
            Connection con = null;
            PreparedStatement ps;
            conexion co=new conexion();
            con=co.getconexion();
            ps =con.prepareStatement("update factura set NUMERO_CHAQUETAS=(NUMERO_CHAQUETAS+?) where ID_FACTURA=? ;");
            ps.setInt(1,Integer.parseInt(cantidad.getText()));
            ps.setInt(2,Integer.parseInt(idfac.getText()));

            int res=ps.executeUpdate();
            if(res>0){
                JOptionPane.showMessageDialog(null,"Factura modificada");
            }else{
                JOptionPane.showMessageDialog(null,"Ocurrio un error al eliminar");
            }
            con.close();
        }catch (SQLException e) {
                Logger.getLogger(crudmateria.class.getName()).log(Level.SEVERE, null, e);
        }
        
        try{
            Connection con = null;
            PreparedStatement ps;
            conexion co=new conexion();
            con=co.getconexion();
            ps =con.prepareStatement("update CHAQUETA_REALIZADA set ESTADO='VENDIDO' where NOMBRE_CHAQUETA_REALIZADA=? AND COLOR=? AND ESTADO LIKE 'EN REPARACION' LIMIT ?;");
            ps.setString(1,nombrecha.getText());
            ps.setString(2,colorcha.getText());
            ps.setInt(3,Integer.parseInt(cantidad.getText()));

            int res=ps.executeUpdate();
            if(res>0){
                JOptionPane.showMessageDialog(null,"Chaqueta modificada");
            }else{
                JOptionPane.showMessageDialog(null,"Ocurrio un error al eliminar");
            }
            con.close();
        }catch (SQLException e) {
                Logger.getLogger(crudmateria.class.getName()).log(Level.SEVERE, null, e);
        }
    }
        
    limpiar();
    bneliminar.setVisible(false);
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
        menudevoluciones pa=new menudevoluciones();
        pa.setVisible(true);
        dispose();
        if (tipousuario10.getText().equals("USUARIO")){
                pa.tipousuario17.setText("USUARIO");
        }
        if(tipousuario10.getText().equals("ADMINISTRADOR")){
                pa.tipousuario17.setText("ADMINISTRADOR");
        }
    }//GEN-LAST:event_volverActionPerformed

    private void seleccionarregistroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seleccionarregistroMouseEntered
        seleccionarregistro.setBackground(new java.awt.Color(153,153,255));//le damos color al texto del boton y al relleno
        seleccionarregistro.setForeground(Color.red);
    }//GEN-LAST:event_seleccionarregistroMouseEntered

    private void seleccionarregistroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seleccionarregistroMouseExited
        seleccionarregistro.setBackground(new java.awt.Color(204,204,255));//le damos color al texto del boton y al relleno
        seleccionarregistro.setForeground(Color.black);
    }//GEN-LAST:event_seleccionarregistroMouseExited

    private void seleccionarregistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionarregistroActionPerformed
        if (iddevo.getText().equals(""))
        {
         JOptionPane.showMessageDialog(null,"Debes consultar tu registro");       
        }
        else{
            try{
                Connection con = null;
                PreparedStatement ps;
                ResultSet rs;
                conexion co=new conexion();
                con=co.getconexion();
                ps =con.prepareStatement("select * from DEVOLUCION where ID_DEVOLUCION =?");
                ps.setString(1,iddevo.getText());

                rs= ps.executeQuery();
                if(rs.next()){
                    iddevo.setText(rs.getString("ID_DEVOLUCION"));
                    nomcli.setText(rs.getString("NOMBRE_CLIENTE"));
                    idfac.setText(rs.getString("ID_FACTURA"));
                    nombrecha.setText(rs.getString("NOMB_CHAQUETA"));
                    colorcha.setText(rs.getString("COL_CHAAQUETA"));
                    cantidad.setText(rs.getString("CANTI_CHAQUETAS"));
                    bneliminar.setVisible(true);
                    btnguardar.setVisible(false);
                }else{
                   JOptionPane.showMessageDialog(null,"No hay un registro con ese ID"); 
                   limpiar();
                }
                } catch (SQLException ex) {
                      Logger.getLogger(crudmateria.class.getName()).log(Level.SEVERE, null, ex);
                 }
        }
    }//GEN-LAST:event_seleccionarregistroActionPerformed

    private void lbliddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbliddMouseEntered
        lblidd.setForeground(Color.blue);
    }//GEN-LAST:event_lbliddMouseEntered

    private void lbliddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbliddMouseExited
        lblidd.setForeground(Color.black);
    }//GEN-LAST:event_lbliddMouseExited

    private void lblnombrechaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblnombrechaMouseEntered
        lblnombrecha.setForeground(Color.blue);
    }//GEN-LAST:event_lblnombrechaMouseEntered

    private void lblnombrechaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblnombrechaMouseExited
        lblnombrecha.setForeground(Color.black);
    }//GEN-LAST:event_lblnombrechaMouseExited

    private void lblcolorchaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcolorchaMouseEntered
        lblcolorcha.setForeground(Color.blue);
    }//GEN-LAST:event_lblcolorchaMouseEntered

    private void lblcolorchaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcolorchaMouseExited
        lblcolorcha.setForeground(Color.black);
    }//GEN-LAST:event_lblcolorchaMouseExited

    private void lblcantidadMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcantidadMouseEntered
        lblcantidad.setForeground(Color.blue);
    }//GEN-LAST:event_lblcantidadMouseEntered

    private void lblcantidadMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcantidadMouseExited
       lblcantidad.setForeground(Color.black);
    }//GEN-LAST:event_lblcantidadMouseExited

    private void idfacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idfacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idfacActionPerformed

    private void nombrechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombrechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombrechaActionPerformed

    private void colorchaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorchaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_colorchaActionPerformed

    private void cantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadActionPerformed

    private void iddevoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_iddevoKeyTyped
        char c= evt.getKeyChar();
        if (c<'0'||c>'9') evt.consume();
    }//GEN-LAST:event_iddevoKeyTyped

    private void nomcliKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomcliKeyTyped
        char c= evt.getKeyChar();
        if ((c<'a'||c>'z') &&(c<'A'||c>'Z') )evt.consume();
    }//GEN-LAST:event_nomcliKeyTyped

    private void idfacKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idfacKeyTyped
        char c= evt.getKeyChar();
        if (c<'0'||c>'9') evt.consume();
    }//GEN-LAST:event_idfacKeyTyped

    private void nombrechaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombrechaKeyTyped
        char c= evt.getKeyChar();
        if ((c<'a'||c>'z') &&(c<'A'||c>'Z') )evt.consume();
    }//GEN-LAST:event_nombrechaKeyTyped

    private void colorchaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_colorchaKeyTyped
        char c= evt.getKeyChar();
        if ((c<'a'||c>'z') &&(c<'A'||c>'Z') )evt.consume();
    }//GEN-LAST:event_colorchaKeyTyped

    private void cantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidadKeyTyped
        char c= evt.getKeyChar();
        if (c<'0'||c>'9') evt.consume();
    }//GEN-LAST:event_cantidadKeyTyped

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
            java.util.logging.Logger.getLogger(cruddevoluciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cruddevoluciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cruddevoluciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cruddevoluciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cruddevoluciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JTextField cantidad;
    private javax.swing.JTextField colorcha;
    private javax.swing.JButton consul;
    private javax.swing.JTextField iddevo;
    private javax.swing.JTextField idfac;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblcantidad;
    private javax.swing.JLabel lblcolorcha;
    private javax.swing.JLabel lbldoccli;
    private javax.swing.JLabel lblidd;
    private javax.swing.JLabel lblidfac;
    private javax.swing.JLabel lblnombrecha;
    private javax.swing.JTextField nombrecha;
    private javax.swing.JTextField nomcli;
    private javax.swing.JButton seleccionarregistro;
    public javax.swing.JLabel tipousuario10;
    private javax.swing.JLabel titulo;
    private javax.swing.JButton usuario;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables

}//cerramos la clase declarando las variables como privadas 
