package Practice;

public class FindMissingNumber {

    /*
     * If n = 10, then array will have 9 elements in the range from 1 to 10.
     * For example {10, 2, 1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).
     * Write java code to find the missing number from the array. Write static helper method to find it.
     */

    public static void main(String[] args) {

        int n =10;
        int [] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};
        missingNum(array,n);
    }
    public static void missingNum(int[] arr , int n){
        int requiredSum = 0;
        int CurrentSum = 0;
        for (int i = 1; i <= n; i++){
            requiredSum = requiredSum +i;
        }
        for (int i = 0; i < n -1; i++){
            CurrentSum = CurrentSum+arr[i];
        }
        System.out.println(" That's the missing num" + (requiredSum - CurrentSum));
    }
}
