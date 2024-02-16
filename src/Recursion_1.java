public class Recursion_1 {
    public static void printNum(int i){
        if (i == 0){
            return;
        }
        System.out.print(i);
        printNum(i-1);
    }
    public static void main(String[] args) {
        int i = 5;
        printNum(i);

    }
}

//Print sum of first n natural number
class Recursion_2{
    public static void printNum(int i, int n, int sum){
        if (i == n) {
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        printNum(i+1, n, sum);
    }

    public static void main(String[] args){
            printNum(1, 5, 0);
        }
}

//Print Factorial of number n
class Recursion_3{
    public static int factorial(int n){
        if (n == 1 || n == 0)
            return 1;
        int fact_nm1 = factorial(n-1);
        int fact_n = n * fact_nm1;
        return fact_n;
    }
    public static void main(String[] args) {
        int n = 7;
        int ans = factorial(n);
        System.out.println(ans);
    }
}

//Print the fibonacci sequence till nth term
class Recursion_4{
    public static void printfab(int a, int b, int n){
        if (n == 0){
            return;
        }
        int c = a+b;
        System.out.println(c);
        printfab(b, c, n-1);
    }
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        int n = 18;
        printfab(a, b, n-2);
    }
}

//Print the fibonacci sequence till nth term
class recursion_4{
    public static int fibRecursion(int count){
        if (count == 0){
            return 0;
        }
        if (count == 1 || count == 2) {
            return 1;
        }
        return fibRecursion(count - 1) + fibRecursion(count - 2);
    }
    public static void main(String[] args) {
        int fib_len = 9;
        System.out.print("Fibonacci Series of " + fib_len + " number is:\n");
        for (int i=0; i<fib_len; i++){
            System.out.print(fibRecursion(i) + " ");
        }
    }
}

//Print x^n (Stack height = n)
class Recursion_5{
    public static int calcPower(int x, int n){
        if (n == 0){
            return 1;
        }
        if (x == 0){
            return 0;
        }
        int xPownm1 = calcPower(x, n-1);
        int xPown = x*xPownm1;
        return xPown;
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        int ans = calcPower(x, n);
        System.out.println(ans);
    }
}

//Print x^n (Stack height = logn)
class Recursion_6{
    public static int calcPower(int x, int n){
        if (n == 0){
            return 1;
        }
        if (x == 0){
            return 0;
        }
        if (n % 2 ==0){
            return calcPower(x, n/2) * calcPower(x, n/2);
        }
        else{
            return calcPower(x, n/2) * calcPower(x, n/2) * x;
        }
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        int ans = calcPower(x, n);
        System.out.println(ans);
    }
}

// Tower of Hanoi
class Recursion_7{
    public static void TowerOfHanoi(int n, String src, String helper, String dest){
        if (n==1){
            System.out.println("transfer disk " + n + " from " + src + " to " + dest);
            return;
        }
        TowerOfHanoi(n-1, src, dest, helper);
        System.out.println("transfer disk " + n + " from " + src + " to " + dest);
        TowerOfHanoi(n-1, helper, src, dest);
    }
    public static void main(String[] args) {
        int n = 3;
        TowerOfHanoi(n, "S", "H", "D");
    }
}

// Print a string in Reverse
class Recursion_8{
    
}

class PrintNumbersWithoutLoop {
    public static void printNumbers(int n) {
        if (n <= 10) {
            System.out.println(n);
            printNumbers(n + 1);
        }
    }

    public static void main(String[] args) {
        int startingNumber = 1;
        printNumbers(startingNumber);
    }
}

class short_fun{
    public static void main(String[] args) {
        short x = 10;
        x = (short) (x * 5);
        System.out.println(x);

    }
}

class check{
    static boolean ckeck(int n){
        if ((n^1)==(n+1))
            return true;
            else
                return false;
        }

    public static void main(String[] args) {
        int n = 20;
        System.out.println(ckeck(n)==true ? "Even" : "Odd");
    }
}

class Check{
    static boolean ckeck(int n){
        return  ((n^1)==(n+1));
    }

    public static void main(String[] args) {
        int n = 20;
        System.out.println(ckeck(n) ? "Even" : "Odd");
    }
}

class check2{
    public static void main(String[] args) {
        int n = 31;
        int answer = n/2;
        if ((answer*2)==n){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }
}

class Check2 {

    static boolean isEven(int n) {
        if (n == 0) {
            return true;  // Base case: 0 is even
        } else if (n == 1) {
            return false; // Base case: 1 is odd
        } else {
            // Recursively check the number one less than n
            return isEven(n - 1);
        }
    }
    public static void main(String[] args) {
        int n = 31;
        if (isEven(n)) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}

class check3{
    public static void main(String[] args) {
        int a = 37;
        if (a%2== 0){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }
}




