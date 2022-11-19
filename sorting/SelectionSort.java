package sorting;

public class SelectionSort {

    // pick the smallest numb index (i) and check each element and sort once, not in each iteration
    private void getSelectionSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
        }
        for (int j : arr) {
            System.err.print(j + " , ");
        }

    }

    public static void main(String[] args) {

        SelectionSort selectionSort = new SelectionSort();
        int[] arr = {4, 6, 7, 2, 1, 9};
        selectionSort.getSelectionSort(arr);
    }
}
