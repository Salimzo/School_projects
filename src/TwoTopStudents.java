import java.util.Scanner;

public class TwoTopStudents {

    public static void main(String[] args) {

        // create scanner
        Scanner input = new Scanner(System.in);

        // prompts the user to enter number of students
        System.out.print("Enter number of students: ");
        int nStudents = input.nextInt();
        input.nextLine(); // remove the newline in the input buffer

        // defines 2 arrays for scores and names
        String[] names = new String[nStudents];
        int[] scores = new int[nStudents];

        System.out.println(); // new line
        for (int i = 0; i < nStudents; i++) {
            // read name and score
            System.out.print("Enter the student score and name: ");
            int score = input.nextInt();
            String name = input.nextLine().trim();

            // store names and score
            names[i] = name;
            scores[i] = score;
        }

        // find top 2 students
        int firstI = 0, secondI = 0;
        for (int i = 0; i < nStudents; i++) {
            if(scores[i] > scores[firstI]) {
                secondI = firstI;
                firstI = i;
            }
            else if(scores[i] > scores[secondI] && firstI != secondI) {
                secondI = i;
            }
        }
        System.out.println("\nTop two students:");
        System.out.printf("First place: %s with score: %d\n", names[firstI], scores[firstI]);
        System.out.printf("Second place: %s with score: %d\n", names[secondI], scores[secondI]);
        // close the scanner
        input.close();

    }
}
