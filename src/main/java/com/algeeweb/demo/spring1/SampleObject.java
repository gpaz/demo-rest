package com.algeeweb.demo.spring1;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

public class SampleObject {

    @SerializedName("name")
    private String mName;

    @SerializedName("ethnicity") // using GSON
    private String mEthnicity;
    
    public SampleObject() {}

    public SampleObject(String name, String ethnicity3) {
        mName = name;
        mEthnicity = ethnicity3;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getEthnicity() {
        return mEthnicity;
    }

    public void setEthnicity(String ethnicity) {
        mEthnicity = ethnicity;
    }
}
