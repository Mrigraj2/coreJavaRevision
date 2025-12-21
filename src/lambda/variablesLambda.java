package lambda;

public class variablesLambda {

    int count =0;

    public void variable1(){
        Demo1 d1 = (s)->{count++;
            System.out.println(s);};
    }

    public void variable2(){
        Demo d = ()->{
            int c = 0;
            System.out.println(c++);
            c++;
        };
    }

    public void variable3(){
        int counting=0;
        Demo d = ()->{
            System.out.println(counting);
        };
    }
}
