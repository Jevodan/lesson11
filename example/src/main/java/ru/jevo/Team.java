package ru.jevo;

import ru.jevo.players.Player;

public class Team {

    private Player[] players; // все участники
    private Player[] playersSuper = new Player[4]; // прошедшие дистанцию участники
    private int countSuper = 0;

    public Player[] getPlayers() {
        return players;
    }

    public Team(Player[] players) {
        this.players = players;
    }


    public void teamPrint() {
        System.out.println("Состав команды:");
        for (Player el : players) {
            System.out.println(el.getFullName());
        }
    }

    public void addTeamSuper(Player player) {
        this.playersSuper[this.countSuper] = player;
        this.countSuper++;
    }


    public void teamSuperPrint() {
        System.out.println("Прошедшие дистанцию:");
            for (int i=0; i < this.countSuper; i++) {
                System.out.println(this.playersSuper[i].getFullName());
            }

    }
}
