package array2D;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RotateBy90 {
	int arr[][], m,n,temp;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		RotateBy90 ob = new RotateBy90();
		ob.initiate();
	}

	private void initiate()throws IOException {
		// TODO Auto-generated method stub
		System.out.println("\n\n Set the no of rows and column : \n");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		m = Integer.parseInt(br.readLine());
		n = Integer.parseInt(br.readLine());
		Userdefined2DArray userdefined2dArray=new Userdefined2DArray(m, n);
		arr = userdefined2dArray.initialize();
		//userdefined2dArray.printMatrix(arr, m, n);
		reorder(m,n);
		userdefined2dArray.printMatrix(arr, m, n);
	}

	private void reorder(int m2, int n2) {
		// TODO Auto-generated method stub
		for(int i=0;i<m2;i++)
		{
			for(int j=0;j<n2;j++)
			{
				temp=arr[i][j];
				int x,y,r=i,c=j;
				while(temp>0)
				{
					x=c;
					y=n2-1-r;
					System.out.println(temp+" @ " + i+" "+j+" is made change with "+arr[x][y]);
					arr[i][j]=arr[x][y];
					arr[x][y]=-temp;
					temp=arr[i][j];
					r=x;
					c=y;
				}
			}
		}
		for(int i=0;i<m2;i++)
		{
			for(int j=0;j<n2;j++)
			{
				arr[i][j]=-arr[i][j];
			}
		
	}
	
	}
}
 