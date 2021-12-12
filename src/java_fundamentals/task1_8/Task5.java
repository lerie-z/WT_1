package java_fundamentals.task1_8;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        int count = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Array size, n = ");
        int n = in.nextInt();
        int[] array = new int[n];
        int number;
        for (int i = 0; i < array.length; i++) {
            //array[i] = (int)(Math.random() * 100);    //random
            //System.out.print(array[i] + " ");         //

            number = in.nextInt();                      //manual input
        }
        in.close();
        System.out.println();
        int currMaxNumber = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] <= currMaxNumber) {
                count++;
            }
            else {
                currMaxNumber = array[i + 1];
            }
        }
        System.out.println("The number of elements that can be discarded, k = " + count);
    }
}
