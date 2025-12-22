package lambda;

@FunctionalInterface
interface parameter{
    void display();
}

public class LambdaAsParameter {

    public void lambdaMethod(parameter pr){
        pr.display();
    }

    public static void main(String[] args) {
        LambdaAsParameter lp = new LambdaAsParameter();
        lp.lambdaMethod(()->{
            System.out.println("Lamdba as parameter passed");
        });
    }
}
