
abstract class Aaa
{
    public abstract void show();
    public abstract void config();
}

public class Anon
{
    public static void main(String a[])
    {
        Aaa obj = new Aaa() {
            public void show()
            {
                System.out.println("In New Show");
            }
            public void config()
            {
                System.out.println("In New Config");
            }
        };
        obj.show();
        obj.config();
    }
}
