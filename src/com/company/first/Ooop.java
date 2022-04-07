package com.company.first;

import static java.lang.System.out;

class Ooop {
    public static void main(String[] args) {

        OoopInstance ooop = new OoopInstance();
        ooop.a = 1;              // 초기화 전에는 기본값인 0,
                                 // 초기화 하고 나면 모든 인스턴스 a값도 변경 됨.
        ooop.b = "Hello";
        ooop.c = false;

        out.println(ooop.a);     // 클래스 변수의 사용     -- 1
        out.println(OoopInstance.a); // 클래스 변수의 사용 -- 2
        out.println(ooop.b);
        out.println(ooop.c);
        out.println(ooop);

        int[] intArray = ooop.intFunction();

    }
};


class OoopInstance{
        static int a ; // 클래스 변수
        String b;      // 인스턴스 변수
        boolean c;
        
        int[] intFunction(){
            int[] ints = new int[5];
            return ints;
        }
};




