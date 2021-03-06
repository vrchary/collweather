package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

//SerializedName注解让Json字段和java字段之间建立映射关系
public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
