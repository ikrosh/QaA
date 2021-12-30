package myhw.lesson15.hw1;

import com.google.gson.annotations.SerializedName;

public class Runs {

    @SerializedName("blocked_count")
    private int blockedCount;
    @SerializedName("completed_on")
    private String completedOn;
    private String config;

    public int getBlockedCount() {
        return blockedCount;
    }

    public void setBlockedCount(int blockedCount) {
        this.blockedCount = blockedCount;
    }

    public String getCompletedOn() {
        return completedOn;
    }

    public void setCompletedOn(String completed_on) {
        this.completedOn = completedOn;
    }

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config;
    }

}
