package com.example.android.tourguide;

/**
 * Created by E1 on 10/16/2017.
 */

public class Location {
    private int image;
    private String name;
    private String location;
    private String phoneNumber;

    public Location(int image, String name, String location, String phoneNumber) {
        this.image = image;
        this.name = name;
        this.location = location;
        this.phoneNumber = phoneNumber;
    }

    public int getImage() {
        return image;
    }


    public String getName() {
        return name;
    }


    public String getLocation() {
        return location;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }

}
