import java.util.Scanner;
public class if_else_questions {
    public static void main(String[] args) {

//        Question 1
//        int a = 10;
//        if(a==11) {
//            System.out.println("I am 11");
//        }
//        else {
//            System.out.println("I am not 11");
//        }

//        Question 2
//        int marks1,marks2,marks3;
//        Scanner a = new Scanner(System.in);
//        System.out.println("Enter the marks of Maths");
//        marks1 = a.nextInt();
//
//        System.out.println("Enter the marks of Physics");
//        marks2 = a.nextInt();
//
//        System.out.println("Enter the marks of English");
//        marks3 = a.nextInt();
//
//        float b = (marks1+marks2+marks3)/3.0f;
//        System.out.println("Total % obtained: " +b);
//        if (b>=40 /*&& marks1>=33 && marks2>=33 && marks3>=33*/) {
//            System.out.println("You are promoted");
//        }
//        else {
//            System.out.println("You are not Promoted, Work Hard Boy!!");
//        }

//        Question 3
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your Income");
//        float tax = 0;
//        float income = sc.nextFloat();
//        if (income<2.5) {
//            tax = tax + 0;
//        }
//        else if (income>2.5 && income<=5.0f) {
//            tax = tax + 0.05f * (income - 2.5f);
//        }
//        else if (income>5.0 && income<=10.0f) {
//            tax = tax + 0.05f * (5.0f - 2.5f);
//            tax = tax + 0.2f * (income - 5.0f);
//        } else if (income>10.0f) {
//            tax = tax + 0.05f * (5.0f - 2.5f);
//            tax = tax + 0.2f * (10.0f - 5.0f);
//            tax = tax + 0.3f * (income - 10.0f);
//        }
//        System.out.println("The total tax paid by the employee " + tax);

//        Question 4
//        int day;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number of Day");
//        day = sc.nextInt();
//        switch (day) {
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//        }

//        Question 5;
//        int year;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the Year");
//        year = sc.nextInt();
//        int x = year%4;
//        if (x==0) {
//            System.out.println("This is a leap year");
//        }
//        else {
//            System.out.println("This is not a leap year");
//        }

//        Question 6
        String website;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Website");
        website = sc.next();
        if (website.endsWith(".com")) {
            System.out.println("This is a commercial website");
        } else if (website.endsWith(".org")) {
            System.out.println("This is an Organizational website");
        } else if (website.endsWith(".in")) {
            System.out.println("This is an Indian website");
        }
    }
}
