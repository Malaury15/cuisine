package com.mycompany.menudujour;
import org.json.simple.*;

public class MenuJson {
    private JSONObject menuJson;
    private int idCounter;

    public MenuJson() {
        menuJson = new JSONObject();
        idCounter = 0;
        menuJson.put("starters", new JSONArray());
        menuJson.put("main_courses", new JSONArray());
        menuJson.put("desserts", new JSONArray());
    }
    private void addItem(String type, String nom, int quantite) {
        JSONObject item = new JSONObject();
        item.put("id", idCounter++);
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
}
