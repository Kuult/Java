
class Aa
{

    int age;

    public void show()
    {
        System.out.println("in Show");
    }

    static class Bb
    {
        public void config()
        {
            System.out.println("in Config");
        }
    }
}

public class DemoDemo
{
    public static void main(String[] args)
    {
        Aa obj = new Aa();
        obj.show();

        Aa.Bb obj1 = new Aa.Bb();
        obj1.config();
    }
}
