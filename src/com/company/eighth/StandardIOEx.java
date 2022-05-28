package com.company.eighth;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class StandardIOEx {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream printStream = null;
        FileOutputStream fileOutputStream = null;

        fileOutputStream = new FileOutputStream("text.txt");
        printStream = new PrintStream(fileOutputStream);
        System.setOut(printStream);

        System.out.println("Hello World!");
    }
}
