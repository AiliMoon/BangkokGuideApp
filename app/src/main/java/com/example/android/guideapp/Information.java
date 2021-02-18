package com.example.android.guideapp;

public class Information {

    private String place_name;
    private String place_short_address;
    private String place_description;
    private String phoneNumber;
    private String place_full_address;
    private String clickableAddress;

    private int imageSrc;

    public Information(String place_name, String place_short_address, String place_description, String place_full_address, String phoneNumber, int imageSrc){
        this.place_name = place_name;
        this.place_short_address = place_short_address;
        this.place_description = place_description;
        this.place_full_address = place_full_address;
        this.phoneNumber = phoneNumber;
        this.imageSrc = imageSrc;
    }

    public Information(String place_name, String place_short_address, String place_description, String place_full_address, String phoneNumber, int imageSrc, String clickableAddress){
        this.place_name = place_name;
        this.place_short_address = place_short_address;
        this.place_description = place_description;
        this.place_full_address = place_full_address;
        this.phoneNumber = phoneNumber;
        this.imageSrc = imageSrc;
        this.clickableAddress = clickableAddress;
    }

    public String getClickableAddress() {
        return clickableAddress;
    }

    public boolean hasClickableAddress() {
        return clickableAddress != null;
    }

    public String getPlace_name() {
        return place_name;
    }

    public String getPlace_short_address() {
        return place_short_address;
    }

    public String getPlace_description() {
        return place_description;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getPlace_full_address() {
        return place_full_address;
    }

    public int getImageSrc() {
        return imageSrc;
    }
}
