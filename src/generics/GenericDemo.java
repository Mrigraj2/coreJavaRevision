package generics;

public class GenericDemo<T> {
    @SuppressWarnings("unchecked")
    T[] data = (T[]) new Object[3];

    public void printArray(T[] array){
        for(T x: array) System.out.println(x);
    }

    public static void main(String[] args) {
        GenericDemo<String> gd = new GenericDemo<>();
        gd.data[0] = "Hi";
        gd.data[1] = "Hello";
        gd.data[2] = "Maybe";

//        gd.printArray(gd.data);
    }
}
