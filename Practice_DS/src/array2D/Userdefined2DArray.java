package array2D;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Userdefined2DArray {
	private int arr[][];
	private int m,n;
	public Userdefined2DArray(int m,int n)
	{
		this.m=m;
		this.n=n;
	}
	public int[][] initialize() throws IOException {
		// TODO Auto-generated method stub
		arr=new int [m][n];
		System.out.println("\n\n Fill the matrix : \n");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr[i][j]=Integer.parseInt(br.readLine());
			//	System.out.println(i+""+j);
			}
		}
		return arr;
	}
	public void printMatrix( int [][]ar,int m,int n)
	{
		// TODO Auto-generated method stub
		for(int i=0;i<m;i++)
		{
			System.out.println();
			for(int j=0;j<n;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
		}
		
	}
}
