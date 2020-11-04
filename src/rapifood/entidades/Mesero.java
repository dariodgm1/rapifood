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
public class Mesero {
            private int idMesero;
            private int dniMesero;
            private int cuitMesero;
            private String nombreMesero;
            private String apellidoMesero;
            private boolean activo;

    public Mesero() {
    }

    public Mesero(int dniMesero, int cuitMesero, String nombreMesero, String apellidoMesero, boolean activo) {
        this.dniMesero = dniMesero;
        this.cuitMesero = cuitMesero;
        this.nombreMesero = nombreMesero;
        this.apellidoMesero = apellidoMesero;
        this.activo = activo;
    }

    public Mesero(int idMesero, int dniMesero, int cuitMesero, String nombreMesero, String apellidoMesero, boolean activo) {
        this.idMesero = idMesero;
        this.dniMesero = dniMesero;
        this.cuitMesero = cuitMesero;
        this.nombreMesero = nombreMesero;
        this.apellidoMesero = apellidoMesero;
        this.activo = activo;
    }

    public int getIdMesero() {
        return idMesero;
    }

    public void setIdMesero(int idMesero) {
        this.idMesero = idMesero;
    }

    public int getDniMesero() {
        return dniMesero;
    }

    public void setDniMesero(int dniMesero) {
        this.dniMesero = dniMesero;
    }

    public int getCuitMesero() {
        return cuitMesero;
    }

    public void setCuitMesero(int cuitMesero) {
        this.cuitMesero = cuitMesero;
    }

    public String getNombreMesero() {
        return nombreMesero;
    }

    public void setNombreMesero(String nombreMesero) {
        this.nombreMesero = nombreMesero;
    }

    public String getApellidoMesero() {
        return apellidoMesero;
    }

    public void setApellidoMesero(String apellidoMesero) {
        this.apellidoMesero = apellidoMesero;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
            
             @Override
            public String toString(){
            return "Mesero{" + "idMesero=" + idMesero + ", nombreMesero=" + nombreMesero + ", apellidoMesero=" +
                    apellidoMesero + ", dniMesero=" + dniMesero + '}';
        }
}
