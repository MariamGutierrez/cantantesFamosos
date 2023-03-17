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
        System.out.println("Nombre del artista: ");
        String nom = sc.next();
        System.out.println("Nombre del disco: ");
        String nomD = sc.next();
        System.out.println("Codigos: ");
        int cod = sc.nextInt();
        System.out.println("Ventas: ");
        int ven = sc.nextInt();
        cantanteFamoso obj1 = new cantanteFamoso(nomD, ven, cod);
        ob.ingresar(cod, nom, obj1); 
        
        //ingresar segundo artista
        System.out.println("Ingrese datos del segundo artista: ");
        System.out.println("Nombre del artista: ");
        String nom1 = sc.next();
        System.out.println("Nombre del disco: ");
        String nomD1 = sc.next();
        System.out.println("Codigos: ");
        int cod1 = sc.nextInt();
        System.out.println("Ventas: ");
        int ven1 = sc.nextInt();
        cantanteFamoso obj2 = new cantanteFamoso(nomD1, ven1, cod1);
        ob.ingresar(cod1, nom1, obj2); 
        
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
                        System.out.println("Nombre del artista: ");
                        String nom2 = sc.next();
                        System.out.println("Nombre del disco: ");
                        String nomD2 = sc.next();
                        System.out.println("Codigos: ");
                        int cod2 = sc.nextInt();
                        System.out.println("Ventas: ");
                        int ven2= sc.nextInt();
                        cantanteFamoso obj3 = new cantanteFamoso(nomD2, ven2, cod2);
                        ob.ingresar(cod2, nom2, obj3); 
                        ob.imprimir();
                    }

                    case 2 -> {

                        System.out.println("Ingrese nuevo nombre: ");
                        String nom3 = sc.next();
                        System.out.println("Ingrese codigo del artista a cambiar: "); 
                        int cod3 = sc.nextInt();
                        ob.actualizar(nom3, cod3); 
                        ob.imprimir();
                    }

                    case 3 -> {
                        System.out.println("Ingrese codigo del artista a eliminar: ");
                        int nom4 = sc.nextInt();
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

