Day-2
  22.12.2024
    Hackerrank
    PG-1

    import java.util.Scanner;
public class mtl{
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        for(int i=1;i<=10;i++)
        {
            int m=n*i;
            System.out.println(n + " x " + i + " = " +m);
        }
        scanner.close();
    }
}
