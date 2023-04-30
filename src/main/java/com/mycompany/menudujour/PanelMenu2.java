/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.menudujour;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author Malaury
 */
public class PanelMenu2 extends JPanel{
    
    public PanelMenu2(){
        JLabel label = new JLabel("Menu du Jour", JLabel.CENTER);
        label.setFont(new Font("Serif", Font.BOLD, 20));
        add(label);
        
        setFont(new Font("Serif", Font.BOLD, 12));
        String[] menu = { "Entrée", "Plat", "Dessert"};
        JComboBox cb = new JComboBox(menu);
        add(cb);
        
        JLabel label2 = new JLabel("Nom :");
        add(label2);
        
        JTextField text = new JTextField(12);
        add(text);
        
        JLabel label3 = new JLabel("Quantité :");
        add(label3);
        
        SpinnerModel model = new SpinnerNumberModel(
                0, //valeur initiale
                0, //valeur minimum
                50, //valeur maximum
                1 //pas
        ); 
        JSpinner spinner = new JSpinner(model);
        add(spinner);
        
        JButton btn = new JButton("Entrer");
        btn.setBackground(Color.BLUE);
        add(btn);
        //btn.addActionListener((ActionListener) this);
    }
   
}
