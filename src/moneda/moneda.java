/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moneda;

import java.util.ArrayList;
import java.util.Scanner;
import models.monedaConstructor;


/**
 *
 * @author Sebas
 */

public class moneda {
    
    static ArrayList<monedaConstructor> monedas = new ArrayList<>();
    
    static Scanner entradaDato = new Scanner (System.in);
    
        public static void Llenar(){
            monedas.add(new models.monedaConstructor (1,"peso","$",1));
            monedas.add(new models.monedaConstructor (2,"dollar","$",19));
            monedas.add(new models.monedaConstructor (3,"euro","e",25));
            System.out.println(monedas.toString());
        }
        public static void Agregar(){
            System.out.println("Registre una nueva moneda continente");
            System.out.println("");
            System.out.println("ID");
            int ID = entradaDato.nextInt();
            System.out.println("");
            System.out.println("Nombre");
            String Nombre = entradaDato.next();
            System.out.println("");
            System.out.println("Símbolo");
            String Simbolo = entradaDato.next();
            System.out.println("");
            System.out.println("Valor en pesos mexicanos");
            int valorPesos = entradaDato.nextInt();
            System.out.println("");
            monedas.add(new monedaConstructor(ID, Nombre, Simbolo, valorPesos));
            System.out.println("La localidad se ha agregado exitosamente");
    }
        public static void ActualizarDatos(){
            System.out.println("Ingrese el ID de la moneda a actualizar");
            int ID = entradaDato.nextInt();
            monedas.get(ID);
            System.out.println("");
            System.out.print("Nombre: ");
            String Nombre = entradaDato.next();
            System.out.print("Simbolo");
            String Simbolo = entradaDato.next();
            System.out.println("");
            double valorPesos = entradaDato.nextDouble();
            System.out.println("");
            System.out.println("Los datos de la moneda se han actualizado exitosamente");   
        }
        public static void Eliminar(){
            System.out.println("Ingrese el ID del continente para eliminar");
            System.out.print("ID: ");
            int ID=entradaDato.nextInt();
            monedas.remove(ID);
            System.out.println("La moneda se ha eliminado de forma exitosa");
        }
        public static void opciones(int opcion){
            switch (opcion){
                case 0: System.out.println("Adios");
                case 1: menuopcionesIndex();
            }
    }
            
    public static void menu(){
        System.out.println("1. Regresar al menu anterior");
        System.out.println("0. Salir"); 
    }
    
    public static void menuopcionesIndex(){
        int opcion;
        do{
            menu();
            opcion = entradaDato.nextInt();
            opciones (opcion);
        } while (opcion != 0);
    }
}
