package Practice;

import java.util.Scanner;

public class MakePyramid {

    /*   Implement a large Pyramid of stars in the screen with java.

     *
     * *
     * * *
     * * * *
     * * * * *
     * * * * * *

     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int NumOfRows , k = 0;
        System.out.println(" Enter number of rows :: ");
        NumOfRows = sc.nextInt();
        for (int i = 1; i <= NumOfRows; ++i , k =0){
            for (int space = 1; space <= NumOfRows - i; ++space){
                System.out.print(" ");
            }
            while (k != 2 * i -1){
                System.out.print(" * ");
                ++k;
            }
            System.out.println();
        }
    }
}
