/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejem_11_9;

/**
 *
 * @author BETAN
 */
// Creación de botones de opción, usando ButtonGroup y JRadioButton.
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class RadioBoton extends JFrame
{
private JTextField campoTexto; // se utiliza para mostrar los cambios en el tipo de letra
private Font tipoLetraSimple; // tipo de letra para texto simple
private Font tipoLetraNegrita; // tipo de letra para texto en negrita
private Font tipoLetraCursiva; // tipo de letra para texto en cursiva
private Font tipoLetraNegritaCursiva; // tipo de letra para texto en negrita y cursiva
private JRadioButton simple; // selecciona texto simple
private JRadioButton negrita; // selecciona texto en negrita
private JRadioButton cursiva; // selecciona texto en cursiva
private JRadioButton negritaCursiva; // negrita y cursiva
private ButtonGroup grupoOpciones; // grupo de botones que contiene los botones de opción

// El constructor de MarcoBotonOpcion agrega los objetos JRadioButton a JFrame
public RadioBoton()
{
super( "Prueba de RadioButton" );
setLayout( new FlowLayout() ); // establece el esquema del marco

campoTexto = new JTextField( "Observe el cambio en el estilo del tipo de letra", 28 );
add( campoTexto ); // agrega campoTexto a JFrame

// crea los botones de opción
simple = new JRadioButton( "Simple", true );
negrita = new JRadioButton( "Negrita", false );
cursiva = new JRadioButton( "Cursiva", false );
negritaCursiva = new JRadioButton( "Negrita/Cursiva", false );
add( simple ); // agrega botón simple a JFrame
add( negrita ); // agrega botón negrita a JFrame
add( cursiva ); // agrega botón cursiva a JFrame
add( negritaCursiva ); // agrega botón negrita y cursiva

// crea una relación lógica entre los objetos JRadioButton
grupoOpciones = new ButtonGroup(); // crea ButtonGroup
grupoOpciones.add( simple ); // agrega simple al grupo
grupoOpciones.add( negrita ); // agrega negrita al grupo
grupoOpciones.add( cursiva ); // agrega cursiva al grupo
grupoOpciones.add( negritaCursiva ); // agrega negrita y cursiva

// crea objetos tipo de letra
tipoLetraSimple = new Font( "Serif", Font.PLAIN, 14 );
tipoLetraNegrita = new Font( "Serif", Font.BOLD, 14 );
tipoLetraCursiva = new Font( "Serif", Font.ITALIC, 14 );
tipoLetraNegritaCursiva = new Font( "Serif", Font.BOLD + Font.ITALIC, 14 );
campoTexto.setFont( tipoLetraSimple ); // establece tipo letra inicial a simple

// registra eventos para los objetos JRadioButton
simple.addItemListener(
new ManejadorBotonOpcion( tipoLetraSimple ) );
negrita.addItemListener(
new ManejadorBotonOpcion( tipoLetraNegrita ) );
cursiva.addItemListener(
new ManejadorBotonOpcion( tipoLetraCursiva ) );
negritaCursiva.addItemListener(
new ManejadorBotonOpcion( tipoLetraNegritaCursiva ) );
} // fin del constructor de MarcoBotonOpcion

 // clase interna privada para manejar eventos de botones de opción
private class ManejadorBotonOpcion implements ItemListener
{
private Font tipoLetra; // tipo de letra asociado con este componente de escucha

public ManejadorBotonOpcion( Font f )
{
tipoLetra = f; // establece el tipo de letra de este componente de escucha
} // fin del constructor ManejadorBotonOpcion

// maneja los eventos de botones de opción
public void itemStateChanged( ItemEvent evento )
{
campoTexto.setFont( tipoLetra ); // establece el tipo de letra de campoTexto
} // fin del método itemStateChanged
} // fin de la clase interna privada ManejadorBotonOpcion
} // fin de la clase MarcoBotonOpcion