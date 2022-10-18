/*
Write a java program input sales id, seller's name, sales amount, and salary basic and
then fined this sales
Commission
 Sales amount >= 50,000 35%
 Sales amount >= 30,000 20%
>= 20,000 10%
>= 10,000 5%
< 10,000 2%
 */
import java.util.Scanner;

public class Program_7_Commision {
    public static void main(String[] args) {
        sales();
    }
    static void sales(){
        double comm=0.0;
        int per=0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sales id : ");
        int id = scanner.nextInt();
        System.out.println("Seller's name: ");
        String name = scanner.next();
        System.out.println("Sales amount: ");
        double amount = scanner.nextDouble();
        System.out.print("Salary basic: ");
        double salary = scanner.nextDouble();

        if(amount>=50000){
            per=35;
            comm=amount*0.35;}
        else if (amount>=30000){
            per=20;
            comm=amount*0.2;}
        else if (amount>=20000){
            per=10;
            comm=amount*0.1;}
        else if (amount>=10000){
            per=5;
            comm=amount*0.05;}
        else
            {
            per=2;
            comm=amount*0.02;}
        System.out.println("Commission amount = " + comm);
        System.out.println(" Commission percentage : " +per+ "%");
        scanner.close();
        }
    }
