package ru.itpark.domain;

public class Shirt extends Product{
    private String size;
    private String colour;

    public Shirt(int price, String name, String category, String size, String colour) {
        super(price, name, category);
        this.size = size;
        this.colour = colour;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

}
