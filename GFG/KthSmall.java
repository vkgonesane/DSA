package GFG;

public class KthSmall {
    public static void main(String[] args){
        int arr [] = {7, 10, 4, 3, 20, 15};
        int k = 3;
        int n = arr.length;

        for(int i = 0; i < n - 1; i++) {
            for(int j = 0; j < n - 1 - i; j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }


        System.out.println(arr[k-1]);
    }
}
