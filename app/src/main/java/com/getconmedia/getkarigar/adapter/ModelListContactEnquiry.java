package com.getconmedia.getkarigar.adapter;

public class ModelListContactEnquiry
{
    private String date;
    private String category_name;
    private String name;
    private String mobileNumber;

    public ModelListContactEnquiry(String date, String category_name, String name, String mobileNumber) {
        this.date = date;
        this.category_name = category_name;
        this.name = name;
        this.mobileNumber = mobileNumber;
    }


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }



}
