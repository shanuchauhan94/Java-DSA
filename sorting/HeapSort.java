package sorting;

import java.util.PriorityQueue;

public class HeapSort {

    // By using PriorityQueue implement MinHeap

    private void getHeapSort(int[] arr) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int a : arr) {
            minHeap.add(a);
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = minHeap.poll();
        }

        for (int a : arr) {
            System.err.print(a + " , ");
        }
    }

    public static void main(String[] args) {
        HeapSort heapSort = new HeapSort();
        int[] arr = {4, 6, 7, 2, 1, 9, 7};
        heapSort.getHeapSort(arr);
    }
}
