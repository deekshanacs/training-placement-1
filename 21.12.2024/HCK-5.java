Pg.5

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt(); 

        for (int i = 0; i < q; i++) {
            int a = scanner.nextInt(); 
            int b = scanner.nextInt(); 
            int n = scanner.nextInt();

            int current = a;
            for (int j = 0; j < n; j++) {
                current += Math.pow(2, j) * b; 
                System.out.print(current + " ");
            }
            System.out.println(); 
        }

        scanner.close();
    }
}
