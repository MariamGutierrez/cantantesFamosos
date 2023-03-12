/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainD;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ListadeCantantesFamosos {
    ArrayList<cantanteFamoso> listaFamoso = new ArrayList<cantanteFamoso>();
    Scanner sc = new Scanner(System.in);
    
    public void ingresar(cantanteFamoso ob){
        listaFamoso.add(ob);
    }
    
    public void imprimir(){
        for (cantanteFamoso e : listaFamoso) {
            System.out.println(e.toString());
        }
    }
    
    public void comparar(){
        Collections.sort(listaFamoso, new Comparator<cantanteFamoso>() {
            public int compare(cantanteFamoso c1, cantanteFamoso c2) {
                return Integer.parseInt(c2.getDiscomasVentas())- Integer.parseInt(c1.getDiscomasVentas());
            }
        });
    
    }
    
    public void eliminar(String nombre){
        for (int i = 0; i < listaFamoso.size(); i++) {
            if (listaFamoso.get(i).getNombre().equals(nombre)) {
                // Si encontramos un objeto con el nombre ingresado, lo eliminamos de la lista
                listaFamoso.remove(i);
                System.out.println("Se ha eliminado la persona con nombre " + nombre + "\n");
                break;
            }
        }
    }
    
    public void actualizar(String nombre){
        System.out.println("Ingrese nuevo nombre: ");
        String nuevoNombre = sc.next();
        for (cantanteFamoso p : listaFamoso) {
            if (p.getNombre().equals(nombre)) {
                p.setNombre(nuevoNombre);
        }
    }
    }
}
