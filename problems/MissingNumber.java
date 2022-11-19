package problems;

public class MissingNumber {

    /*
    Calculate the sum of number using (n+1) * (n+2)/2
    Loop through all the elements from the array and subtract all the numbers form the sum.
    Then you will get the missed number.
     */
    private int missingNumberInUnSortedArray(int[] arr) {

        int n = arr.length;
        int sum = (n + 1) * (n + 2) / 2;
        for (int i = 0; i < n; i++) {
            System.err.print(" - " + sum);
            sum -= arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        MissingNumber missingNumber = new MissingNumber();
        int[] arr = {6, 3, 2, 4, 1};
        int result = missingNumber.missingNumberInUnSortedArray(arr);
        System.err.println(" ");
        System.err.println(" " + result);
    }
}
