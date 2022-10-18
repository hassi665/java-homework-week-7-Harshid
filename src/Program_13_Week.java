/*
Write a Java program which input any number between 1 to 7 and it print The Days
name MONDAY, TUESDAY…..SUNDAY of the week accordingly by using switch.
 NOTE: if number is out of selection Print message “Week contains 1 to 7 days”
 */

import java.util.Scanner;

public class Program_13_Week {
    public static void main(String[] args) {
        Program_13_Week obj = new Program_13_Week();
        obj.week();
    }

    public void week() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input any number to get according day in a week : ");
        int day = scanner.nextInt();
        switch (day) {
            case 1:
                System.out.println(day + "st day of week is Monday");
                break;
            case 2:
                System.out.println(day + "nd day of week is Tuesday");
                break;
            case 3:
                System.out.println(day + "rd day of week is Wednesday");
                break;
            case 4:
                System.out.println(day + "th day of week is Thursday");
                break;
            case 5:
                System.out.println(day + "th day of week is Friday");
                break;
            case 6:
                System.out.println(day + "th day of week is Saturday");
                break;
            case 7:
                System.out.println(day + "th day of week is Sunday");
                break;
            default:
                System.out.println(" Week contains 1 to 7 days ");
                scanner.close();
        }
    }
}
