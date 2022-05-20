package com.company.fifth;

import java.util.ArrayList;

public class GenericMethodPrac {

    public void method1(){}

    public void method2(){
        method1();
    }

    public <T> void method3(ArrayList<T> list){}

    public void method4(){
//        <Student7>method3();  // 에러 발생
        this.<Student>method4();
    }

}
class Student{}
