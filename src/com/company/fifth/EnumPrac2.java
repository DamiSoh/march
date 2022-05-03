package com.company.fifth;

public class EnumPrac2 {

    public static void main(String[] args) {
        System.out.println(Location.금천구.name());
        System.out.println(Location.금천구.getValue());
        System.out.println(Location.금천구.getSymbol());
    }
}

enum Location{
    금천구(0, "A"), 관악구(2, "B"), 서대문구(4, "C");

    private final int value;
    private String symbol;

    Location(int value, String symbol) {
        this.value = value;
        this.symbol = symbol;
    }
    //애초에 private final이라 외부에서 접근할 수 없음.

    public int getValue(){
        return value;
    }

    public String getSymbol(){
        return symbol;
    }
}