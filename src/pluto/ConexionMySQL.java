
package pluto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ConexionMySQL {

    public Connection conexion = null;
    public Statement sentencia;
    public ResultSet resultado;

    public Connection ConectarBasedeDatos() {
        try {
            final String Controlador = "com.mysql.cj.jdbc.Driver";
            Class.forName(Controlador);
            final String url_bd = "jdbc:mysql://us-east.connect.psdb.cloud:3306/plutodb";
            conexion = DriverManager.getConnection(url_bd, "pwgpp38q9hydwnu5ry68", "pscale_pw_BvTn73zLBXCcioD9WYdGip8m7mIqeu4zEylMveOtdsy");
            sentencia = conexion.createStatement();
         
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error ", JOptionPane.ERROR_MESSAGE);
        }
        return conexion;
        
    }

    public void DesconectarBasedeDatos() {
        try {
            if (conexion != null) {
                if (sentencia != null) {
                    sentencia.close();
                }
                conexion.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }
    }

    public Connection getConnection() {
        return conexion;
    }
}
