package GFG;

//done using StablePartitioningUsingReserveArray
public class MoveNegativeAtEnd {
    public static void moveNegativeToEnd(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                temp[j++] = arr[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                temp[j++] = arr[i];
            }
        }
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, -1, 3, 2, -7, -5, 11, 6};
        moveNegativeToEnd(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
