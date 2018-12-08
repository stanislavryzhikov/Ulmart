package ru.itpark.domain;

public class TV extends Product {
    private int screenDiagonal;

    public TV(int price, String name, String category, int screenDiagonal) {
        super(price, name, category);
        this.screenDiagonal = screenDiagonal;
    }

    public int getScreenDiagonal() {
        return screenDiagonal;
    }

    public void setScreenDiagonal(int screenDiagonal) {
        this.screenDiagonal = screenDiagonal;
    }
}
