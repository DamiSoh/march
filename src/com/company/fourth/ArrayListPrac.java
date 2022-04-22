package com.company.fourth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListPrac {
    public static void main(String[] args) {
        final int LIMIT = 10;
        String source = "0123456789abcdefghijABCDEFGHIJ";
        int length = source.length();

        ArrayList list = new ArrayList(length/LIMIT + 10);

        for(int i=0; i < length ;i+=LIMIT){
            if(i<length)
                list.add(source.substring(i, i+LIMIT));

            else
                list.add(source.substring(i));
        }

        System.out.println(list);

        list.remove(0);
        System.out.println(list.get(0));
        System.out.println(list);
        list.add(12345);

        Iterator iterator = list.iterator();
        System.out.println(list);
//        while(iterator.hasNext()){
            System.out.println(iterator.next());
            iterator.remove();
        System.out.println("removed");
            System.out.println(iterator.next());
        System.out.println(iterator.toString());
        System.out.println(list.toString());
        System.out.println(list);
        int[] array = {1,2,3};
        int[] array2 = {3,2,1};
//        Arrays.sort(array2);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.equals(array, array2));
//        }


    }
}
