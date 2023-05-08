package com.mycompany.menudujour;
import org.json.simple.*;

public class MenuJson {
    private JSONObject menuJson;
  //  private int idCounter;
    private int startersCounter;
    private int mainCoursesCounter;
    private int dessertsCounter;

    public MenuJson() {
        menuJson = new JSONObject();
       // idCounter = 0;
        startersCounter = 0;
        mainCoursesCounter = 0;
        dessertsCounter = 0;
        menuJson.put("starters", new JSONArray());
        menuJson.put("main_courses", new JSONArray());
        menuJson.put("desserts", new JSONArray());
    }
    private void addItem(String type, String nom, int quantite) {
        JSONObject item = new JSONObject();
        item.put("id", getNextId(type));
        item.put("description", nom);
        item.put("qty", quantite);
        JSONArray menu = (JSONArray) menuJson.get(type);
        menu.add(item);
    }

    public void addStarter(String nom, int quantite) {
        addItem("starters", nom, quantite);
    }

    public void addMainCouse(String nom, int quantite) {
        addItem("main_courses", nom, quantite);
    }

    public void addDessert(String nom, int quantite) {
        addItem("desserts", nom, quantite);
    }

    public JSONObject getMenuJson() {
        return menuJson;
    }
    private int getNextId(String type) {
        int id = -1;
        switch (type) {
            case "starters":
                id = ++startersCounter;
                break;
            case "main_courses":
                id = ++mainCoursesCounter;
                break;
            case "desserts":
                id = ++dessertsCounter;
                break;
        }
        return id;
    }
    @Override
    public String toString() {
        JSONArray starters = (JSONArray) menuJson.get("starters");
        JSONArray main_courses = (JSONArray) menuJson.get("main_courses");
        JSONArray desserts = (JSONArray) menuJson.get("desserts");

        StringBuilder sb = new StringBuilder();
        sb.append("Starters:\n");
        for (Object o : starters) {
            JSONObject item = (JSONObject) o;
            sb.append("- ").append(item.get("description")).append(", qty: ").append(item.get("qty")).append("\n");
        }

        sb.append("Main courses:\n");
        for (Object o : main_courses) {
            JSONObject item = (JSONObject) o;
            sb.append("- ").append(item.get("description")).append(", qty: ").append(item.get("qty")).append("\n");
        }

        sb.append("Desserts:\n");
        for (Object o : desserts) {
            JSONObject item = (JSONObject) o;
            sb.append("- ").append(item.get("description")).append(", qty: ").append(item.get("qty")).append("\n");
        }

        return sb.toString();
    }

}
