package classes_and_objects.task9.runner;

import classes_and_objects.task9.classes.Ball;
import classes_and_objects.task9.classes.Basket;

import java.util.Scanner;

public class Main {

    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        Basket basket = new Basket();
        fill(basket);

        try {
            System.out.println("Total ball's weight is: " + Execute.getBallsWeight(basket));
            System.out.println("Count of blue balls is: "+ Execute.getCountOfColoredBalls(basket, "blue"));
        }catch(IllegalArgumentException e) {
            System.out.println( e.getMessage() );
        }

    }

    public static  void fill(Basket basket) {
        int ballsCount;
        double ballWeight;
        String ballColor;

        System.out.print("Balls amount: ");
        ballsCount = sc.nextInt();

        for (int i = 0; i < ballsCount; i++) {
            System.out.println("Ball " + (i + 1) + " of " + ballsCount);

            System.out.print("Ball's weight: ");
            ballWeight = sc.nextDouble();

            System.out.print("Ball's color: ");
            do {
                ballColor = sc.nextLine();
            } while (ballColor.isEmpty());

            basket.addBall(new Ball(ballColor, ballWeight));
        }
    }
}