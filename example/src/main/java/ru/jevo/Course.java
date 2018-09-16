package ru.jevo;

import ru.jevo.players.Player;
import ru.jevo.Team;

public class Course {
    static boolean flag;
    public Barrier[] courseLong;

    public Course(Barrier[] courseLong) {
        this.courseLong = courseLong;
    }

    public void getCourse(Team team) {
        for (Player player : team.getPlayers()) {
            flag = false;
            int k = 0;
            System.out.println(player.getFullName()
                    + " - Пробегает: " + player.runningDistance()
            + " Проплывает: " + player.sweemingDistance()
            + " Прыгает: " + player.jumpingHeight());
            for (Barrier barrier : courseLong) {
                k++;
                System.out.print("Препятствие " + k + "(" + barrier.name + " " + barrier.quantity + "):");
                switch (barrier.name) {
                    case Run:
                        if (player.runningDistance() < barrier.quantity) {
                            player.getFailPrint();
                            flag = true;
                        } else
                            player.setRun(player.runningDistance() - barrier.quantity);
                        break;
                    case Jump:
                        if (player.jumpingHeight() < barrier.quantity) {
                            player.getFailPrint();
                            flag = true;
                        } else
                            player.setJump(player.jumpingHeight() - barrier.quantity);
                        break;
                    case Sweem:
                        if (player.sweemingDistance() < barrier.quantity) {
                            player.getFailPrint();
                            flag = true;
                        } else
                            player.setSweem(player.sweemingDistance() - barrier.quantity);
                        break;
                }
                if (flag == true) {
                    break;
                } else {
                    System.out.println("Пройдено");
                }
            }
            if (flag == false)
                team.addTeamSuper(player);

        }

    }
}
