public class RadixSortEjerc
{
	public static void radixSort(int []arr)
	{
		// PROGRAMAR AQUI
		String[] vector = StringUtil.toStringArray(arr);
		int max = StringUtil.maxLength(vector);
		StringUtil.lpad(vector[1],max,'0');
	}

	public static void main(String[] args)
	{
		int arr[]={16223,898,13,906,235,23,9,1532,6388,2511,8};
		radixSort(arr);
		
		for(int i=0; i<arr.length;i++)
		{
			System.out.print(arr[i]+(i<arr.length-1?",":""));
		}
	}
}
