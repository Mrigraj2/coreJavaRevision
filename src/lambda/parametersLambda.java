package lambda;

@FunctionalInterface
interface Demo1{
    void display(String s);
}

public class parametersLambda implements Demo1{

    @Override
    public void display(String s){
        System.out.println(s);
    }
}
