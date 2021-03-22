import java.util.Scanner;

public class main {
    public static void main(String args[])
    {
        multiplo();

    }
    public static void multiplo(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese numero n:");
        int n = scanner.nextInt();

        System.out.println("Ingrese numero m:");
        int m = scanner.nextInt();

        for(int i=1; i<=n; i++)
        {
            System.out.println(i*m);

        }
        scanner.close();

    }
}
