import java.util.*;

class BinarySearch {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array :");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Elements after sorting:");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println("\n Enter the element to be searched:");
        int key = sc.nextInt();
        int result = Arrays.binarySearch(arr, key);
        if (result < 0)
            System.out.println("Element is not found!");
        else
            System.out.println("Element is found at index: " + result);
    }
}
