package com.getconmedia.getkarigar.adapter;

public class ModelListEmailEnquiry
{
    private String date;
    private String category_name;
    private String name;
    private String mobileNumber;
    private String email;
    private String message;

    public ModelListEmailEnquiry(String date, String category_name, String name, String mobileNumber, String email, String message) {
        this.date = date;
        this.category_name = category_name;
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.message = message;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}
