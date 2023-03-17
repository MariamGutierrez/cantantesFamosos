/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainD;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ListadeCantantesFamosos {
    ArrayList<cantanteFamoso> listaFamoso = new ArrayList<cantanteFamoso>();
    HashMap <Integer, String> map = new HashMap <Integer, String> ();
    Scanner sc = new Scanner(System.in);
    
    public void ingresar(int cod, String name, cantanteFamoso ob){
        listaFamoso.add(ob);
        map.put(cod, name); 
    }
    
    public void imprimir(){
        Iterator<Map.Entry<Integer, String>> iteradorMapa = map.entrySet().iterator(); 
        Iterator<cantanteFamoso> iteradorLista = listaFamoso.iterator();
        
        while (iteradorMapa.hasNext() && iteradorLista.hasNext()) {
            cantanteFamoso ele = iteradorLista.next(); 
            Map.Entry<Integer, String> entry = iteradorMapa.next();
            System.out.println("Nombre: " + entry.getValue() + ele); 
        }
    }
    
    public void comparar(){
       listaFamoso.sort(Comparator.comparingInt(cantanteFamoso::getDiscomasVentas).reversed());
        HashMap<Integer, cantanteFamoso> discosMap = new HashMap<>();
        for (cantanteFamoso disco : listaFamoso) {
            discosMap.put(disco.getCod(), disco);
        }
        listaFamoso.clear();
        for (int codigo : map.keySet()) {
            cantanteFamoso disco = discosMap.get(codigo);
            if (disco != null) {
                listaFamoso.add(disco);
            }
        }
    }
    
    public void eliminar(int cod){
        for (int i = 0; i < listaFamoso.size(); i++) {
            if (listaFamoso.get(i).getCod() == cod) {
                // Si encontramos un objeto con el nombre ingresado, lo eliminamos de la lista
                listaFamoso.remove(i); 
                map.remove(i);
                System.out.println("Se ha eliminado la persona con nombre " + listaFamoso.get(i).getNombre()+ "\n");
                break;
            }
        }
    }
    
    public void actualizar(String nombre, int cod){
            if (map.containsKey(cod)) {
            map.replace(cod, nombre);
        }
    }
    }

