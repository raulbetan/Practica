/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//paquete del capitulo 11.2(Entrada y salida )
/*En este programa intente hacer lo mismo que en el ejemplo pero con una operacion distinta*/
package ejem_11_2;

/**
 *
 * @author BETAN
 */

import javax.swing.JOptionPane;

public class Resta {
    
    public static void main( String args[] )
            {
                /*Crea una ventana de dialogo que pide un numero entero*/
                String PrimerNumero =
                        JOptionPane.showInputDialog ( "Introduzca un numero entero" );
                /*Crea una ventana de dialogo que pide un numero entero*/
                String SegundoNumero =
                        JOptionPane.showInputDialog ( "Introduzca otro numero entero" );
                /*Convierte el texto que se introdujo en entero*/
                int Numero1 = Integer.parseInt(PrimerNumero);
                int Numero2 = Integer.parseInt(SegundoNumero);
                /*Realiza la suma*/
                int Resta = Numero1 - Numero2;
                /*Crea una ventana de dialogo que muestra un mensaje con el resulado de la suma*/
                JOptionPane.showMessageDialog(null," La resta es: " + Resta, 
                        "Resta de dos enteros", JOptionPane.PLAIN_MESSAGE );
            }
}
