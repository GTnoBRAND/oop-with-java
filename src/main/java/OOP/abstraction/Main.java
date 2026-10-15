package OOP.abstraction;

abstract class Demo{
    abstract void m1();
    abstract void m2();
    abstract void m3();
}

abstract class FirstSubClass extends Demo{
    @Override
    void m1() {
        System.out.println("First method implemented!");
    }
}

class SecondSubClass extends FirstSubClass{

    @Override
    void m2() {
        System.out.println("Second method implementation!");
    }

    @Override
    void m3() {
        System.out.println("Third method implementation!");
    }
}

public class Main {
    static void main() {

        Demo second = new SecondSubClass();
        second.m1();
        second.m2();
        second.m3();

    }
}
