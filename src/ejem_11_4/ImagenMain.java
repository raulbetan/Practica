/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejem_11_4;

/**
 *
 * @author BETAN
 */
 // Prueba de LabelFrame.
 import javax.swing.JFrame;
 public class ImagenMain
 {
 public static void main( String args[] )
{
Imagen marcoEtiqueta = new Imagen(); // crea objeto LabelFrame
 marcoEtiqueta.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
 marcoEtiqueta.setSize( 300, 300 ); // establece el tamaño del marco
 marcoEtiqueta.setVisible( true ); // muestra el marco
 } // fin de main
 } // fin de la clase PruebaLabel