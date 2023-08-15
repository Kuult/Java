
class Human
{
    private int age;
    private String name;

    public Human()      //default constructor
    {
        age = 12;
        name = "Johny";
    }

    public Human(int a, String n)       //parameterized constructor
    {
        age = a;
        name = n;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


}



public class Demo {

    public static void main(String[] args)
    {

        Human obj = new Human();
        Human obj1 = new Human(18, "Nanan");
        // obj.setAge (22);
        // obj.setName ("Piotr");

        System.out.println(obj.getName() + " : " + obj.getAge());
        System.out.println(obj1.getName() + " : " + obj1.getAge());

    }
}

