package task_15_18;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 4, 6, 2, 3, 7, 8, 0, 9};

        for (int i = 0; i != arr.length; i++) {
            for (int j = i; j != arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.print(String.format("%d ", arr[i]));
        }
    }
}
