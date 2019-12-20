package testExamples;

public interface Priantable {
    int NUMBER = 5;

    default int number(){
        return 2;
    }

    void print();
}
