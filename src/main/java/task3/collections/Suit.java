package task3.collections;

public class Suit extends Clothes implements Fabric {
    public Suit(String name, String size, int price, String color, String season) {
        super(name, size, price, color, season);
    }

    @Override
    public void type() {
        System.out.println("The suit is maked from cotton");
    }

    @Override
    public void price() {
        System.out.println("The suit costs 800 UAN");
    }

    @Override
    public void popularity() {
        System.out.println("The suit fabric is popular in Ukraine");
    }
}
