package com.company.third;

// p.420 예외처리
// 참고 : https://passionha.tistory.com/146
// e.printStackTrace(), e.getMessage(), e.toString(); --> Throwable에 있음 RuntimeException > Exception > Throwable

public class ArithmeticExceptionPrac {
    public static void main(String[] args) {
        int number = 100;
        int rs = 0;
        for(int i=0; i < 10; i++){
            try{
                rs = number / (int) (Math.random() * 10) ;
                System.out.println("--------------------");
                System.out.println(rs);
            }catch(ArithmeticException e){
                System.out.println("--------------------");
                System.out.println("1. printStackTrace()");
                e.printStackTrace();
                System.out.println("--------------------");
                System.out.println("2. getMessage()");
                System.out.println(e.getMessage());
                System.out.println("--------------------");
                System.out.println("3. getStackTrace()");
                System.out.println(e.getStackTrace());
                System.out.println("--------------------");
                System.out.println("4. toString()");
                System.out.println(e.toString());
                System.out.println("--------------------");
//                System.out.println("Arithmetic Exception");

            }
        }
    }
}
