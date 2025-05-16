/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author LAB
 */
public class Agenda {
    
    private String nombre, telefono;
    private Contact_type tipoContacto;

    public Agenda() {
    }

    public Agenda(String nombre, String telefono, Contact_type tipoContacto) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.tipoContacto = tipoContacto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Contact_type getTipoContacto() {
        return tipoContacto;
    }

    public void setTipoContacto(Contact_type tipoContacto) {
        this.tipoContacto = tipoContacto;
    }
    
    
    
}
