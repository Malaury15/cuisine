package Map;
import Entity.*;


import java.util.HashMap;

public class MealMap {
    private HashMap<Integer, Meal> theMap;

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
        String mealName = "entrées"; // Par défaut, on considère que la HashMap contient des entrées
        if (theMap.values().size() > 0) {
            mealName = theMap.values().iterator().next().getClass().getSimpleName(); // On prend le type de plat du premier élément de la HashMap
        }
        String texte = "Voici les " + mealName + " à la carte : \n";
        for (Meal meal : theMap.values()){
            texte += "Id : " + meal.getId() + " | Nom : " + meal.getName() + " | Quantité : " + meal.getQuantity() + "\n" ;
        }
        return texte;
    }

}
