import java.util.Scanner;
public class switch_case {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter your Age");
        Scanner x = new Scanner(System.in);
        age = x.nextInt();
        switch(age) {
            case 18:
                System.out.println("You are eligible");
                break;
            case 25:
                System.out.println("You are getting a Job");
                break;
            case 28:
                System.out.println("You are getting married");
                break;
            default:
                System.out.println("Enjoy your life");
        }
        System.out.println("This is my Java code");

    }
}
