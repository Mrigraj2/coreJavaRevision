package collections;

import java.util.*;

public class ArrayClass {
    public static void main(String[] args){
        int[] arr = new int[4];
        int count=0;
        for(int i=0;i<arr.length;i++){
            arr[count++]=count;
        }

        ArrayList<Integer> al = new ArrayList<Integer>();
        ArrayList<Integer> al2 = new ArrayList<>(List.of(1,2,3,4,5,6,7));

        al.add(12);
        al.addAll(al2);

        Iterator<Integer> it = al.iterator();

        al.forEach(System.out::print);

        while(it.hasNext()){
            System.out.print(it.next());
        }

        ListIterator<Integer> lit = al.listIterator();
        System.out.println();
        System.out.println(al.size());

        while(lit.hasNext()) System.out.print(lit.next());


    }
}
