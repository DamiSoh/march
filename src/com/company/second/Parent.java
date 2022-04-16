package com.company.second;

class Parent {
    public static void main(String[] args) {

        Child child = new Child("hello");

    }
    String age = "in twenties";

    public Parent(String age) {
        this.age = age;
        System.out.println("parent 생성자");
    }
}

class Child extends Parent{
    public Child(String age) {
        super(age);
        System.out.println("child 생성자");
    }
}
