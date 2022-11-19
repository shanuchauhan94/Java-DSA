package sorting;

public class BubbleSort {

    // time complexity O(n^2) , use O(logN)
    // pick largest bubble(number) and compare each element and pushed it at the last.

    private void getBubbleSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            // leave sorted index i in each iteration (arr.length - i - 1)
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap number
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int j : arr) {
            System.err.print(j + " , ");
        }
    }

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] arr = {4, 6, 7, 2, 1, 9, 7};
        bubbleSort.getBubbleSort(arr);
    }


}
