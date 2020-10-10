import java.util.Scanner;

public class SortThreeWords {

    public static void main(String[] args) {

        // create scanner
        Scanner sc = new Scanner(System.in);

        // prompts the user to enter three words
        System.out.print("Write in first word: ");
        String w1 = sc.nextLine();
        System.out.print("Write in second word: ");
        String w2 = sc.nextLine();
        System.out.print("Write in third word: ");
        String w3 = sc.nextLine();

        String[] arrayWords = {w1, w2, w3};

        // sort
        sort(arrayWords);

        System.out.print("Three words in alphabetic order are:");
        for (int i = 0; i < 3; i++) {
            System.out.print(" " + arrayWords[i] + " ");
        }
        System.out.println();

    }

    // sort given words array
    static void sort(String[] array) {
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i].compareTo(array[i + 1]) > 0) {
                    String temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }
        }

    }

}
