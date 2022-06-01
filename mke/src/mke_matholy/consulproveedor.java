
package mke_matholy;//paquete donde se encuentra nuestro documento

import java.awt.Color;//librerias
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


//@author Juan david diaz
public class consulproveedor extends javax.swing.JFrame {
//creamos una clase publica con los siguientes metodos asignados a las variables

    public consulproveedor() {
        initComponents();//le damos los siguientes componentes
        this.setSize(1010, 800);//le damos un tamaño a nuestra pantalla
        this.setTitle("CONSULTAR REGISTROS DE PROVEEDOR");//le damos un titulo en la parte superior izquierda
        this.setLocation(150,60);//le damos una localizacion para cuando salga en pantalla
        hecho.setVisible(false);
        try {
            DefaultTableModel modelo=new DefaultTableModel();
            tablaempleado.setModel(modelo);
            
            PreparedStatement ps= null;
            ResultSet rs= null;
            conexion conn = new conexion();
            Connection con= conn.getconexion();
            Statement stmt = null;
            
            String sql ="select DOC_PROVEEDOR,NOMBRE_PROVEEDOR,APELLIDO_PROVEEDOR,TELEFONO_PROVEEDOR,CORREO_PROVEEDOR,NOMBRE_EMPRESA,DIRECCION_EMPRESA from PROVEEDOR";
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            
            ResultSetMetaData rsMd=rs.getMetaData();
            int cantidadcolumnas = rsMd.getColumnCount();
            
            
            modelo.addColumn("DOCUMENTO");
            modelo.addColumn("NOMBRE");
            modelo.addColumn("APELLIDO");
            modelo.addColumn("TELEFONO");
            modelo.addColumn("CORREO");
            modelo.addColumn("NOMBRE EMPRESA");
            modelo.addColumn("DIRECCION EMPRESA");
            
            while(rs.next()) {
          
                Object[] filas = new Object[cantidadcolumnas];
                for(int i =0 ; i<cantidadcolumnas; i++){
                    filas[i] = rs.getObject(i+1);
                }
                modelo.addRow(filas);
                
            }
            
            
            
        }//declaramosexcepciones
        catch (Exception e) {
            //imprimir en pantalla si da un error al estraer los datos de la base de datos 
            JOptionPane.showMessageDialog(null,"Error al extraer los datos de la tabla");
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaempleado = new javax.swing.JTable();
        consul = new javax.swing.JButton();
        semititulo = new javax.swing.JLabel();
        registro = new javax.swing.JTextField();
        items = new javax.swing.JComboBox<>();
        Volver = new javax.swing.JButton();
        titulo = new javax.swing.JLabel();
        hecho = new javax.swing.JButton();
        editar = new javax.swing.JButton();
        tipousuario4 = new javax.swing.JLabel();
        usuario = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        tablaempleado = new javax.swing.JTable(){
            public boolean isCellEditable (int rowIndex, int colIndex){
                return false ;
            }
        };
        tablaempleado.setBackground(new java.awt.Color(204, 204, 255));
        tablaempleado.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tablaempleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DOCUMENTO", "NOMBRE ", "APELLIDO", "TELEFONO", "CORREO", "NOMBRE EMPRESA", "DIRECCION EMPRESA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaempleado.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tablaempleado.setFocusable(false);
        tablaempleado.getTableHeader().setReorderingAllowed(false);
        tablaempleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tablaempleadoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tablaempleadoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaempleadoMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tablaempleado);
        if (tablaempleado.getColumnModel().getColumnCount() > 0) {
            tablaempleado.getColumnModel().getColumn(0).setResizable(false);
            tablaempleado.getColumnModel().getColumn(1).setResizable(false);
            tablaempleado.getColumnModel().getColumn(2).setResizable(false);
            tablaempleado.getColumnModel().getColumn(3).setResizable(false);
            tablaempleado.getColumnModel().getColumn(4).setResizable(false);
            tablaempleado.getColumnModel().getColumn(5).setResizable(false);
            tablaempleado.getColumnModel().getColumn(6).setResizable(false);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(50, 80, 900, 460);

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
        consul.setBounds(610, 560, 65, 65);

        semititulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        semititulo.setText("Registro que desea buscar :");
        semititulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                semitituloMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                semitituloMouseExited(evt);
            }
        });
        getContentPane().add(semititulo);
        semititulo.setBounds(10, 650, 210, 20);

        registro.setBackground(new java.awt.Color(204, 204, 255));
        getContentPane().add(registro);
        registro.setBounds(230, 640, 156, 29);

        items.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DOCUMENTO", "NOMBRE", "APELLIDO", "TELEFONO", "CORREO", "NOMBRE EMPRESA", "DIRECCION EMPRESA" }));
        getContentPane().add(items);
        items.setBounds(420, 640, 156, 29);

        Volver.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mke_matholy/img/volver.jpg"))); // NOI18N
        Volver.setBorder(new javax.swing.border.MatteBorder(null));
        Volver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                VolverMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                VolverMouseExited(evt);
            }
        });
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });
        getContentPane().add(Volver);
        Volver.setBounds(870, 630, 65, 65);

        titulo.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        titulo.setForeground(new java.awt.Color(51, 51, 255));
        titulo.setText("Registros proveedores");
        titulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tituloMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tituloMouseExited(evt);
            }
        });
        getContentPane().add(titulo);
        titulo.setBounds(350, 30, 410, 40);

        hecho.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        hecho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mke_matholy/img/hecho.jpg"))); // NOI18N
        hecho.setBorder(new javax.swing.border.MatteBorder(null));
        hecho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                hechoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                hechoMouseExited(evt);
            }
        });
        hecho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hechoActionPerformed(evt);
            }
        });
        getContentPane().add(hecho);
        hecho.setBounds(610, 640, 65, 65);

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
        editar.setBounds(730, 630, 65, 65);

        tipousuario4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(tipousuario4);
        tipousuario4.setBounds(130, 40, 150, 30);

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
        usuario.setBounds(60, 10, 65, 65);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mke_matholy/img/mke DEGRA.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1080, 820);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void consulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consulActionPerformed

        Object consultar=items.getSelectedItem();

    if(consultar.equals("DOCUMENTO"))//si el dato escogido es igual a id realice lo siguiente 
    {
        String  ress= registro.getText();
        try {
            DefaultTableModel modelo=new DefaultTableModel();
            tablaempleado.setModel(modelo);
            
            PreparedStatement ps= null;
            ResultSet rs= null;
            conexion conn = new conexion();
            Connection con= conn.getconexion();
            
            String sql ="select DOC_PROVEEDOR,NOMBRE_PROVEEDOR,APELLIDO_PROVEEDOR,TELEFONO_PROVEEDOR,CORREO_PROVEEDOR,NOMBRE_EMPRESA,DIRECCION_EMPRESA from PROVEEDOR where DOC_PROVEEDOR= ? ";
            ps=con.prepareStatement(sql);
            ps.setInt(1,Integer.parseInt(registro.getText()));
            rs=ps.executeQuery();
            
            ResultSetMetaData rsMd=rs.getMetaData();
            int cantidadcolumnas = rsMd.getColumnCount();
            
            
            modelo.addColumn("DOCUMENTO");
            modelo.addColumn("NOMBRE");
            modelo.addColumn("APELLIDO");
            modelo.addColumn("TELEFONO");
            modelo.addColumn("CORREO");
            modelo.addColumn("NOMBRE EMPRESA");
            modelo.addColumn("DIRECCION EMPRESA");
            
            
            while(rs.next()) {
          
                Object[] filas = new Object[cantidadcolumnas];
                for(int i =0 ; i<cantidadcolumnas; i++){
                    filas[i] = rs.getObject(i+1);
                }
                modelo.addRow(filas);
                
            }
            registro.setText("");
            hecho.setVisible(true);
        }//declaramosexcepciones
        catch (Exception e) {
            //imprimir en pantalla si da un error al estraer los datos de la base de datos 
            JOptionPane.showMessageDialog(null,"Error al extraer los datos de la tabla");
            hecho.setVisible(true);
        }
           

    }
    if(consultar.equals("NOMBRE"))//si el dato escogido es igual a nombrematerial  realice lo siguiente 
    {
        String  ress= registro.getText();
        try {
            DefaultTableModel modelo=new DefaultTableModel();
            tablaempleado.setModel(modelo);
            
            PreparedStatement ps= null;
            ResultSet rs= null;
            conexion conn = new conexion();
            Connection con= conn.getconexion();
            Statement stmt = null;
            
            String sql ="select DOC_PROVEEDOR,NOMBRE_PROVEEDOR,APELLIDO_PROVEEDOR,TELEFONO_PROVEEDOR,CORREO_PROVEEDOR,NOMBRE_EMPRESA,DIRECCION_EMPRESA from PROVEEDOR where NOMBRE_PROVEEDOR like '%"+ress+"%' ";
            ps=con.prepareStatement(sql);
            //ps.setString(1,registro.getText());
            rs=ps.executeQuery();
            
            ResultSetMetaData rsMd=rs.getMetaData();
            int cantidadcolumnas = rsMd.getColumnCount();
            
            
            modelo.addColumn("DOCUMENTO");
            modelo.addColumn("NOMBRE");
            modelo.addColumn("APELLIDO");
            modelo.addColumn("TELEFONO");
            modelo.addColumn("CORREO");
            modelo.addColumn("NOMBRE EMPRESA");
            modelo.addColumn("DIRECCION EMPRESA");
            
            
            while(rs.next()) {
          
                Object[] filas = new Object[cantidadcolumnas];
                for(int i =0 ; i<cantidadcolumnas; i++){
                    filas[i] = rs.getObject(i+1);
                }
                modelo.addRow(filas);
                
            }
            registro.setText("");
            hecho.setVisible(true);
        }//declaramosexcepciones
        catch (Exception e) {
            //imprimir en pantalla si da un error al estraer los datos de la base de datos 
            JOptionPane.showMessageDialog(null,"Error al extraer los datos de la tabla");
            hecho.setVisible(true);
        }
           
    }
    if(consultar.equals("APELLIDO"))//si el dato escogido es igual a cantidad  realice lo siguiente
    {
        String  ress= registro.getText();
        try {
            DefaultTableModel modelo=new DefaultTableModel();
            tablaempleado.setModel(modelo);
            
            PreparedStatement ps= null;
            ResultSet rs= null;
            conexion conn = new conexion();
            Connection con= conn.getconexion();
            Statement stmt = null;
            
            String sql ="select DOC_PROVEEDOR,NOMBRE_PROVEEDOR,APELLIDO_PROVEEDOR,TELEFONO_PROVEEDOR,CORREO_PROVEEDOR,NOMBRE_EMPRESA,DIRECCION_EMPRESA from PROVEEDOR where APELLIDO_PROVEEDOR like '%"+ress+"%' ";
            ps=con.prepareStatement(sql);
            //ps.setInt(1,Integer.parseInt(registro.getText()));
            rs=ps.executeQuery();
            
            ResultSetMetaData rsMd=rs.getMetaData();
            int cantidadcolumnas = rsMd.getColumnCount();
            
            
            modelo.addColumn("DOCUMENTO");
            modelo.addColumn("NOMBRE");
            modelo.addColumn("APELLIDO");
            modelo.addColumn("TELEFONO");
            modelo.addColumn("CORREO");
            modelo.addColumn("NOMBRE EMPRESA");
            modelo.addColumn("DIRECCION EMPRESA");
            
            
            
            while(rs.next()) {
          
                Object[] filas = new Object[cantidadcolumnas];
                for(int i =0 ; i<cantidadcolumnas; i++){
                    filas[i] = rs.getObject(i+1);
                }
                modelo.addRow(filas);
                
            }
            registro.setText("");
            hecho.setVisible(true);
        }//declaramosexcepciones
        catch (Exception e) {
            //imprimir en pantalla si da un error al estraer los datos de la base de datos 
            JOptionPane.showMessageDialog(null,"Error al extraer los datos de la tabla");
            hecho.setVisible(true);
        }
    }
    else
        if(consultar.equals("DIRECCION EMPRESA"))//si el dato escogido es igual a cantidad  realice lo siguiente
        {
        String  ress= registro.getText();
        try {
            DefaultTableModel modelo=new DefaultTableModel();
            tablaempleado.setModel(modelo);
            
            PreparedStatement ps= null;
            ResultSet rs= null;
            conexion conn = new conexion();
            Connection con= conn.getconexion();
            Statement stmt = null;
            
            String sql ="select DOC_PROVEEDOR,NOMBRE_PROVEEDOR,APELLIDO_PROVEEDOR,TELEFONO_PROVEEDOR,CORREO_PROVEEDOR,NOMBRE_EMPRESA,DIRECCION_EMPRESA from PROVEEDOR where DIRECCION_EMPRESA like '%"+ress+"%'" ;
            ps=con.prepareStatement(sql);
            //ps.setInt(1,Integer.parseInt(registro.getText()));
            rs=ps.executeQuery();
            
            ResultSetMetaData rsMd=rs.getMetaData();
            int cantidadcolumnas = rsMd.getColumnCount();
            
            
            modelo.addColumn("DOCUMENTO");
            modelo.addColumn("NOMBRE");
            modelo.addColumn("APELLIDO");
            modelo.addColumn("TELEFONO");
            modelo.addColumn("CORREO");
            modelo.addColumn("NOMBRE EMPRESA");
            modelo.addColumn("DIRECCION EMPRESA");
            
            
            
            while(rs.next()) {
          
                Object[] filas = new Object[cantidadcolumnas];
                for(int i =0 ; i<cantidadcolumnas; i++){
                    filas[i] = rs.getObject(i+1);
                }
                modelo.addRow(filas);
                
            }
            registro.setText("");
            hecho.setVisible(true);
            }//declaramosexcepciones
            catch (Exception e) {
            //imprimir en pantalla si da un error al estraer los datos de la base de datos 
            JOptionPane.showMessageDialog(null,"Error al extraer los datos de la tabla");
            hecho.setVisible(true);
        }
    }
    else
    if(consultar.equals("TELEFONO"))//si el dato escogido es igual a precio  realice lo siguiente
    {
        String  ress= registro.getText();
        try {
            DefaultTableModel modelo=new DefaultTableModel();
            tablaempleado.setModel(modelo);
            
            PreparedStatement ps= null;
            ResultSet rs= null;
            conexion conn = new conexion();
            Connection con= conn.getconexion();
            
            String sql ="select DOC_PROVEEDOR,NOMBRE_PROVEEDOR,APELLIDO_PROVEEDOR,TELEFONO_PROVEEDOR,CORREO_PROVEEDOR,NOMBRE_EMPRESA,DIRECCION_EMPRESA from PROVEEDOR where TELEFONO_PROVEEDOR like '%"+ress+"%'" ;
            ps=con.prepareStatement(sql);
            //ps.setInt(1,Integer.parseInt(registro.getText()));
            rs=ps.executeQuery();
            
            ResultSetMetaData rsMd=rs.getMetaData();
            int cantidadcolumnas = rsMd.getColumnCount();
            
            
            modelo.addColumn("DOCUMENTO");
            modelo.addColumn("NOMBRE");
            modelo.addColumn("APELLIDO");
            modelo.addColumn("TELEFONO");
            modelo.addColumn("CORREO");
            modelo.addColumn("NOMBRE EMPRESA");
            modelo.addColumn("DIRECCION EMPRESA");
            
            
            
            while(rs.next()) {
          
                Object[] filas = new Object[cantidadcolumnas];
                for(int i =0 ; i<cantidadcolumnas; i++){
                    filas[i] = rs.getObject(i+1);
                }
                modelo.addRow(filas);
                
            }
            registro.setText("");
            hecho.setVisible(true);
        }//declaramosexcepciones
        catch (Exception e) {
            //imprimir en pantalla si da un error al estraer los datos de la base de datos 
            JOptionPane.showMessageDialog(null,"Error al extraer los datos de la tabla");
            hecho.setVisible(true);
        }
    
    }
    else
        if(consultar.equals("CORREO"))//si el dato escogido es igual a precio  realice lo siguiente
    {
            String  ress= registro.getText();
        try {
            DefaultTableModel modelo=new DefaultTableModel();
            tablaempleado.setModel(modelo);
            
            PreparedStatement ps= null;
            ResultSet rs= null;
            conexion conn = new conexion();
            Connection con= conn.getconexion();
            Statement stmt = null;
            
            String sql ="select DOC_PROVEEDOR,NOMBRE_PROVEEDOR,APELLIDO_PROVEEDOR,TELEFONO_PROVEEDOR,CORREO_PROVEEDOR,NOMBRE_EMPRESA,DIRECCION_EMPRESA from PROVEEDOR where CORREO_PROVEEDOR like '%"+ress+"%'" ;
            ps=con.prepareStatement(sql);
            //ps.setInt(1,Integer.parseInt(registro.getText()));
            rs=ps.executeQuery();
            
            ResultSetMetaData rsMd=rs.getMetaData();
            int cantidadcolumnas = rsMd.getColumnCount();
            
            
            modelo.addColumn("DOCUMENTO");
            modelo.addColumn("NOMBRE");
            modelo.addColumn("APELLIDO");
            modelo.addColumn("TELEFONO");
            modelo.addColumn("CORREO");
            modelo.addColumn("NOMBRE EMPRESA");
            modelo.addColumn("DIRECCION EMPRESA");
            
            
            while(rs.next()) {
          
                Object[] filas = new Object[cantidadcolumnas];
                for(int i =0 ; i<cantidadcolumnas; i++){
                    filas[i] = rs.getObject(i+1);
                }
                modelo.addRow(filas);
                
            }
            registro.setText("");
            hecho.setVisible(true);
        }//declaramosexcepciones
        catch (Exception e) {
            //imprimir en pantalla si da un error al estraer los datos de la base de datos 
            JOptionPane.showMessageDialog(null,"Error al extraer los datos de la tabla");
            hecho.setVisible(true);
        }
    
    } 
    else
        if(consultar.equals("NOMBRE EMPRESA"))//si el dato escogido es igual a precio  realice lo siguiente
            {
            String  ress= registro.getText();
        try {
            DefaultTableModel modelo=new DefaultTableModel();
            tablaempleado.setModel(modelo);
            
            PreparedStatement ps= null;
            ResultSet rs= null;
            conexion conn = new conexion();
            Connection con= conn.getconexion();
            Statement stmt = null;
            
            String sql ="select DOC_PROVEEDOR,NOMBRE_PROVEEDOR,APELLIDO_PROVEEDOR,TELEFONO_PROVEEDOR,CORREO_PROVEEDOR,NOMBRE_EMPRESA,DIRECCION_EMPRESA from PROVEEDOR where NOMBRE_EMPRESA like '%"+ress+"%'" ;
            ps=con.prepareStatement(sql);
            //ps.setInt(1,Integer.parseInt(registro.getText()));
            rs=ps.executeQuery();
            
            ResultSetMetaData rsMd=rs.getMetaData();
            int cantidadcolumnas = rsMd.getColumnCount();
            
            
            modelo.addColumn("DOCUMENTO");
            modelo.addColumn("NOMBRE");
            modelo.addColumn("APELLIDO");
            modelo.addColumn("TELEFONO");
            modelo.addColumn("CORREO");
            modelo.addColumn("NOMBRE EMPRESA");
            modelo.addColumn("DIRECCION EMPRESA");
            
            
            
            while(rs.next()) {
          
                Object[] filas = new Object[cantidadcolumnas];
                for(int i =0 ; i<cantidadcolumnas; i++){
                    filas[i] = rs.getObject(i+1);
                }
                modelo.addRow(filas);
                
            }
            registro.setText("");
            hecho.setVisible(true);
        }//declaramosexcepciones
        catch (Exception e) {
            //imprimir en pantalla si da un error al estraer los datos de la base de datos 
            JOptionPane.showMessageDialog(null,"Error al extraer los datos de la tabla");
            hecho.setVisible(true);
        }
    
    } 
    }//GEN-LAST:event_consulActionPerformed

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        opcprov mp=new opcprov();//cuando de click en volver lo envie al modulo de materi prima 
        mp.setVisible(true);
        dispose();
        if (tipousuario4.getText().equals("USUARIO")){
                mp.tipousuario26.setText("USUARIO");
        }
        if(tipousuario4.getText().equals("ADMINISTRADOR")){
                mp.tipousuario26.setText("ADMINISTRADOR");
        }
    }//GEN-LAST:event_VolverActionPerformed

    private void tituloMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tituloMouseEntered
        titulo.setForeground(Color.black);//le damos color al texto
    }//GEN-LAST:event_tituloMouseEntered

    private void tituloMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tituloMouseExited
        titulo.setForeground(Color.blue);//le damos color al texto
    }//GEN-LAST:event_tituloMouseExited

    private void semitituloMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_semitituloMouseEntered
        semititulo.setForeground(Color.blue);//le damos color al texto
    }//GEN-LAST:event_semitituloMouseEntered

    private void semitituloMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_semitituloMouseExited
        semititulo.setForeground(Color.black);//le damos color al texto
    }//GEN-LAST:event_semitituloMouseExited

    private void consulMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consulMouseEntered
        consul.setBackground(new java.awt.Color(153,153,255));//le damos color al texto del boton y al relleno
        consul.setForeground(Color.red);
    }//GEN-LAST:event_consulMouseEntered

    private void consulMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consulMouseExited
        consul.setBackground(new java.awt.Color(204,204,255));//le damos color al texto del boton y al relleno
        consul.setForeground(Color.black);
    }//GEN-LAST:event_consulMouseExited

    private void VolverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VolverMouseEntered
        Volver.setBackground(new java.awt.Color(153,153,255));//le damos color al texto del boton y al relleno
        Volver.setForeground(Color.red);
    }//GEN-LAST:event_VolverMouseEntered

    private void VolverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VolverMouseExited
        Volver.setBackground(new java.awt.Color(204,204,255));//le damos color al texto del boton y al relleno
        Volver.setForeground(Color.black);
    }//GEN-LAST:event_VolverMouseExited

    private void hechoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hechoMouseEntered
        hecho.setBackground(new java.awt.Color(153,153,255));//le damos color al texto del boton y al relleno
        hecho.setForeground(Color.red);
    }//GEN-LAST:event_hechoMouseEntered

    private void hechoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hechoMouseExited
        hecho.setBackground(new java.awt.Color(204,204,255));//le damos color al texto del boton y al relleno
        hecho.setForeground(Color.black);
    }//GEN-LAST:event_hechoMouseExited

    private void hechoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hechoActionPerformed

try {
            DefaultTableModel modelo=new DefaultTableModel();
            tablaempleado.setModel(modelo);
            
            PreparedStatement ps= null;
            ResultSet rs= null;
            conexion conn = new conexion();
            Connection con= conn.getconexion();
            Statement stmt = null;
            
            String sql ="select DOC_PROVEEDOR,NOMBRE_PROVEEDOR,APELLIDO_PROVEEDOR,TELEFONO_PROVEEDOR,CORREO_PROVEEDOR,NOMBRE_EMPRESA,DIRECCION_EMPRESA from PROVEEDOR";
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            
            ResultSetMetaData rsMd=rs.getMetaData();
            int cantidadcolumnas = rsMd.getColumnCount();
            
            
            modelo.addColumn("DOCUMENTO");
            modelo.addColumn("NOMBRE");
            modelo.addColumn("APELLIDO");
            modelo.addColumn("TELEFONO");
            modelo.addColumn("CORREO");
            modelo.addColumn("NOMBRE EMPRESA");
            modelo.addColumn("DIRECCION EMPRESA");
            
            while(rs.next()) {
          
                Object[] filas = new Object[cantidadcolumnas];
                for(int i =0 ; i<cantidadcolumnas; i++){
                    filas[i] = rs.getObject(i+1);
                }
                modelo.addRow(filas);
                registro.setText("");  
          hecho.setVisible(false);
            }
            
            
            
        }//declaramosexcepciones
        catch (Exception e) {
            //imprimir en pantalla si da un error al estraer los datos de la base de datos 
            JOptionPane.showMessageDialog(null,"Error al extraer los datos de la tabla");
        }
           registro.setText("");    
    }//GEN-LAST:event_hechoActionPerformed

    private void editarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editarMouseEntered
        editar.setBackground(new java.awt.Color(153,153,255));//le damos color al texto del boton y al relleno
        editar.setForeground(Color.red);
    }//GEN-LAST:event_editarMouseEntered

    private void editarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editarMouseExited
        editar.setBackground(new java.awt.Color(204,204,255));//le damos color al texto del boton y al relleno
        editar.setForeground(Color.black);
    }//GEN-LAST:event_editarMouseExited

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed
        crudproveedor cm=new crudproveedor();
        cm.setVisible(true);
        dispose();
        if (tipousuario4.getText().equals("USUARIO")){
                cm.tipousuario15.setText("USUARIO");
        }
        if(tipousuario4.getText().equals("ADMINISTRADOR")){
                cm.tipousuario15.setText("ADMINISTRADOR");
        }
    }//GEN-LAST:event_editarActionPerformed

    private void tablaempleadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaempleadoMouseEntered
   
    }//GEN-LAST:event_tablaempleadoMouseEntered

    private void tablaempleadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaempleadoMouseExited
        
    }//GEN-LAST:event_tablaempleadoMouseExited

    private void tablaempleadoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaempleadoMousePressed
        
    }//GEN-LAST:event_tablaempleadoMousePressed

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
            java.util.logging.Logger.getLogger(consulproveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(consulproveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(consulproveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(consulproveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new consulproveedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Volver;
    private javax.swing.JButton consul;
    private javax.swing.JButton editar;
    private javax.swing.JButton hecho;
    private javax.swing.JComboBox<String> items;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField registro;
    private javax.swing.JLabel semititulo;
    private javax.swing.JTable tablaempleado;
    public javax.swing.JLabel tipousuario4;
    private javax.swing.JLabel titulo;
    private javax.swing.JButton usuario;
    // End of variables declaration//GEN-END:variables
}
//cerramos la clase consultar declarando las variables como privadas