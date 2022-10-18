/*
 Write a Java program to calculate the average value of array elements.
 */

public class Program_19_ArrayAverage {
    public static void main(String[] args) {
        avarage();
    }

    public static void avarage() {
        int num[] = new int[]{1, 2, 3};

        // int[] numbers = new int[]{20, 30, 25, 35, -16, 60, -100};
        //calculate sum of all array elements
        int add = 0;
        for (int i = 0; i < num.length; i++)
            add = add + num[i];
        //calculate average value
        double average = add / num.length;
        System.out.println("Average value of the array elements is : " + average);
    }

}
