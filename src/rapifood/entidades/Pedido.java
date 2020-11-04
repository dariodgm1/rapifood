/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rapifood.entidades;

import java.time.LocalDateTime;

/**
 *
 * @author Usuario
 */
public class Pedido {
            private int idPedido;
            private int idMesa;
            private int idMesero;
            private double monto;
            private LocalDateTime fechaPedido; 
            private boolean activo;

    public Pedido() {
    }

    public Pedido(int idMesa, int idMesero, double monto, LocalDateTime fechaPedido, boolean activo) {
        this.idMesa = idMesa;
        this.idMesero = idMesero;
        this.monto = monto;
        this.fechaPedido = fechaPedido;
        this.activo = activo;
    }

    public Pedido(int idPedido, int idMesa, int idMesero, double monto, LocalDateTime fechaPedido, boolean activo) {
        this.idPedido = idPedido;
        this.idMesa = idMesa;
        this.idMesero = idMesero;
        this.monto = monto;
        this.fechaPedido = fechaPedido;
        this.activo = activo;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
    }

    public int getIdMesero() {
        return idMesero;
    }

    public void setIdMesero(int idMesero) {
        this.idMesero = idMesero;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public LocalDateTime getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(LocalDateTime fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
            
              @Override
            public String toString(){
            return "Pedido{" + "idPedido=" + idPedido + ", idMesa=" + idMesa + '}';
        }
}
