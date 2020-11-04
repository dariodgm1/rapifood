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
public class Mesa {
    
     private int idMesa;
     private int capacidad;
     private boolean activo;

    public Mesa() {
    }

    public Mesa(int capacidad, boolean activo) {
        this.capacidad = capacidad;
        this.activo = activo;
    }

    
    public Mesa(int idMesa, int capacidad, boolean activo) {
        this.idMesa = idMesa;
        this.capacidad = capacidad;
        this.activo = activo;
    }

    public int getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
    @Override
            public String toString(){
            return "Mesa{" + "idMesa=" + idMesa + ", capacidad=" + capacidad + ",activo=" + activo +'}';
        }
}
