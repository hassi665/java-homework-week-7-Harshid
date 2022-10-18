import java.util.Scanner;

// Write a java program to input any number and find out if it’s odd or even
public class Program_6_OddEven {
    public static void main(String[] args) {
        Program_6_OddEven obj = new Program_6_OddEven();
        obj.oddeven();

    }
    public void oddeven(){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if(num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
        scanner.close();
    }
}
