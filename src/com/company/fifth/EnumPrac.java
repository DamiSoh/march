package com.company.fifth;

public class EnumPrac {

    enum Direction {EAST, SOUTH, WEST, NORTH}

    public static void main(String[] args) {
        Direction dir = Direction.EAST;
        System.out.println(dir.compareTo(Direction.SOUTH));
        System.out.println(Direction.SOUTH.ordinal());
        System.out.println(Direction.SOUTH.name());
        System.out.println(Direction.WEST == Direction.valueOf("SOUTH"));
    }

}
