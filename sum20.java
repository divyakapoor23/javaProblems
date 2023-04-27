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
