package ru.jevo.players;


public abstract class Player implements Ability {


    public String name;
    protected int run;
    protected int jump;
    protected int sweem;

    @Override
    public int runningDistance() {
        return run;
    }

    @Override
    public int jumpingHeight() {
        return jump;
    }

    @Override
    public int sweemingDistance() {
        return sweem;
    }

    public Player(String name, int run, int jump, int sweem) {
        this.name = name;
        this.run = run;
        this.jump = jump;
        this.sweem = sweem;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public void setJump(int jump) {
        this.jump = jump;
    }

    public void setSweem(int sweem) {
        this.sweem = sweem;
    }

    public String getFullName() {
        return this.name + " (" + this.getClass().getSimpleName() + ")";
    }

    public void getFailPrint() {
        System.out.println(this.getFullName() + " не прошел дистанцию");
    }
}


