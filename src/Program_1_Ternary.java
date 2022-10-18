// Write a java program that tells us that Input number is odd or even?
// HINT: use ternary operator (? :)

import java.util.Scanner;

public class Program_1_Ternary {

    public static void main(String[] args) {
        Program_1_Ternary obj = new Program_1_Ternary();
        obj.trnry();
    }
    public void trnry(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input number: ");
        int number = scanner.nextInt();

        scanner.close();

        String result = number%2==0 ? "Even" : "Odd";

        System.out.println(number +" is "+ result + " number ");
        scanner.close();
    }
}
