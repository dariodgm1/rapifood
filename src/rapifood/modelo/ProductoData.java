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
import rapifood.entidades.Producto;

/**
 *
 * @author Usuario
 */
public class ProductoData {
    
     private Connection con;


    public ProductoData (Conexion conexion) {
      con= conexion.getConnection();//obtengo la coneccion a la base de datos 
    
    }
     public void guardarProducto(Producto producto){
        
    
        String sql="INSERT into mesa (idProducto, nombreProducto, precioProducto, codigo, activo) "
                + "VALUES(?, ?, ?, ?, ?);";
        
        try{
        
        PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.setInt(1,producto.getIdProducto());
        ps.setString(2,producto.getNombreProducto() );
        ps.setDouble(3,producto.getPrecioProducto());
        ps.setInt(4,producto.getCodigo());
        ps.setBoolean(5,producto.isActivo());
        
        ps.executeUpdate();
        
        ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                producto.setIdProducto(rs.getInt(1));
            } else {
                JOptionPane.showMessageDialog(null,"No puedo obtener idProducto");
            }
       
        con.close();
        }catch(SQLException e){
        
            JOptionPane.showMessageDialog(null,"Error al guardar producto");
        }
 }
      public void borrarProducto(int idProducto){
    
     
        try {
            
            String sql = "DELETE FROM producto  WHERE idProducto=?;";
            
            try (PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                ps.setInt(1, idProducto);
                ps.executeUpdate();
            }
        
        } catch (SQLException ex) {
            Logger.getLogger(ProductoData.class.getName()).log(Level.SEVERE, null, ex);
        }
          JOptionPane.showMessageDialog(null,"Error al Borrar Producto");
          
        }
    
}
