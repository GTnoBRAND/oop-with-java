package OOP.abstraction;

abstract class PartialAbstraction {

    //an abstract method
    abstract void drive();

    //abstract method
    public void start(){
        System.out.println("Engine of the car is started");
    }

}
class Sedan extends PartialAbstraction{

    String brand  = "bmw";
    int gear = 1;

    @Override
    void drive() {
        System.out.println("You are driving " + brand + " in: " + gear +  " gear!");
    }
}

class Crossover extends PartialAbstraction{

    String brand = "porche";
    int gear = 3;

    @Override
    void drive() {
        System.out.println("You are driving " + brand + " in: " + gear +  " gear!");
    }
}

public class Brain{

    static void brain(){
        PartialAbstraction sedan = new Sedan();
        sedan.start();
        sedan.drive();

        PartialAbstraction crossover = new Crossover();
        crossover.start();
        crossover.drive();
    }

}