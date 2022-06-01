
package mke_matholy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class conexion {
    
    public Connection getconexion(){
         String url = "jdbc:mysql://localhost:3306/mke_matholy";
         String usuario = "root";
         String contraseña = "";
         Connection con=null;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection(url,usuario,contraseña);
                if (con!= null){
                    System.out.println("Se ha establecido una conexion a la base de datos"+"\n"+url);
                }
                else{
                   System.out.println("No se ha establecido una conexion a la base de datos");
                }
        }catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
            
    }
}
        


