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
import rapifood.entidades.Reserva;

/**
 *
 * @author Usuario
 */
public class ReservaData {
    
     private Connection con;


    public ReservaData (Conexion conexion) {
      con= conexion.getConnection();//obtengo la coneccion a la base de datos 
    
    }  
    
     public void guardarReserva(Reserva reserva){
        
    
        String sql="INSERT into mesa (idReserva, idMesa, dniCliente, apellidoNombreC, fechaReserva, fechaAhora, activo) "
                + "VALUES(?, ?, ?, ?, ?, ?, ?);";
        
        try{
        
        PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.setInt(1,reserva.getIdReserva());
        ps.setInt(2,reserva.getIdMesa() );
        ps.setInt(3,reserva.getDniCliente());
        ps.setString(4,reserva.getApellidoNombreC());
        ps.setDate(5,reserva.getFechaReserva());
        ps.setDate(6,reserva.getFechaAhora());
        ps.setBoolean(7,reserva.isActivo());
        
        ps.executeUpdate();
        
        ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                reserva.setIdReserva(rs.getInt(1));
            } else {
                JOptionPane.showMessageDialog(null,"No puedo obtener id");
            }
       
        con.close();
        }catch(SQLException e){
        
            JOptionPane.showMessageDialog(null,"Error al guardar mesa");
        }
 }
    
    public void borrarReserva(int idReserva){
    
     
        try {
            
            String sql = "DELETE FROM reserva  WHERE idReserva=?;";
            
            try (PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                ps.setInt(1, idReserva);
                ps.executeUpdate();
            }
        
        } catch (SQLException ex) {
            Logger.getLogger(ReservaData.class.getName()).log(Level.SEVERE, null, ex);
        }
          JOptionPane.showMessageDialog(null,"Error al Borrar Reserva");
          
        }
    
}
