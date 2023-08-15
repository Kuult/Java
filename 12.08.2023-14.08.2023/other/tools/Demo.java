package other.tools;

class Aaa {

    public int show(int n1, int n2){
        return n1+n2;
    }
}


class Bbb extends Aaa{
    public int show(int n1, int n2){
        return n1+n2+2;
    }
}


public class Demo {
    public static void main(String[] args) {
        Bbb obj = new Bbb();
        System.out.println();
    }
}


//Overwritting