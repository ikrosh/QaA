package myhw.lesson11.task1;

import java.util.ArrayList;
import java.util.List;

public class FigureImpl {

    public static void main(String[] args) {
        List<Figure> list = new ArrayList<>();
        list.add(new Quadrate(2));
        list.add(new Rectangle(2, 3));
        list.add(new RightTriangle(3, 4));

        for (Figure l : list) {
            l.square();
            l.perimeter();
        }
    }
}
