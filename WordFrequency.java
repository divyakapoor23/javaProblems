// write a java program that takes in a string of words and outputs the number of times 
// each word appears in the string. the program should first prompt the user to enter the 
// string of words and then output each word along with its frequency using brute force
import java.util.Scanner;

public class WordFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string of words: ");
        String inputString = scanner.nextLine();
        String[] words = inputString.split("\\s+");
        
        int[] frequencies = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            frequencies[i] = 1;
            for (int j = i+1; j < words.length; j++) {
                if (words[i].equalsIgnoreCase(words[j])) {
                    frequencies[i]++;
                    words[j] = "";
                }
            }
        }

        System.out.println("Word Frequency:");
        for (int i = 0; i < words.length; i++) {
            if (words[i] != "") {
                System.out.println(words[i] + ": " + frequencies[i]);
            }
        }
    }
}

