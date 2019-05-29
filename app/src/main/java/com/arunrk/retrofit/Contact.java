package com.arunrk.retrofit;

import com.google.gson.annotations.SerializedName;

public class Contact {

    @SerializedName("name")
    String Name;
    @SerializedName("email")
    String Email;

    public String getName() {
        return Name;
    }

    public String getEmail() {
        return Email;
    }
}
