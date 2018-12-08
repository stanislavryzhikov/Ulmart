package ru.itpark.domain;

public class Phone extends Product {
    protected String number;

    public Phone(int price, String name, String category, String number) {
        super(price, name, category);
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

}
