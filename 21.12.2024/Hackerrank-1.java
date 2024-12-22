21.12.2024
Hackerrank
Day-1


Pg.1
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            System.out.println(number);
        }

        scanner.close();
    }
}

