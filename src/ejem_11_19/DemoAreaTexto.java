/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejem_11_19;

/**
 *
 * @author BETANCOURT
*/
// Copia el texto seleccionado de un área de texto a otra.
import javax.swing.JFrame;

public class DemoAreaTexto
{
public static void main( String args[] )
{
MarcoAreaTexto marcoAreaTexto = new MarcoAreaTexto();
marcoAreaTexto.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
marcoAreaTexto.setSize( 425, 200 ); // establece el tamaño del marco
marcoAreaTexto.setVisible( true ); // muestra el marco
} // fin de main
} // fin de la clase DemoAreaTexto