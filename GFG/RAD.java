package GFG;

public class RAD {
    //Rotate an array by D steps
    public static void main (String[]args){
        int arr [] = {1, 2, 3, 4, 5};
        int d = 2;

        for(int i = 0, j = d-1; i<j; i++,j--){
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }
        for(int i = d, j=arr.length-1; i<j; i++,j--){
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }
        for(int i = 0, j=arr.length-1; i<j; i++,j--){
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
