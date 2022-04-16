package com.company.third;

public class ExeptionEx17 {
    public static void main(String[] args) {
        try{
            method1();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static int method1() throws Exception{
        try{
            System.out.println("1");
            int a = 0;
            int b = 1;
            return b/a;
        }catch(Exception e){
            System.out.println("2");
            throw new Exception();
        }
    }
}
