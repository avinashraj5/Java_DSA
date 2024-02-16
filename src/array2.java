public class array2 {
    public static void main(String[] args) {
        //int [] marks; // A 1-D Array
        int [][] flats; // A 2-D Array
        flats = new int [2][3];
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;

        // Displaying the 2-D Array (for loop)
        System.out.println("Printing a 2-D array using for loop");
        for(int i=0;i<flats.length;i++){
            for(int j=0;j<flats[i].length;j++) {
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }


        //int [] marks; // A 1-D Array
        //int [][] flats; // A 2-D Array
        int[][][] marks = new int[3][3][3]; // A 3-D Array
        marks[0][0][0] = 101;
        marks[0][0][1] = 102;
        marks[0][0][2] = 103;
        marks[0][1][0] = 104;
        marks[0][1][1] = 105;
        marks[0][1][2] = 106;
        marks[0][2][0] = 201;
        marks[0][2][1] = 202;
        marks[0][2][2] = 203;
        marks[1][0][0] = 204;
        marks[1][0][1] = 205;
        marks[1][0][2] = 206;
        marks[1][1][0] = 301;
        marks[1][1][1] = 302;
        marks[1][1][2] = 303;
        marks[1][2][0] = 304;
        marks[1][2][1] = 305;
        marks[1][2][2] = 306;
        marks[2][0][0] = 401;
        marks[2][0][1] = 402;
        marks[2][0][2] = 403;
        marks[2][1][0] = 404;
        marks[2][1][1] = 405;
        marks[2][1][2] = 406;
        marks[2][2][0] = 501;
        marks[2][2][1] = 502;
        marks[2][2][2] = 503;

        // Displaying the 3-D Array (for loop)
        System.out.println("Printing a 3-D array using for loop");
        for (int i=0; i<marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                for (int k = 0; k < marks[i][j].length; k++) {
                    System.out.print(marks[i][j][k]);
                    System.out.print(" ");
                }
                System.out.println();
            }
            //System.out.println("\n");
        }
    }
}
