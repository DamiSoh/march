package com.company.seventh;

import java.util.*;
import java.util.stream.*;

public class StreamEx1 {
    public static void main(String[] args) {
        Stream<Student> studentStream = Stream.of(
                new Student("김소담", 1, 300),
                new Student("이소담", 1, 200),
                new Student("박소담", 2, 200),
                new Student("장소담", 3, 100),
                new Student("진소담", 3, 250)
        );

        studentStream
                .sorted(Comparator.naturalOrder())
                .forEach(System.out::println);

//        System.out.println(studentStream.count());
    }
}

class Student implements Comparable<Student>{
    String name;
    int ban;
    int totalScore;

    public String getName() {
        return name;
    }

    public int getBan() {
        return ban;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public Student(String name, int ban, int totalScore) {
        this.name = name;
        this.ban = ban;
        this.totalScore = totalScore;
    }

    @Override
    public String toString() {
        return String.format("[%s, %d, %d]", name, ban, totalScore);
    }

    @Override
    public int compareTo(Student s) {
        return s.totalScore - this.totalScore;
    }
}
