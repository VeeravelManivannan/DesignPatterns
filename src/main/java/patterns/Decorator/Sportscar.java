package patterns.Decorator;

public class Sportscar extends Simplecar {

    @Override
    void assemble()
    {
        super.assemble();
        System.out.println("SPORTS features have been incorporated ");
    }
}
