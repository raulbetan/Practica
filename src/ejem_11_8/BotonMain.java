/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejem_11_8;

/**
 *
 * @author BETAN
 */

import javax.swing.JFrame;

public class BotonMain
{
public static void main( String args[] )
{
Boton marcoBoton = new Boton(); 
marcoBoton.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
marcoBoton.setSize( 1000, 600 ); 
marcoBoton.setVisible( true );
}
}
