// write a java program that takes in a string of words and outputs the number of times 
// each word appears in the string. the program should first prompt the user to enter the 
// string of words and then output each word along with its frequency using brute force

import java.util.Scanner;
import java.util.String;

public class FrequencyWord{
    public static int countOccurrances(String userstr, String word){
        int count = 0;
        String a[] = userstr.split(",");
        for(int i = 0; i < a.length; i++){
           if(word == a[i]){
               count++;
           }
        }
        System.out.Println(count);
       return count;

   }public static void main(String[] args){
        Scanner userin = new Scanner(System.in);
        System.out.Println("Please enter a string of words: ");
        String userstr = userin.nextLine();
        System.out.Println("You have entered: ", userstr);
        Scanner wordsin = new Scanner(System.in);
        System.out.Println("Please enter the word to count for occurances: ", wordsin);
        String word = wordsin.nextLine();
        System.out.Println(countOccurrances(userstr, word)); 

    }
    
}