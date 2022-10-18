/*
WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
salary
 HRA = basic salary 10%
 DA = Basic salary 8%
 TA = Basic salary 9%
 PF= Basic salary 20%
 Gross salary = basic salary + HRA + TA + DA –PF
Print in following format
_______________________________
| Salary Slip |
|______________________________|
| Employee Id : 2564 |
| Employee Name : Jay |
|______________________________|
| Basic Salary : 25000.0 |
| HRA 10% : 2500.0 |
| TA 8% : 2250.0 |
| DA 9% : 2000.0 |
| PF - 20& : 5000.0 |
|______________________________|
| Gross Salary : 26750.0 |
|===========================|

 */

import java.util.Scanner;

public class Program_5_Employee {

    public static void main(String[] args) {
        salary();
    }

    static void salary() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter Employee ID: ");
        int empID = sc.nextInt();
        System.out.print("Please Enter Employee Name: ");
        String name = sc.next();
        System.out.print(" Please Enter Basic Salary: ");
        double basic = sc.nextDouble();
        double HRA = basic*0.10;
        double TA = basic*0.08;
        double DA = basic*0.09;
        double PF = basic*0.20;
        double Gross = basic+HRA+TA+DA-PF;
        System.out.println(" _______________________________ ");
        System.out.println(" |            Salary Slip      |  ");
        System.out.println(" |_____________________________|  ");
        System.out.println(" |Employee Id     :" +empID+"      |");
        System.out.println(" |Employee Name   :" +name+"         |");
        System.out.println(" |_____________________________|");
        System.out.println(" |Basic Salary    :" +basic+"     |");
        System.out.println(" |HRA 10%         :" +HRA+"      |");
        System.out.println(" |TA 8%           :" +TA+"       |  ");
        System.out.println(" |DA 9%           :" +DA+"       |  ");
        System.out.println(" |PF 20%          :" +PF+"      |  ");
        System.out.println(" |_____________________________|  ");
        System.out.println(" |Gross Salary    :" +Gross+"     |  ");
        System.out.println(" |=============================|");
        sc.close();

    }


}
