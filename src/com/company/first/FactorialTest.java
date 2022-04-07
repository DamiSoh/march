package com.company.first;

import org.w3c.dom.ls.LSOutput;

class FactorialTest {
    public static void main(String[] args) {
        int factorialTest = factorial(4);
        System.out.println(factorialTest);
    }

    static int factorial(int n){
        int rs ;
        if(n != 1)
            rs = n * factorial(n-1);
        else
            rs = 1;
        return rs;
    };
}
