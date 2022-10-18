// Write a program that tells us input value is number or an alphabet or symbol.

import java.util.Scanner;

public class Program_12_Identify {
    public static void main(String[] args) {
    value();
    }
    public static void value(){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input Data : ");
        char data = scanner.next().charAt(0);

        if((data >= 'a' && data <= 'z') || (data >= 'A' && data <= 'Z')) {

            System.out.println(data + " is an alphabet ");

        } else if(data >= '0' && data <= '9') {

            System.out.println(data + " is a number ");

        } else {

            System.out.println(data + " is a symbol");
        }
        scanner.close();

    }
}
