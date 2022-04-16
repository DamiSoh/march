package com.company.second;

public class AbstractTest {
}

abstract class AbstractClass{
    /*주석을 통해 어떤 기능을 수행할 목적으로 작성하였는지 설명한다*/
    abstract void method01();
    void method02(){}; // abstract 메소드가 아닌 메소드도 담을 수 있다. -- 인터페이스는 abstract 메소드와 상수만 가질 수있다. (생략돼있을뿐)
}

class AbstactInherit extends AbstractClass{

    @Override
    void method01() {
        return ;
    }
    @Override
     void method02(){

    }
}
