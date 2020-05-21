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
// Prueba de MarcoBorderLayout.
import javax.swing.JFrame;

public class DemoBorderLayout
{
public static void main( String args[] )
{
MarcoBorderLayout marcoBorderLayout = new MarcoBorderLayout();
marcoBorderLayout.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
marcoBorderLayout.setSize( 375, 200 ); // establece el tamaño del marco
marcoBorderLayout.setVisible( true ); // muestra el marco
} // fin de main
} // fin de la clase DemoBorderLayout