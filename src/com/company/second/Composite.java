package com.company.second;

// p. 316 포함 관계 (composite)   : "~는 ~를 가지고 있다"  --> has-a
//        상속 관계 (inheritance) : "~는 ~이다"         --> is-a
class Composite {

    int r;
    Point point;

    public static void main(String[] args) {
        Composite composite = new Composite();
        System.out.println(composite.point.x + "," + composite.point.y + "," + composite.r);
    }
}

class Point{
    static int x;
    static int y;
}