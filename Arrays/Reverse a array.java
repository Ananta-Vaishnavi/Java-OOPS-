public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.print("Original array: ");
        printArray(arr);
        reverseArrayInPlace(arr);
        System.out.print("Reversed array: ");
        printArray(arr);
    }

    public static void reverseArrayInPlace(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            // swap the elements at the start and end indices
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // move the start and end indices inward
            start++;
            end--;
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
}
}
