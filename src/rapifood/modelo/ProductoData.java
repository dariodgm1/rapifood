/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rapifood.modelo;

import java.sql.Connection;

/**
 *
 * @author Usuario
 */
public class ProductoData {
    
     private Connection con;


    public ProductoData (Conexion conexion) {
      con= conexion.getConnection();//obtengo la coneccion a la base de datos 
    
    }  
}
