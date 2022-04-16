package com.company.second;

// p. 331 super 의 사용
//        부모 클래스와 자손 클래스에서 서로 다른 변수, 메서드를 중복 정의할 때 사용할 수 있다.

public class Super {
    public static void main(String[] args) {
        ChildforSuper  childforSuper = new ChildforSuper(1,2);
//        childforSuper.method();
//        System.out.println("===================================");
//        childforSuper.printExe();
    }
}

class ChildforSuper extends ParentforSuper{
    int y;
//    void method(){
//        System.out.println("x: " + x);
//        System.out.println("this.x: " + this.x);
//        System.out.println("super.x: " + super.x);
//    }
//
//    void printExe(){
//        System.out.println("Child Print");
//        super.printExe();
//    }


    public ChildforSuper(int x, int y) {
        super();
        this.y = y;
    }
}

class ParentforSuper{
    int x;


    public ParentforSuper() {
        this.x = x;
    }

//    void printExe(){
//        System.out.println("Parent Print");
//    }

}
