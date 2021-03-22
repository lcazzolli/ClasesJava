import java.util.Scanner;

public class main
{
    public static void main (String argd[]){
        numeroPar();
    }
    public static void numeroPar()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        int n = scanner.nextInt();

        for(int i=0;i<n*2;i+=2)
        {
             System.out.println(i);
        }
    }
}
