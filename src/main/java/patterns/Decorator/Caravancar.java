package patterns.Decorator;

public class Caravancar extends Simplecar {

    @Override
    void assemble()
    {
        super.assemble();
        System.out.println("CARAVAN features have been added");
    }
}
