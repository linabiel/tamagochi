package com.company.tamagochi;

import com.company.entertainment.Entertainment;
import com.company.feeds.Food;

public class Tamagotchi {
    private int hungerLevel;
    private int funLevel;
    private int pooLevel;
    private String name;

    public Tamagotchi(int hungerLevel, int funLevel, int pooLevel, String name) {
        this.hungerLevel = hungerLevel;
        this.funLevel = funLevel;
        this.pooLevel = pooLevel;
        this.name = name;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public int getFunLevel() {
        return funLevel;
    }

    public int getPooLevel() {
        return pooLevel;
    }

    public String getName() {
        return name;
    }

    public void setHungerLevel(int hungerLevel) {
        this.hungerLevel = hungerLevel;
    }

    public void setFunLevel(int funLevel) {
        this.funLevel = funLevel;
    }

    public void setPooLevel(int pooLevel) {
        this.pooLevel = pooLevel;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void feedTamagotchi(Food food) {
        if (hungerLevel + food.getHungerRestore() > 100) {
            hungerLevel = 100;
        }
        else {
            hungerLevel += food.getHungerRestore();
        }
        addPoo(food.getPooAmount());
    }

    public void addPoo(int pooAmount) {
        if (pooLevel + pooAmount > 100) {
            pooLevel = 0;
        }
        else {
            pooLevel += pooAmount;
        }
    }

    public void entertainTamagotchi(Entertainment entertainment) {
        if (funLevel + entertainment.getGamesFunLevel() > 100) {
            funLevel = 100;
        }
        else {
            funLevel += entertainment.getGamesFunLevel();
        }
    }




}
