package com.lb199811_t.weather.weather_forecast.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2018/1/5.
 */

public class ForeCast {
    public String date;

    @SerializedName("tmp")
    public Temperature temprature;

    @SerializedName("cond")
    public More more;

    public class Temperature{

        public String max;

        public String min;
    }
    public class  More{

        @SerializedName("txt_d")
        public String info;
    }
}
