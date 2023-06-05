abstract class Car      // Abstract class
{
    public abstract void drive();    // Abstract method

    public abstract void fly();
    
    public void playmusic()     // Normal method
    {
        System.out.println("Playing music...");
    }
}

class WagonR extends Car
{
    public void drive()
    {
        System.out.println("Driving...");
    }

    public void fly()
    {
        System.out.println("Flying...");
    }
}


public class Abstract {
    public static void main(String[] args) {
        WagonR car = new WagonR();     
        Car obj = new WagonR();     // Object reference of abstract class type and object of subclass type

        car.drive();
        car.fly();
        car.playmusic();
    }
}
