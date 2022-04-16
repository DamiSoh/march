package com.company.second;

// p. 361 부모 - 자손 형변환

class CarTest{
    public static void main(String[] args) {
        // 참조변수는 부모, 자손으로 인스턴스는 모두 자손으로 생성
        // 자손 -> 조상 (형변환 명시 생략 가능)
        // 조상 -> 자손 (형변환 명시 생략 불가)

        Car     carRefType          = new Hyundai();
        Hyundai hyundaiRefType      = new Hyundai();
        Hyundai hyundaiRefType002 ;
        hyundaiRefType002 = (Hyundai) carRefType;

        // 참조변수는 부모, 자손은 부모와 인스턴스로 각각 생성
        // 부모 인스턴스를 자손으로 형변환하는 것은 애초에 불가능하다.
        // 컴파일시 오류 없으나, 실행시 에러가 발생한다.

        Car     car     = new Car();
        Hyundai hyundai = new Hyundai();
        Hyundai hyundaiNew;

        hyundaiNew = (Hyundai)car;

    }
}
class Car {
    String color;

}

class Hyundai extends Car{
    String price ;
}