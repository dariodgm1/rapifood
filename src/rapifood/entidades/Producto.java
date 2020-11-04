/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rapifood.entidades;

/**
 *
 * @author Usuario
 */
public class Producto {
        
              private int idProducto;
              private String nombreProducto;
              private double precioProducto;
              private int codigo;
              private boolean activo;

    public Producto() {
    }

    public Producto(String nombreProducto, double precioProducto, int codigo, boolean activo) {
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
        this.codigo = codigo;
        this.activo = activo;
    }

    public Producto(int idProducto, String nombreProducto, double precioProducto, int codigo, boolean activo) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
        this.codigo = codigo;
        this.activo = activo;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
              
                @Override
            public String toString(){
            return "Producto{" + "idProducto=" + idProducto + ", nombreProducto=" + nombreProducto + '}';
        }
}
