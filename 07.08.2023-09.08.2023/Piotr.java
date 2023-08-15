

class A
{
    public A()
    {
        super();
        System.out.println("in A");
    }
    public A(int n)
    {
        super();
        System.out.println("in A int");
    }
}

class B extends A
{
    public B()
    {
        super();
        System.out.println("in B");
    }
    public B(int n)
    {
        this();
        System.out.println("in B int");
    }
}

public class Piotr
{
    public static void main(String[] args)
    {
        B obj = new B(5);
    }
}


// Camel casing
// class and interface - Calc, Runable
// variable and method - marks, show()
// constants - PIE, BRAND

//showMyName
//MyData
//age, DATA, Human()