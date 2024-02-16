import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        /*int [] x={120,200,016};
        for (int i=0; i< x.length; i++){
            System.out.print(x[i]+" ");
        }

        String x="The Kiran Academy";
        System.out.println("Count of Character in String is: "+x.length());*/

        /*System.out.println("Taking input from the user");
        Scanner c = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int a = c.nextInt();
        System.out.println("Enter 2nd number");
        int b = c.nextInt();
        int x = a+b;
        System.out.println("The sum of total number:");
        System.out.println(x);*/

    }
}

class pra{
    public static int fab(int count){
        if(count == 0){
    return 0;
        }
        if (count ==1 || count == 2){
            return 1;
        }
        return fab(count-1)+ fab(count -2);
    }
    public static void main(String[] args) {
        int fab_length = 13;
        System.out.print(" fab series of " + fab_length + " is:\n ");
        for (int i=0; i<fab_length; i++)
            System.out.print(fab(i) + " ");
    }
}

class p{
    public static void main(String[] args) {
        int a = 5;
        int res = ~a;
        System.out.println(res);
    }
}

class palin{
    public static void main(String[] args) {
        String s = new String();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String to check:");
        s = sc.nextLine();
        int i, j, flag;
        i = 0;
        j = s.length() - 1;
        flag = 0;
        while (i < j && flag == 0) {
            if (s.charAt(i) != s.charAt(j))
                flag = 1;
            i = i + 1;
            j = j - 1;
        }
        if (flag == 0)
            System.out.println("Palindrome");
         else
            System.out.println("Not Palindrome");
    }
}

class palin2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, rev = 0, z;
        System.out.println("Enter Number to check:");
        n = sc.nextInt();
        z = n;
        while (n > 0) {
            rev = (rev * 10) + n % 10;
            n = n/10;
        }
        if (rev == z)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}

class palin3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, rev = 0, z;
        System.out.println("Enter Number to check:");
        n = sc.nextInt();
        z = n;
        while (n>0) {
            rev = (rev * 10) + n % 10;
            n = n / 10;
        }
        if (rev ==z)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
