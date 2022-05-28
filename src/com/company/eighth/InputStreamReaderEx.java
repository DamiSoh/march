package com.company.eighth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderEx {
    public static void main(String[] args)  {
        String line = "";
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader    br  = new BufferedReader(isr);

        System.out.println("사용중인 인코딩: " + isr.getEncoding());

        do{
            try {
                System.out.println("문장을 입력하세요. 마치려면 q를 입력하세요");
                line = br.readLine();
                System.out.println(line);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }while(!line.equalsIgnoreCase("q"));

//        br.close();
        System.out.println("=== 종료 ===");
    }

}
