package com.company.prac;

public class Unit {
    int x, y;
    void move(){}
    void stop(){}
}

class Marine extends Unit{
    void stimPack(){}
}

class Tank extends Unit{
    void changeMode(){}
}

class Dropship extends Unit{
    void load(){}
    void unload(){}
}

