package com.algeeweb.demo.spring1;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

public class SampleObject {

    @SerializedName("name")
    private String mName;

    @SerializedName("ethnicity2") // using GSON
    private String mEthnicity3;

    @JsonProperty("jacksonTestContributorNameBLAH")
    private String mJacksonContributorName = "DEFAULT_CONTRIBUTOR_NAME";

    public SampleObject() {}

    public SampleObject(String name, String ethnicity3) {
        mName = name;
        mEthnicity3 = ethnicity3;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getEthnicity3() {
        return mEthnicity3;
    }

    public void setEthnicity3(String ethnicity3) {
        mEthnicity3 = ethnicity3;
    }
}
