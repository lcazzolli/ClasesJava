import java.util.Scanner;

public class main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese numero:");
        int n = scanner.nextInt();

        if(n==0){

            System.out.println("El numero ingresado es 0");
        }else {
            boolean bandera = numeroPrimo(n);
            if (bandera) {
                System.out.println("Es primo");
            } else {
                System.out.println("Es no primo");
            }
        }
        scanner.close();
    }

    public static boolean numeroPrimo(int n)
    {

        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
