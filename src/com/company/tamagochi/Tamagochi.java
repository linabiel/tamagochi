package com.company.tamagochi;

public class Tamagochi {
    private int hungerLevel;
    private int funLevel;
    private int pooLevel;
    private String name;

    public Tamagochi(int hungerLevel, int funLevel, int pooLevel, String name) {
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
}
