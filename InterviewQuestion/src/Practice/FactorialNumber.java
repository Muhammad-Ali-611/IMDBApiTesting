package Practice;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FactorialNumber {

         /*
     * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
     * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
     *

         */

        public static int factorialItaretion(int n){
            int result = 1;
            for (int i = 1; i<= n; i++)
                result *= i;
            return result;
        }
        public static int FactorialRecursion(int n){
            if (n == 0)
                return 1;
            return n * FactorialRecursion(n -1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter a Number ");
        int sc = scanner.nextInt();
        System.out.println("Factorial of" + sc + " using iteration " + factorialItaretion(sc));
        System.out.println("Factorial of" + sc + " using Recursion " + FactorialRecursion(sc));

    }



}