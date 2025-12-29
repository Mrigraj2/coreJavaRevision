package lambda;

@FunctionalInterface
interface ReferenceLambda{
    void display(String str);
}

@FunctionalInterface
interface Addition{
    void addition(int x, int y);
}

class Dummy{

    public Dummy(int x, int y){
        System.out.println(x%y);
    }

    public static void reverseString(String str){
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);
    }

    public void exchangeValue(int x, int y){
        System.out.println("Before"+ "x = "+x+ "and "+ "y = "+y);

        x = x^y;
        y = x^y;
        x = x^y;

        System.out.println("After"+ "x = "+x+ "and "+ "y = "+y);
    }

    public void addition(int x, int y){
        System.out.println(x+y);
    }
}

public class MethodReference {
    public static void main(String[] args) {
        ReferenceLambda rl = System.out::println;
        rl.display("Hello world method reference worked");

        ReferenceLambda rla = Dummy::reverseString;
        rla.display("Mrigraj");

        Dummy d = new Dummy(4,5);
        Addition ad = d::addition;
        ad.addition(3,5);

        Dummy d1 = new Dummy(4,5);

        Addition rd = d1::exchangeValue;
        rd.addition(6,7);
    }

}
