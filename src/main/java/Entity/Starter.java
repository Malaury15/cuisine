package Entity;

public class Starter extends Meal{
    public Starter(int id, String name, int quantity) {
        super(id, name, quantity);
    }
    @Override
    public String toString() {
        return "Entrée proposée : " + super.toString();
    }
}
