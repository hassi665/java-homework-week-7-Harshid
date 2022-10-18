// Write a Java program to sum values of an array

public class Program_18_ArraySum {
    public static void main(String[] args) {
        sum();
    }

    public static void sum() {
        int array[] = {1, 2, 3};
        int add = 0;

        for (int i : array)
            add += i;
        System.out.println("The sum of an value is " + add);
    }
}