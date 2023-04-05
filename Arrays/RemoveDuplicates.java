import java.util.*;

public class RemoveDuplicates {

    static int duplicate(int arr[], int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j++] = arr[i];
            }
        }
        arr[j++] = arr[n - 1];
        return j;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 15, 15, 30, 40, 40, 50, 50 };
        int length = arr.length;
        Arrays.sort(arr);
        length = duplicate(arr, length);
        for (int i = 0; i < length; i++)
            System.out.print(arr[i] + " ");
    }
}
