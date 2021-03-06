import java.util.Arrays;

public class StringUtil
{
	// Retorna una cadena compuesta por n caracteres c
	// Ejemplo: replicate('x',5) ==> 'xxxxx'
	public static String replicate(char c, int n)
	{
		return "";
	}

	// Retorna una cadena de longitud n, compuesta por s
	// y precedida de tantos caracteres c como sea necesario
	// para completar la longitud mencionada
	// Ejemplo lpad("5",3,'0') ==> "005"
	public static String lpad(String s, int n, char c)
	{
		String valor = String.format("%"+n+"s",s).replace(' ' ,c);
		return valor;
	}

	// Retorna un String[] conteniendo los elementos de arr
	// representados como cadenas de caracteres
	public static String[] toStringArray(int arr[])
	{
		String[] vector = new String[arr.length];
		for(int i=0;i<arr.length;i++){
			vector[i] = String.valueOf(arr[i]);
		}
		int max = maxLength(vector);
		for(int i =0; i<vector.length;i++) {
			vector[i]=StringUtil.lpad(vector[i], max, '0');
		}

		return vector;
	}

	// Retorna un int[] conteniendo los elementos de arr
	// representados como cadenas de caracteres
	public static int[] toIntArray(String arr[])
	{
		int[] vector = new int[arr.length];
		for(int i = 0; i < arr.length; i++){
			vector[i] = Integer.parseInt(arr[i]);
		}
		return vector;
	}

	// Retorna la longitud del elemento con mayor cantidad
	// de caracteres del array arr
	public static int maxLength(String arr[])
	{
		int max =1;
		for(int i=0;i<arr.length;i++){
			if(max<arr[i].length()){
				max=arr[i].length();
			}
		}
		return max;
	}

	// Completa los elemento del arr agregando caracteres c
	// a la izquierda, dejando a todos con la longitud del mayor
	public static void lNormalize(String arr[], char c)
	{

	}
}
