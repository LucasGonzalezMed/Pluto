
package pluto;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.ResultSet;


public class Sqlusuario extends ConexionMySQL{
    
    public boolean registrar_usuario(Usuario usr){
        
        PreparedStatement ps = null;
        Connection conexion = ConectarBasedeDatos();
      
        
        String sql = "INSERT INTO Usuario (usuario, contra, nombre, apellido, mail) VALUES (?,?,?,?,?)";
        
        try {
            ps = conexion.prepareStatement(sql);
            ps.setString(1, usr.getUsuario());
            ps.setString(2, usr.getContraseña());
            ps.setString(3, usr.getNombre());
            ps.setString(4, usr.getApellido());
            ps.setString(5, usr.getMail());
            ps.execute();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error ", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
    }
        public int Reconocer_usuario(String usuario){
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conexion = ConectarBasedeDatos();
      
        
        String sql = "SELECT count (id_usuario) FROM Usuario WHERE usuario = ?";
        
        try {
            ps = conexion.prepareStatement(sql);
            ps.setString(1, usuario);
            rs = ps.executeQuery();
            
            if(rs.next()){
                return rs.getInt(1);
                         
            }
            return 1;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error ", JOptionPane.ERROR_MESSAGE);
            return 1;
        }
        
    }
    
}

