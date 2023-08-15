class A
{
    public void show()
    {
        System.out.println("In A Show");
    }
}
class B extends A
{
    public void show()
    {
        System.out.println("In B Show");
    }
}
class C extends A
{
    public void show()
    {
        System.out.println("In C Show");
    }
}
class Computer
{
    public void pc()
        {
            System.out.println("In Computer");
        }
}
class Laptop extends Computer
{
    
}

public class DemoD {

    public static void main(String[] args)
    {
        A obj = new A();
        obj.show();

        obj = new B();
        obj.show();

        obj = new C();
        obj.show();

        Computer obj1 = new Laptop();
        obj1.pc();
    }
}