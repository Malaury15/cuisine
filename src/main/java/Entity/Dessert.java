package Entity;

public class Dessert extends Meal{
    public Dessert(int id, String name, int quantity) {
        super(id, name, quantity);
    }
    @Override
    public String toString() {
        return "Dessert proposé : " + super.toString();
    }
}
