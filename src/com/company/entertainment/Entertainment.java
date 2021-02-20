package com.company.entertainment;

public class Entertainment {
    private String name;
    private int gamesFunLevel;

    public Entertainment(String name, int funLevel) {
        this.name = name;
        this.gamesFunLevel = funLevel;
    }

    public String getName() {
        return name;
    }

    public int getGamesFunLevel() {
        return gamesFunLevel;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGamesFunLevel(int gamesFunLevel) {
        this.gamesFunLevel = gamesFunLevel;
    }


}
