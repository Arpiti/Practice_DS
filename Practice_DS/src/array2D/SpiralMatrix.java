package array2D;

import java.io.IOException;

public class SpiralMatrix {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Userdefined2DArray userdefined2dArray = new Userdefined2DArray(3, 2);
		new SpiralMatrix().printSpiral(userdefined2dArray.initialize(), 3, 2);;
	}

	private void printSpiral(int arr[][],int m,int n) {
		// TODO Auto-generated method stub
		int counter=0,stR=0,stC=0,enR=m-1,enC=n-1;
	while(counter != m*n)
	{
		int i=stR,j;
		for(j=stC;j<=enC;j++)
		{
			System.out.print(arr[i][j]);
			counter++;
		}
		System.out.println();
		j--;
		for(i=stR+1;i<=enR;i++)
		{
			System.out.print(arr[i][j]);
			counter++;
		}
		System.out.println();
		i--;
		for(j=enC-1;j>=stC;j--)
		{
			System.out.print(arr[i][j]);
			counter++;
		}
		System.out.println();
		j++;
		for(i=enR-1;i>stR;i--)
		{
			System.out.print(arr[i][j]);
			counter++;
		}
		System.out.println();
		stC++;
		enC--;
		enR--;
	}
	}
}
