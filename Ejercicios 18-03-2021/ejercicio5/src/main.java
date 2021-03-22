import java.util.Scanner;
public class main {
    public static void main (String args[]) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        Integer n= scanner.nextInt();
        System.out.println("Ingrese un numero:");
        Integer m= scanner.nextInt();
        System.out.println("Ingrese un numero:");
        Integer d= scanner.nextInt();
        boolean respuesta= false;
        Integer contador=n, i=0;
        while(contador!=0){
            if(verNaturales(i, m, d)){
                System.out.println(i);
                contador--;
            }
            i++;
        }
    }
    public static boolean verNaturales(Integer i,Integer m, Integer d){
        String auxiliar=i.toString();
        String auxiliar2=d.toString();
        int cont=0;
        for (int j=0; j<auxiliar.length();j++){
            if(auxiliar.charAt(j)==auxiliar2.charAt(0)){
                cont++;
            }
        }
        if (cont==m){
            return true;
        }
        return false;
    }
}
