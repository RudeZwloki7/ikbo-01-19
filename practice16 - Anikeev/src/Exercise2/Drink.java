package Exercise2;

public final class Drink implements Item {
    final double price;
    final String name;
    final String description;

    public Drink(String name, String description) {
        this.price = 0.f;
        this.name = name;
        this.description = description;
    }

    public Drink(double price, String name, String description) {
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
