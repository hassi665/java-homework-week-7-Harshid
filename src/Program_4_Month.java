import java.util.Scanner;

public class Program_4_Month {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Year : ");
        int year = sc.nextInt();
        isLeapYear(year);
        System.out.println("Enter Month : ");
        int month = sc.nextInt();
        getDaysInMonth(year,month);

    }

    public static void isLeapYear(int year) {
        if (year < 1 || year >= 9999) {
            System.out.println("False");
        } else if ((year % 4 == 0) && year % 100 != 0 && year % 400 == 0 ) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public static void getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            System.out.println(" Invalid");
        }
        switch (month) {
            case 1:
                if (year < 1 || year > 9999) {
                    System.out.println(" Invalid ");
                } else {
                    System.out.println(" January month has 31 days");
                }
                break;
            case 2:
                if (year < 1 || year >= 9999) {
                } else if ((year % 4 == 0) && year % 100 != 0 && year % 400 == 0 ) {
                    System.out.println("February has 29 days with leap year");
                } else {
                    System.out.println(" Not a leap year");
                }
                break;
            case 3:
                if (year < 1 || year > 9999 ) {
                    System.out.println("Invalid");
                } else {
                    System.out.println("March has 31 days");
                }

                break;
            case 4:
                if (year < 1 || year > 9999) {
                    System.out.println("Invalid");
                } else {
                    System.out.println("April has 30 days");
                }

                break;
            case 5:
                if (year < 1 || year > 9999) {
                    System.out.println("Invalid");
                } else {
                    System.out.println("May has 31 days");
                }

                break;
            case 6:
                if (year < 1 || year > 9999) {
                    System.out.println("Invalid");
                } else {
                    System.out.println("June has 30 days");
                }

                break;
            case 7:
                if (year < 1 || year > 9999) {
                    System.out.println("Invalid");
                } else {
                    System.out.println("July has 31 days");
                }

                break;
            case 8:
                if (year < 1 || year > 9999) {
                    System.out.println("Invalid");
                } else {
                    System.out.println("August has 31 days");
                }

                break;
            case 9:
                if (year < 1 || year > 9999) {
                    System.out.println("Invalid");
                } else {
                    System.out.println("September has 30 days");
                }

                break;
            case 10:
                if (year < 1 || year > 9999) {
                    System.out.println("Invalid");
                } else {
                    System.out.println("October has 31 days");
                }
                break;
            case 11:
                if (year < 1 || year > 9999) {
                    System.out.println("Invalid");
                } else {
                    System.out.println("November has 30 days");
                }

                break;
            case 12:
                if (year < 1 || year > 9999) {
                    System.out.println("Invalid");
                } else {
                    System.out.println("December has 31 days");
                }

                break;

        }
    }
}
