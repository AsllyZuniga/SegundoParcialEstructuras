/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglo2;

import java.util.Scanner;

/**
 *
 * @author HP 360
 */
public class Arreglo2 {
private static int codigo[];
private static String nombre[];
private static double salario[];
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int op;
        codigo[];
        
        do{
        System.out.println("\n       MENU PRINCIPAL");
        System.out.println("1. Ingresar codigo, nombre y sueldo del usuario");
        System.out.println("2. Ver la información registrada ");
        System.out.println("3. Promedio de los salarios");
        System.out.println("4. Encontrar el salario maximo");
        System.out.println("5. Encontrar el salario minimo");
        System.out.println("6. Salir");
        System.out.println("---Seleccione una opción--");
        op=teclado.nextInt();
        
        switch (op) {
            case 1:
                
                break;
            case 2:
                
                break;
            case 3:
                
                break;
            case 4:
                
                break;
            case 5:
                System.out.println("Ha salido del menú");
                break;
            default:
                System.out.println("opción NO valida");
    }
    }       
            while (op != 6);        
    }
    
    }
 
    //codigo-nombre-sueldo del usuario
   
        
    
       