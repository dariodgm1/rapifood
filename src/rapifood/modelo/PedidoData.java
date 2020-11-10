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
import rapifood.entidades.Pedido;
import java.sql.Date;


/**
 *
 * @author Usuario
 */
public class PedidoData {
    
     private Connection con;


    public PedidoData (Conexion conexion) {
      con= conexion.getConnection();//obtengo la coneccion a la base de datos 
    
    }  
    
     public void guardarPedido(Pedido pedido){
        
    
        String sql="INSERT into pedido (idPedido, idMesa, idMesero, monto, fechaPedido, activo) "
                + "VALUES(?, ?, ?, ?, ?. ?);";
        
        try{
        
        PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.setInt(1,pedido.getIdPedido());
        ps.setInt(2,pedido.getIdMesa() );
        ps.setInt(3,pedido.getIdMesero());
        ps.setDouble(4,pedido.getMonto());
        ps.setLocalDateTime(5, Date.valueOf(pedido.getFechaPedido()));
        ps.setBoolean(6,pedido.isActivo());
        
        ps.executeUpdate();
        
        ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                pedido.setIdPedido(rs.getInt(1));
            } else {
                JOptionPane.showMessageDialog(null,"No puedo obtener idPedido");
            }
       
        con.close();
        }catch(SQLException e){
        
            JOptionPane.showMessageDialog(null,"Error al guardar pedido");
        }
 }
      public void borrarMesa(int idPedido){
    
     
        try {
            
            String sql = "DELETE FROM pedido  WHERE idPedido=?;";
            
            try (PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                ps.setInt(1, idPedido);
                ps.executeUpdate();
            }
        
        } catch (SQLException ex) {
            Logger.getLogger(PedidoData.class.getName()).log(Level.SEVERE, null, ex);
        }
          JOptionPane.showMessageDialog(null,"Error al Borrar Pedido");
          
        }
    
}
