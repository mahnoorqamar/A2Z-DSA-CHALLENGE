package methods;

abstract class EX {
    abstract void check(String name);
}

public class EXAbstract extends EX {
    @Override
    void check(String name) {
        // Implementation of the abstract method
        System.out.println("Checking name: " + name);
    }

    public static void main(String[] args) {
        EXAbstract exAbstract = new EXAbstract();
        exAbstract.check("ExampleName");
    }
}
