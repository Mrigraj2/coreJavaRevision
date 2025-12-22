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
    public static void reverseString(String str){
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);
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

        Dummy d = new Dummy();
        Addition ad = d::addition;
        ad.addition(3,5);
    }

}
