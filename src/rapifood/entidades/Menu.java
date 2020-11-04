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
public class Menu {
     private int idMenu;
     private int idPedido;
     private int idProducto;

    public Menu() {
    }

    public Menu(int idPedido, int idProducto) {
        this.idPedido = idPedido;
        this.idProducto = idProducto;
    }

    public Menu(int idMenu, int idPedido, int idProducto) {
        this.idMenu = idMenu;
        this.idPedido = idPedido;
        this.idProducto = idProducto;
    }

    public int getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(int idMenu) {
        this.idMenu = idMenu;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

      @Override
            public String toString(){
            return "Menu{" + "idMenu=" + idMenu + ", idPedido=" + idPedido + ", idProducto=" + idProducto +'}';
        }
  
}
