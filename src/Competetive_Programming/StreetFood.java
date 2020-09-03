package sorting;
import java.util.*;

public class StreetFood {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the value of n");
		int n=sc.nextInt();
		int sum=0;
		int arr[][]=new int[n+1][3+1];
		int mult=1,max=-1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=3;j++)
			{
				arr[i][j]=sc.nextInt();
			
					
			}
		}
		for(int i=1;i<=n;i++)
		{
			sum=sum+arr[i][1];
		}
		System.out.println(sum);
		for(int i=1;i<=n;i++)
		{
			mult=(i*arr[i][3]*arr[i][2])/sum;
			if(max<mult)
				max=mult;
			
		}
		System.out.println(max);
		sc.close();
	

	}

}
