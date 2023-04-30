/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.menudujour;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;

/**
 *
 * @author Malaury
 */
public class PanelMenu extends JPanel{
    
    public PanelMenu(){
       
        JLabel label = new JLabel("Menu du Jour", JLabel.CENTER);
        label.setFont(new Font("Serif", Font.BOLD, 20));
        add(label);
        
    }
    
  
}
