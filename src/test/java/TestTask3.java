import org.example.task3.Hero;
import org.example.task3.Planet;
import org.example.task3.Surface;
import org.example.task3.Univers;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTask3 {
    static Hero hero;
    static Planet planet;
    static Surface surface;
    static Univers univers;

    @BeforeAll
    public static void createAll() {
        hero = new Hero("Зафод");
        planet = new Planet("рандомная");
        surface = new Surface("золотая");
        univers = new Univers();

    }

    @Test
    public void test1(){
        assertEquals(surface.act(), "простиралась золотая поверхность");
    }

    @Test
    public void test2(){
        assertEquals(surface.shine(), true);
    }

    @Test
    public void test3(){
        assertEquals(univers.shine(planet), false);
    }

    @Test
    public void test4(){
        assertEquals(planet.isShine(), false);
    }

    @Test
    public void test5(){
        assertEquals(hero.lookAround(), true);
        assertEquals(hero.standUp(), true);
    }
}
