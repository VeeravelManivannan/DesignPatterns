package patterns.Decorator;

public class LuxuryCar extends Simplecar {

    @Override
    void assemble()
    {
        super.assemble();
        System.out.println("LUXURY features have been added");
    }
}
