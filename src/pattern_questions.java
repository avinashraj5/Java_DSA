public class pattern_questions {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
class patter_question2{
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

class patter_question3{
    public static void main(String[] args) {
        for (int i = 1; i < 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

class patter_question4{
    public static void main(String[] args) {
        for (int i = 1; i < 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}

class patter_question5{
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = i; j < 4; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

class patter_question6{
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4-i+1; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

class patter_question7 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            //space
            for (int j=0; j<5-i-1; j++){
                System.out.print(" ");
            }
            //Star
            for (int j=0; j<2*i+1; j++){
                System.out.print("*");
            }
            //Space
            for (int j=0; j<5-i-1; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

class patter_question8 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            //space
            for (int j=0; j<i;j++){

                System.out.print(" ");
            }
            //Star
            for (int j=0; j<2*5-(2*i+1); j++){
                System.out.print("*");
            }
            //Space
            for (int j=0; j<i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    }

class patter_question9 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            //space
            for (int j=0; j<5-i-1; j++){
                System.out.print(" ");
            }
            //Star
            for (int j=0; j<2*i+1; j++){
                System.out.print("*");
            }
            //Space
            for (int j=0; j<5-i-1; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = 0; i < 5; i++) {
            //space
            for (int j=0; j<i;j++){

                System.out.print(" ");
            }
            //Star
            for (int j=0; j<2*5-(2*i+1); j++){
                System.out.print("*");
            }
            //Space
            for (int j=0; j<i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

class pattern_question10{
    public static void main(String[] args) {
        for (int i=1; i<=2*5-1; i++){
            int stars = i;
            if (i>5) stars = 2*5-i;
            for (int j=1; j<=stars; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

class pattern_question11{
    public static void main(String[] args) {
        int start = 1;
        for (int i=0; i<5; i++){
            if (i % 2 == 0) start = 1;
            else start = 0;
            for (int j=0; j<=i; j++){
                System.out.print(start+" ");
                start = 1-start;
            }
            System.out.println();
        }
    }
}






        /*int i, j, row=6;
        for(i=0; i<row; i++){
            for(j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }*/

        /*int i,j,row=6;
        for (i=0; i<row; i++) {
            for (j=2*(row-i); j>=0; j--){
                System.out.print(" ");
            }
            for (j=0; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }*/

        //Pyramid Pattern
        /*int i,j,row=6;
        for (i=0; i<row; i++) {
            for (j=row-i; j>=0; j--){
                System.out.print(" ");
            }
            for (j=0; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }*/
