/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos01;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo03 {

    public static void main(String[] args) {
        // 
        int valor = obtenerSuma(10, 30); // se invoca al método 
                                         // obtenerSuma
        int valor2 = obtenerSuma2();
        System.out.printf("El valor de la suma es: %d\n"
                + "El valor de la nueva suma es: %d\n", valor, valor2);
        
        // System.out.printf("El valor de la suma es: %d\n", obtenerSuma(10, 30));
    }
    
    
    private static int obtenerSuma(int a, int b){
       // int suma;
        int suma = a + b;
        return suma;
        // return a + b;
        //return 40;
    }
    
    private static int obtenerSuma2(){
        Scanner entrada = new Scanner(System.in);
       // int suma;\
        System.out.println("Ingrese valor de a: ");
        int a = entrada.nextInt();
        System.out.println("Ingrese valor de b: ");
        int b = entrada.nextInt();
        int suma = a + b;
        return suma;
       
    }
    
    
}
