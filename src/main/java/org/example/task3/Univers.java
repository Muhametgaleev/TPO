package org.example.task3;

public class Univers {

    public boolean shine(Planet planet) {
        if (planet.getName().equals("золотая")) {
            System.out.println("Ничего во вселенной не блестит как золотая планета");
            return true;
        }
        System.out.println("золотая планета получше блестит");
        return false;
    }
}
