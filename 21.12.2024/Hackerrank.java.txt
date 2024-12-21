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

Pg.2
import java.util.*;
 
public class Solution {
 
 public static void main(String[]args)
 {
    Scanner scanner=new Scanner(System.in);
    int n=scanner.nextInt(); 
    scanner.close();
    
    if(n%2!=0)
    {
        System.out.println("Weird");
    }
    else if(n%2==0 && n>=2&&n<=5)
    {
        System.out.println("Not Weird");
    }
    else if(n%2==0 && n>=6 && n<=20)
    {
        System.out.println("Weird");
    }
    else{
        System.out.println("Not Weird");
    }
 }
    
}


Pg.3
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        double d= scanner.nextDouble();
        scanner.nextLine();
        String s= scanner.nextLine();
        
        scanner.close();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}


Pg.4

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=scanner.next();
                int x=scanner.nextInt();
                System.out.printf("%-15s%03d%n", s1, x);
            
            }
             scanner.close();
            System.out.println("================================");

    }
}



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



Pg.6

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            try {
        
                long n = scanner.nextLong();
                System.out.println(n + " can be fitted in:");

           
                if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }
                if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                System.out.println("* long");
            } catch (Exception e) {
                
                System.out.println(scanner.next() + " can't be fitted anywhere.");
            }
        }

        scanner.close();
    }
}


Pg.7


import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        String us = usFormat.format(payment);

        Locale indiaLocale = new Locale("en", "IN");
        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(indiaLocale);
        String india = indiaFormat.format(payment);


        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = chinaFormat.format(payment);
        NumberFormat franceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = franceFormat.format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}



Pg-8


import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();


        int totalLength = A.length() + B.length();
        System.out.println(totalLength);

        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        String capitalizedA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String capitalizedB = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(capitalizedA + " " + capitalizedB);
    }
}





