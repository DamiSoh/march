package com.company.eighth;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderEx1 {
    public static void main(String[] args) {
        String line = "";
        try {
            FileReader fileReader = new FileReader("/Users/sodam/Desktop/javaStandard/march/src/com/company/eighth/BufferedReaderEx1.java");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            for(int i = 1; (line = bufferedReader.readLine())!=null; i++){
                if(line.indexOf(";") != -1){
                    System.out.println(i + " : "+ line);
                }
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
