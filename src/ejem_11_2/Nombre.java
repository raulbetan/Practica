/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejem_11_2;
import javax.swing.JOptionPane;
/**
 *
 * @author BETAN
 */
/*Se implementa el JOptionPane para unir varias cadenas de caracteres*/
public class Nombre {
    public static void main ( String args [] )
    {
        /*Crea una ventana de dialogo que pide al usuario su nombre*/
        String Nombre = 
                JOptionPane.showInputDialog ( "Introduzca su nombre" );
        /*Crea una ventana de dialogo que pide al usuario su apellido*/
        String ApellidoP = 
                JOptionPane.showInputDialog ( "Introduzca su apellido paterno" );
        /*Crea una ventana de dialogo que pide al usuario su apellido paterno*/
        String ApellidoM = 
                JOptionPane.showInputDialog ( "Introduzca su apellido materno" );
        /*Combina las cadenas de caracteres*/
        String NombreCompleto = Nombre + ApellidoP + ApellidoM;
        
        /*Crea una ventana de dialogo que muestra el nombre completo*/
        JOptionPane.showMessageDialog(null," Su nombre completo es " + NombreCompleto, 
                        "Nombre Completo", JOptionPane.PLAIN_MESSAGE );
    }
}