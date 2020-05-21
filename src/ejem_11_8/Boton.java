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
/* este programa crea botones en una ventana y al presionar te devuelve un 
dialogo que te dice cual presionaste*/
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class  Boton extends JFrame
{
    //botones
private JButton botonEmojiSuenio;
private JButton botonCorazon;
private JButton botonEmojiEnojado;
private JButton botonEmojiAsustado;
private JButton botonEmojiFeliz;
private JButton botonEmojiEnfermo;
// Agrega botones a la ventana
 public Boton()
{
super( "¿Como se siente hoy?" );
setLayout( new FlowLayout() );

Icon imagen1 = new ImageIcon( getClass().getResource( "imag1.jpg" ) );
Icon sustitucion1 = new ImageIcon( getClass().getResource( "sust1.png" ) );
botonEmojiSuenio = new JButton( "Con Sueño ", imagen1 );//agrega imagen al boton(se utiliza en cada boton).

botonEmojiSuenio.setRolloverIcon( sustitucion1 );//sustituye la imagen al pasar el cursor(se utiliza en cada boton).
add( botonEmojiSuenio );

Icon imagen2 = new ImageIcon( getClass().getResource( "imag2.jpg" ) );
Icon sustitucion2 = new ImageIcon( getClass().getResource( "sust2.jpg" ) );
botonCorazon = new JButton( "Enamorado ", imagen2 ); 

botonCorazon.setRolloverIcon( sustitucion2 );
add( botonCorazon );

Icon imagen3 = new ImageIcon( getClass().getResource( "imag3.jpg" ) );
Icon sustitucion3 = new ImageIcon( getClass().getResource( "sust3.jpg" ) );
botonEmojiEnojado = new JButton( "Enojado ", imagen3 );

botonEmojiEnojado.setRolloverIcon( sustitucion3 );
add( botonEmojiEnojado );

Icon imagen4 = new ImageIcon( getClass().getResource( "imag4.jpg" ) );
Icon sustitucion4 = new ImageIcon( getClass().getResource( "sust4.jpg" ) );
botonEmojiAsustado = new JButton( "Asustado ", imagen4 );

botonEmojiAsustado.setRolloverIcon( sustitucion4 );
add( botonEmojiAsustado );

Icon imagen5 = new ImageIcon( getClass().getResource( "imag5.jpg" ) );
Icon sustitucion5 = new ImageIcon( getClass().getResource( "sust5.jpg" ) );
botonEmojiFeliz = new JButton( "Feliz ", imagen5 );

botonEmojiFeliz.setRolloverIcon( sustitucion5 ); 
add( botonEmojiFeliz ); 

Icon imagen6 = new ImageIcon( getClass().getResource( "imag6.jpg" ) );
Icon sustitucion6 = new ImageIcon( getClass().getResource( "sust6.jpg" ) );
botonEmojiEnfermo = new JButton( "Enfermo ", imagen6 ); 

botonEmojiEnfermo.setRolloverIcon( sustitucion6 );
add( botonEmojiEnfermo );

// crea el escuchador para botones
ListenerBoton escuchador = new ListenerBoton();
botonEmojiSuenio.addActionListener( escuchador );
botonCorazon.addActionListener( escuchador );
botonEmojiEnojado.addActionListener( escuchador );
botonEmojiAsustado.addActionListener( escuchador );
botonEmojiFeliz.addActionListener( escuchador );
botonEmojiEnfermo.addActionListener( escuchador );

} 

// clase interna para escuchador
private class ListenerBoton implements ActionListener
{
public void actionPerformed( ActionEvent evento )
{
JOptionPane.showMessageDialog( Boton.this, String.format(
"Usted oprimio: %s", evento.getActionCommand() ) );
} 
} 
} 