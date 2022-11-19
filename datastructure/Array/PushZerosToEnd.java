package datastructure.Array;

public class PushZerosToEnd {

    private int[] pushZerosToEndPosition(int[] arr, int n) {

        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                swap(arr, i, j);
                j++;
            }
        }
        return arr;
    }

    private void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        PushZerosToEnd zerosToEnd = new PushZerosToEnd();
        int[] arr = {0,1, 3, 6, 7, 0, 8, 2, 0, 5, 0, 9, 0};
        int n = arr.length;
        int[] res = zerosToEnd.pushZerosToEndPosition(arr, n);
        for (int re : res) {
            System.err.print(re + ",");
        }
    }


}
