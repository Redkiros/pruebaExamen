package Clases;

import java.util.Scanner;

/**********************************************************************************************************************************************
 *   APLICACIÓN: "JLC_SAM"                                                                                                                    *
 **********************************************************************************************************************************************
 *   ACCESO A DATOS - FACTORÍA DE PROYECTOS 2DAM  -  Intellij Ultimate IDE v2022.3.2                                                          *
 **********************************************************************************************************************************************
 *   @author Jorge Otin Caba, Laura Butler Gracia, Jose Manuel Sanchez del Palacio                  										  *
 *   @since 13-ENERO-2023                                                                                                                     *
 **********************************************************************************************************************************************
 *   COMENTARIOS:                                                                                                                             *
 *        - Clase LeerDatos.                                                                                                                  *
 *        - Clase que contiene métodos para leer datos de teclado.                                                                            *
 *        - También se implementa el manejo de errores.                                                                                       *
 **********************************************************************************************************************************************/

public class LeerDatos {
    /**
     * Método para imprimir mensaje que se repetía
     */
    static public void mostrarEnPantalla(String mensaje){
        System.out.println(mensaje);
    }


    /**
     * @param texto - Referencia al contenido del dato solicitado
     * @return dato - cadena introducida por teclado
     */
    static public String pideCadena(final String texto) {
        Scanner dataIn = new Scanner(System.in);
        mostrarEnPantalla(texto);
        return dataIn.nextLine();
    }

    /**
     * @param texto - Referencia al contenido del dato solicitado
     * @return dato - entero introducido por teclado
     */
    static public int pideInt(String texto) {
        Scanner sc=new Scanner(System.in);
        int dato=0;
        boolean error=true;
        System.out.println(texto);
        while(error) {
            try {
                dato= Integer.parseInt(sc.nextLine());
                error=false;
            }catch(NumberFormatException e) {
                mostrarEnPantalla("El dato introducido no es entero");
                mostrarEnPantalla("Vuelve a introducir el dato, por favor: ");
                error = true;
            }
        }


        return dato;
    }


    /**
     * @param texto - Referencia al contenido del dato solicitado
     * @return dato - decimal introducido por teclado
     */
    static public double pideDouble(String texto) {
        double dato=0;
        boolean error=true;
        while(error) {
            try {
                dato= Double.parseDouble(pideCadena(texto));
                error=false;
            }catch(NumberFormatException e) {
                mostrarEnPantalla("El dato introducido no es decimal");
                mostrarEnPantalla("Vuelve a introducir el dato, por favor: ");
                error = true;
            }
        }


        return dato;
    }

    /**
     * @param texto - Referencia al contenido del dato solicitado
     * @return dato - decimal introducido por teclado
     */
    static public float pideFloat(String texto) {
        float dato=0;
        boolean error=true;
        while(error) {
            try {
                dato= Float.parseFloat(pideCadena(texto));
                error=false;
            }catch(NumberFormatException e) {
                mostrarEnPantalla("El dato introducido no es decimal");
                mostrarEnPantalla("Vuelve a introducir el dato, por favor: ");
                error = true;
            }
        }


        return dato;
    }


    /**
     * @param texto - Referencia al contenido del dato solicitado
     * @return dato - booleano introducido por teclado
     */
    static public boolean pideBoolean(String texto) {
        boolean dato=true;
        boolean error=true;
        String aux=pideCadena(texto).toLowerCase();
        while(error) {
            mostrarEnPantalla("Introduce un 'true' o 'false'... ");
            if (!aux.equals("true") || !aux.equals("false")) {
                aux=pideCadena("Introduce un 'true' o 'false'... ");
                error=true;
            }
            if(aux.equals("false")) {
                dato=false;
                error=false;
            }else {
                dato=true;
                error=false;
            }
        }
        return dato;
    }
}