/*
Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
“ZERO”

 */

import java.util.Scanner;

public class Program_16_CheckNumber {
    public static void main(String[] args) {
        check();
    }

    public static void check(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if(number>0)
        {
            System.out.println("Entered number is positive.");
        }

        else if(number<0)
        {
            System.out.println("Entered number is negative.");
        }

        else
        {
            System.out.println("Entered number is zero.");
            scanner.close();
        }
    }
}
