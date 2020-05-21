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
// Mostrar imagen y texto en una ventana
 import java.awt.FlowLayout;
 import javax.swing.JFrame; 
 import javax.swing.JLabel; 
 import javax.swing.SwingConstants; 
 import javax.swing.Icon; 
 import javax.swing.ImageIcon; 
 public class Imagen extends JFrame
 {

 private JLabel Figura1;

  public Imagen()
 {
 super( "Michi" );
 setLayout( new FlowLayout() );

  Icon gato = new ImageIcon( getClass().getResource( "gato.jpg" ) );

 Figura1 = new JLabel();
 Figura1.setText( "Este es un michi tomandose una selfie" );
 Figura1.setIcon( gato );
 Figura1.setHorizontalTextPosition( SwingConstants.CENTER );
 Figura1.setVerticalTextPosition( SwingConstants.BOTTOM );
 Figura1.setToolTipText( "Figura1" );
 add( Figura1 );
 }
 }