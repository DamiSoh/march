package com.company.sixth;

import org.w3c.dom.ls.LSOutput;

@FunctionalInterface
interface MyFunction{
        void myMethod();
}

class FuncInterfacePrac{

    public static void main(String[] args) {
        FuncInterfacePrac funcInterfacePrac = new FuncInterfacePrac();
        MyFunction f = () -> System.out.println("myMethod()");
        funcInterfacePrac.aMethod(f);

        // 바로 매개변수로 대입하는 것도 가능하다

        funcInterfacePrac.aMethod(()-> System.out.println("hello"));
    }

    void aMethod(MyFunction f) {
        f.myMethod();
    }
}
