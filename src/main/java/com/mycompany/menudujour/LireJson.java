package com.mycompany.menudujour;

import java.io.*;
import java.util.HashMap;

import Entity.Dessert;
import Entity.MainCourse;
import Entity.Meal;
import Entity.Starter;
import Map.*;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class LireJson {
    public static void main(String args[]) {
        JSONParser jsonP = new JSONParser();
        JSONParser parser = new JSONParser();

        // Création des Hashmaps pour les entrées, plats et desserts
        HashMap<Integer, Meal> st = new HashMap<>();
        HashMap<Integer, Meal> mains = new HashMap<>();
        HashMap<Integer, Meal> dess = new HashMap<>();

        // Création des objets StarterMap, MainCourseMap et DessertMap à partir des HashMaps
        StarterMap starterMap = new StarterMap(st);
        MainCourseMap mainCourseMap = new MainCourseMap(mains);
        DessertMap dessertMap = new DessertMap(dess);

        try {
            JSONObject jsonO = (JSONObject)jsonP.parse(new FileReader("C:\\Users\\Utilisateur\\Documents\\Devoirs et Cours 3A\\Web\\cuisine\\restaurant_exemple_menu.json"));

            // Parcourir les entrées du menu
            JSONArray starters = (JSONArray) jsonO.get("starters");
            System.out.println("Entrées :");
            for (Object obj : starters) {
                JSONObject plat = (JSONObject) obj;
                int id = ((Long) plat.get("id")).intValue();
                String name = (String) plat.get("description");
                int quantity = ((Long) plat.get("qty")).intValue();
                Starter starter1 = new Starter(id, name, quantity);
                starterMap.addMap(starter1);
              //  System.out.println("Id : " + id + ", Description : " + name + ", Quantité : " + quantity);
            }

            // Parcourir les plats principaux du menu
            JSONArray main_courses = (JSONArray) jsonO.get("main_courses");
            System.out.println("Plats principaux :");
            for (Object obj : main_courses) {
                JSONObject plat = (JSONObject) obj;
                int id = ((Long) plat.get("id")).intValue();
                String name = (String) plat.get("description");
                int quantity = ((Long) plat.get("qty")).intValue();
                MainCourse mainCourse1 = new MainCourse(id, name, quantity);
                mainCourseMap.addMap(mainCourse1);
               // System.out.println("Id : " + id + ", Description : " + name + ", Quantité : " + quantity);
            }

            // Parcourir les desserts du menu
            JSONArray desserts = (JSONArray) jsonO.get("desserts");
            System.out.println("Desserts :");
            for (Object obj : desserts) {
                JSONObject plat = (JSONObject) obj;
                int id = ((Long) plat.get("id")).intValue();
                String name = (String) plat.get("description");
                int quantity = ((Long) plat.get("qty")).intValue();
                Dessert dessert1 = new Dessert(id, name, quantity);
                dessertMap.addMap(dessert1);
               // System.out.println("Id : " + id + ", Description : " + name + ", Quantité : " + quantity);
            }

            // Afficher les hashmaps
            System.out.println("Entrées : " + starterMap);
            System.out.println("Plats principaux : " + mainCourseMap);
            System.out.println("Desserts : " + dessertMap);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        try {
            // Lecture des données du fichier dans un objet JSONObject
            Object obj = parser.parse(new FileReader("menu2.json"));
            JSONObject menuJson = (JSONObject) obj;

            // Parcourir les entrées du menu
            JSONArray starters = (JSONArray) menuJson.get("starters");
            for (Object o : starters) {
                JSONObject item = (JSONObject) o;
                int id = ((Long) item.get("id")).intValue();
                int quantity = ((Long) item.get("qty")).intValue();

                if (st.containsKey(id)) {
                    Meal meal = st.get(id);
                    int newQuantity = quantity - meal.getQuantity();
                    item.put("qty", newQuantity);
                }
            }

            // Parcourir les plats du menu
            JSONArray mainCourses = (JSONArray) menuJson.get("main_courses");
            for (Object o : mainCourses) {
                JSONObject item = (JSONObject) o;
                int id = ((Long) item.get("id")).intValue();
                int quantity = ((Long) item.get("qty")).intValue();

                if (mains.containsKey(id)) {
                    Meal meal = mains.get(id);
                    int newQuantity = quantity - meal.getQuantity();
                    item.put("qty", newQuantity);
                }
            }

            // Parcourir les desserts du menu
            JSONArray desserts = (JSONArray) menuJson.get("desserts");
            for (Object o : desserts) {
                JSONObject item = (JSONObject) o;
                int id = ((Long) item.get("id")).intValue();
                int quantity = ((Long) item.get("qty")).intValue();

                if (dess.containsKey(id)) {
                    Meal meal = dess.get(id);
                    int newQuantity = quantity - meal.getQuantity();
                    item.put("qty", newQuantity);
                }
            }

            // Réécriture des données dans le fichier
            FileWriter file = new FileWriter("menu2.json");
            file.write(menuJson.toJSONString());
            file.flush();
            file.close();

            System.out.println("Modification terminée !");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}