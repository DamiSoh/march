package com.company.fourth;

import java.util.*;

public class Timeprac {
    public static void main(String[] args) {
        final int[] TIME_UNIT = {3600, 60, 1};
        final String[] TIME_UNIT_NAME = {"시간", "분", "초"};

        Calendar time1 = Calendar.getInstance();
        Calendar time2 = Calendar.getInstance();

        time1.set(Calendar.HOUR_OF_DAY, 10);
        time1.set(Calendar.MINUTE, 20);
        time1.set(Calendar.SECOND, 30);

        time2.set(Calendar.HOUR_OF_DAY, 20);
        time2.set(Calendar.MINUTE, 30);
        time2.set(Calendar.SECOND, 10);

        long difference =
                Math.abs(time1.getTimeInMillis() - time2.getTimeInMillis())/1000;

        System.out.println("시간의 차이는 " + difference + "(초) 입니다.");

        String tmp = "";

        for(int i=0; i<TIME_UNIT.length; i++){
            tmp += difference/TIME_UNIT[i] + TIME_UNIT_NAME[i];
            difference %= TIME_UNIT[i];
        }

        System.out.println(tmp + " 차이입니다.");

        Calendar time3 = Calendar.getInstance();
        System.out.println(time3.get(Calendar.DAY_OF_WEEK));

    }




}
