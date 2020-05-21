/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejem_11_14;

/**
 *
 * @author BETANCOURT
 */
// Prueba de MarcoDetallesRaton.
import javax.swing.JFrame;

public class AdaptadorasMain
{
public static void main( String args[] )
{
Adaptadoras marcoDetallesRaton = new Adaptadoras();
marcoDetallesRaton.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
marcoDetallesRaton.setSize( 400, 150 ); // establece el tamaño del marco
marcoDetallesRaton.setVisible( true ); // muestra el marco
} // fin de main
} // fin de la clase DetallesRaton