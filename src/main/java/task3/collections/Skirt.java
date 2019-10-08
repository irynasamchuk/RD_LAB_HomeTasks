package task3.collections;

public class Skirt extends Clothes implements Fabric {
    public Skirt(String name, String size, int prise, String color, String season) {
        super(name, size, prise, color, season);
    }

    @Override
    public void type() {
        System.out.println("The Skirt is from cotton");
    }

    @Override
    public void price() {
        System.out.println("The Skirt costs 500");
    }

    @Override
    public void popularity() {
        System.out.println("The skirt fabric is very popular in Ukraine");
    }
}
