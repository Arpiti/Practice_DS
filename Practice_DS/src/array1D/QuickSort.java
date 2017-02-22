package array1D;

import java.io.IOException;

public class QuickSort {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
	Userdefined1DArray userdefined1dArray=new Userdefined1DArray();
	QuickSort ob=new QuickSort();
	int arr[]=userdefined1dArray.initialize();
	userdefined1dArray.printArray(ob.quickSort(arr,0,arr.length-1), arr.length);
}

	private int[] quickSort(int[] arr, int st, int last) {
		// TODO Auto-generated method stub
		if(st>=last)
			return arr;
		int p_pv=st;
		int pivot = arr[st];
		int i=st;
		for(int j= st+1;j<=last;j++)
		{
			if(arr[j]<pivot)
			{
				i++;
				exchange(arr,i,j);
			}
		}
		exchange(arr,p_pv,i);
		quickSort(arr, st, i-1);
		quickSort(arr,i+1,last);
		return arr;
	}
	private void exchange(int[] arr,int a, int b) {
		// TODO Auto-generated method stub
		int temp = arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
	
}
