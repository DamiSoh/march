package com.company.seventh;

import java.util.Optional;

public class OptionalEx1 {
    public static void main(String[] args) {
        Optional<String> opt1 = Optional.of("abcdef");
        Optional<Integer> opt2 = opt1.map(String::length);

        System.out.println("1: "+opt1.get());
        System.out.println("2: "+opt2.get());

        System.out.print("3: ");
        int result1 = Optional.of("123")
                .filter(x->x.length() >0)
                .map(Integer::parseInt).orElse(-1);
        System.out.println(result1);

        System.out.print("3: ");
        int result2 = Optional.of("")
                .filter(x->x.length() >0)
                .map(Integer::parseInt).orElse(-1);
        System.out.print(result2);



    }
}
