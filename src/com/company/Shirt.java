package com.company;

public class Shirt {
    private final String id;
    private final String brand;
    private final String color;
    private final String size;

    public Shirt(String text) {
        this.id = text.split(",")[0];
        this.brand = text.split(",")[1];
        this.color = text.split(",")[2];
        this.size = text.split(",")[3];
    }

    @Override
    public String toString() {
        return "Shirt:\n" +
                "\tid = " + id +
                "\n\tbrand = " + brand +
                "\n\tcolor = " + color +
                "\n\tsize = " + size + "\n";
    }
}
