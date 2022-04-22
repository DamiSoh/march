package com.company.fourth;

import java.util.HashSet;
import java.util.Set;

public class HashSetPrac {
    public static void main(String[] args) {

        HashSet set = new HashSet();
        Person person = new Person("Dami", 28);
        set.add("abc");
        set.add(new Person("Dami", 28));
        set.add(person);
        System.out.println(person + ", " + person.hashCode());
        System.out.println(set);

    }

}

class Person{
    String name ;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean equals(Object obj){
        if(obj instanceof Person) {
            Person personCompare = (Person)obj;
            return personCompare.name.equals(name) && personCompare.age == age;
        }

        return false;
    };

    public int hashCode(){
        return (name+age).hashCode();
    }
    public String toString(){
        return this.name + " : " + this.age;
    }
}
