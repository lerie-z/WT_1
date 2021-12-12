package java_fundamentals.task1_8;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number x: ");
        int x = in.nextInt();
        System.out.print("Enter number y: ");
        int y = in.nextInt();
        in.close();

        if (((y > 5) || (y < -3)) || ((y <= 0) && ((x > 6) || (x < -6)) || ((y >= 0) && ((x > 4) || (x < -4))))) {
            System.out.println("False");
        } else {
            System.out.println("True");
        }
    }
}
