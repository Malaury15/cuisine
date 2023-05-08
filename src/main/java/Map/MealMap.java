package Map;
import Entity.*;


import java.util.HashMap;

public class MealMap {
    private HashMap<Integer, Meal> theMap;

    public MealMap(HashMap<Integer, Meal> theMap) {
        this.theMap = theMap;
    }

    public void addMap(Meal meal) throws Exception{
        if (meal instanceof MainCourse && theMap.values().stream().filter(m -> m instanceof MainCourse).count() == 3) {
            throw new Exception("Impossible de rajouter un autre plat principal");
        } else if ((meal instanceof Starter) && theMap.values().stream().filter(m -> m instanceof Starter).count() == 4) {
            throw new Exception("Impossible de rajouter une autre entrée");
        } else if ((meal instanceof Dessert) && theMap.values().stream().filter(m -> m instanceof Dessert).count() == 4) {
            throw new Exception("Impossible de rajouter un autre dessert");
        } else {
            theMap.put(meal.getId(), meal);
        }
    }
    public boolean containsMeal(int mealId) {
        return theMap.containsKey(mealId);
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
