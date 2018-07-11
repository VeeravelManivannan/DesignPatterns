package patterns.Decorator;

public class Luxurydecorator extends Car {


    private Car undecoratedcar ;

    Luxurydecorator(Car anycar)
    {
        this.undecoratedcar = anycar ;
    }

    @Override
    void assemble()
    {
        undecoratedcar.assemble();
        System.out.println("DECORATING LUXURY car feature");
    }

}

