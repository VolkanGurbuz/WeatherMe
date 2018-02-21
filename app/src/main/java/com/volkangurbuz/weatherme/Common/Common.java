package com.volkangurbuz.weatherme.Common;

import android.support.annotation.NonNull;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by VolkanGurbuz on 2/21/2018.
 */

public class Common {

    public static String API_KEY = "e5a097d1c025cd8921d7f23eb8150a6c";
    public static String API_LINK = "http://api.openweathermap.org/data/2.5/weather";


    @NonNull
    public static String apiRequest(String lat, String lng){
        StringBuilder stringBuilder = new StringBuilder(API_LINK);
        stringBuilder.append(String.format("?lat=%s&lon=%s&APPID=%s&units=metric", lat, lng, API_KEY));
        return stringBuilder.toString();
    }

    public static String unixTimeStampToDateTime(double unixtime){
        DateFormat dateFormat = new SimpleDateFormat("HH:mm");
        Date date = new Date();
        date.setTime((long)unixtime * 1000);
        return dateFormat.format(date);

    }

    public static String getImage(String icon){

        return String.format("http://openweathermap.org/img/w/%s/png", icon);
    }

    public static String getDateNow(){
        DateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy HH:mm");
        Date date = new Date();
        return dateFormat.format(date);
    }


}
