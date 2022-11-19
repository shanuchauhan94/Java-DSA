package problems;

public class SortingUsingSwap {

    private static int[] sort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                swapping(arr, i, j);
            }
        }
        return arr;
    }

    private static void swapping(int[] arr, int i, int j) {

        if (arr[i] > arr[j]) {
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 9, 5, 2, 5};
        int[] result = sort(arr);
        for (int i : result) {
            System.err.print(i + " , ");
        }
    }
}
