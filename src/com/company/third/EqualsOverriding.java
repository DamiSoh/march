package com.company.third;
// p.452 Object Class - Equals
class equalsOverriding {

    public static void main(String[] args) {
        Person personA = new Person(1);
        Person personB = new Person(1);
        System.out.println("Is Person A and B Same?: '=='     "  + (personA == personB));
        System.out.println("Is Person A and B Same?: equals() " + personA.equals(personB));
    }
}

class Person{
    int id;

    public boolean equals(Object obj){
        if(obj instanceof Person)
            return id == ((Person)obj).id;
        else
            return false;
    }

    Person(int id){
        this.id = id;
    }
}
