package testExamples;

public class Journal implements Priantable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void print(){
        System.out.println("Hello from Journal!");
    };
}
