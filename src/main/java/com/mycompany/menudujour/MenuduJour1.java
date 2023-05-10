package com.mycompany.menudujour;

import javax.swing.*;
import java.awt.*;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONValue;

/**
 *
 * @author Malaury
 */
public class MenuduJour1 extends JFrame {

    // Déclaration des variables
    private final MenuJson menuJson;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextField jTextField1;

    public MenuduJour1() {
        //Définition du titre de la fenêtre
        setTitle("Malaury's Restaurant");
        // Fermer la fenêtre et arrêter le programme en cliquant sur la croix
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        //Afficher la fenêtre au centre de l'écran
        setSize(500, 500);
        setLocationRelativeTo(null);

        // Création de l'objet MenuJson
        menuJson = new MenuJson();

        //Initialisation des composants de la fenêtre
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // Méthode pour initialiser les composants de la fenêtre
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();


        // Création d'un JPanel sur fond blanc pour le haut de la fenêtre (le bandeau)
        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel1, BorderLayout.PAGE_START);

        // Création d'un JComboBox pour le choix du type de plat
        jComboBox1.setFont(new java.awt.Font("Arial", 1, 12));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Entrées", "Plats", "Desserts" }));
        // Ajout de la comboBox au bandeau
        jPanel1.add(jComboBox1);

        // Création d'un JLabel pour le nom du plat
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16));
        jLabel1.setForeground(new java.awt.Color(0, 204, 153));
        jLabel1.setText("Nom :");
        // Ajout du JLabel Nom au bandeau
        jPanel1.add(jLabel1);

        // Création d'un JTextField pour entrer le nom du plat
        jTextField1.setFont(new java.awt.Font("Comic Sans MS", 1, 14));
        jTextField1.setPreferredSize(new java.awt.Dimension(200, 50));
        // Ajout du champ pour le nom au bandeau
        jPanel1.add(jTextField1);

        // Création d'un JLabel pour la quantité
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16));
        jLabel2.setForeground(new java.awt.Color(0, 204, 153));
        jLabel2.setText("Quantité :");
        // Ajout du JLabel Qte au bandeau
        jPanel1.add(jLabel2);

        // Ajout d'un JSpinner pour la quantité
        jSpinner1.setPreferredSize(new java.awt.Dimension(60, 40));
        SpinnerNumberModel model = new SpinnerNumberModel(1, 1, Integer.MAX_VALUE, 1); // valeur initiale = 1, valeur minimale = 1, valeur maximale = la plus grande valeur possible pour un entier, pas de 1
        jSpinner1.setModel(model);
        jPanel1.add(jSpinner1);

        // Création d'un JButton pour ajouter le plat au menu
        jButton1.setBackground(new java.awt.Color(0, 204, 153));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12));
       // jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Ajouter");
        // Ajout du JButton Ajouter au bandeau
        jPanel1.add(jButton1);

        //Méthode pour ajouter le plat au menu avec le listener
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        // Création d'un JButton pour supprimer le plat du menu
        jButton2.setBackground(new java.awt.Color(0, 204, 153));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Supprimer");
        // Ajout du JButton Supprimer au bandeau
        jPanel1.add(jButton2);

        //Méthode pour supprimer le plat au menu avec le listener
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        // Création d'un JPanel sur fond vert pour le bas de la fenêtre (le menu)
        jPanel2.setBackground(new java.awt.Color(0, 204, 153));
        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        // Création d'un JLabel pour les entrées
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Entrées :");
        // Ajout de la zone de texte pour les entrées au menu
        jTextArea1.setColumns(20);
        jTextArea1.setRows(4);
        jTextArea1.setEditable(false);
        jScrollPane1.setViewportView(jTextArea1);

        // Création d'un JLabel pour les plats
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Plats :");
        // Ajout de la zone de texte pour les plats au menu
        jTextArea2.setColumns(20);
        jTextArea2.setRows(4);
        jTextArea2.setEditable(false);
        jScrollPane2.setViewportView(jTextArea2);

        // Création d'un JLabel pour les desserts
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Desserts :");
        // Ajout de la zone de texte pour les desserts au menu
        jTextArea3.setColumns(20);
        jTextArea3.setRows(4);
        jTextArea3.setEditable(false);
        jScrollPane3.setViewportView(jTextArea3);

        // Positionnement des éléments dans le JPanel
        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        // Création d'un JPanel pour le bas de la fenêtre
        jPanel5.setBackground(new java.awt.Color(0, 204, 153));
        jPanel5.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel5, java.awt.BorderLayout.PAGE_END);

        // Création du bouton de validation du menu
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 13));
        jButton3.setForeground(new java.awt.Color(0, 204, 153));
        jButton3.setText("VALIDER");
        // Ajout du bouton de validation du menu au JPanel
        jPanel5.add(jButton3);

        // Méthode pour valider le menu avec le listener
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        //création du bouton pour afficher la commande dans la console
        jButton4.setFont(new Font("Tahoma", 1, 13));
        jButton4.setForeground(new Color(0, 204, 153));
        jButton4.setText("COMMANDE");
        // Ajout du bouton de validation du menu au JPanel
        jPanel5.add(jButton4);

            // Méthode pour afficher la commande avec le listener
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        pack();
    }

    // Méthode pour ajouter les éléments au menu au click sur le bouton "Ajouter"
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        String meal = jTextField1.getText();
        int quantite = ((Integer)jSpinner1.getValue()) ;
        String texte = meal + " : " + quantite;
        String selectedValue = jComboBox1.getSelectedItem().toString();

        if (selectedValue.equals("Entrées")) {
            jTextArea1.append(texte + "\n");
            menuJson.addStarter(meal, quantite);
        } else if (selectedValue.equals("Plats")) {
            jTextArea2.append(texte + "\n");
            menuJson.addMainCourse(meal, quantite);
        } else if (selectedValue.equals("Desserts")) {
            jTextArea3.append(texte + "\n");
            menuJson.addDessert(meal, quantite);
        }
    }

    // Méthode pour supprimer les éléments du menu au click sur le bouton "Supprimer"
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        String selectedValue = jComboBox1.getSelectedItem().toString();

        if (selectedValue.equals("Entrées")) {
            try {
                menuJson.removeLastStarters();
                String text = jTextArea1.getText();
                int lastLineBreak = text.lastIndexOf("\n", text.length() - 2);
                jTextArea1.setText(text.substring(0, lastLineBreak + 1));
                JOptionPane.showMessageDialog(this, "La liste a été vidée d'un élément !");
            } catch (IllegalStateException e) {
                JOptionPane.showMessageDialog(this, e.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
            }
        } else if (selectedValue.equals("Plats")) {
            try {
                menuJson.removeLastMainCourses();
                String text = jTextArea2.getText();
                int lastLineBreak = text.lastIndexOf("\n", text.length() - 2);
                jTextArea2.setText(text.substring(0, lastLineBreak + 1));
                JOptionPane.showMessageDialog(this, "La liste a été vidée d'un élément !");
            } catch (IllegalStateException e) {
                JOptionPane.showMessageDialog(this, e.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
            }
        } else if (selectedValue.equals("Desserts")) {
            try {
                menuJson.removeLastDesserts();
                String text = jTextArea3.getText();
                int lastLineBreak = text.lastIndexOf("\n", text.length() - 2);
                jTextArea3.setText(text.substring(0, lastLineBreak + 1));
                JOptionPane.showMessageDialog(this, "La liste a été vidée d'un élément !");
            } catch (IllegalStateException e) {
                JOptionPane.showMessageDialog(this, e.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    // Méthode pour enregistrer le menu au format JSON, au click sur le bouton "Valider"
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        // Vérifier que le menu contient exactement 3 plats principaux et 3 ou 4 desserts et 3 ou 4 entrées
        if (menuJson.getNumberOfStarters() < 3 || menuJson.getNumberOfStarters() > 4) {
            JOptionPane.showMessageDialog(null, "Le nombre d'entrées doit être compris entre 3 et 4.");
            return;
        }
        if (menuJson.getNumberOfMainCourses() != 3) {
            JOptionPane.showMessageDialog(null, "Le menu doit contenir exactement 3 plats principaux.");
            return;
        }
        if (menuJson.getNumberOfDesserts() < 3 || menuJson.getNumberOfDesserts() > 4) {
            JOptionPane.showMessageDialog(null, "Le nombre de desserts doit être compris entre 3 et 4.");
            return;
        }

        // Ecrire le JSON dans un fichier
        try (FileWriter file = new FileWriter("menu2.json")) {
            JSONValue.writeJSONString(menuJson.getMenuJson(), file);
            System.out.println("Le menu a été écrit dans le fichier menu2.json.");
            JOptionPane.showMessageDialog(null, "Le menu a bien été enregistré !");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Une erreur est survenue lors de l'enregistrement du menu : " + e.getMessage());
        }
    }

    // Méthode pour lire la commande dans la console, au click sur le bouton "Commande" en faisant appel à la classe LireJson
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        LireJson.main(new String[]{});
    }

    public static void main(String args[]) {
        // Définition du look and feel Nimbus pour l'interface graphique
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuduJour1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuduJour1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuduJour1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuduJour1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuduJour1().setVisible(true);
            }
        });
    }
}
