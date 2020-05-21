/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejem_11_5;

/**
 *
 * @author BETAN
 */
// Ejemplo para agregar cuadros de texto y mostrar en una ventana su contenido 
// JTextField e introduccion a Eventos
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

 public class TextoEvents extends JFrame
 {
 private JTextField cuadrodenombre; 
 private JTextField correoelectronico;
 private JTextField noeditable1;
 private JTextField noeditable2;
 private JTextField noeditable3;
 private JPasswordField contrasenia;

public TextoEvents()

 {
 super( "Ingrese sus Datos" );
 setLayout( new FlowLayout() );  
  /*construye cuadros de texto no editable y con texto predeterminado
 para determinar lo que hay que ingresar en el cuadro siguiente
 */
noeditable1 = new JTextField( "Nombre: ", 8 );
noeditable1.setEditable( false );
 add( noeditable1 );

 // hace un cuadro de texto para nombre
 cuadrodenombre = new JTextField( 10 );
 add( cuadrodenombre ); 
 
  // otro cuadro con texto predeterminado para el sig cuadro
noeditable2 = new JTextField( "Correo Electronico: ", 20 );
noeditable2.setEditable( false );
 add( noeditable2 );

 /*hace un cuadro con texto predeterminado pero editable para agregar
 correo electronico*/
correoelectronico = new JTextField( "Escriba su correo electronico aqui" );
 add( correoelectronico );

 // otro cuadro de texto no editable para el sig cuadro
noeditable3 = new JTextField( "Ingrese Contrasenia: ", 21 );
noeditable3.setEditable( false );
 add( noeditable3 );

 // construye campo de contraseña con texto predeterminado
 contrasenia = new JPasswordField( "Password" );
 add( contrasenia );

 // registra los manejadores de eventos
 ListenerCuadro escuchador = new ListenerCuadro();
 cuadrodenombre.addActionListener( escuchador );
 correoelectronico.addActionListener( escuchador );
 noeditable1.addActionListener( escuchador );
 noeditable2.addActionListener( escuchador );
 noeditable3.addActionListener( escuchador );
 contrasenia.addActionListener( escuchador );
 }

 // clase para los listeners
 private class ListenerCuadro implements ActionListener
 {
 public void actionPerformed( ActionEvent evento )
 {
 String cadena = ""; 
 // cuando el usuario oprime "Enter" en un cuadro de texto, se muestra lo que contiene
 if ( evento.getSource() == cuadrodenombre )
 cadena = String.format( "Nombre: %s",
 evento.getActionCommand() );

 else if ( evento.getSource() == correoelectronico )
 cadena = String.format( "correoelectronico: %s",
 evento.getActionCommand() );

 else if ( evento.getSource() == noeditable1 )
 cadena = String.format( "cuadro no editable 1: %s",
 evento.getActionCommand() );
 
 else if ( evento.getSource() == noeditable2 )
 cadena = String.format( "cuadro no editable 2: %s",
 evento.getActionCommand() );
 
 else if ( evento.getSource() == noeditable3 )
 cadena = String.format( "cuadro no editable 3: %s",
 evento.getActionCommand() );

 else if ( evento.getSource() == contrasenia )
 cadena = String.format( "Password: %s",
 new String( contrasenia.getPassword() ) );

  JOptionPane.showMessageDialog( null, cadena );//muestra el mensaje.
           }
     }
}