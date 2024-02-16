import java.util.Scanner;
public class else_if {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter Your Age");
        Scanner x = new Scanner(System.in);
        age = x.nextInt();
        if (age>=60) {
            System.out.println("Person is experienced");
        } else if (age>=40) {
            System.out.println("Person is semi-experienced");
        } else if (age>=30) {
            System.out.println("Person is semi-semi experienced");
        }
        else {
            System.out.println("Person is not experienced");
        }

    }
}
