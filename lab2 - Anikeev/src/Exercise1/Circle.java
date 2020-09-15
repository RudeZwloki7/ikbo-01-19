package Exercise1;

public class Circle {
    private float radius;
    private float coordX;
    private float coordY;


    Circle(float coordX,float coordY, float radius){
        setCoordX(coordX);
        setCoordY(coordY);
        setRadius(radius);
    }


    public void setRadius(float radius) {
        this.radius = radius;
    }

    public void setCoordX(float coordX) {
        this.coordX = coordX;
    }

    public void setCoordY(float coordY) {
        this.coordY = coordY;
    }

    public float getRadius() {
        return radius;
    }

    public float getCoordX() {
        return coordX;
    }

    public float getCoordY() {
        return coordY;
    }

    public float calculateLength(){
        return 2*(float)Math.PI*radius;
    }
    public void printInfo(){
        System.out.print("Радиус окружности: "+ radius+"\nКоординаты центра окружности: ("+coordX+", "+coordY+")\n");
    }
}
