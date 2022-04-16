package com.company.third;

public class StringPrac {
    public static void main(String[] args) {
        String a = "a";
        System.out.println(a.hashCode());
        String b = "b";
        a = a+b;
        System.out.println(a.hashCode());
        System.out.println(a);
    }


}
