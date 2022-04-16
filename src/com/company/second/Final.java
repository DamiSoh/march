package com.company.second;

class Final {
    final int a;
    final int b;

//    public Final(final int a, final int b) {
//        this.a = a;
//        this.b = b;
//    }

    // 매개변수에 final 붙이면 나중에 수정 못한다.
    public Final(final int a, final int b){
        this.a = a;
        this.b = b;
    }

    public static void main(String[] args) {
    }
}
