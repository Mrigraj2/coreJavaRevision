package collections;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.List;

public class LinkedClass {

    public static void main(String[] args){
        LinkedList<Integer> ll = new LinkedList<>();
        LinkedList<Integer> ll2 = new LinkedList<>(List.of(23,34,45,56));
        ll.add(Integer.valueOf(10));
        ll.add(20);
        ll.addAll(ll2);
        System.out.println(ll);
        System.out.println(ll.getFirst());

        ll.retainAll(ll2);
        System.out.println(ll);

        ListIterator<Integer> it = ll.listIterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
