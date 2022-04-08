package com.company.second;

import java.text.SimpleDateFormat;
import java.util.Date;

import static java.lang.System.*;
import static java.lang.Math.random;

public class ImportDatesAndStatic {
    public static void main(String[] args) {
        Date today = new Date();

        SimpleDateFormat date = new SimpleDateFormat("YYYY-MM-dd");
        SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");

        out.println(date.format(today));
        out.println(time.format(today));
        out.println(random());
    }
}
