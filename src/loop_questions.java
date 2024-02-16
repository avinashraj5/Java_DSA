public class loop_questions {
    static int i1=0, i2=1, i3;
    static void printfab(int count){
        if (count>0){
            i3 = i1+i2;
            i1 = i2;
            i2 = i3;
            System.out.print(" "+i3);
            printfab(count-1);
        }
    }
    public static void main(String[] args) {
        int count = 10;
        System.out.print(i1+" "+i3);
        printfab(count-2);
//         int i, j, row=6;
//        for (i=0; i<row; i++){
//            //for (j=2*(row-i); j>=0; j--){
//                //System.out.print(" ");}
//            for (j=0; j<=i; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        //Question 1
//        int i, j, row=4;
//        for (i=row; i>=0; i--){
//        for (j=0; j<=i; j++){
//            System.out.print("* ");
//        }
//        System.out.println();
//    }
        //OR
//         for (int i = 0; i < 4; i++) {
      //This for loop is to print some number of stars in one line
//            for (int j = i; j<4; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        //Question 2
//        int y =5;
//         int i = 0;
//        while (i<=y){
//            System.out.println(i);
//            i+=2;
//        }
        //OR
//        int x=0;
//        int n=3;
//        for(int i=0;i<n;i++){
//            x = x + (2*i);
//        }
//        System.out.print("Sum of even numbers is: ");
//        System.out.println(x);

//        Question 3
//        int y=9;
//        for (int i=0; i<=10; i++){
//            System.out.printf("%d x %d = %d\n",y,i,y*i);
//        }

        //Question 4
//        int y=10;
//        for (int i=10; i>0; i--){
//            System.out.printf("%d x %d = %d\n",y,i,y*i);
//        }

        //Question 6
//        int y =5;
//        int i = 0;
//        while (i<y){
//            System.out.println(y);
//            i++;
//        }

        //Question 5
//        int n = 5;
//        // What is factorial n = n * n-1 * n-2 ..... 1
//        // 5! = 5*4*3*2*1 = 120
//        int i = 1;
//        int factorial = 1;
//        while(i<=n){
//            factorial *= i;
//            i++;
//        }
//        System.out.println(factorial);
        //OR
//        int a=8;
//        int x=1;
//        for (int i=1; i<=a; i++){
//            x *=i;
//        }
//        System.out.println(x);

        //Question 9
//        int y=9;
//        int sum =0;
//        for (int i=0; i<=10; i++){
//        sum += y*i;
//        }
//        System.out.println(sum);

        //Question 10
    }
}