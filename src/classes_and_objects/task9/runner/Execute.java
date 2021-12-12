package classes_and_objects.task9.runner;

import classes_and_objects.task9.classes.Ball;
import classes_and_objects.task9.classes.Basket;

import java.util.LinkedList;

public class Execute {

    public static double getBallsWeight(Basket basket) {
        double weight = 0;

        for (Ball ball : basket.getBallsList()) {
            weight += ball.getWeight();
        }
        return weight;
    }

    private static LinkedList<Ball> getBallsListByColour(Basket basket, String colour) {
        LinkedList<Ball> ballsList = new LinkedList<>();

        for (Ball ball : basket.getBallsList()) {

            if (ball.getColour().equalsIgnoreCase(colour)) {
                ballsList.add(ball);
            }
        }
        return ballsList;
    }

    public static int getCountOfColoredBalls(Basket basket, String colour) throws IllegalArgumentException  {

        return getBallsListByColour(basket, colour).size();
    }
}