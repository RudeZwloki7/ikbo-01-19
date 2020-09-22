package Exercise2;

public class Clothes implements Priceable {
    double clothesPrice;

    public Clothes(double clothesPrice) {
        this.clothesPrice = clothesPrice;
    }

    @Override
    public double getPrice() {
        return clothesPrice;
    }
}
