package ru.jevo;

import java.util.Random;

public class Barrier {
    public CourseStady name;
    public int quantity;

    public Barrier(CourseStady name) {
        this.name = name;
        switch (name) {
            case Run:
                this.quantity = new Random().nextInt(300) + 25;
                break;
            case Jump:
                this.quantity = new Random().nextInt(4) + 1;
                break;
            case Sweem:
                this.quantity = new Random().nextInt(100) + 25;
                break;
            default:
                break;
        }

    }
}
