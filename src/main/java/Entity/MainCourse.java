package Entity;

public class MainCourse extends Meal{
    public MainCourse(int id, String name, int quantity) {
        super(id, name, quantity);
    }
    @Override
    public String toString() {
        return "Plat proposé : " + super.toString();
    }
}
