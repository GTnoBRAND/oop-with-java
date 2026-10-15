package OOP;


abstract class Mood{

    abstract void fun();

    void body(){
        System.out.println("Doing great now!");
    }
}

class TodaysMood extends Mood{

    @Override
    void fun() {
        System.out.println("Today im in a good mood!");
    }
}

public class Main{
    static void main() {
        Mood today = new TodaysMood();
        today.fun();
    }
}