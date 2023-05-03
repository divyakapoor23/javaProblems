// Convert a given array into a zigzag pattern, where the elements are alternately increasing and decreasing.
import java.util.Arrays;
public class ZigzagArray {
    public static void main(String[] args) {
        int[] arr = {4, 3, 7, 8, 6, 2, 1};

    // Sort the array in ascending order
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // Print the sorted array
        System.out.println("Sorted array: " + Arrays.toString(arr));


        // Swap adjacent elements starting from the second element
        for (int i = 1; i < arr.length - 1; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}

