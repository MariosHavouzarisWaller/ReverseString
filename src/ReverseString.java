import java.util.Scanner;

public class ReverseString {

    // Here we are inputting a String and reversing it using a for loop
    public static void main(String[] args) {

        // Initialise Scanner and Variables
        Scanner reader = new Scanner(System.in);
        System.out.print("Input a string: ");
        char [] letters = reader.nextLine().toCharArray();  // This will separate each letter in the string and place them individually in an array for easy access later
        String reverseLetters = "";

        // Take the letters from the array, starting at the greatest index and going down to the smallest and add them to a string after each iteration
        for (int i = (letters.length - 1); i >= 0; i--) {
            reverseLetters += letters[i];
        }
        System.out.println(reverseLetters);
    }
}
