package Exercise1;

public abstract class Shape {

    protected String color = "undefined";

    protected int vertics;

    public int getVertics() {
        return vertics;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    abstract float calcSquare();

    abstract float calcPerim();

}
