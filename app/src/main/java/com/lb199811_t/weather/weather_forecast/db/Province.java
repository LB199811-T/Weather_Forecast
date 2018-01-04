package com.lb199811_t.weather.weather_forecast.db;


/**
 * Created by Administrator on 2018/1/4.
 */

public class Province extends dataSupport {
    private  int id;
    private String provinceName;
    private  int provinceCode;
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getProvinceName(){
        return provinceName;
    }
    public void setProvinceName(String provinceName){
        this.provinceName = provinceName;
    }
    public int getProvinceCode(){
        return provinceCode;
    }
    public void setProvinceCode(int provinceCode){
        this.provinceCode = provinceCode;
    }

}
