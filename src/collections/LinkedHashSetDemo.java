package collections;

import java.util.*;

public class LinkedHashSetDemo {

    public static void main(String[] args){
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>(5);
        int[] arr={23,12,34,13,34};
        for(int i=0;i<5;i++){
            lhs.add(arr[i]);
        }

        for (Integer lh : lhs) {
            System.out.println(lh);
        }
    }
}
