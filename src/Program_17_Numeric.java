//  Write a Java program to sort a numeric array and a string array.

import java.util.Arrays;

public class Program_17_Numeric {
    public static void main(String[] args) {

        Program_17_Numeric obj = new Program_17_Numeric();
        obj.array();
    }

    public void array() {

        int[] array1 = {3, 1, 2};
        String[] array2 = {"Alpha", "Cat", "Beta"};

        System.out.println("Real Numeric array : " + Arrays.toString(array1));
        System.out.println("Real String array : " + Arrays.toString(array2));

        Arrays.sort(array1);
        System.out.println("Sort Numeric array : " + Arrays.toString(array1));

        Arrays.sort(array2);
        System.out.println("Sort String array : " + Arrays.toString(array2));
    }
}