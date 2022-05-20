package com.company.seventh;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamEx4 {
    public static void main(String[] args) {

        String[] array1 = {
                "abc", "def", "ghi"
        };
        String[] array2 = {
                "ABC", "DEF", "GHI", "JKL"
        };

        Stream<String[]> stringStream = Stream.of(array1, array2);
        Stream<String> stringStreamDiv = stringStream.flatMap(Arrays::stream);

        stringStreamDiv.map(String::toLowerCase)
                .distinct()
                .sorted()
                .forEach(System.out::println);

        System.out.println();

        String string1 = "I believe I can fly";
        String string2 = "love you ten thousand";
        String[] stringArray = { string1, string2 };

        Stream<String> stringStream2 = Arrays.stream(stringArray);
        stringStream2.flatMap(line -> Stream.of(line.split(" ")))
                .distinct()
                .map(String::toLowerCase)
                .sorted()
                .forEach(System.out::println);

    }
}
