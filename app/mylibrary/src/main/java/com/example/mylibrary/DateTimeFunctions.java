package com.example.mylibrary;

import android.content.Context;
import android.icu.text.SimpleDateFormat;
import android.icu.util.TimeZone;
import java.util.Date;

public class DateTimeFunctions {
    public static String getDuration(int duration)
    {
        int hours = (int)duration / 3600;
        int remainder = (int) duration - hours * 3600;
        int mins = remainder / 60;
        remainder = remainder - mins * 60;
        int secs = remainder;
        return ""+String.format("%02d",hours)+":"+String.format("%02d",mins)+":"+String.format("%02d",secs);
    }

    public static String secondsToDateTime(long Seconds)
    {
        long lastupdatedTime = Seconds * 1000;
        Date date = new Date(lastupdatedTime);
        SimpleDateFormat formatter_time = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss aa");
        formatter_time.setTimeZone(TimeZone.getTimeZone("UTC"));
        return formatter_time.format(date);
    }


    public static String secondsTohms(long Seconds)
    {
        long lastupdatedTime = Seconds * 1000;
        Date date = new Date(lastupdatedTime);
        final SimpleDateFormat formatter = new SimpleDateFormat("hh:mm aa");
        formatter.setTimeZone(TimeZone.getTimeZone("UTC"));
        return formatter.format(date);
    }
}
