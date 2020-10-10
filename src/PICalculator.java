import java.util.Scanner;

public class PICalculator {

    public static void main(String[] args) {
        double pi = 0;
        for (int i = 1; i <= 100000; i++) {
            int numerator = i % 2 == 0 ? -1 : 1;
            pi += 4 * numerator / (2 * i - 1.0);
            if(i % 10000 == 0) {
                // print
                System.out.printf("For %d term in the series the value of pi is: %.15f\n", i, pi);
            }
        }
    }
}
