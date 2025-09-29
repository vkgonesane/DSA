package Leetcode;

public class CWMW {
    public static void main(String[] args) {
        int arr[] = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int maxArea = 0;

        for (int left = 0, right = arr.length - 1; left < right;) {
            int height = Math.min(arr[left], arr[right]);
            int width = right - left;
            int area = height * width;

            if (area > maxArea) {
                maxArea = area;
            }

            if (arr[left] < arr[right]) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println("Maximum water that can be contained is: " + maxArea);
    }
}
