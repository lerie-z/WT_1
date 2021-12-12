package java_fundamentals.task1_8;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number x: ");
        int x = in.nextInt();
        System.out.print("Enter number y: ");
        int y = in.nextInt();
        in.close();

        double result = ((1 + Math.pow(Math.sin(x + y), 2)) / (2 + Math.abs(x - ((2 * x)/(1 + Math.pow(x * y, 2)))))) + x;

        System.out.println("Result is " + result);
    }
}
