package classes_and_objects.task9.classes;

import java.util.LinkedList;

public class Basket {

    private final LinkedList<Ball> ballsList ;

    public Basket() {
        ballsList = new LinkedList<Ball>();
    }

    public LinkedList<Ball> getBallsList () {
        return ballsList;
    }

    public void addBall (Ball ball) {
        ballsList.add(ball);
    }
}