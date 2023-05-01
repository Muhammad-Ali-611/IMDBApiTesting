package Practice;

public class Fibonacci {

    /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */

    public static void main(String[] args) {

        int[] fib = new int[40];

        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i < 40; i++)
            fib[i] = fib[i - 1] + fib[i - 2];
        for (int i = 0; i < fib.length; i++) {
            System.out.println(fib[i] + " ");
        }


    }
}