package com.mycompany.menudujour;

import Entity.Dessert;
import Entity.MainCourse;
import Entity.Meal;
import Entity.Starter;
import Map.DessertMap;
import Map.MainCourseMap;
import Map.StarterMap;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import org.json.simple.*;


/**
     *
     * @author Malaury
     */
    public class MenuDuJour {

        public static void main(String[] args) throws Exception {
           // Main de départ pour tester les premiers objets du menu

        /*    // Création des Hashmaps pour les entrées, plats et desserts
            HashMap<Integer, Meal> starters = new HashMap<>();
            HashMap<Integer, Meal> mains = new HashMap<>();
            HashMap<Integer, Meal> desserts = new HashMap<>();

            // Création des objets StarterMap, MainCourseMap et DessertMap à partir des HashMaps
            StarterMap starterMap = new StarterMap(starters);
            MainCourseMap mainCourseMap = new MainCourseMap(mains);
            DessertMap dessertMap = new DessertMap(desserts);


            // Création des objets entrée, plat et dessert à stocker dans les HashMaps
            Starter starter1 = new Starter(1,"Salade de tomates", 5);
            Starter starter2 = new Starter(2,"Oeufs mimosa", 10);
            Starter starter3 = new Starter(3,"Assiette de charcuterie", 2);
            Starter starter4 = new Starter(4,"Salade de chèvre chaud", 2);
            Starter starter5 = new Starter(5,"Soupe de légumes", 2);

            MainCourse mainCourse1 = new MainCourse(1,"Steak frites", 5);
            MainCourse mainCourse2 = new MainCourse(2,"Poulet rôti", 10);
            MainCourse mainCourse3 = new MainCourse(3,"Pâtes carbonara", 2);
            MainCourse mainCourse4 = new MainCourse(4,"Pizza", 2);

            Dessert dessert1 = new Dessert(1,"Tarte aux pommes", 5);
            Dessert dessert2 = new Dessert(2,"Mousse au chocolat", 10);
            Dessert dessert3 = new Dessert(3,"Salade de fruits", 2);
            Dessert dessert4 = new Dessert(4,"Tiramisu", 2);
            Dessert dessert5 = new Dessert(5,"Crème brûlée", 2);


            // Ajout des entrées, plats et desserts à leurs HashMaps respectives
            starterMap.addMap(starter1);
            starterMap.addMap(starter2);
            starterMap.addMap(starter3);
            starterMap.addMap(starter4);
            starterMap.addMap(starter5);

            mainCourseMap.addMap(mainCourse1);
            mainCourseMap.addMap(mainCourse2);
            mainCourseMap.addMap(mainCourse3);
            mainCourseMap.addMap(mainCourse4);

            dessertMap.addMap(dessert1);
            dessertMap.addMap(dessert2);
            dessertMap.addMap(dessert3);
            dessertMap.addMap(dessert4);
            dessertMap.addMap(dessert5);

            //Affichage d'une entrée, d'un plat et d'un dessert
            System.out.println(starter1.toString());
            System.out.println(mainCourse1.toString());
            System.out.println(dessert1.toString());

            // Affichage du contenu des HashMaps
            System.out.println(starterMap.toString());
            System.out.println(mainCourseMap.toString());
            System.out.println(dessertMap.toString());

            // Suppression d'une entrée, d'un plat et d'un dessert
            starterMap.removeMap(1);
            mainCourseMap.removeMap(1);
            dessertMap.removeMap(1);

            // Affichage du contenu des HashMaps modifiées
            System.out.println(starterMap.toString());
            System.out.println(mainCourseMap.toString());
            System.out.println(dessertMap.toString());

            // Ajouter les plats
            menu.addStarter("Salade verte", 2);
            menu.addMainCouse("Poulet rôti", 1);
            menu.addDessert("Tarte aux pommes", 3);
            }*/
        }
    }
