package com.company.eighth;

import java.io.*;
import java.util.ArrayList;

public class FileReaderEx1 {
    public static void main(String[] args) throws IOException {
        String fileName = "test.txt";
        FileReader fileReader = new FileReader(fileName);
        int date = 0;
        ArrayList<Character> stringArray = new ArrayList<>();
        while(fileReader.read() != -1){
//            System.out.println((char)fileReader.read());
//            stringArray.add((char)fileReader.read());
            System.out.println(fileReader.read());
        }
        fileReader.close();
        String finalValue = String.valueOf(stringArray);
        System.out.println(finalValue);

//        String fileName = "test.txt";
//        FileReader fileReader = new FileReader(fileName);
//        while()
//        StringReader stringReader = new StringReader()
//        StringWriter stringWriter = new StringWriter();
//
    }
}
