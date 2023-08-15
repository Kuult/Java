// final - variable, method, class


class Calcula
{
    public  void show()
    {
        System.out.println("By ja i ja");
    }
    public void add(int a, int b)
    {
        System.out.println(a+b);
    }
}

class AdvCalcula extends Calcula
{
    public void show()
    {
        System.out.println("By Adam");
    }
}

public class Final {
    public static void main(String[] args)
    {
        AdvCalcula obj = new AdvCalcula();
        obj.show();
        obj.add(1,2);
    }
}
