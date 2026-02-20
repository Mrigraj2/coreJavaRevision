package generics.multipleparameters;

public class Data<T,K> {
    private T key;
    private K value;

    public void append(T key, K value){
        this.key=key;
        this.value=value;
    }

    public static void main(String[] args){
        Data<Integer,String> d = new Data<>();
        d.append(1,"Hi");
        d.append(2,"hello");
    }
}
