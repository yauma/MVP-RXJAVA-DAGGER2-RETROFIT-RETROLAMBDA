package com.example.jaimequeraltgarrigos.mvptest.domain;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by jaimequeraltgarrigos on 5/15/16.
 */
public class Results {
    @SerializedName("runningscore")
    @Expose
    private String runningscore;
    @SerializedName("halftime")
    @Expose
    private String halftime;

    /**
     *
     * @return
     * The runningscore
     */
    public String getRunningscore() {
        return runningscore;
    }

    /**
     *
     * @param runningscore
     * The runningscore
     */
    public void setRunningscore(String runningscore) {
        this.runningscore = runningscore;
    }

    /**
     *
     * @return
     * The halftime
     */
    public String getHalftime() {
        return halftime;
    }

    /**
     *
     * @param halftime
     * The halftime
     */
    public void setHalftime(String halftime) {
        this.halftime = halftime;
    }
}
