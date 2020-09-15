package com.company;

public class Kettle extends Dish {

    private boolean electric;

    public boolean isElectric() {
        return electric;
    }

    public Kettle(String material, boolean washed, boolean broken, int price) {
        super(material, washed, broken, price);
    }

    public Kettle(String material, boolean washed, boolean empty, String containment, boolean broken, int price) {
        super(material, washed, empty, containment, broken, price);
    }

    public Kettle(String material, boolean washed, boolean empty, String containment, boolean broken, int price, boolean electric) {
        super(material, washed, empty, containment, broken, price);
        this.electric = electric;
    }
}
