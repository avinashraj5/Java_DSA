public class logical_operator {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        System.out.println("In Logical AND operator");
        if (a&&b) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        System.out.println("In OR operator");
        if (a||b) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        System.out.println("In NOT operator");
        System.out.print("NOT(a) is ");
        System.out.println(!a);
        System.out.print("NOT(b) is ");
        System.out.println(!b);


    }
}
