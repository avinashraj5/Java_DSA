import java.util.Scanner;

public class take_input {
    public static void main(String[] args) {
        //Question 1
        /*Write a java program to calculate percentage of a given
        student in CBSE board exam. His marks from 5 subjects must be
        taken as input from the keyboard (Marks are out of 100).*/

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the marks for five subjects (out of 100):");
        int totalMarks = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Subject " + i + ": ");
            int marks = scanner.nextInt();
            totalMarks += marks;
        }
        double percentage = (double) totalMarks / 5;
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
        scanner.close();*/

        //Question 2
        //Write a program to calculate CGPA using marks of three subjects (out of 100).

        /*float a = 45;
        float b = 74;
        float c = 65;
        float sum = (a+b+c)/30;
        System.out.println(sum);*/

        //Question 3
        /*Write a java program which asks the user to enter his/her name and greets them with
        "Hello <name>, have a good day" text.*/

        /*Scanner sc = new Scanner(System.in);
        System.out.println("What is your Name");
        String name = sc.next();
        System.out.println("Hello " + name + " Have a good day!");*/

        //Question 4
        //Write a java program to convert kilometers to miles.

        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the distance in kilometers");
        double k = sc.nextDouble();
        double m = k * 0.62137119;
        System.out.println(k + " kilometers is equal to " + m + " miles."); */

        //Question 5
        // Write a java program to detect whether a number entered by the user is integer or not.

        //Question 6
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        System.out.println(sc.hasNextInt());*/

        /*float b = 10;
        float a = 4;
        float c = 2;
        float x = (b*b)-(4*a*c)/(2*a);
        System.out.println(x);*/

        /*char grade = 'j';
        grade = (char) (grade-8);
        System.out.println(grade);*/

        /*Scanner c = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = c.nextInt();
        int b = 70;
        System.out.println(a>=b);*/
        String a = "  avinash raj";
        System.out.println(a.trim());

    }
}
