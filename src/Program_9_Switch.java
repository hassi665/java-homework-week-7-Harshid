// Same as above program-8 using switch statement

import java.util.Scanner;

public class Program_9_Switch {
    public static void main(String[] args) {
        alphabet();
    }

    public static void alphabet() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Aplphabet: ");
        char give = scanner.next().charAt(0);
        switch (give) {
            case 'A':
                System.out.print("Ahmedabad");
                break;
            case 'B':
                System.out.println("Bombay");
                break;
            case 'C':
                System.out.println("Culcatta");
                break;
            case 'D':
                System.out.println("Delhi");
                break;
            case 'E':
                System.out.println("El Dorado");
                break;
            case 'F':
                System.out.println("Florida");
                break;
            default:
                System.out.println(" invalid entry ");
                scanner.close();

        }

    }


}
