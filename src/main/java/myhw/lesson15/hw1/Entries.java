package myhw.lesson15.hw1;

import java.util.ArrayList;
import java.util.List;

public class Entries {

    private String id;
    private String description;
    private String name;
    private List<Runs> runs = new ArrayList<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Runs> getRuns() {
        return runs;
    }

    public void setRuns(List<Runs> runs) {
        this.runs = runs;
    }

}
