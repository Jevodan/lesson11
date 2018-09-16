package ru.jevo.players;

import ru.jevo.players.Player;

public class Cat extends Player {

    public Cat(String name, int run, int jump, int sweem) {
        super(name, run, jump, sweem);
    }

    @Override
    public int sweemingDistance() {
        System.out.println("Коты не умеют плавать");
        return 0;
    }
}
