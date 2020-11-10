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
public class Reserva {
             
                     private int idReserva;
                     private int idMesa;
                     private int dniCliente;
                     private String apellidoNombreC;
                     private LocalDateTime fechaReserva;
                     private LocalDateTime fechaAhora;
                     private boolean activo;

    public Reserva() {
    }

    public Reserva(int dniCliente, int idMesa, String apellidoNombreC, LocalDateTime fechaReserva, LocalDateTime fechaAhora, boolean activo) {
        this.dniCliente = dniCliente;
        this.idMesa = idMesa;
        this.apellidoNombreC = apellidoNombreC;
        this.fechaReserva = fechaReserva;
        this.fechaAhora = fechaAhora;
        this.activo = activo;
    }

    public Reserva(int idReserva,int idMesa, int dniCliente, String apellidoNombreC, LocalDateTime fechaReserva, LocalDateTime fechaAhora, boolean activo) {
        this.idReserva = idReserva;
        this.idMesa = idMesa;
        this.dniCliente = dniCliente;
        this.apellidoNombreC = apellidoNombreC;
        this.fechaReserva = fechaReserva;
        this.fechaAhora = fechaAhora;
        this.activo = activo;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public int getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(int dniCliente) {
        this.dniCliente = dniCliente;
    }

    public String getApellidoNombreC() {
        return apellidoNombreC;
    }

    public void setApellidoNombreC(String apellidoNombreC) {
        this.apellidoNombreC = apellidoNombreC;
    }

    public LocalDateTime getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(LocalDateTime fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public LocalDateTime getFechaAhora() {
        return fechaAhora;
    }

    public void setFechaAhora(LocalDateTime fechaAhora) {
        this.fechaAhora = fechaAhora;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public int getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
    }
    
                     
                       @Override
            public String toString(){
            return "Reserva{" + "idReserva=" + idReserva + ", apellidoNombreC=" + apellidoNombreC + '}';
        }
}
