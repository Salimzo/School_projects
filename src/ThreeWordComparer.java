// Importing Scanner
import java.util.Scanner;


public class ThreeWordComparer {
    
    
    public static void main(String[] args) {
        
        // Creating Scanner object to receive user input
        Scanner scanner = new Scanner(System.in);
        
        // Creating the String variables to store user input
        String firstWord  ;
        String secondWord ;
        String thirdWord  ;
        
        // Scan first word into the firstWord variable
        System.out.print("Write in first word: ");
        firstWord = scanner.nextLine();
        
        // Scan second word into the secondWord variable
        System.out.print("Write in second word: ");
        secondWord = scanner.nextLine();
        
        // Scan third word into the thirdWord variable
        System.out.print("Write in third word: ");
        thirdWord = scanner.nextLine();
        
        
        // Sorting the three words Alphabetically
        // The way i sort the three words is the following:
        
        // I compare the first two words to find the one that comes first
        if (firstWord.compareTo(secondWord) > 0 ){
            //If the second Word comes before the first then i switch their place
            String tmp = firstWord ;
            firstWord  = secondWord ;
            secondWord = tmp ;
        }
        
        // Then, i compare the first and third words
        if (firstWord.compareTo(thirdWord) > 0){
            // If the third word comes before the first, i switch their place
            String tmp = firstWord ;
            firstWord = thirdWord ;
            thirdWord = tmp ;
        }
        
        // At this point the first word is in the correct position
        // All that is left is to compare the second and third words.
        if (secondWord.compareTo(thirdWord) > 0){
            String tmp = secondWord ;
            secondWord = thirdWord ;
            thirdWord = tmp ;
        }
        
        // Printing the words in alphabetic order to the user
        System.out.print("Three words in alphabetic order are: "
        + firstWord + " " + secondWord + " " + thirdWord);
        
        System.out.println();
        
        
    }
    
}


