package com.lb199811_t.weather.weather_forecast.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2018/1/5.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
