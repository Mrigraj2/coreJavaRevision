package generics;

public class GenericDemo<T> {
    @SuppressWarnings("unchecked")
    T[] data = (T[]) new Object[3];

    int length=0;

    public void append(T v)
    {
        data[length++]=v;
    }

    public void display() {for(T x:data) System.out.println(x);}
    public static void main(String[] args) {
        GenericDemo<String> gd = new GenericDemo<>();
        gd.append("Hi");
        gd.append("Hello");
        gd.append("Hello0000000000000000000000000");

        gd.display();
    }
}
