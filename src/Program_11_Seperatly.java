// Write a java program to print the numbers between 1 to 100 which can be divided by 3
// and 5 separately.

public class Program_11_Seperatly {
    public static void main(String[] args) {
        Program_11_Seperatly obj = new Program_11_Seperatly();
        obj.input();
    }

    public void input() {
        System.out.println("Numbers can be divided by 3 only : ");
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0)
                System.out.println(i + ",");
        }
        System.out.println("Numbers can be divided by 5 only : ");
        for (int i = 1; i < 100; i++) {
            if (i % 5 == 0) {
                System.out.println(i + ",");
            }
        }


    }
}
