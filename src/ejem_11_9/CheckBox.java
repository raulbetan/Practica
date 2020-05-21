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
import javax.swing.*;  
import java.awt.event.*;  
public class CheckBox extends JFrame implements ActionListener{  
    private JLabel Titulo;  
    private JCheckBox comida1;
    private JCheckBox comida2;
    private JCheckBox comida3;
    private JCheckBox bebida1;
    private JCheckBox bebida2;
    private JCheckBox bebida3;
    private JButton boton1;  
    public CheckBox(){  
        super ("Sistema para ordenar comida.");
        Titulo = new JLabel("Ordenar Comida");  
        Titulo.setBounds(80,50,150,20);  
        comida1 = new JCheckBox("Tacos @ 60");  
        comida1.setBounds(100,100,150,20);  
        comida2 = new JCheckBox("Hamburguesa @ 30");  
        comida2.setBounds(100,150,150,20);  
        comida3 = new JCheckBox("Torta @ 28");  
        comida3.setBounds(100,200,150,20); 
        bebida1 = new JCheckBox("Te @ 10");  
        bebida1.setBounds(100,250,150,20); 
        bebida2 = new JCheckBox("Refresco @ 15");  
        bebida2.setBounds(100,300,150,20); 
        bebida3 = new JCheckBox("Agua @ 12");  
        bebida3.setBounds(100,350,150,20); 
       
        boton1 = new JButton("Ordenar");  
        boton1.setBounds(100,400,80,30);  
        boton1.addActionListener(this);  
        add(Titulo);
        add(comida1);
        add(comida2);
        add(comida3);
        add(bebida1);
        add(bebida2);
        add(bebida3);
        add(boton1);  
        setSize(400,600);  
        setLayout(null);  
        setVisible(true);  
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
    }  
    public void actionPerformed(ActionEvent e){  
        float amount=0;  
        String msg="";  
        if(comida1.isSelected()){  
            amount+=60;  
            msg="Tacos: 60\n";  
        }  
        if(comida2.isSelected()){  
            amount+=30;  
            msg+="Hamburguesa: 30\n";  
        }  
        if(comida3.isSelected()){  
            amount+=28;  
            msg+="Torta: 28\n";  
        }  
        if(bebida1.isSelected()){  
            amount+=10;  
            msg+="Te: 10\n";  
        }  
        if(bebida2.isSelected()){  
            amount+=15;  
            msg+="Refresco: 15\n";  
        }  
        if(bebida3.isSelected()){  
            amount+=12;  
            msg+="Agua: 12\n";  
        }  
        msg+="-----------------\n";  
        JOptionPane.showMessageDialog(this,msg+"Total: "+amount);  
    }  
    public static void main(String[] args) {  
        new CheckBox();  
    }  
}  