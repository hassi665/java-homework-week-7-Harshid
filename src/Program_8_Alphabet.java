// Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
// any other alphabet should be invalid entry

import java.util.Scanner;

public class Program_8_Alphabet {
    public static void main(String[] args) {
        city();
    }

    public static void city() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Alphabet: ");
        char INPUT = scanner.next().charAt(0);

        if (INPUT == 'A') {
            System.out.print("Ahmedabad");
        } else if (INPUT == 'B') {
            System.out.println("Bombay");
        } else if (INPUT == 'C') {
            System.out.println("Culcatta");
        } else if (INPUT == 'D') {
            System.out.println("Delhi");
        } else if (INPUT == 'E') {
            System.out.println("El Dorado");
        } else if (INPUT == 'F') {
            System.out.println("Florida");
        } else
            System.out.println(" invalid entry ");
        scanner.close();
    }
}
