package com.company;

import com.company.first.Array;

public class Main {

    public static void main(String[] args) {
        int[] score = Array.score;
        for(int i=0; i < score.length; i++){
            System.out.print(score[i]+ ",");
        }
        String[] strings = Array.strings;
        System.out.println();
        for(int i=0; i < strings.length; i++){
            System.out.println(strings[i]);
        }

        // -- method: System.arraycopy(arr, 0, arrCopy, 0, arr.length);
        String[] stringsCopy = new String[strings.length + 5];
        System.arraycopy(strings, 0, stringsCopy, 0, strings.length);
        for(int i=0; i < stringsCopy.length; i++){
            System.out.print(stringsCopy[i] + ",");
        };

        int arrayLength  = 5;
        int[] arraMix = new int[arrayLength];

        // -- Math.random()
        System.out.println();
        for(int i = 0; i < arrayLength; i++){
            arraMix[i] = (int) (Math.random() * arrayLength);
            System.out.print(arraMix[i] + " ,");
        };

        // 선위 증감자 후위 증감자 ++i, i++
        int first = 1;
        int second = 1;
        System.out.println(first++);
        System.out.println(first);
        System.out.println(++second);
        System.out.println(second);

        int firstSum = first++ +1;
        int secondSum = ++second + 1;
        System.out.println(firstSum);
        System.out.println(secondSum);


    }
}
