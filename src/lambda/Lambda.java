@FunctionalInterface
interface Demo{
    void display();
}

public class Lambda {
    public static void main(String[] args){
        Demo d = ()->{
            System.out.println("Hello world");
        };
        d.display();
    }
}
