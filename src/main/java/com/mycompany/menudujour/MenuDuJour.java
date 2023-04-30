package com.mycompany.menudujour;

import Entity.*;
import java.util.HashMap;
import Map.*;


/**
     *
     * @author Malaury
     */
    public class MenuDuJour {

        public static void main(String[] args) {
           // new FrameMenu("Malaury's Restaurant");

            // Création des Hashmaps pour les entrées, plats et desserts
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

            MainCourse mainCourse1 = new MainCourse(1,"Steak frites", 5);
            MainCourse mainCourse2 = new MainCourse(2,"Poulet rôti", 10);
            MainCourse mainCourse3 = new MainCourse(3,"Pâtes carbonara", 2);

            Dessert dessert1 = new Dessert(1,"Tarte aux pommes", 5);
            Dessert dessert2 = new Dessert(2,"Mousse au chocolat", 10);
            Dessert dessert3 = new Dessert(3,"Salade de fruits", 2);


            // Ajout des entrées, plats et desserts à leurs HashMaps respectives
            starterMap.addMap(starter1);
            starterMap.addMap(starter2);
            starterMap.addMap(starter3);

            mainCourseMap.addMap(mainCourse1);
            mainCourseMap.addMap(mainCourse2);
            mainCourseMap.addMap(mainCourse3);

            dessertMap.addMap(dessert1);
            dessertMap.addMap(dessert2);
            dessertMap.addMap(dessert3);

            // Affichage du contenu des HashMaps
            System.out.println(starterMap.toString());
            System.out.println(mainCourseMap.toString());
            System.out.println(dessertMap.toString());
        }
    }
