/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejem_11_17;

/**
 *
 * @author BETANCOURT
 */
// Prueba de MarcoGridLayout.
import javax.swing.JFrame;

public class DemoGridLayout
{
public static void main( String args[] )
{
MarcoGridLayout marcoGridLayout = new MarcoGridLayout();
marcoGridLayout.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
marcoGridLayout.setSize( 300, 200 ); // establece el tamaño del marco
marcoGridLayout.setVisible( true ); // muestra el marco
} // fin de main
} // fin de la clase DemoGridLayout