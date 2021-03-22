import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese numero:");
        Integer n = scanner.nextInt();
        System.out.println("Ingrese numero:");
        Integer m = scanner.nextInt();
        System.out.println("Ingrese numero:");
        Integer d = scanner.nextInt();

        boolean resp = false;
        Integer contador = n,i=1;
        while(contador!=0)
        {
            if(verNaturales(n,m,d)){
                System.out.println(i);
                contador--;
            }
            i++;
        }
        scanner.close();
    }

    public static boolean verNaturales(Integer n,Integer m,Integer d)
    {
        String auxiliar=m.toString();
        int cont=0;
        for(int i=0;i<auxiliar.length();i++){
            if(auxiliar.charAt(i)==d){
                cont++;
            }
        }

    }
}
