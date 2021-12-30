package myhw.lesson15.hw1;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.List;

public class Case1ModelConstructor {
    public static void main(String[] args) {
        Case1ModelConstructor case1ModelConstructor = new Case1ModelConstructor();

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        System.out.println(gson.toJson(case1ModelConstructor.getCase1Model()));
    }

    public Case1Model getCase1Model() {
        Runs runs = new Runs();
        runs.setBlockedCount(0);
        runs.setCompletedOn(null);
        runs.setConfig("Firefox, Ubuntu 12");

        List<Runs> runsList = new ArrayList<>();
        runsList.add(runs);

        Entries entries = new Entries();
        entries.setId("3933d74b-4282-4c1f-be62-a641ab427063");
        entries.setDescription("some description");
        entries.setName("File Formats");
        entries.setRuns(runsList);

        List<Entries> entriesList = new ArrayList<>();
        entriesList.add(entries);

        Case1Model case1Model = new Case1Model();
        case1Model.setEntriesList(entriesList);
        return case1Model;
    }
}
