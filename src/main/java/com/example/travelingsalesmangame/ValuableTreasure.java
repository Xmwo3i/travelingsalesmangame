package com.example.travelingsalesmangame;

public class ValuableTreasure {
    private int treasureId;
    private int xCoordinate;
    private int yCoordinate;

    public ValuableTreasure(int treasureId) {
        this.treasureId = treasureId;
    }

    public int getTreasureId() {
        return treasureId;
    }

    public void setTreasureId(int treasureId) {
        this.treasureId = treasureId;
    }

    public int getXCoordinate() {
        return xCoordinate;
    }

    public void setXCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public int getYCoordinate() {
        return yCoordinate;
    }

    public void setYCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }
}
