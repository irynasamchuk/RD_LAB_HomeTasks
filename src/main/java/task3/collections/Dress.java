package task3.collections;

public class Dress extends Clothes implements Fabric {
    public Dress(String name, String size, int price, String color, String season) {
        super(name, size, price, color, season);
    }

    @Override
    public void type() {
        System.out.println("The dress is made from silk");
    }

    @Override
    public void price() {
        System.out.println("The dress price 1000 UAN");
    }

    @Override
    public void popularity() {
        System.out.println("The dress fabric is popular in Ukraine");
    }
}

