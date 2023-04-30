/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.menudujour;

import java.awt.BorderLayout;
import static java.awt.BorderLayout.NORTH;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;

/**
 *
 * @author Malaury
 */
public class FrameMenu extends JFrame {

    private PanelMenu2 part2;
    private PanelMenu3 part3; 
    //private JTextArea entree;
    //private JTextArea plat;
    
    public FrameMenu(String title){
        PanelMenu2 part2 = new PanelMenu2();
        PanelMenu3 part3 = new PanelMenu3();
        
        setTitle(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 750);
        setBackground(Color.WHITE);
        setLayout(new GridLayout(1, 3));
        setLocationRelativeTo(null);          

        add(part2);
        add(part3);
        //entree = new JTextArea();
        //entree.setRows(4);
        //entree.setColumns(2);
        //entree.setBounds(20,10,200,150);
        //add(entree, BorderLayout.WEST);
        
        //plat = new JTextArea(3, 2);
       
        
        setVisible(true); 
    }

    
}
