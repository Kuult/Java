
class A 
{

}

class B extends A
{

}

class C extends B
{

}

public class DemoCalc {
    public static void main(String[] args) {
        VeryAdvCalc obj = new VeryAdvCalc();
        int r1 = obj.add(4,5);
        int r2 = obj.sub(6,5);
        int r3 = obj.multi(4,5);
        int r4 = obj.div(10,5);
        double r5 = obj.power(4, 2);

        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4 + " " + r5);
    }
}
