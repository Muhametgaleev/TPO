package org.example.task3;

public class Hero {
    String name = "Зафод";
    boolean look = false;
    boolean stand = false;

    public Hero(String name) {
        this.name = name;
    }

    public boolean lookAround(){
        System.out.println(name + "осмотрелся по сторонам\n");
        look = true;
        return look;
    }

    public boolean standUp(){
        System.out.println(name + "вскочил на ноги\n");
        stand = true;
        return stand;
    }

    public void stop() {
        stand = false;
        look = false;

    }
}
