public class break_continue_loop {
    public static void main(String[] args) {
        /*int a = 1;
        while (a<10) {
            System.out.println("Hello");
        if (a==5){
            System.out.println("Fuck off");
            break;
        }
            a++;
        }*/

        /*int a = 1;
        while (a<10){
            if (a==5){
            System.out.println("Hello");
            a++;
            continue;
        }
                System.out.println("Fuck off");
                a++;
    }*/

        //For Loop
        /*for (int i=0; i<10; i++){
            System.out.println("Hii");
        if (i==5){
            System.out.println("Okkk");
            break;
        }
        }*/

        /*for (int i=0; i<10; i++){
            if (i==5){
            System.out.println("Hii");
            continue;
            }
            System.out.println("Bye");
        }*/

        //Do-While-Loop
        /*int a =1;
        do{
            System.out.println("Beta");
            if (a==5) {
                System.out.println("Son");
                break;
            }
            a++;
        }
        while (a<10);*/

        int a =1;
        do{
            System.out.println("Beta");
            a++;
            if (a==5) {
                System.out.println("Son");
                continue;
            }
        }
        while (a<10);

    }
}
