package array1D;

import java.io.IOException;

//3,4,8,5,9

public class QuickSort {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
	Userdefined1DArray userdefined1dArray=new Userdefined1DArray();
	QuickSort ob=new QuickSort();
	int arr[]=userdefined1dArray.initialize();
	ob.quickSort(arr,0,arr.length-1);
	userdefined1dArray.printArray(arr, arr.length);
}

	private void quickSort(int[] arr, int st, int last) {
		// TODO Auto-generated method stub
		int end = last;
		if (st>=end)
			return;
		
		int pivot = st++;
		System.out.println("st " +st + " end " + end+ " piv "+pivot);
		while(st<=end)
		{
			if(arr[st]<arr[pivot])
			{
				st++;
			}
			if(arr[end]>arr[pivot])
			{
				end--;
			}
			if(arr[st]>arr[pivot] && arr[end]<arr[pivot])
			{	
				exchange(arr,st,end);
			st++;
			end--;
			}
			System.out.println("st " +st + " end " + end+ " piv "+pivot);
		}
		exchange(arr,pivot,end);
		pivot=end;
		System.out.println(" array : ");
		for(int i:arr)
			System.out.print(i+",");
		System.out.println();
		if(end==pivot)
			quickSort(arr, 0, end-1);
		else if(st>pivot)
			quickSort(arr, st, last);
	}
	//if()

	private void exchange(int[] arr,int a, int b) {
		// TODO Auto-generated method stub
		int temp = arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
	
}
