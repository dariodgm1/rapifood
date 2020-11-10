/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rapifood.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import rapifood.entidades.Mesero;

/**
 *
 * @author Usuario
 */
public class MeseroData {
    
     private Connection con;


    public MeseroData (Conexion conexion) {
      con= conexion.getConnection();//obtengo la coneccion a la base de datos 
    
    }  
    
    public void crearMesero(Mesero mesero){
        
    
        String sql="INSERT into mesero (idMesero, dniMesero, cuitMesero, nombreMesero, apellidoMesero, activo) "
                + "VALUES(?, ?, ?, ?, ?, ?);";
        
        try{
        
        PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.setInt(1,mesero.getIdMesero());
        ps.setInt(2,mesero.getDniMesero() );
        ps.setInt(3, mesero.getCuitMesero());
        ps.setString(4, mesero.getNombreMesero());
        ps.setString(5, mesero.getApellidoMesero());
        ps.setBoolean(6, mesero.isActivo());
        
        ps.executeUpdate();
        
        ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                mesero.setIdMesero(rs.getInt(1));
            } else {
                JOptionPane.showMessageDialog(null,"No puedo obtener id");
            }
       
        con.close();
        }catch(SQLException e){
        
            JOptionPane.showMessageDialog(null,"Error al guardar Alumno");
        }
 }
    
    public void borrarMesero(int idMesero){
    
     
        try {
            
            String sql = "DELETE FROM mesero  WHERE idMesero=?;";
            
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, idMesero);
            ps.executeUpdate();
            ps.close();
        
        } catch (SQLException ex) {
            Logger.getLogger(MeseroData.class.getName()).log(Level.SEVERE, null, ex);
        }
          JOptionPane.showMessageDialog(null,"Error al Borrar Mesero");
          
        }
}
