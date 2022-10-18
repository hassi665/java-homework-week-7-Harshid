/* Write a java program to input any two number and ask user to enter their symbol (+, -,/
, *) find addition, Subtraction, multiplication and division according to their symbol
 (using if else)
 */

import java.util.Scanner;

public class Program_10_Symbol {
    public static void main(String[] args) {
        Program_10_Symbol obj = new Program_10_Symbol();
        obj.cal();
    }

    public void cal() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter Second Number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the symbol for operation performing (+, -, /, *) - ");
        char operation = scanner.next().charAt(0);
        if (operation == '+') {

            System.out.println(" Addition of " + num1 + "+" + num2 + " = " + (num1 + num2));

        } else if (operation == '-') {

            System.out.println(" Substraction of " + num1 + "-" + num2 + " = " + (num1 - num2));

        } else if (operation == '/') {

            System.out.print("Division of " + num1 + "/" + num2 + " = " + (num1 / num2));

        } else if (operation == '*') {

            System.out.println("Multiplication of " + num1 + "x" + num2 + " = " + (num1 * num2));

        } else {

            System.out.print("Operator can't perform");
            scanner.close();
        }
    }
}

