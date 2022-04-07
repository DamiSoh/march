package com.company.second;

class Parent {
    public static void main(String[] args) {
        Parent parent = new Parent();
        System.out.println(parent.age.hashCode());

        Parent child = new Child();
        System.out.println(child.age.hashCode());

    }
    String age = "in twenties";
}

class Child extends Parent{


}
