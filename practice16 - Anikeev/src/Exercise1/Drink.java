package Exercise1;

public final class Drink  {
    final double price;
    final String name;
    final String description;

    public Drink(String name, String description) {
        this.price = 0;
        this.name = name;
        this.description = description;
    }

    public Drink(double price, String name, String description) {
        this.price = price;
        this.name = name;
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
