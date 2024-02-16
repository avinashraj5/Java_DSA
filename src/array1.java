public class array1 {
    public static void main(String[] args) {

        //Declaration + Memory allocation
//        int [] marks = new int[5];
//        marks [0] = 0;
//        marks [1] = 10;
//        marks [2] = 20;
//        marks [3] = 30;
//        marks [4] = 40;
//        System.out.println(marks[4]);

        //Declare + Initialize
//        int [] marks = {10,20,30,40,50};
//        System.out.println(marks[3]);

        //Check Length
        /*int [] marks = {10,20,30,40,50,0,0,0,};
        String [] students = {"Avinash","Sonu","Golu","Shiva","Peter"};
        System.out.println(marks.length);
        System.out.println(marks[3]);
        System.out.println(students.length);
        System.out.println(students[3]);*/

        //Displaying the array(Naive way)
        //System.out.println("Printing using Naive method");
        int[] marks = {10, 20, 30, 40, 50};
        /*System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);*/
        //Displaying the array(For loop way)
        System.out.println("Printing using for loop");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        System.out.println("Printing using for loop in Reverse order");
        for (int i = marks.length-1; i >= 0; i--) {
            System.out.println(marks[i]);
        }

        //Displaying the array(For-each Loop)
        System.out.println("Printing using For-each loop");
        for (int element:marks){
            System.out.println(element);
        }
    }
}
