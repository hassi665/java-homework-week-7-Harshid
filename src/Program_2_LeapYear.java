// Write a java program to input any year like (ex.2007) and find out if it is leap year or
// not?


import java.util.Scanner;

public class Program_2_LeapYear {
    public static void main(String[] args) {
        lyear();
    }
    public static void lyear(){
        int year;

        System.out.print("Enter an Year : ");
        Scanner scanner = new Scanner(System.in);
        year = scanner.nextInt();

        if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
            System.out.println("This year is a leap year");
        else
            System.out.println("This year is not a leap year");
        scanner.close();
    }

}
