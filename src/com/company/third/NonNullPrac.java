package com.company.third;

import java.util.Objects;

// p. 497 Objects 클래스의 requireNonNull의 사용

public class NonNullPrac {
    public static void main(String[] args) {
        NonNullPrac nonNullPrac = new NonNullPrac();
        String a = null;
        nonNullPrac.setName(a); // NullPointerException; 발생
    }
    String name;

//    void setName(String name){
//        if(name == null){
//            throw new NullPointerException();
//        }
//        this.name = name;
//    }
    void setName(String name){
        this.name = Objects.requireNonNull(name);
    }
}
