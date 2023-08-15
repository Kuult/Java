
abstract class Car
{
    public abstract void drive();
    public abstract void fly();


    public void playMusic()
    {
        System.out.println("Play Music");
    }
}

abstract class Wagon extends Car
{
    public void drive()
    {
        System.out.println("Driving...");
    }
}

class UpdatedWagon extends Wagon  //concrete class
{
    public void fly()
    {
        System.out.println("Flying...");
    }
}

public class Auto
{
    public static void main(String[] args)
    {
        Car obj = new UpdatedWagon();
        obj.drive();
        obj.playMusic();
        obj.fly();
    }
}
