import java.util.Scanner;

public class TurnText {

    public static void main(String[] args) {

        // create scanner
        Scanner sc = new Scanner(System.in);

        // prompts the user to enter a text
        System.out.print("Enter the text string: ");
        String text = sc.nextLine();

        String reversed = turnText(text.trim());
        System.out.printf("The revers of %s is %s\n", text, reversed);
    }

    // turn the given text
    static String turnText(String text) {
        String reversed = "";
        int length = text.length(); // text length
        for (int i = length - 1; i >= 0; i--) {
            char ch = text.charAt(i);
            reversed += ch;
        }
        return reversed;
    }

}
