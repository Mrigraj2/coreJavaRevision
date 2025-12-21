package lambda;

public class MainLambda {
    public static void main(String[] args) {
        Demo1 d1 = (s)->{
            System.out.println(s);
        };
        d1.display("parametrised lambda method");


    }
}
