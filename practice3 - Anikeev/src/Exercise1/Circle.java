package Exercise1;

public class Circle extends Shape {
    private float radius;

    public Circle(){
        this.vertics = 0;
    }
    public Circle(float radius) {
        this.radius = radius;
        this.vertics = 0;
    }

    public Circle(float radius, String collor) {
        this.radius = radius;
        this.vertics = 0;
    }

    @Override
    float calcSquare() {
        return (float)(Math.PI*Math.pow(radius,2));
    }

    @Override
    float calcPerim() {
        return (float)(2*Math.PI*radius);
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }
}
