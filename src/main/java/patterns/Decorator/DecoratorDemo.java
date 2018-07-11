//This logic is awesome

//Decorator pattern
//https://www.journaldev.com/1540/decorator-design-pattern-in-java-example

package  patterns.Decorator ;

class DecoratorDemo
{
    public static void main(String[]args){

      //Assembling a simple CaravanCar
        //Car caravancar = new Caravancar();
        //caravancar.assemble();

        //decorating the caravan with luxury and sports feature
        //Car CaravanWithSportsWithLuxury = new Sportsdecorator( new Luxurydecorator(new Caravancar()));

        Car CaravanWithSportsWithLuxury = new Sportsdecorator(  new Sportsdecorator (new Luxurydecorator(new Caravancar()))  );

        CaravanWithSportsWithLuxury.assemble();

    }
}

