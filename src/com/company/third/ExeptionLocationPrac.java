package com.company.third;

public class ExeptionLocationPrac {

    public static void main(String[] args) {
        method1();
//        method2();
    }
    static void method1(){
        try{
            System.out.println("method1 Try문 실행");
        }catch(Exception e){
            e.printStackTrace();
            throw e;
        }
    }

    static void method2() throws Exception {
        System.out.println("method2 실행");
    }
}
