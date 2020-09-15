package com.company;

public abstract class Dish {

    protected String material;
    protected boolean washed;
    protected boolean empty;
    protected String containment;
    protected boolean broken;

    int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isWashed() {
        return washed;
    }

    public void setWashed(boolean washed) {
        this.washed = washed;
    }

    public boolean isEmpty() {
        return empty;
    }

    public void setEmpty(boolean empty) {
        this.empty = empty;
    }

    public String getContainment() {
        return containment;
    }

    public void setContainment(String containment) {
        this.containment = containment;
    }

    public boolean isBroken() {
        return broken;
    }

    public void setBroken(boolean broken) {
        this.broken = broken;
    }

    public Dish(String material, boolean washed, boolean broken, int price) {
        this.material = material;
        this.washed = washed;
        this.broken = broken;
        this.price = price;
    }

    public Dish(String material, boolean washed, boolean empty, String containment, boolean broken, int price) {
        this.material = material;
        this.washed = washed;
        this.empty = empty;
        this.containment = containment;
        this.broken = broken;
        this.price = price;

    }

    public void cookDish(String nameDish){
        this.empty = false;
        this.washed = false;
        this.containment = nameDish;
    }
}
