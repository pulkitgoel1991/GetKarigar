package com.getconmedia.getkarigar.adapter;

public class ModelListCustom
{
    private String date;
    private String contact_person;
    private String mobile;
    private String message;

    public ModelListCustom(String date, String contact_person, String mobile, String message) {
        this.date = date;
        this.contact_person = contact_person;
        this.mobile = mobile;
        this.message = message;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContact_person() {
        return contact_person;
    }

    public void setContact_person(String contact_person) {
        this.contact_person = contact_person;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }




}
