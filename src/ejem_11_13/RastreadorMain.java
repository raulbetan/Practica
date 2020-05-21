/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejem_11_13;

/**
 *
 * @author BETANCOURT
 */
// Prueba de MarcoRastreadorRaton.
import javax.swing.JFrame;

public class RastreadorMain
{
public static void main( String args[] )
{
Rastreador marcoRastreadorRaton = new Rastreador();
marcoRastreadorRaton.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
marcoRastreadorRaton.setSize( 300, 100 ); // establece el tamaño del marco
marcoRastreadorRaton.setVisible( true ); // muestra el marco
} // fin de main
} // fin de la clase RastreadorRaton