package Entity;

import java.util.HashMap;

public class Meal {
        private int id;
        private String name;
        private int quantity;

        public Meal(int id, String name, int quantity) {
            this.id = id;
            this.name = name;
            this.quantity = quantity;
        }

        // Getters et setters pour les attributs

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setNom(String name) {
            this.name = name;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

    @Override
    public String toString() {
        return "Id = " + id +
                ", Nom = " + name +
                ", Quantité = " + quantity + "\n";
    }
}
