package myhw.lesson11.task3;

import java.util.ArrayList;
import java.util.List;

public class InstrumentImpl {

    public static void main(String[] args) {

        List<Instrument> list = new ArrayList<>();
        list.add(new Guitar(7));
        list.add(new Drum("14a"));
        list.add(new Trumpet(127));

        for (Instrument l : list) l.play();
    }


}
