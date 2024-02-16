public class questions_loop {
    public static void main(String[] args) {
        int i,j,row=6;
        for(i=0; i<row; i++){
            for(j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        /*int i, j, row=6;
//outer loop for rows
        for(i=0; i<row; i++){
//inner loop for columns
            for(j=0; j<=i; j++){
//prints stars
                System.out.print("* ");
            }
//throws the cursor in a new line after printing each line
            System.out.println();
        }*/
    }
}
