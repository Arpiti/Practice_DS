package array1D;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Userdefined1DArray {
		
		private int arr[];
		private int n;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		public Userdefined1DArray() throws NumberFormatException, IOException
		{
			System.out.println("\n\n Enter array limit : \n");
			n= Integer.parseInt(br.readLine());
		}
		public int[] initialize() throws IOException {
			// TODO Auto-generated method stub
			arr=new int[n];
			System.out.println("\n\n Fill the array : \n");
			
				for(int j=0;j<n;j++)
				{
					arr[j]=Integer.parseInt(br.readLine());
				//	System.out.println(i+""+j);
				}
			return arr;
		}
		public void printArray( int[] ar,int n)
		{
			// TODO Auto-generated method stub
			
				for(int j=0;j<n;j++)
				{
					System.out.print(arr[j]+" ");
				}
	
			
		}
	}



