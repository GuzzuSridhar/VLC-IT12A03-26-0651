package arrays;

import java.util.Arrays;

public class MultiDimensional {
    public static void main(String[] args) {
        // literal approach
        int[][] matrix = {
            {1,2,3}, // row 1 with 3 columns
            {4,5,6}  // row 2 with 3 columns
        };

        // print the array using the API
        System.out.println("------Print array with API ---------");
        System.out.println("------Using Arrays.toString() - Not the right way ---------");
        System.out.println(Arrays.toString(matrix));
        System.out.println("------Using Arrays.deepToString() - the right way ---------");
        System.out.println(Arrays.deepToString(matrix));

        
        // traverse loop with traditional loop (nested loops)
        System.out.println("------Print array with traditional loop ---------");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                System.out.print("["+i+"]"+"["+j+"] -> "+matrix[i][j] +"\t");
            }
            System.out.println();
        }
        
        // traverse loop with enhanced loop (nested loops)
        System.out.println("------Print array with enhanced loop ---------");
        for (int[] row : matrix) { // picks the current row in the array
            for (int element : row) { // picks elements in the current row 
                System.out.print(element+ "\t");  // print each element in the current row with a tab space
            }
            System.out.println();
        }

        // fixed dimensions
        int[][] board = new int[3][3];
        // access top left element
        board[0][0] = 1;
        
        //  ragged array
        int[][] ragged = new int[3][];
        // fill each ro with different column size
        ragged[0] = new int[2]; // row 0 has 2 columns
        ragged[1] = new int[3]; // row 1 has 3 columns
        ragged[2] = new int[4]; // row 2 has 4 columns
    }

}
