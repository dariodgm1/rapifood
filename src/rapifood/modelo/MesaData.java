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
import rapifood.entidades.Mesa;

/**
 *
 * @author Usuario
 */
public class MesaData {
    
     private Connection con;


    public MesaData (Conexion conexion) {
      con= conexion.getConnection();//obtengo la coneccion a la base de datos 
    
    }  
    
    public void crearMesa(Mesa mesa){
        
    
        String sql="INSERT into mesa (idMesa, capacidad, activo) "
                + "VALUES(?, ?, ?);";
        
        try{
        
        PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.setInt(1,mesa.getIdMesa());
        ps.setInt(2,mesa.getCapacidad() );
        ps.setBoolean(3, mesa.isActivo());
        
        ps.executeUpdate();
        
        ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                mesa.setIdMesa(rs.getInt(1));
            } else {
                JOptionPane.showMessageDialog(null,"No puedo obtener id");
            }
       
        con.close();
        }catch(SQLException e){
        
            JOptionPane.showMessageDialog(null,"Error al guardar mesa");
        }
 }
    
    public void borrarMesa(int idMesa){
    
     
        try {
            
            String sql = "DELETE FROM mesa  WHERE idMesa=?;";
            
            try (PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                ps.setInt(1, idMesa);
                ps.executeUpdate();
            }
        
        } catch (SQLException ex) {
            Logger.getLogger(MesaData.class.getName()).log(Level.SEVERE, null, ex);
        }
          JOptionPane.showMessageDialog(null,"Error al Borrar Mesa");
          
        }
}
