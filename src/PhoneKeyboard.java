import java.util.Scanner;

public class PhoneKeyboard {

    public static void main(String[] args) {

        // create scanner
        Scanner sc = new Scanner(System.in);

        // prompts the user to enter a letter
        System.out.print("Enter a letter: ");
        String letter = sc.next();

        if(letter.length() > 1) {
            System.out.println("Input should be a letter");
        } else {
            // convert to number
            int number = letter2number(letter);
            if(number > 0) {
                System.out.printf("Corresponding number for: %s is: %d\n", letter, number);
            } else {
                System.out.printf("%s does not have a corresponding number.\n", letter);
            }
        }
    }

    // convert given letter to keyboard number
    static int letter2number(String letterString) {
        char letter = letterString.toLowerCase().charAt(0);
        if(letter == 'a' || letter == 'b' || letter == 'c') {
            return 2;
        }
        else if(letter == 'd' || letter == 'e' || letter == 'f') {
            return 3;
        }
        else if(letter == 'g' || letter == 'h' || letter == 'i') {
            return 4;
        }
        else if(letter == 'j' || letter == 'k' || letter == 'l') {
            return 5;
        }
        else if(letter == 'm' || letter == 'n' || letter == 'o') {
            return 6;
        }
        else if(letter == 'p' || letter == 'q' || letter == 'r' || letter == 's') {
            return 7;
        }
        else if(letter == 't' || letter == 'u' || letter == 'v') {
            return 8;
        }
        else if(letter == 'w' || letter == 'x' || letter == 'y' || letter == 'z') {
            return 9;
        }
        return -1;
    }

}
