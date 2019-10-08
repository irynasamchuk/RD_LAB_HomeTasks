package task3.collections;

public abstract class Clothes {
    protected String name;
    protected String size;
    protected int price;
    protected String color;
    protected String season;


    public Clothes(String name, String size, int prise, String color, String season) {
        this.name = name;
        this.size = size;
        this.price = prise;
        this.color = color;
        this.season = season;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }
}
