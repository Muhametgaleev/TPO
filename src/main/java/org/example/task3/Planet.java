package org.example.task3;

public class Planet extends Univers {
    private String name = "Обычная такая";

    public String getName() {
        return name;
    }


    public Planet(String name){
        this.name = name;
    }

    public boolean isShine(){
        return name.equalsIgnoreCase("золотая");
    }



}
