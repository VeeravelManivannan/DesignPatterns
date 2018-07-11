package patterns.Decorator;

public class Sportsdecorator extends Car{

    private Car undecoratedcar ;

    Sportsdecorator(Car anycar)
    {
        this.undecoratedcar = anycar ;
    }

    @Override
    void assemble()
    {
        undecoratedcar.assemble();
        System.out.println("DECORATING SPORTS car feature");
    }

}
