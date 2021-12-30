package myhw.lesson15.hw1;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Case1Model {

    @SerializedName("entries")
    private List<Entries> entriesList = new ArrayList<>();

    public List<Entries> getEntriesList() {
        return entriesList;
    }

    public void setEntriesList(List<Entries> entriesList) {
        this.entriesList = entriesList;
    }
}
