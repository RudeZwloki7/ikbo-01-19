package Exercise2;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(75, 60);
        System.out.println(ball);
        ball.move(30, 15);
        System.out.println(ball);
    }
}