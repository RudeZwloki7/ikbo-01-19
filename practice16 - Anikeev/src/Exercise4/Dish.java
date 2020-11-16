package Exercise4;

import Exercise2.Item;

public class Dish implements Item {
    final  double price;
    final String name;
    final String description;

    public Dish(String name, String description) {
        this.price = 0.f;
        this.name = name;
        this.description = description;
    }

    public Dish(double price, String name, String description) {
        this.price = price;
        this.name = name;
        this.description = description;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
