package testExamples;

import java.awt.print.Printable;

public class Books implements Priantable {
   private String name;
   private int number = Priantable.NUMBER;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public void print() {
        System.out.println("I am from Books class");
    }
}
