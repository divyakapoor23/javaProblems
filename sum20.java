// Write a Java program that reads in an integer array of size N, and then calculates and outputs the sum of all the even elements in the array. The program should first prompt the user to enter the value of N, and then ask them to enter N integers separated by spaces.
// Example:
// Enter the value of N: 5
// Enter the array of integers: 2 3 7 8 10
// The sum of even elements in the array is: 20
import java.util.Scanner;

public class SumOfEvenElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

    
        System.out.print("Enter the array of integers: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                sum += arr[i];
            }
        }

        System.out.println("The sum of even elements in the array is: " + sum);
    }
}
