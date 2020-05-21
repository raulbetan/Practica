/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejem_11_11;

/**
 *
 * @author BETANCOURT
 */
// Selección de colores de un objeto JList.
import javax.swing.JFrame;

public class ListMain
{
public static void main( String args[] )
{
List marcoLista = new List(); // crea objeto MarcoLista
marcoLista.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
marcoLista.setSize( 350, 150 ); // establece el tamaño del marco
marcoLista.setVisible( true ); // muestra el marco
} // fin de main
} // fin de la clase PruebaLista