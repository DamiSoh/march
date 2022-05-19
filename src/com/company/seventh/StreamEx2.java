package com.company.seventh;

import java.io.File;
import java.util.stream.Stream;

public class StreamEx2 {
    public static void main(String[] args) {
        File[] fileArray = {
                new File("EX1.java"),
                new File("EX2.bak"),
                new File("EX3.txt"),
                new File("EX4")
        };

        Stream<File> fileStream = Stream.of(fileArray);
        Stream<String> fileString = fileStream.map(File::getName);
        fileString.forEach(System.out::println);

        fileStream = Stream.of(fileArray);

        fileStream.map(File::getName)
                .filter(s->s.indexOf('.') != -1)
                .peek(s->System.out.println(s + " peek"))
                .map(String::toUpperCase)
                .distinct()
                .forEach(System.out::println);



    }
}
