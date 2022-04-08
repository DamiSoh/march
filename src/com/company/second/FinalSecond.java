package com.company.second;

// p.346 final 멤버 변수를 생성자(Constructor)를 통해 초기화 해주기
//       초기화가 안되다면 static을 붙인 것과 차이가 없게될 것이다.
public class FinalSecond {
    final int a;
    final int b;

    public FinalSecond(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public static void main(String[] args) {
        FinalSecond finalSecond = new FinalSecond(1,2);
        System.out.println("int a: " + finalSecond.a + "  int b: " + finalSecond.b);
    }
}
