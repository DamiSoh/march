package com.company.fifth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// 제한된 지네릭 클래스 예제 p. 676

class LimitedGenerics {
    public static void main(String[] args) {

        // Fruits의 자손 클래스이면서, Eatable인터페이스를 구현한 Apple은 문제 없음.
        FruitBox<Apple> appleBox = new FruitBox<Apple>();
        // Eatable인터페이스를 구현하지 않아 에러 뜸.
//        FruitBox<Fruits> fruitBox = new FruitBox<Fruits>();
        // 상속도 구현도 없어 에러 뜸
//        FruitBox<Watermelon> watermelonBox = new Watermelon<Watermelon>;

    }
}

// 조상 클래스 + 인터페이스 구현 둘 다 충족해야할 시에는
// &로 적어준다

class FruitBox<T extends Fruits & Eatable>{
    ArrayList<T> list = new ArrayList<>();
    void add (T item) {list.add(item);}
}

// 인터페이스
interface Eatable{}

// Fruits 조상 클래스
class Fruits{
    public String toString(){return "Fruits";}
}

// Apple 자손 클래스 - Fruits상속 Eatable구현
class Apple extends Fruits implements Eatable{
    @Override
    public String toString(){return "Apple";}
}

// Watermelon 자손 클래스 - Fruits 상속
class Watermelon extends Fruits{
    public String toString(){return "Watermelon";}
}


