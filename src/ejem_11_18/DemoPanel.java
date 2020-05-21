/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejem_11_18;

/**
 *
 * @author BETANCOURT
 */
// Prueba de MarcoPanel.
 import javax.swing.JFrame;
public class DemoPanel extends JFrame
{
public static void main( String args[] )
{
MarcoPanel marcoPanel = new MarcoPanel();
marcoPanel.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
marcoPanel.setSize( 450, 200 ); // establece el tamaño del marco
marcoPanel.setVisible( true ); // muestra el marco
} // fin de main
} // fin de la clase DemoPanel