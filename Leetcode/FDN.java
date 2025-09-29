package Leetcode;

public class FDN {
    public static void main(String[] args) {
        int arr[] = {1, 3, 4, 2, 2};

        int slow = arr[0];
        int fast = arr[0];

        // Phase 1: Detect cycle
        do {
            slow = arr[slow];
            fast = arr[arr[fast]];
        } while (slow != fast);

        // Phase 2: Find cycle entry (duplicate)
        slow = arr[0];
        while (slow != fast) {
            slow = arr[slow];
            fast = arr[fast];
        }

        System.out.println("Duplicate number is: " + slow);
    }
}
