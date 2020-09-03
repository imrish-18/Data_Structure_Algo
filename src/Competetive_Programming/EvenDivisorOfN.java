package sorting;
import java.util.*;

public class EvenDivisorOfN{

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int count=0;
		System.out.println("please enter the value of n & m");
		int n=sc.nextInt();
		int m=sc.nextInt();
		int sum=0;
		if(n%2!=0)
			System.out.println(-1);
		else
		{
		while(n<m)
		{
			int j=2;
			int x = 0;
			count++;
			if(n%6==0 && n+6<=m) 
			{
				if(n==6)
				{
					sum=sum+3;
					n=n+2;
				}
				else
				{
					
					int k=((n/2)%2==0)?n/2:((n/2)-3);
					while(k>=6)
					{
						count++;
						if(n%k==0 && n+k<=m)
						{
							break;
						}
						else
						{
							k=k-6;
						}
					}
					sum=sum+n/k;
					n=n+k;
					
					
					
					
					
					
					
					
					
//					int k=6;
//					while(k<=n/2 && n+k<=m)
//					{
//						if(n%k==0) {
//							x=k;
//						k=k+6;
//						
//						}
//						else
//							k=k+6;
//					}
//					sum=sum+n/x;
//					
//					n=n+x;
					
				
				}
				
			}
			
			else
			{
				int i=n/j;
				while(i>=2)
				{
					count++;
					if(n%i==0 && n+i<=m)
					{
						sum=sum+n/i;
						n=n+i;
						
					i=1;
					}
					else
					{
						j++;
						i=n/j;
						
					}
				}
			
				
			}
		}
		System.out.println(sum);
		System.out.println(count);
		}
		
		sc.close();
}
}