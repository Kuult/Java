

class A
{
    public A()
    {
       System.out.println("object created");
    }
    public void show()
    {
        System.out.println("In A show");
    }
}


public class DemoDemo
{
    public static void main(String[] args)
    {
        new A().show(); // anonymous object
    }
}

