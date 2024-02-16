public class method_practice_questions {
    static void multiplication(int n){
        for (int i=1; i<=10; i++){
            System.out.format("%d X %d = %d\n",n, i, n*i);
        }
    }
    static void pattern1(int n){
        for (int i=0;i<n;i++){
            for (int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static int sumRect(int n){
        if (n==1){
            return 1;
        }
        else {
            return n + sumRect(n-1);
        }
    }

    static void pattern2(int n){
        for (int i=0;i<n;i++){
            for (int j=i;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static int feb(int n){
        if(n==1){
            return 0;
        }
        else if(n==2){
            return 1;
            /*if (n==1 || n==2){
                return n-1;
            }*/
        }
        else {
            return feb(n-1)+feb(n-2);
        }
    }

    static int add(int ...arr){
        //int n= arr.length;
        int result = 0;
        for (int i : arr){
            result = result + i;
        }
        return (result/ arr.length);
    }

    static void pattern2_rec(int n){
        if (n>0){
            for (int i=n;i>0;i--)
                    System.out.print("*");
            }
            System.out.println();
        pattern2_rec(n-1);
        }

    static void pattern1_rec(int n){
        if (n>0){
            pattern1_rec(n-1);
            for (int i=0;i<n;i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static double temp(double celsius){
        return (celsius * 9/5) + 32;
    }

    public static void main(String[] args) {
        //Question 1
        //multiplication(8);

        //Question 2
        //pattern1(9);

        //Question 3
        //int c=sumRect(3);
        //System.out.println(c);

        //Question 4
        //pattern2(7);

        //Question 5
        //int result = feb(7);
        //System.out.println(result);

        //Question 6
        //System.out.println(add(1,2));
        //System.out.println(add(2,3,4));
        //System.out.println(add(4,5,6));
        //System.out.println(add(10,20,30,20));

        //Question 7
        //pattern2_rec(5);


        //Question 8
        pattern1_rec(8);

        //Question 9
        //double celsius = 50;
        //double fahrenheit = temp(celsius);
        //System.out.println(fahrenheit);

    }
}
