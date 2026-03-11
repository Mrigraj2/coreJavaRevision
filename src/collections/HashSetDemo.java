package collections;

import java.util.*;

public class HashSetDemo {

    public static void main(String[] args){
        HashSet<Integer> lhs = new HashSet<>(5);

        int[] arr={23,12,34,13,44};
        for(int i=0;i<5;i++){
            lhs.add(arr[i]);
        }

        lhs.forEach(System.out::println);
    }
}
