package com.company.tamagochi;

import com.company.entertainment.Entertainment;
import com.company.feeds.Food;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TamagochiTest {
        Tamagotchi tamagotchi;
        Food food;
        Entertainment entertainment;

    @Before public void setup () {
        tamagotchi = new Tamagotchi(50, 35, 60, "Tam");
        food = new Food("Sausage", 47, 65);
        entertainment = new Entertainment("Yoyo", 56);
    }

    @Test public void hasHungerLevel() {
        assertEquals(50, tamagotchi.getHungerLevel());
    }

    @Test public void hasFunLevel() {
        assertEquals(35, tamagotchi.getFunLevel());
    }

    @Test public void hasPooLevel() {
        assertEquals(60, tamagotchi.getPooLevel());
    }

    @Test public void hasName() {
        assertEquals("Tam", tamagotchi.getName());
    }

    @Test public void canSetHungerLevel() {
        tamagotchi.setHungerLevel(75);
        assertEquals(75, tamagotchi.getHungerLevel());
        System.out.println(tamagotchi.getHungerLevel());
    }

    @Test public void canSetFunLevel() {
        tamagotchi.setFunLevel(63);
        assertEquals(63, tamagotchi.getFunLevel());
    }

    @Test public void canSetPooLevel() {
        tamagotchi.setPooLevel(77);
        assertEquals(77, tamagotchi.getPooLevel());
    }

    @Test public void canSetName() {
        tamagotchi.setName("Boobi");
        assertEquals("Boobi", tamagotchi.getName());
    }

    @Test public void canGetName() {
        assertEquals("Sausage", food.getName());
    }

    @Test public void canGetHungerRestore() {
        assertEquals(47, food.getHungerRestore());
    }

    @Test public void canGetPooAmount() {
        assertEquals(65, food.getPooAmount());
    }

    @Test public void canSetFoodName() {
        food.setName("Soup");
        assertEquals("Soup", food.getName());
    }

    @Test public void canSetHungerRestore() {
        food.setHungerRestore(32);
        assertEquals(32, food.getHungerRestore());
    }

    @Test public void canSetPooAmount() {
        food.setPooAmount(13);
        assertEquals(13, food.getPooAmount());
    }

    @Test public void canGetEntertainmentName() {
        assertEquals("Yoyo", entertainment.getName());
    }

    @Test public void canGetEntertainmentFunLevel() {
        assertEquals(56, entertainment.getGamesFunLevel());
    }

    @Test public void canSetEntertainmentName() {
        entertainment.setName("Tv");
        assertEquals("Tv", entertainment.getName());
    }

    @Test public void canSetEntertainmentFunLevel() {
        entertainment.setGamesFunLevel(2);
        assertEquals(2, entertainment.getGamesFunLevel());
    }

    @Test public void canFeedTamagochi() {
        tamagotchi.feedTamagotchi(food);
        assertEquals(97, tamagotchi.getHungerLevel());
        assertEquals(0, tamagotchi.getPooLevel());
        tamagotchi.feedTamagotchi(food);
        assertEquals(100, tamagotchi.getHungerLevel());
        assertEquals(65, tamagotchi.getPooLevel());
        tamagotchi.feedTamagotchi(food);
        assertEquals(100, tamagotchi.getHungerLevel());
        assertEquals(0, tamagotchi.getPooLevel());
    }

    @Test public void canEntertainTamagochi() {
        tamagotchi.entertainTamagotchi(entertainment);
        assertEquals(91, tamagotchi.getFunLevel());
        tamagotchi.entertainTamagotchi(entertainment);
        assertEquals(100, tamagotchi.getFunLevel());
    }

}