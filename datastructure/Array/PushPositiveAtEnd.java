package datastructure.Array;

public class PushPositiveAtEnd {

    private int[] rearrangePosNegNum(int[] arr) {

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                int temp = arr[count];
                arr[count] = arr[i];
                arr[i] = temp;
                count++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        PushPositiveAtEnd posNeg = new PushPositiveAtEnd();
        int[] arr = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        int[] res = posNeg.rearrangePosNegNum(arr);
        for (int re : res) {
            System.err.print(re + ",");
        }

    }
}
