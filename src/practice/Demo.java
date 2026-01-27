package practice;

@FunctionalInterface
interface Inter{
    public void exchangeNumbers(int x, int y);
}

class Display{
    int x;
    int y;

    public Display(int x, int y){
        this.x= x;
        this.y=y;
    }
    public void display(Inter it){
//        System.out.println("Before: "+ this.x+ "and "+this.y);
        it.exchangeNumbers(this.x,this.y);
//        System.out.println("After: "+ this.x+ "and "+this.y);
    }
}

public class Demo {

    public static void main(String[] args) {
        Display d = new Display(4,5);
        d.display((x,y)->{
            System.out.println("Before: "+ x+ "and "+y);
            x = x^y;
            y = x^y;
            x = x^y;
            System.out.println("After: "+ x+ "and "+y);
        });
    }

}
