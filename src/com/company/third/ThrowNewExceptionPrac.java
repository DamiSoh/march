package com.company.third;

// p. 426 throw 에러 발생시 컴파일 에러와 런타임 에러

public class ThrowNewExceptionPrac {
    public static void main(String[] args) {
//        throw new Exception(); //Unhandled Exception Error
        try {
            throw new Exception("Found new Error");
        }catch(Exception e){
            System.out.println(e.toString());

        }
        // RuntimeException과 그 자손들은 에러처리를 강제하지는 않는다.
        // 실행시 에러 발생

        throw new RuntimeException();
        }

}
