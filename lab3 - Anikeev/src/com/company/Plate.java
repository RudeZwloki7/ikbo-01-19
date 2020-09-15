package com.company;

public class Plate extends Dish {

    private boolean deep;

    public Plate(String material, boolean washed, boolean empty, String containment, boolean broken, int price, boolean deep) {
        super(material, washed, empty, containment, broken, price);
        this.deep = deep;
    }

    public Plate(String material, boolean washed, boolean broken, int price) {
        super(material, washed, broken, price);
    }

    public Plate(String material, boolean washed, boolean empty, String containment, boolean broken, int price) {
        super(material, washed, empty, containment, broken, price);
    }

    public boolean isDeep(){
        return deep;
    }


}
