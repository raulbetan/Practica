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
// Prueba de MarcoFlowLayout.
import javax.swing.JFrame;

public class DemoFlowLayout
{
public static void main( String args[] )
{
MarcoFlowLayout marcoFlowLayout = new MarcoFlowLayout();
marcoFlowLayout.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
marcoFlowLayout.setSize( 350, 75 ); // establece el tamaño del marco
marcoFlowLayout.setVisible( true ); // muestra el marco
} // fin de main
} // fin de la clase DemoFlowLayout