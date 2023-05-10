package Map;
import Entity.*;


import java.util.HashMap;

public class MealMap {
    protected HashMap<Integer, Meal> theMap;

    public MealMap(HashMap<Integer, Meal> theMap) {
        this.theMap = theMap;
    }

    public void addMap(Meal meal) {
        theMap.put(meal.getId(), meal);
    }

    public void removeMap(Integer id) {
        theMap.remove(id);
    }
    public String toString() {
        String texte = "Voici les items commandés : \n";
        for (Meal meal : theMap.values()){
            texte += "Id : " + meal.getId() + " | Nom : " + meal.getName() + " | Quantité : " + meal.getQuantity() + "\n" ;
        }
        return texte;
    }
}
