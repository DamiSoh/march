package com.company.seventh;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;

public class StreamEx7 {
    public static void main(String[] args) {
        Student7[] stuArr = {
                new Student7("나자바", true,  1, 1, 300),
                new Student7("김지미", false, 1, 1, 250),
                new Student7("김자바", true,  1, 1, 200),
                new Student7("이지미", false, 1, 2, 150),
                new Student7("남자바", true,  1, 2, 100),
                new Student7("안지미", false, 1, 2,  50),
                new Student7("황지미", false, 1, 3, 100),
                new Student7("강지미", false, 1, 3, 150),
                new Student7("이자바", true,  1, 3, 200),

                new Student7("나자바", true,  2, 1, 300),
                new Student7("김지미", false, 2, 1, 250),
                new Student7("김자바", true,  2, 1, 200),
                new Student7("이지미", false, 2, 2, 150),
                new Student7("남자바", true,  2, 2, 100),
                new Student7("안지미", false, 2, 2,  50),
                new Student7("황지미", false, 2, 3, 100),
                new Student7("강지미", false, 2, 3, 150),
                new Student7("이자바", true,  2, 3, 200)
        };

        System.out.println("1. 성별 분할");
        Map<Boolean, List<Student7>> stuBySex = Stream.of(stuArr)
                .collect(Collectors.partitioningBy(Student7::isMale));
        System.out.println(stuBySex.get(true));
        System.out.println(stuBySex.get(false));

        System.out.println("2. 성별 분할 + 학생 수(count)");
        Map<Boolean, Long> stuBySexWcount = Stream.of(stuArr)
                .collect(Collectors.partitioningBy(Student7::isMale, Collectors.counting()));
        System.out.println("남학생 수: " + stuBySexWcount.get(true));
        System.out.println("여학생 수: " + stuBySexWcount.get(false));

        System.out.println("2. 성별 분할 + 1등 학생");
        Map<Boolean, Optional<Student7>> stuBySexandFirst = Stream.of(stuArr)
                .collect(
                        Collectors.partitioningBy(Student7::isMale,
                            Collectors.maxBy(Comparator.comparingInt(Student7::getScore))
                ));
        System.out.println(stuBySexandFirst.get(true));
        System.out.println(stuBySexandFirst.get(false));
    }
}

class Student7{
    String name;
    boolean isMale;
    int hak;
    int ban;
    int score;

    public Student7(String name, boolean isMale, int hak, int ban, int score) {
        this.name = name;
        this.isMale = isMale;
        this.hak = hak;
        this.ban = ban;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public boolean isMale() {
        return isMale;
    }

    public int getHak() {
        return hak;
    }

    public int getBan() {
        return ban;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return String.format("[%s, %s, %d학년 %d반 %3d점]",
                name, isMale ? "남자":"여자", hak, ban, score);
    }

    enum Level{HIGH, MID, LOW}
}
