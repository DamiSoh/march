package com.company.third;
import java.util.*;
import java.util.regex.*;

// pattern. matcher
public class PracTogether {
    public static void main(String[] args) {
        String[] phoneNumArr = {
                "012-3456-7890",
                "099-2456-7890",
                "088-2346-9870",
                "013-3456-7890"
        };

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

//        input = input.trim();

        String source = ".*" + input + ".*";

        Pattern pattern = Pattern.compile(source);

        for(String string : phoneNumArr){
            Matcher matcher = pattern.matcher(string);
            if(matcher.matches()){
                System.out.println("index: "+ string.indexOf(input));
                System.out.println(string);
            }
        }
    }

}
