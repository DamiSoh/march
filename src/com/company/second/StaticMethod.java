package com.company.second;

// p.344 static 메소드는 인스턴스 생성없이 사용 가능
//
public class StaticMethod {

    public static void main(String[] args) {
        sayHi();
        StaticMethod staticMethod = new StaticMethod();
        System.out.println("++++++++++++++++++++++++++++");
        staticMethod.sayHello();
    }
    static void sayHi(){
        System.out.println("Hi");
    }

    void sayHello(){
        System.out.println("Hello");
    }
}
