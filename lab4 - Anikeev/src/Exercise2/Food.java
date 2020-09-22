package Exercise2;

public class Food implements Priceable {
    double foodPrice;

    public Food(double foodPrice) {
        this.foodPrice = foodPrice;
    }

    @Override
    public double getPrice() {
        return foodPrice;
    }
}
