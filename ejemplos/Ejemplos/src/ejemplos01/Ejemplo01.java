/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos01;

/**
 *
 * @author reroes
 */
public class Ejemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String miCiudad = obtenerCiudadMayuscula("Loja");
        int o = obtenerMultiplicacion(100, 6); //lo hize por ejercicio
        String nombre = obtenerNombre();
        System.out.printf("%s\n%d\n%s\n%s\n", miCiudad, o, obtenerNombre()
                , nombre);
    }

    public static String obtenerCiudadMayuscula(String m) {
        String m2 = m.toUpperCase();
        return m2;
    }

    public static int obtenerMultiplicacion(int tabla, int limite) {
        int el = tabla*limite;
        return el;
    }

    public static String obtenerNombre() {
        return "Luis";
    }

}
