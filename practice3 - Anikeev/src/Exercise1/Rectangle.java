package Exercise1;

public class Rectangle extends Shape {
    private float length, width;

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
        this.vertics = 4;
    }

    public Rectangle(float length, float width, String color) {
        this.length = length;
        this.width = width;
        this.vertics = 4;
        this.color = color;
    }

    @Override
    float calcSquare() {
        return length * width;
    }

    @Override
    float calcPerim() {
        return 2 * (length + width);
    }
}
