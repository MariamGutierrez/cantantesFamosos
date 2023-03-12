/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainD;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class clasePrueba {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ListadeCantantesFamosos ob = new ListadeCantantesFamosos();
        
        System.out.println("BIENVENIDO A EL COMPARADOR DE VENTAS DE DISCOS: ");
        
        //ingresar primer artistas
        System.out.println("Ingrese datos del primer artista: ");
        System.out.println("Nombre: ");
        String nom = sc.next();
        System.out.println("Ventas: ");
        String ven = sc.next();
        cantanteFamoso obj1 = new cantanteFamoso(nom, ven);
        ob.ingresar(obj1); 
        
        //ingresar segundo artista
        System.out.println("Ingrese datos del primer artista: ");
        System.out.println("Nombre: ");
        String nom1 = sc.next();
        System.out.println("Ventas: ");
        String ven2 = sc.next();
        cantanteFamoso obj2 = new cantanteFamoso(nom1, ven2);
        ob.ingresar(obj2); 
        
        //inicio del menu
        int opcion;
        

            do {

                System.out.println("\nseleccione que desea hacer: ");

                System.out.println("1. ingresar mas datos");

                System.out.println("2. modificar nombres ");

                System.out.println("3. eliminar datos");

                System.out.println("4. imprimir lista de mayor a menor");

                System.out.println("5. imprimir lista actual ");
                
                System.out.println("6. SALIR ");


                System.out.println("Por favor digita una opcion:");

                opcion = sc.nextInt();

                switch (opcion) {

                    case 1 -> {
                        System.out.println("Ingrese datos del artista: ");
                        System.out.println("Nombre: ");
                        String nombre = sc.next();
                        System.out.println("Ventas: ");
                        String ventas = sc.next();
                        cantanteFamoso op = new cantanteFamoso(nombre, ventas);
                        ob.ingresar(op); 
                        ob.imprimir();
                    }

                    case 2 -> {

                        System.out.println("Ingrese nombre del artista a cambiar: ");
                        String nom3 = sc.next();
                        ob.actualizar(nom3); 
                        System.out.println("Lista actualizada: ");
                        ob.imprimir();
                    }

                    case 3 -> {
                        System.out.println("Ingrese nombre del artista a eliminar: ");
                        String nom4 = sc.next();
                        ob.eliminar(nom4); 
                        ob.imprimir();
                      
                    }

                    case 4 -> {
                        ob.comparar();
                        System.out.println("Lista de mayor a menor: ");
                        ob.imprimir();
                    }

                    case 5 -> {
                        ob.imprimir();
                    }
                    case 6 -> {

                        break;
                    }

                    default -> {

                        System.out.println("Opcion incorrecta (◣_◢). Ingresa una opcion valida  ");

                    }

                }

            } while (opcion != 6);

            System.out.println("El menu ha finalizado correctamente. Vuelve pronto! (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧ ");
        }
}

