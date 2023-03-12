/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainD;

/**
 *
 * @author Usuario
 */
public class cantanteFamoso {
    String nombre;
    String discomasVentas;

    public cantanteFamoso() {
    }

    public cantanteFamoso(String nombre, String discomasVentas) {
        this.nombre = nombre;
        this.discomasVentas = discomasVentas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDiscomasVentas() {
        return discomasVentas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDiscomasVentas(String discomasVentas) {
        this.discomasVentas = discomasVentas;
    }

    @Override
    public String toString() {
        return "cantanteFamoso{" + "nombre=" + nombre + ", discomasVentas=" + discomasVentas + '}';
    }
    
    
     
}
