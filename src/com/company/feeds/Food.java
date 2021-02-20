package com.company.feeds;

public class Food {
    private String name;
    private int hungerRestore;
    private int pooAmount;

    public Food(String name, int hungerRestore, int pooAmount) {
        this.name = name;
        this.hungerRestore = hungerRestore;
        this.pooAmount = pooAmount;
    }

    public String getName() {
        return name;
    }

    public int getHungerRestore() {
        return hungerRestore;
    }

    public int getPooAmount() {
        return pooAmount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHungerRestore(int hungerRestore) {
        this.hungerRestore = hungerRestore;
    }

    public void setPooAmount(int pooAmount) {
        this.pooAmount = pooAmount;
    }


}
