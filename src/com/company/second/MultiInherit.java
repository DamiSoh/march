package com.company.second;

// p. 324 두 부모 클래스를 사용하고 싶을 때 (자바는 다중 상속이 불가)
//        하나는 상속 받고, 다른 하나는 해당 자식 클래스를 포함시켜서 사용하면 된다.

class MultiInherit extends FirstParent {

    SecondParent secondParent = new SecondParent();

    public static void main(String[] args) {
        MultiInherit multiInherit = new MultiInherit();
        multiInherit.printMeth();
        multiInherit.secondParent.printFunc();
    }

}

class FirstParent{
    void printMeth(){
        System.out.println("print : FirstParent");
    }
}

class SecondParent{
    void printFunc(){
        System.out.println("print : SecondParent");
    }
}