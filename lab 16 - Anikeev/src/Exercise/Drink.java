package Exercise;


public final class Drink extends MenuItem implements Alcoholable {
    private final double alcoholVol;
    private final DrinkTypeEnum type;

    public Drink(double alcoholVol, DrinkTypeEnum type) {
        this.alcoholVol = alcoholVol;
        this.type = type;
    }

    public DrinkTypeEnum getType() {
        return type;
    }

    @Override
    public boolean isAlcoholicDrink() {
        return type.isAlcohol();
    }

    @Override
    public double getAlcoholVol() {
        return alcoholVol;
    }
}