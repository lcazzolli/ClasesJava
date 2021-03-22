import java.util.HashMap;
import java.util.Map;

public class RadixSortEjerc
{
	public static void radixSort(int []arr)
	{
		// PROGRAMAR AQUI
		String[] vector = StringUtil.toStringArray(arr);

		for(int i=1; i<=vector[0].length();i++) {

			HashMap<String,String> map = new HashMap<>();

			for(int j=0;j<vector.length;j++) {
				String caracter = vector[j].substring(vector[j].length() - i);
				char[] valCaracter = caracter.toCharArray();
				String key ="L"+valCaracter[valCaracter.length - i];
				if(map.containsKey(key)){
					String valor= map.get(key);
					valor = valor + ","+ vector[j];
					map.put(key,valor);
				}else{
					map.put(key,vector[j]);
				}
			}
			int cont=0;
		    for(Map.Entry<String,String> m: map.entrySet()){
				String mapValor = m.getValue();
				String[] vectorMap = mapValor.split(",");
				for(int s=0;s< vectorMap.length;s++){
					vector[cont]=vectorMap[s];
					cont++;
				}
			}
			System.out.println(vector);
		}

		int[] vec=StringUtil.toIntArray(vector);
		for(int i=0; i<vec.length;i++)
		{
			System.out.print(vec[i]+(i<vec.length-1?",":""));
		}
	}

	public static void main(String[] args)
	{
		int arr[]={16223,898,13,15,2222222,5432,412412,906,235,23,9,1532,6388,2511,8};
		radixSort(arr);
		
	//	for(int i=0; i<arr.length;i++)
	//	{
	//		System.out.print(arr[i]+(i<arr.length-1?",":""));
	//	}
	}
}
