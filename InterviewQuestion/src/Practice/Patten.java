package Practice;

public class Patten {

    /* Read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
     * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32............
     *
     */

    public static void main(String[] args) {
        int n = 100;

        while (n != 90){
            System.out.print( n +",");
            n =n -1;
        }
        while (n != 70){
            System.out.print(n + " ,");
            n = n -2;
        }
        while (n != 40){
            System.out.print(n + " , ");
            n = n -3;
        }
        while (n != 0 ){
            System.out.print(n + " ,");
            n = n -4;
        }
        System.out.print(n);
    }


}
