// Write a Java program to test if an array contains a specific value.

import java.util.Scanner;

public class Program_20_Specific    {
    public static void main(String[] args) {
    value();
    }

    static void value(){

        int[] num = {1, 2, 3};
        int toFind = 5;
        boolean found = false;

        for (int n : num ) {
            if (n == toFind) {
                found = true;
                break;
            }
        }

        if(found)
            System.out.println(toFind + " is available in array");
        else
            System.out.println(toFind + " is not Available in array ");
    }
}
