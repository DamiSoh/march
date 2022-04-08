package com.company.second;

final class Final {
    final static int a = 0;
    static int b = 0;

    public static void main(String[] args) {
//        Final.a = 1;
        System.out.println(Final.a);
        Final.b = 2;
        System.out.println(Final.b);
    }
}
