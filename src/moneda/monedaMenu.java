/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package moneda;

import java.util.Scanner;
import static moneda.moneda.ActualizarDatos;
import static moneda.moneda.Agregar;
import static moneda.moneda.Llenar;
import static moneda.moneda.Eliminar;

/**
 *
 * @author Sebas
 */
public class monedaMenu {
    
    /**
     * @param args the command line arguments
     */

    static Scanner entradaDato = new Scanner(System.in);

    public static void menu(){
        System.out.println("Seleccione una opcion");
        System.out.println("1. Listado de moneda");
        System.out.println("2. Agrregar moneda");
        System.out.println("3. Actualizar moneda");
        System.out.println("4. Eliminar moneda");
        System.out.println("0. Salir");  
    }
    public static void opciones(int opcion){
            switch (opcion){
                case 0: System.out.println("Adios");
                case 1:Llenar(); break;
                case 2: Agregar(); break;
                case 3:ActualizarDatos(); break;
                case 4: Eliminar(); break;
            }
    }
        public static void menuopcionesIndex(){
        int opcion;
        do{
            menu();
            opcion = entradaDato.nextInt();
            opciones (opcion);
        } while (opcion != 0);
    }
    public static void main(String[] args) {
        menuopcionesIndex();
    }
}
         
         /*borrarmunicipio(4);
         System.out.println(municipios.toString());
         
         llenarmonedas();
    }
}
         /*monedaConstructor pesos = new monedaConstructor(1,"peso","$",1);
         System.out.println(pesos.toString());
         
         monedaConstructor dollar = new monedaConstructor(2,"dollar","$",19);
         System.out.println(pesos.toString());
         
         monedaConstructor euro = new monedaConstructor(3,"euro","e",15);
         System.out.println(euro.toString());
 
        // TODO code application logic here
        String mivariable=new String();
        mivariable= "12345";
        
        String varimplicita=new String("ABCDEF");
        
        municipio campeche=new municipio();
        campeche.setId(1);
        campeche.setNombre("campeche");
        System.out.println(campeche.toString());
        
        municipio calkini=new municipio(2,"calkini");
        System.out.println(calkini.toString());
        
        municipio camen=new municipio();
         campeche.setId(3);
        campeche.setNombre("camen");
        System.out.println(camen.toString());
        
        municipio hopelchen=new municipio(4,"hopelchen");
        System.out.println(calkini.toString()); */
