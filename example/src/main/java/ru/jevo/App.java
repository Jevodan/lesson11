package ru.jevo;

import ru.jevo.players.*;
import java.util.Random;

// #rewiev

public class App {

    // Возможности собак
    public static final int RANDOM_JUMPING_DOG = 4;
    public static final int MIN_JUMPING_DOG = 1;
    public static final int RANDOM_RUNNING_DOG = 600;
    public static final int MIN_RUNNING_DOG = 100;
    public static final int RANDOM_SWIMMING_DOG = 50;
    public static final int MIN_SWIMMING_DOG = 250;

    // Возможности котов
    public static final int RANDOM_JUMPING_CAT = 7;
    public static final int MIN_JUMPING_CAT = 1;
    public static final int RANDOM_RUNNING_CAT = 550;
    public static final int MIN_RUNNING_CAT = 150;
    public static final int RANDOM_SWIMMING_CAT = 0;
    public static final int MIN_SWIMMING_CAT = 0;

    // Возможности кроликовв
    public static final int RANDOM_JUMPING_RABBIT = 10;
    public static final int MIN_JUMPING_RABBIT = 2;
    public static final int RANDOM_RUNNING_RABBIT = 800;
    public static final int MIN_RUNNING_RABBIT = 50;
    public static final int RANDOM_SWIMMING_RABBIT = 80;
    public static final int MIN_SWIMMING_RABBIT = 2;

    public static final int number = 4; // количество участников
    public static final int numberPrep = 4; // количество препятствий на полосе

    public static void main(String[] args) {
        Player[] players = new Player[number];
        Player player1 = new Dog("Лёка",
                new Random().nextInt(RANDOM_RUNNING_DOG) + MIN_RUNNING_DOG,
                new Random().nextInt(RANDOM_JUMPING_DOG) + MIN_JUMPING_DOG,
                new Random().nextInt(RANDOM_SWIMMING_DOG) + MIN_SWIMMING_DOG);
        Player player2 = new Dog("Барбос",
                new Random().nextInt(RANDOM_RUNNING_DOG) + MIN_RUNNING_DOG,
                new Random().nextInt(RANDOM_JUMPING_DOG) + MIN_JUMPING_DOG,
                new Random().nextInt(RANDOM_SWIMMING_DOG) + MIN_SWIMMING_DOG);
        Player player3 = new Cat("Зорька",
                new Random().nextInt(RANDOM_RUNNING_CAT) + MIN_RUNNING_CAT,
                new Random().nextInt(RANDOM_JUMPING_CAT) + MIN_JUMPING_CAT,
                0);
        Player player4 = new Rabbit("Банни",
                new Random().nextInt(RANDOM_RUNNING_RABBIT) + MIN_RUNNING_RABBIT,
                new Random().nextInt(RANDOM_JUMPING_RABBIT) + MIN_JUMPING_RABBIT,
                new Random().nextInt(RANDOM_SWIMMING_RABBIT) + MIN_SWIMMING_RABBIT);
        players[0] = player1;
        players[1] = player2;
        players[2] = player3;
        players[3] = player4;
        Team team = new Team(players);

        Barrier[] barriers = new Barrier[numberPrep];
        System.out.print("Полоса препятсвий: ");
        for (int i = 0; i < numberPrep; i++) {
            CourseStady typePrep = CourseStady.values()[new Random().nextInt(CourseStady.values().length)];
            barriers[i] = new Barrier(typePrep);
            System.out.print(typePrep + ", ");
        }
        Course course = new Course(barriers);
        System.out.println();
        team.teamPrint();
        System.out.println("Старт, внимание, марш - марафон начался");
        course.getCourse(team);
        team.teamSuperPrint();
    }
}

// #rewiev