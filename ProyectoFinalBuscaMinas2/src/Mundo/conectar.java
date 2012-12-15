package Mundo;

import java.sql.*;
import javax.swing.*;

/**
 *
 * @author jucazuse
 */
public class conectar {

    Connection conect = null;

    public Connection conexion() {
        try {
            Class.forName("org.gjt.mm.mysql.Driver");//driver para acceder a la base de datos 
            conect = DriverManager.getConnection("jdbc:mysql://localhost/proyecto2", "root", "");//crear conexion jdbc
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error " + e);
        }
        return conect;
    }
}
