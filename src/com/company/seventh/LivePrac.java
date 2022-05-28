package com.company.seventh;

import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// 14 - 5
// 14 - 8
public class LivePrac {
//    public static void main(String[] args) {
//        String[] strArr = { "aaa","bb","c","dddd" };
//        String strStream1 = Stream.of(strArr)
//                .collect(Collectors.joining());
//        System.out.println("============================");
//        System.out.println("sum= " + strStream1.length());
//        System.out.println("============================");
//
//        Student[] stuArr = {
//                new Student("김지미", false, 1, 1, 250), new Student("김자바", true, 1, 1, 200), new Student("이지미", false, 1, 2, 150), new Student("남자바", true, 1, 2, 100), new Student("안지미", false, 1, 2, 50), new Student("황지미", false, 1, 3, 100), new Student("강지미", false, 1, 3, 150), new Student("이자바", true, 1, 3, 200),
//                new Student("나자바", true, 2, 1, 300), new Student("김지미", false, 2, 1, 250), new Student("김자바", true, 2, 1, 200), new Student("이지미", false, 2, 2, 150), new Student("남자바", true, 2, 2, 100), new Student("안지미", false, 2, 2, 50), new Student("황지미", false, 2, 3, 100), new Student("강지미", false, 2, 3, 150), new Student("이자바", true, 2, 3, 200)
//        };
//
//        Map<Boolean, Map<Boolean, Long>> failedStuBySex = Stream.of(stuArr)
//                .collect(Collectors.groupingBy(
//                            Student::isMale,
//                            Collectors.partitioningBy(Student::isFailed),
////                        Collectors.collectingAndThen(
//                                Collectors.counting())
//                        )
//                );
//
//        long failedMaleStuNum = failedStuBySex.get(true).get(true);
//        long failedFemaleStuNum = failedStuBySex.get(false).get(true);
//
//
//    }
//}
//
//class Student{
//    String name;
//    boolean isMale;
//    int hak;
//    int ban;
//    int score;
//
//    public Student(String name, boolean isMale, int hak, int ban, int score) {
//        this.name = name;
//        this.isMale = isMale;
//        this.hak = hak;
//        this.ban = ban;
//        this.score = score;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public boolean isMale() {
//        return isMale;
//    }
//
//    public int getHak() {
//        return hak;
//    }
//
//    public int getBan() {
//        return ban;
//    }
//
//    public int getScore() {
//        return score;
//    }
//
//    public boolean isFailed(){
//        if(this.score < 150)
//            return true;
//        else
//            return false;
//    }
//
//    @Override
//    public String toString() {
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", isMale=" + isMale +
//                ", hak=" + hak +
//                ", ban=" + ban +
//                ", score=" + score +
//                '}';
//    }
//
//    enum Level {HIGH, MID, LOW}
}


