package Exercise2;

public class Transport implements Priceable{
    double transportPrice;

    public Transport(double transportPrice) {
        this.transportPrice = transportPrice;
    }

    @Override
    public double getPrice() {
        return transportPrice;
    }
}
