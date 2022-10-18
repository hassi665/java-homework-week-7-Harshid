import com.sun.org.apache.regexp.internal.RETest;

import java.util.Scanner;

/*
3. Write a java program to input student Name, roll No, and three subjects Math, Science and
English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
Input, Marks should between 0 to 100”) and find out total, percentage and result.
If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
%> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
_______________________________
| |
| Mark Sheet |
|_______________________________|
| Name : Jay |
| Roll No: 08 |
|_______________________________|
| Subjects : Marks |
|_______________________________|
| Math : 98 |
| Science : 90 |
| English : 85 |
|_______________________________|
| Total : 273 |
|_______________________________|
| Percentage : 91.0 |
| Result : Pass |
| Grade : A+ |
|_______________________________|
 */
public class Program_3_Marksheet {

    public static void main(String[] args) {
        result();
    }

    static void result(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter Student Name: ");
        String name = sc.next();
        System.out.print("Please Enter Roll Number: ");
        int num = sc.nextInt();
        System.out.print(" Please Enter Marks of Math : ");
        int math= sc.nextInt();
        System.out.print(" Please Enter Marks of Science : ");
        int sci= sc.nextInt();
        System.out.print(" Please Enter Marks of English : ");
        int eng= sc.nextInt();
        if (math==sci==eng>0 && math==sci==eng<=100) {
            System.out.println("Valid Marks");
        }else {
            System.out.println("Invalid Marks ");
        }

        int total = math+sci+eng;
        float per = total/3;
        String result;
        String grade;

        if(per >= 80){
            result= "pass";
            grade= "A+";
        }else if(per >=60){
            result= "pass";
            grade= "A";
        }else if(per >= 50){
            result= "pass";
            grade= "B";
        }else if(per >= 35){
            result= "pass";
            grade= "C";
        }else {
            result= "Fail";
            grade= "N/A";
        }
        System.out.println(" _______________________________ ");
        System.out.println(" |        Mark Sheet           |  ");
        System.out.println(" |_____________________________|  ");
        System.out.println(" |      Name         :" +name+"      |");
        System.out.println(" |      Roll No:     :" +num+"    |");
        System.out.println(" |_____________________________|");
        System.out.println(" |      Subjects     :  Marks  |");
        System.out.println(" |_____________________________|");
        System.out.println(" |      Math         :" +math+"       |");
        System.out.println(" |      Science      :" +sci+"       |  ");
        System.out.println(" |      English:     :" +eng+"       |  ");
        System.out.println(" |_____________________________|");
        System.out.println(" |      Total        :" +total+"      |  ");
        System.out.println(" |_____________________________|  ");
        System.out.println(" |      Percentag    :" +per+"     |  ");
        System.out.println(" |      Result       :" +result+"     |  ");
        System.out.println(" |      Grade        :" +grade+"        |  ");
        System.out.println(" |_____________________________|  ");
        sc.close();




    }

}
