package com.company;

public class Cup extends Dish {

    private String size;

    public Cup(String material, boolean washed, boolean empty, String containment, boolean broken, int price, String size) {
        super(material, washed, empty, containment, broken, price);
        this.size = size;
    }

    public Cup(String material, boolean washed, boolean broken, int price) {
        super(material, washed, broken, price);
    }

    public Cup(String material, boolean washed, boolean empty, String containment, boolean broken, int price) {
        super(material, washed, empty, containment, broken, price);
    }

    public String getSize() {
        return size;
    }
}
