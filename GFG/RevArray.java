package GFG;

public class RevArray {
    public static void main(String[] args){
        int arr[] = {1, 4, 3, 2, 6, 5};
        int temp;
        int j = arr.length - 1;

        for(int i = 0; i < j; i++, j--){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
