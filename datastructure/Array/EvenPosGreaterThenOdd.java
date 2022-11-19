package datastructure.Array;

public class EvenPosGreaterThenOdd {

    private int[] arrangeEvenPosGreaterThenOddPos(int[] arr, int n) {

        for (int i = 1; i < n; i++) {
            if (i % 2 == 0) {
                if (arr[i] > arr[i - 1] || arr[i] < arr[i - 1]) {
                    doSwap(arr, i, i - 1);
                }
            }
        }
        return arr;
    }

    private void doSwap(int[] arr, int i, int i1) {
        int temp = arr[i];
        arr[i] = arr[i1];
        arr[i1] = temp;
    }

    public static void main(String[] args) {
        EvenPosGreaterThenOdd greaterThenOdd = new EvenPosGreaterThenOdd();
        int[] arr = {3, 1, 9, 2, 10,5};
        int n = arr.length;
        int[] res = greaterThenOdd.arrangeEvenPosGreaterThenOddPos(arr, n);
        for (int re : res) {
            System.err.print(re + ",");
        }
    }

}
