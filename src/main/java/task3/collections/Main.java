package task3.collections;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Suit suit = new Suit("suit", "M", 800, "red", "Winter");
        Dress dress = new Dress("dress", "L", 1000, "blue", "Summer");
        Skirt skirt = new Skirt("skirt", "S", 500, "black", "Summer");
        List<Fabric> typesOfClothes = new ArrayList<>();
        typesOfClothes.add(suit);
        typesOfClothes.add(dress);
        typesOfClothes.add(skirt);

        for (Fabric element : typesOfClothes) {
            element.popularity();
            element.price();
            element.type();
        }
    }
}
