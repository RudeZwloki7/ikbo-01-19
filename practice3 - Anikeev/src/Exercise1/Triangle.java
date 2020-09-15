package Exercise1;

public class Triangle extends Shape {
    private float first,second,third ;


    public Triangle(float first, float second, float third) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.vertics = 3;
    }
    public Triangle(float first, float second, float third, String color) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.vertics = 3;
        this.color = color;
    }
    @Override
    float calcSquare() {
        float hfPer = (first+second+third)/2;
        return (float)Math.sqrt(hfPer*(hfPer-first)*(hfPer-second)*(hfPer-third));
    }

    @Override
    float calcPerim() {
        return first+second+third;
    }
}
